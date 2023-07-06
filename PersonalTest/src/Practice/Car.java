package Practice;

public class Car {
	
	private String color;
	private int speed;
	
	 public Car(String color, int speed){
		this.color = color;
		this.speed = speed;
	
	}
	 
	 public void speedUp() {
		 speed = speed +100;
		 System.out.println(speed);
	 }
	 
	 public void speedDown() {
		 speed = speed -50;
		 System.out.println(speed);
	 }

}
