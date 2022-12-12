public class StringConcatenation {
    public static void main(String[] args) {
        String driverFirstName = "Mikele";
        String driverLastName = "Smith";
        String driverFullName = driverFirstName + " " + driverLastName;
        System.out.println(driverFullName);

        int stops = 0;
        int fare = 0;
        stops += 1;
        fare += 5;
        stops += 1;
        fare += 3;
        stops += 1;
        fare += 7;
        System.out.println("The bus made $"+ fare + " after " + stops + " stops.");
    }
}
