package design;

import design.patterns.builder.User;
import design.patterns.prototype.PrototypeFactory;
import design.patterns.prototype.PrototypeFactory.ModelType;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
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

        String moviePrototype  = PrototypeFactory.getInstance(ModelType.MOVIE).toString();
        System.out.println(moviePrototype);

        String albumPrototype  = PrototypeFactory.getInstance(ModelType.ALBUM).toString();
        System.out.println(albumPrototype);

        String showPrototype  = PrototypeFactory.getInstance(ModelType.SHOW).toString();
        System.out.println(showPrototype);        
    }
}
