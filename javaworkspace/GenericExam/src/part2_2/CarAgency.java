package part2_2;

public class CarAgency implements Rentable<Car> {

	@Override
	public Car rent() {
		return new Car();
	}

}
