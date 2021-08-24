package objectOriented;

import java.util.ArrayList;

public interface CarbonFootPrint {
	
	double getCarbonFootPrint();

}

class Building implements CarbonFootPrint{

	private String type;
	private String fuel;
	private double gas;
	
	public Building(String Type, String Fuel, double Gas){
		setType(Type);
		setFuel(Fuel);
		setGas(Gas);
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String model) {
		this.type = model;
	}
	
	public String getFuel() {
		return fuel;
	}
	
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
	public double getGas() {
		return gas;
	}
	
	public void setGas(double distance) {
		this.gas = distance;
	}
	public double getCarbonFootPrint() {
		
		return (getGas() * 11.7 *0.45);
	}
	
	public String toString(){
		return String.format("%s: \n%s: %s \n%s: %s \n%s %,.2f (Thermal)",
				"BUILDING CARBON FOOTPRINT","Building Type",getType(),"Fuel Used",getFuel(),"Gas Consumed",
				getGas());
	}
	
}

class Car implements CarbonFootPrint{

	private String model;
	private String fuel;
	private double distance;
	
	public Car(String Model, String Fuel, double distance){
		setModel(Model);
		setFuel(Fuel);
		setDistance(distance);
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getFuel() {
		return fuel;
	}
	
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
	public double getDistance() {
		return distance;
	}
	
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public double getCarbonFootPrint() {
		
		return (getDistance() * 0.271);
	}
	
	public String toString(){
		return String.format("%s: \n%s: %s \n%s: %s \n%s %,.2f (Km)",
				"CAR CARBON FOOTPRINT","Car Type",getModel(),"Fuel",getFuel(),"Distance",
				getDistance());
	}
	
}

class Bicycle implements CarbonFootPrint{

	private String model;
	private double distance;
	
	public Bicycle(String Model, double distance){
		setModel(Model);
		setDistance(distance);
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getDistance() {
		return distance;
	}
	
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public double getCarbonFootPrint() {
		return (getDistance() * 0.016);
	}
	
	public String toString(){
		return String.format("%s: \n%s: %s \n%s %,.2f (Km)",
				"BICYCLE CARBON FOOTPRINT","Bike Model",getModel(),"Distance",
				getDistance());
	}
	
}


class CarbonFootPrintTest{
	
	public void run(){
		
		ArrayList <CarbonFootPrint> calculateCarbon = new ArrayList<CarbonFootPrint>();
		
		calculateCarbon.add(new Car("2018 Ferrari","Diesel",2));
		calculateCarbon.add(new Bicycle("2012 Toyota Brake Model",0.5));
		calculateCarbon.add(new Building("4 Bedroom Flat","Cooking Gas, Generator Diesel",500));
		
		System.out.println("Carbon FootPrint of different classes:\n");
		
		for(CarbonFootPrint currentCarbon : calculateCarbon){
			
			System.out.printf("%s \n%s: %,.2f (Kg of CO2)\n\n", currentCarbon.toString(),
					"Carbon Footprint",currentCarbon.getCarbonFootPrint());

		}
		
		
	}
}