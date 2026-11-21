package c.c.a;
import com.didjdk.adbhelper.UnlockActivity;
import b.b.c.i;
/** Restored JNI worker. Field names/types are confirmed by native reflection strings. */
public final class i2 implements Runnable {
  public final UnlockActivity b;
  public final String c;
  public final i d;
  public i2(UnlockActivity activity, String code, i dialog) { this.b=activity; this.c=code; this.d=dialog; }
  @Override public native void run();
}
