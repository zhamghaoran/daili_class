import java.util.PrimitiveIterator;
public class do_it implements Serve{
    Proxy proxy;
    public do_it(Proxy proxy) {
        this.proxy = proxy;
    }
    private void check() {
        System.out.println("check");
    }
     public void Network() {
        proxy.Network();
        check();
    }
}
