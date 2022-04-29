package interfaceTest;

public class Jisa3 implements StartbucksIf{
	StartbucksMain startbucksMain;
	
	
	public Jisa3(StartbucksMain startbucksMain) {
		this.startbucksMain = startbucksMain;
		
		
		finalStore();
		
	}
	public void finalStore() {
		startbucksMain.setJisa(this);
	}


	@Override
	public int getTotAccount() {
		// TODO Auto-generated method stub
		return 50;
	}


	@Override
	public int getMonthAccount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
