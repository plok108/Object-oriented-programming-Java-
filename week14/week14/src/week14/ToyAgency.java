package week14;

public class ToyAgency implements Rentable<Toy>{
	public Toy rent() {
		return new Toy();
	}
}
