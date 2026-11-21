package c.c.a;
import com.didjdk.adbhelper.UnlockActivity;
/** Restored JNI worker. */
public final class z1 implements Runnable {
  public final UnlockActivity b;
  public z1(UnlockActivity activity) { this.b=activity; }
  @Override public native void run();
}
