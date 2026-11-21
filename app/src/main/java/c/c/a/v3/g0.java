package c.c.a.v3;

import androidx.fragment.app.Fragment;
import com.didjdk.adbhelper.MainActivity;
import com.didjdk.adbhelper.MyApplication;

/* JADX INFO: renamed from: c.c.a.v3.g0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 extends Fragment {

    /* JADX INFO: renamed from: V */
    public boolean f4966V = true;

    /* JADX INFO: renamed from: W */
    public String f4967W;

    /* JADX INFO: renamed from: G0 */
    public native MainActivity G0();
    public MainActivity m2646G0() {
        return G0();
    }

    /* JADX INFO: renamed from: H0 */
    public MyApplication m2647H0() {
        return (MyApplication) m303h().getApplication();
    }

    /* JADX INFO: renamed from: I0 */
    public void mo2641I0() {
        this.f4966V = false;
        this.f4967W = m2646G0().f6465u;
    }

    /* JADX INFO: renamed from: J0 */
    public void mo2648J0() {
        if (m2646G0() != null) {
            m2646G0().x();
        } else if (m303h() != null) {
            m303h().onBackPressed();
        }
    }
}
