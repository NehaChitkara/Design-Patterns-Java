package creational.singleton;

/*
 * Instance is initialized only when required
 * */
public class SingletonLazy {
    // Private constructor to prevent making new objects
    private SingletonLazy() {
    }

    // Single instance saved
    private static SingletonLazy instanceOfClass = null;

    // Public static method through which the object will be accessed
    public static SingletonLazy getInstance() {
	if (instanceOfClass == null) {
	    // to make it thread safe
	    synchronized (SingletonLazy.class) {
		instanceOfClass = new SingletonLazy();
	    }
	}
	return instanceOfClass;
    }
}
