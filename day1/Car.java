package week1.day1;

public class Car {

	public static void main(String[] args) {
		
		Bike obj1=new Bike();
		obj1.applyBreak();
		obj1.soundHorn();
				

	}
	
	public void applyBreak() {
		System.out.println("B-Applied Break");
	}
public void soundHorn() {
	System.out.println("B-Sound horn");
}
}
