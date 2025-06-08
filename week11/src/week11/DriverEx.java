package week11;

public class DriverEx {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle v = new Vehicle();
		driver.drive(v);
		
		driver.drive(new Bus());    // 이것도 가능
		driver.drive(new Taxi());
		
		v = new Bus();  // 이것도 가능
		driver.drive(v);
	}
}
