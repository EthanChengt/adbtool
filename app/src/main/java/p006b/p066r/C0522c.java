package p006b.p066r;

import android.util.SparseIntArray;
import androidx.media.AudioAttributesCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import c.a.a.a.a;

/* JADX INFO: renamed from: b.r.c */
/* JADX INFO: loaded from: classes.dex */
public class C0522c implements InterfaceC0520a {

    /* JADX INFO: renamed from: a */
    public int f3219a = 0;

    /* JADX INFO: renamed from: b */
    public int f3220b = 0;

    /* JADX INFO: renamed from: c */
    public int f3221c = 0;

    /* JADX INFO: renamed from: d */
    public int f3222d = -1;

    public boolean equals(Object obj) {
        if (!(obj instanceof C0522c)) {
            return false;
        }
        C0522c c0522c = (C0522c) obj;
        if (this.f3220b != c0522c.f3220b) {
            return false;
        }
        int i = this.f3221c;
        int i2 = c0522c.f3221c;
        int i3 = c0522c.f3222d;
        int i4 = 4;
        if (i3 == -1) {
            int i5 = c0522c.f3219a;
            SparseIntArray sparseIntArray = AudioAttributesCompat.f741b;
            if ((i2 & 1) != 1) {
                if ((i2 & 4) != 4) {
                    switch (i5) {
                        case RecyclerView.SCROLL_STATE_SETTLING /* 2 */:
                            i4 = 0;
                            break;
                        case 3:
                            i4 = 8;
                            break;
                        case 4:
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i4 = 5;
                            break;
                        case 6:
                            i4 = 2;
                            break;
                        case 11:
                            i4 = 10;
                            break;
                        case 12:
                        default:
                            i4 = 3;
                            break;
                        case 13:
                            i4 = 1;
                            break;
                    }
                } else {
                    i4 = 6;
                }
            } else {
                i4 = 7;
            }
        } else {
            i4 = i3;
        }
        if (i4 == 6) {
            i2 |= 4;
        } else if (i4 == 7) {
            i2 |= 1;
        }
        return i == (i2 & 273) && this.f3219a == c0522c.f3219a && this.f3222d == i3;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3220b), Integer.valueOf(this.f3221c), Integer.valueOf(this.f3219a), Integer.valueOf(this.f3222d)});
    }

    public String toString() {
        String strM2198l;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f3222d != -1) {
            sb.append(" stream=");
            sb.append(this.f3222d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f3219a;
        SparseIntArray sparseIntArray = AudioAttributesCompat.f741b;
        switch (i) {
            case 0:
                strM2198l = "USAGE_UNKNOWN";
                break;
            case 1:
                strM2198l = "USAGE_MEDIA";
                break;
            case RecyclerView.SCROLL_STATE_SETTLING /* 2 */:
                strM2198l = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strM2198l = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strM2198l = "USAGE_ALARM";
                break;
            case 5:
                strM2198l = "USAGE_NOTIFICATION";
                break;
            case 6:
                strM2198l = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strM2198l = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strM2198l = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strM2198l = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strM2198l = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strM2198l = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strM2198l = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strM2198l = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strM2198l = "USAGE_GAME";
                break;
            case 15:
            default:
                strM2198l = a.m2198l("unknown usage ", i);
                break;
            case 16:
                strM2198l = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strM2198l);
        sb.append(" content=");
        sb.append(this.f3220b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f3221c).toUpperCase());
        return sb.toString();
    }
}
