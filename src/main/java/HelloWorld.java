import java.time.LocalTime;
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        Greeting greeter = new Greeting();
        System.out.println(greeter.sayHello());
        Date currentDate = new Date();
        System.out.println("Current date is: " + currentDate);
        LocalTime currentTime = LocalTime.now();
    }
}
