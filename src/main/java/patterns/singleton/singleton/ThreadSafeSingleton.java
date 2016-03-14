package patterns.singleton.singleton;


public class ThreadSafeSingleton {

    private ThreadSafeSingleton threadSafeSingleton;

    private ThreadSafeSingleton(){}

    public static ThreadSafeSingleton getThreadSafeSingleto() {
        return ThreadSafeSingletonHelper.singleton;
    }

    private static class ThreadSafeSingletonHelper {
        private static final ThreadSafeSingleton singleton = new ThreadSafeSingleton();
    }

}
