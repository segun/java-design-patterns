package design.patterns.factory;

public class Luxury extends Car {

    public Luxury() {
        super(CarModel.LUXURY);     
        constructCar();   
    }

    @Override
    protected void constructCar() {
        System.out.println("Constructing " + carModel);
    }
    
}
