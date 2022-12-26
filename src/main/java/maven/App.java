package maven;

import com.google.gson.Gson;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Person person = new Person("Eugene", "Petrovytskyi");
        System.out.println(new Gson().toJson(person));

    }

}
