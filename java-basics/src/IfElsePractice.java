public class IfElsePractice {
    public static void main(String[] args){

        boolean passport = false;
        boolean birthCertificate = true;
        boolean driversLicense = true;

        if (passport) {
            System.out.println("A passport is valid ID.");
        } else if (birthCertificate) {
            System.out.println("A birth certificate is valid ID.");
        } else if (driversLicense) {
            System.out.println("A driver's license is valid ID.");
        } else {
            System.out.println("Invalid ID. Your application is denied");
        }
    }
}
