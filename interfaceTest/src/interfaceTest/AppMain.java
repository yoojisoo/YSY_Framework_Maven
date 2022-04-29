package interfaceTest;

public class AppMain {

	
	public static void main(String[] args) {
		
		
		StartbucksMain startbucksMain = new StartbucksMain();
		
//		Jisa1 jisa1 = new Jisa1(startbucksMain);
		Jisa2 jisa2 = new Jisa2(startbucksMain);
		Jisa3 jisa3 = new Jisa3(startbucksMain);
		
		System.out.println(startbucksMain.totAmount);
	}
}
