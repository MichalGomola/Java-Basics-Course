public class ProblemSetOne {
    public static void main(String[] args){
        // question 3
        int bankBalance = 500;
        bankBalance += 250;
        bankBalance -= 100;
        System.out.println(bankBalance);

        // question 5
        int day = 24;
        String month = "January";

        // question 6
        String firstName = "Michal";
        String lastName = "Gomola";
        String fullName = firstName + " " + lastName;
        System.out.println("Hallo, my name is " + fullName);
        System.out.println("There are " + (firstName.length()+lastName.length()) + " letters in my name");

        // questtion 7
        double fahrenheit = 92.0;
        double celsius = (fahrenheit - 32)*5/9;
        System.out.println("Celsius value is: " + celsius);
    }
}
