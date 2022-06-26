package builder;

import java.util.List;

public class Car {
	
	private String name;
	private double price;
	private int year;
	private Color color;

	
	public Car(CarBuilder builder){
		this.name = builder.name;
		this.price = builder.price;
		this.year = builder.year;
		this.color = builder.color;
	
	}
	
	static class CarBuilder{
		
		private final String name; //required
		private double price;
		private int year;
		private Color color;
	
		
		public CarBuilder(String name){
			this.name = name;
		}
		
		public CarBuilder price(double price){
			this.price = price;
			return this;
		}
		
		public CarBuilder year(int year){
			this.year = year;
			return this;
		}
		
		public CarBuilder color(Color color){
			this.color = color;
			return this;
		}

		public CarBuilder build() {
			return this;
		}
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}


	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", year=" + year + ", color=" + color
				+ ", maxSpeed="  + "]";
	}

}
