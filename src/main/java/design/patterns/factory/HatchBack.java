package design.patterns.factory;

public class HatchBack extends Car {

    public HatchBack() {
        super(CarModel.HATCH_BACK);     
        constructCar();   
    }

    @Override
    protected void constructCar() {
        System.out.println("Constructing " + carModel);
    }
    
}
