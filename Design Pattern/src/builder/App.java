package builder;

import builder.Car.CarBuilder;

public class App {

	public static void main(String[] args) {
		
		Car car= null;
		
		car = new Car(
				new CarBuilder("Tesla Model 5")
				.color(Color.White)
				.price(70000)
				.year(2014)
				.build());
		
		System.out.println(car);
	}

}
