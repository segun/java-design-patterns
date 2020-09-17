package design;

import design.patterns.builder.User;
import design.patterns.factory.CarFactory;
import design.patterns.factory.CarModel;
import design.patterns.prototype.PrototypeFactory;
import design.patterns.prototype.PrototypeFactory.ModelType;
import design.patterns.singleton.LazySimpleton;
import design.patterns.singleton.SimpleSingleton;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Builder Pattern Tests
        User a = new User.UserBuilder("Adebayo", "Salami").build();
        System.out.println(a);

        User b = new User.UserBuilder("Adebayo", "Salami").address("Lagos").build();
        System.out.println(b);

        User c = new User.UserBuilder("Adebayo", "Salami").address("Lagos").age(20).build();
        System.out.println(c);

        User d = new User.UserBuilder("Adebayo", "Salami").address("Lagos").age(20).email("adebayo.salami@gmail.com")
                .build();
        System.out.println(d);

        User e = new User.UserBuilder("Adebayo", "Salami").address("Lagos").age(20).email("adebayo.salami@gmail.com")
                .phone("08089489101").build();
        System.out.println(e);

        // Prototype Pattern Tests
        String moviePrototype  = PrototypeFactory.getInstance(ModelType.MOVIE).toString();
        System.out.println(moviePrototype);

        String albumPrototype  = PrototypeFactory.getInstance(ModelType.ALBUM).toString();
        System.out.println(albumPrototype);

        String showPrototype  = PrototypeFactory.getInstance(ModelType.SHOW).toString();
        System.out.println(showPrototype);   
        
        // Singleton Pattern Tests
        SimpleSingleton ss = SimpleSingleton.INSTANCE;
        ss.setVal(10);
        System.out.println(ss.getVal());

        SimpleSingleton ss2 = SimpleSingleton.INSTANCE;
        System.out.println(ss2.getVal());

        assert ss.getVal() == ss2.getVal();

        LazySimpleton ls = LazySimpleton.init();
        ls.setVal(10);
        System.out.println(ls.getVal());

        LazySimpleton ls2 = LazySimpleton.init();
        System.out.println(ls2.getVal());        

        assert ls.equals(ls2);

        // Factory Pattern Tests
        CarFactory.buildCar(CarModel.HATCH_BACK);
        CarFactory.buildCar(CarModel.LUXURY);
        CarFactory.buildCar(CarModel.SEDAN);
        CarFactory.buildCar(CarModel.SUV);
    }
}
