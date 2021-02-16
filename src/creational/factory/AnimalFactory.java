package creational.factory;

public class AnimalFactory {
    // Get instance Factory method
    public static Animal getInstance(int type) {
	switch (type) {
	case 1:
	    return new Cat();
	case 2:
	    return new Dog();
	default:
	    return new Animal();
	}
    }
}
