package week10;

public class AirPlaneEx {
	public static void main(String[] args) {
		SonicAirPlane sPlane = new SonicAirPlane();
		sPlane.takeoff();
		sPlane.fly();
		sPlane.land();
		
		sPlane.flymode = SonicAirPlane.SUPERSONIC;
		sPlane.fly();
	}
}
