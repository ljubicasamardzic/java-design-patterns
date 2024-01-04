public class LazilyInitializedSingleton {

    private LazilyInitializedSingleton() {}

    private static LazilyInitializedSingleton INSTANCE;

    public static LazilyInitializedSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazilyInitializedSingleton();
        }
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello from lazily initialized singleton!");
    }
}
