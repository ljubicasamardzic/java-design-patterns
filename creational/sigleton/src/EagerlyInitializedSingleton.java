public class EagerlyInitializedSingleton {

    private EagerlyInitializedSingleton() {}

    private static final EagerlyInitializedSingleton INSTANCE = new EagerlyInitializedSingleton();

    public static EagerlyInitializedSingleton getInstance() {
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello from eagerly initialized singleton!");
    }
}
