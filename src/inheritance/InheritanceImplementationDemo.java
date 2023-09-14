package inheritance;

public class InheritanceImplementationDemo {
	public static void main(String[] args) {
		// amazon
		double itemcost = 1000;
		SBI sbi = new SBI();
		double moneyAppliedToUser = sbi.finalPriceForItem(itemcost);
		System.out.println("user has to pay after tax : " + moneyAppliedToUser);
		
		HDFC hdfc = new HDFC();
		double moneyAppliedToUser1 = hdfc.finalPriceForItem(itemcost);
		System.out.println("user has to pay after tax : " + moneyAppliedToUser1);
		
	}
}

class PaymentGateway{
	public double serviceCharges() {
		return 10;
	}
}


class HDFC extends PaymentGateway{
	public double interestCharges() {
		return 1.0;
	}
	
	public double finalPriceForItem(double itemPrice) {
		double hdfcCut = itemPrice * (interestCharges()/100);
		System.out.println("HDFC cut  : " + hdfcCut);
		double paymentGateWayCut = itemPrice * (serviceCharges()/100);
		System.out.println("GatewayCut :  " + paymentGateWayCut);
		double totalPrice = itemPrice + hdfcCut + paymentGateWayCut;
		return totalPrice;	
	}	
}

class SBI extends PaymentGateway{
	public double interestCharges() {
		return 5.0;
	}
	
	public double finalPriceForItem(double itemPrice) {
		double hdfcCut = itemPrice * (interestCharges()/100);
		System.out.println("SBI cut  : " + hdfcCut);
		double paymentGateWayCut = itemPrice * (serviceCharges()/100);
		System.out.println("GatewayCut :  " + paymentGateWayCut);
		double totalPrice = itemPrice + hdfcCut + paymentGateWayCut;
		return totalPrice;	
	}	
}

