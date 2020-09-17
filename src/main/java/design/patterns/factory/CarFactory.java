package design.patterns.factory;

public class CarFactory {
    public static Car buildCar(CarModel carModel) {
        switch (carModel) {
            case LUXURY:
                return new Luxury();
            case SEDAN:
                return new Sedan();
            case HATCH_BACK:
                return new HatchBack();
            case SUV:
                return new Suv();
            default:
                System.out.println("We don't know how to build this type of car yet");
                return null;
                
        }
    }
}
