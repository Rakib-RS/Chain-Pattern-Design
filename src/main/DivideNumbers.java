package main;

public class DivideNumbers implements Chain {

	private Chain nextInChain;
	@Override
	public void setNextChain(Chain nextChain) {
		// TODO Auto-generated method stub
		this.nextInChain = nextChain;

	}

	@Override
	public double calculate(Numbers requests) {
		// TODO Auto-generated method stub
		if(requests.getCalculationWanted() == "divide") {
			return (requests.getNumber1()/requests.getNumber2());		}
		else {
			System.out.println("only add,sub,mult and divide is accepted");
			
		}
		return -1;


	}


}
