package Maven;

import com.google.gson.Gson;

import java.util.Collections;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Person person = new Person("Eugene", "Petrovytskyi");
        System.out.println(new Gson().toJson(person));

    }

}
