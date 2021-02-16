package creational.factory;

public class FactoryMain {
    public static void main(String[] args) {

	Animal objFromFactory = AnimalFactory.getInstance(1);
	//1 is for Cat object, 2 is for Dog object
	System.out.println(objFromFactory.getSound());
    }
}
