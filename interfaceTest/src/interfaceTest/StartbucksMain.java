package interfaceTest;

public class StartbucksMain {
	StartbucksIf startbucksIf;
	int totAmount = 0;
	
	
	
	
	public void setJisa(StartbucksIf objInter) {
		
		totAmount += objInter.getTotAccount();
		
	}
}
