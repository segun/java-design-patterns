package design.patterns.factory;

public abstract class Car {
    CarModel carModel;
    /**
     * @return the carModel
     */
    public CarModel getCarModel() {
        return carModel;
    }
    /**
     * @param carModel the carModel to set
     */
    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }


    public Car(CarModel carModel) {
        this.carModel = carModel;
        getBaseCarParts();
    }

    private void getBaseCarParts() {
        System.out.println("Getting car parts common to all car models...");
    }

    protected abstract void constructCar();
}
