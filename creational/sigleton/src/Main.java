public class Main {
    public static void main(String[] args) {

        // Source: https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples

        // eagerly initialized sigleton - not ideal since we create an instance as soon as the classes are loaded
        // we may not need it in the end
        var eagerlyInitializedSingleton = EagerlyInitializedSingleton.getInstance();
        eagerlyInitializedSingleton.sayHello();

        // better approach - create an instance only when somebody asks for it
        var lazilyInitializedSingleton = LazilyInitializedSingleton.getInstance();
        lazilyInitializedSingleton.sayHello();

        // to make the singleton thread safe, we can initialize it using a synchronized method
        var threadSafeSingleton = ThreadSafeSingleton.getInstance();

        // to avoid synchronization we can use the Bill Pugh method
        // in this case, we create an inner class that will not get loaded into memory until somebody calls for an instance of singleton

        // Notice the private inner static class that contains the instance of the singleton class.
        // When the singleton class is loaded, SingletonHelper class is not loaded into memory and only when someone calls the getInstance() method,
        // this class gets loaded and creates the singleton class instance.
        // This is the most widely used approach for the singleton class as it doesn’t require synchronization.
        var billPughSingleton = BillPughSingleton.getInstance();

    }
}