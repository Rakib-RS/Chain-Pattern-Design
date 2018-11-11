package main;

public class MultiplyNumbers implements Chain {

	private Chain nextInChain;
	@Override
	public void setNextChain(Chain nextChain) {
		// TODO Auto-generated method stub
		this.nextInChain = nextChain;

	}

	@Override
	public double calculate(Numbers requests) {
		// TODO Auto-generated method stub
		if(requests.getCalculationWanted() == "mult") {
			return (requests.getNumber1()*requests.getNumber2());		}
		else {
			nextInChain.calculate(requests);
		}
		return -1;


	}


}
