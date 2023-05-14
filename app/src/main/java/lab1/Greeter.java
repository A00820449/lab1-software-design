package lab1;

public class Greeter {
    public String getGreeting(String name) {
        if (name.trim().equals("")) {
            return getGreeting();
        }
        return "Hello, " + name + "!";
    }
    public String getGreeting() {
        return "Hello!";
    }
}
