package week1.day1;

public class Mobile {

	public static void main(String[] args) {
		
		Mobile obj=new Mobile();
		obj.makeCall();
		obj.sendMsg();
System.out.println("This is my mobile");
		

	}
	public void makeCall() {
		String mobileModel="Google Pixel 3";
		float mobileWeight=0.200f;
		System.out.println("Make a Call");
		System.out.println(mobileModel);
		System.out.println(mobileWeight);

	}
public void sendMsg() {
	boolean fullycharged=true;
	int mobileCost=600;
	
	System.out.println("Message Sent");
	System.out.println(fullycharged);
	System.out.println(mobileCost);
}
}
