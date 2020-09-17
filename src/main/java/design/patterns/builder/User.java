package design.patterns.builder;

public class User {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String address;
    private final String phone;
    private final int age;


    public User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "{\n" 
        + "firstName: " + firstName + ", \n"
        + "lastName: " + lastName + ", \n"
        + "email: " + email + ", \n"
        + "address: " + address + ", \n"
        + "phone: " + phone + ", \n"
        + "age: " + age + ", \n"
        + "}";
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }
    
    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private String email;
        private String address;
        private String phone;
        private int age;
    
        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }
    
        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }
    
        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }    
    
    
        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            User user = new User(this);

            return user;
        }
    }     
}
