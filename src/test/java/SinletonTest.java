public class SinletonTest {
    public static void main(String[] args) {
        System.out.println(SingletonClass.getInstance().equals(SingletonClass.getInstance()));

    }
}
