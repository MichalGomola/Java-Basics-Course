public class ParametersAndArguments {
    public static void main(String[] args) {
        String location = "Bartoszyce";

        greetings(location);
    }

    public static void greetings(String city) {
        System.out.print("Hello, " + city);
    }
}
