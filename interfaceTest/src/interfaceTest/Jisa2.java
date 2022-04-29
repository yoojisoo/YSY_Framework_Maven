package interfaceTest;

public class Jisa2 implements StartbucksIf{

	private int test =1;
	StartbucksMain smain;
	public Jisa2(StartbucksMain smain) {
		this.smain = smain;
		
		//청소 판매 결산
		acc111();
	}
	
	
	public void acc111() {
		smain.setJisa(this);
		
		
		
		
		
	}
	
	public void setTest(int test) {
		//1,2,3,4
		if(test != 0)
			this.test = test;
	}
	
	
	@Override
	public int getTotAccount() {
		// TODO Auto-generated method stub
		
		///////일일 결산
		
		double tot = 100/test;
		
		return (int)tot;
	}

	@Override
	public int getMonthAccount() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
