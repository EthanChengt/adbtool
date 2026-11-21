package c.c.a;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: c.c.a.t2 */
/* JADX INFO: loaded from: classes.dex */
public class t2 {

    /* JADX INFO: renamed from: a */
    public ByteBuffer a;

    public t2(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    public String toString() {
        ByteBuffer byteBuffer = this.a;
        byte[] bArr = new byte[4];
        int i = 0;
        int i2 = 0;
        while (i < 4) {
            bArr[i] = byteBuffer.get(i2);
            i++;
            i2++;
        }
        return "[" + new String(bArr) + ", " + this.a.getInt(4) + ", " + this.a.getInt(8) + ", " + this.a.getInt(12) + "]";
    }
}
