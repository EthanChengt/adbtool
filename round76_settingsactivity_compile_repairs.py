#!/usr/bin/env python3
"""Round76: repair SettingsActivity crash-log reader ordering and preference fallback."""
from pathlib import Path
import argparse
import shutil

REL = Path("app/src/main/java/com/didjdk/adbhelper/SettingsActivity.java")
OLD_READ = '''                try {
                    try {
                        fileInputStream = new FileInputStream(new File(c1333a.m303h().getFilesDir().getAbsolutePath(), "crash.log"));
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                sb.append(line);
                                sb.append("\\n");
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    } catch (FileNotFoundException e2) {
                        e2.printStackTrace();
                        fileInputStream = null;
                    }
                    bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                    sb = new StringBuilder();
                    fileInputStream.close();
                    string = sb.toString();
                } catch (Exception unused) {
                    string = "null";
                }'''
NEW_READ = '''                try {
                    fileInputStream = new FileInputStream(new File(c1333a.m303h().getFilesDir().getAbsolutePath(), "crash.log"));
                    bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                    sb = new StringBuilder();
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        sb.append(line);
                        sb.append("\\n");
                    }
                    fileInputStream.close();
                    string = sb.toString();
                } catch (Exception e) {
                    e.printStackTrace();
                    string = "null";
                }'''
OLD_PREF = '''                Preference preference = preferenceScreen;
                if (str != null) {'''
NEW_PREF = '''                Preference preference = preferenceScreen;
                preferenceM393H = preferenceScreen;
                if (str != null) {'''

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("root", nargs="?", default=".")
    parser.add_argument("--check-only", action="store_true")
    args = parser.parse_args()
    path = Path(args.root) / REL
    source = path.read_text(encoding="utf-8")
    if NEW_READ in source and NEW_PREF in source:
        print(f"Round76 already applied: {REL}")
        return
    if OLD_READ not in source:
        raise SystemExit("Round76 expected exact crash-log reader block, found 0")
    if OLD_PREF not in source:
        raise SystemExit("Round76 expected exact preference fallback anchor, found 0")
    updated = source.replace(OLD_READ, NEW_READ, 1).replace(OLD_PREF, NEW_PREF, 1)
    if args.check_only:
        print(f"Round76 validation passed: {REL}")
        return
    backup = path.with_suffix(path.suffix + ".round76.bak")
    if not backup.exists():
        shutil.copy2(path, backup)
    path.write_text(updated, encoding="utf-8")
    verified = path.read_text(encoding="utf-8")
    if NEW_READ not in verified or NEW_PREF not in verified:
        raise SystemExit("Round76 post-write verification failed")
    print(f"Round76 applied: {REL}")
    print(f"Backup: {backup}")

if __name__ == "__main__":
    main()
