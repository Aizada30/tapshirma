import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isTrue = true;

//Anketa anketa = new Anketa();
//anketa.emailO("8465132");


        Anketa anketa = new Anketa();
        boolean isTrue1 = true;
        int count = 0;
        boolean isTrue2 = true;
        boolean isTrue3 = true;
        while (isTrue1) {
            if (getPersonEmail(new Scanner(System.in).nextLine()) != null && count == 0) {
                System.out.println("Method1");
                count++;
            }else if (getPersonName(new Scanner(System.in).nextLine()) != null && count == 1 ) {
                System.out.println("Method2");
                count++;
            }else if (getPersonLastNAme(new Scanner(System.in).nextLine()) != null && count == 2) {
                count++;
            }else if (getAgeOfPerson(new Scanner(System.in).nextInt()) != 0 && count == 3) {
                count++;
            } else {
                count = 0;
                isTrue1 = false;
            }
        }
    }



    public static String getPersonName(String name) {
        try {
            if (name.matches("[a-zA-Z- ]*]")) {
                throw new Myexception("Name can't contain number!!!");
            } else {
                return name;
            }
        } catch (Myexception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static String getPersonLastNAme(String lastName) {
        try {
            if (!lastName.matches("[a-zA-ZА-Яа-я- ]*]")) {
                throw new Myexception("Name can't contain number!!!");
            } else {
                return lastName;
            }
        } catch (Myexception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static int getAgeOfPerson(int age) {
        try {
            if (age < 0) {
                throw new Myexception("Age can't be negative number");
            } else {
                return age;
            }
        } catch (InputMismatchException | Myexception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public static String getPersonEmail(String email) {
        boolean isFalse = false;
        try {
            if (!email.contains("@") || !email.contains(".com") || email.matches("[a-zA-Zа-яА-Я- ]*")) {
                isFalse = false;
                throw new Myexception("Wrong format email!");
            } else {
                isFalse = true;
            }
        } catch (Myexception e) {
            System.out.println(e.getMessage());
        }
        if (isFalse) {
            return email;

        }
        return null;
    }

}