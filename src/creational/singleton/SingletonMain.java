package creational.singleton;


public class SingletonMain {
	public static void main(String[] args)
	{
		SingletonEasy sEasy1 = SingletonEasy.getInstance();
		SingletonEasy sEasy2 = SingletonEasy.getInstance();

		System.out.println(sEasy1);
		System.out.println(sEasy2);
		//sEasy1 and sEasy is the same object
		SingletonLazy sLazy = SingletonLazy.getInstance();
		
	}
}
