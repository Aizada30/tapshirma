import java.util.InputMismatchException;
import java.util.Scanner;

public class Anketa {

    private String name;
    private String lastName;
    private String age;
    private String email;

    public Anketa() {

    }

    public Anketa(String name, String lastName, String age, String email) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String emailO(String email){
        while (true){
            try{
            System.out.println("Write your email: "+ email);
            if(!email.matches("[@]")){
                throw new Myexception("nooo");
            }
            if(email.contains("@")){
                System.out.println("ooooooooou");
            }
        }catch (Myexception e){
            e.getMessage();
        }return null;
    }
}
    @Override
    public String toString() {
        return "Anketa: " +
                "name: " + name + "\n" +
                "lastName: " + lastName + "\n" +
                "age: " + age + "\n" +
                "email: " + email + "\n";
    }
}


