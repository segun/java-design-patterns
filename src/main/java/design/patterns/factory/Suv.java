package design.patterns.factory;

public class Suv extends Car {
    public Suv() {
        super(CarModel.SUV);     
        constructCar();   
    }

    @Override
    protected void constructCar() {
        System.out.println("Constructing " + carModel);
    }
    
}
