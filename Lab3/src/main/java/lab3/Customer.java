package lab3;

import java.io.*;
import java.util.Objects;

public class Customer implements Serializable {
    private int age;
    private int sex;
    private String[] hobbies;

    public Customer(int theAge, int theSex, String[] theHobbies) {
        age = theAge;
        sex = theSex;
        hobbies = theHobbies;
    }

    public int getAge() {
        return age;
    }

    public int getSex() {
        return sex;
    }

    public boolean hasHobby(String aHobby) {
        if (Objects.equals(aHobby, ""))
            return true;
        for (String hobby : hobbies)
            if (hobby.equals(aHobby))
                return true;
        return false;
    }

    public void reset() {
        age = 0;
        sex = 0;
        hobbies = null;
    }

    public String toString() {
        String result = "Age: " + age + ", Sex: ";
        if (sex == Product.MALE)
            result += "Male";
        else if (sex == Product.FEMALE)
            result += "Female";
        else
            result += "Male or Female";
        result += ", Hobbies:";
        for (String hobby : hobbies) result += " " + hobby;
        return result;
    }
}


