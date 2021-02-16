package creational.factory;

public class Animal {
    protected String name;
    protected String sound;
    protected int type;
    public static int CAT = 1;
    public static int DOG = 2;

    public String getSound() {
	return sound;
    }
}
