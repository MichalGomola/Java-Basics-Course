public class ProblemSetThree {
    public static void main(String[] args) {

    }

    // question 4
    public static double absoluteValue(double x) {
        if (x >= 0) {
            return x;
        } else {
            return -x;
        }
    }

    // question 5
    public static double calculateTip(double mealCost) {
        return 0.15*mealCost;
    }

    // question 6
    public static String nametagText(String name) {
        return ("Hello my name is " + name);
    }

    // question 7
    /** Converts from fahrenheit to celsius degrees
    * @param temp - temperature in fahrenheit (double)
    *
    * @return celsius value of temperature
     */
    public static double fahrenheitToCelsius(double temp) {
        return (temp - 32)*5/9;
    }
    /**
     * Prints a temperature in both Fahrenheit and Celsius degrees.
     * @param fahrenheit Temperature in degrees Fahrenheit.
     */

    public static void printTemperature (double fahrenheit) {
        System.out.println("F: " + fahrenheit);
        System.out.println("C: " + fahrenheitToCelsius(fahrenheit));
    }

    // question 8

    public static int diceRoll() {
        return (int) (Math.random()*6+1);
    }

    public static int monopolyRoll() {
        int a = diceRoll();
        int b = diceRoll();
        if (a != b) {
            return a + b;
        } else {
            int c = diceRoll();
            int d = diceRoll();
            return a + b + c + d;
        }
    }
}
