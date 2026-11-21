package c.c.a.x3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: c.c.a.x3.h */
/* JADX INFO: loaded from: classes.dex */
public class h extends SSLSocketFactory {

    /* JADX INFO: renamed from: b */
    public static final String[] f5491b = {"TLSv1.1", "TLSv1.2"};

    /* JADX INFO: renamed from: a */
    public final SSLSocketFactory f5492a;

    public h(SSLSocketFactory sSLSocketFactory) {
        this.f5492a = sSLSocketFactory;
    }

    /* JADX INFO: renamed from: a */
    public final Socket m2697a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(f5491b);
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        Socket socketCreateSocket = this.f5492a.createSocket(str, i);
        m2697a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        Socket socketCreateSocket = this.f5492a.createSocket(str, i, inetAddress, i2);
        m2697a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        Socket socketCreateSocket = this.f5492a.createSocket(inetAddress, i);
        m2697a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        Socket socketCreateSocket = this.f5492a.createSocket(inetAddress, i, inetAddress2, i2);
        m2697a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket socketCreateSocket = this.f5492a.createSocket(socket, str, i, z);
        m2697a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f5492a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f5492a.getSupportedCipherSuites();
    }
}
