package design.patterns.factory;

public class Sedan extends Car {

    public Sedan() {
        super(CarModel.SEDAN);     
        constructCar();   
    }

    @Override
    protected void constructCar() {
       System.out.println("Constructing " + carModel);
    }
    
}
