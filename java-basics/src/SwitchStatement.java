public class SwitchStatement {
    public static void main(String[] args) {
        int passcode = 629;
        String coffeeType;

        switch (passcode) {
            case 555: coffeeType = "Espresso"; break;
            case 312: coffeeType = "Vanilla latte"; break;
            case 629: coffeeType = "Drip coffee"; break;
            default: coffeeType = "Unknown";
        }
        System.out.println(coffeeType);
    }
}
