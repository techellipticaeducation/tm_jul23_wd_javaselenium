package inheritance;

public class InterfaceTest {
	public static void main(String[] args) {
		IndianBank bank  = new HDFCBANK();
		bank.totalAmount(10000);
		System.out.println(IndianBank.country);
	}
}

interface IndianBank{
	String country = "India";

	public int homeloan();
	public void totalAmount(int principal);
}


class HDFCBANK implements IndianBank{
	public int homeloan() {
		return 4;
	}

	public void totalAmount(int principal) {
		int total = principal + (int)((double)principal * ((double)homeloan()/(double)100));
		System.out.println(" HDFC ["+country+"] = "+ total);
	}
}

class SBIBANK implements IndianBank{
	public int homeloan() {
		return 7;
	}
	public void totalAmount(int principal) {
		int total = principal + (int)((double)principal * ((double)homeloan()/(double)100));
		System.out.println(" HDFC ["+country+"] = "+ total);
	}
}