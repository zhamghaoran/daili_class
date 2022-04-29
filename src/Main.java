public class Main {
    public static void main(String[] args) {
        Proxy serve = new Proxy();
        do_it do_it = new do_it(serve);
        do_it.Network();
    }
}
