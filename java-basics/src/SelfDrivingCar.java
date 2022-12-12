public class SelfDrivingCar {
    public static void main(String[] args) {
        //recognize traffic lights
        boolean isLightGreen = true;
        boolean isLightYellow = false;

        if (isLightGreen) {
            double carSpeed = 100;
            System.out.println("Drive!");
            System.out.println("Driving speed: " + carSpeed);
        } else if (isLightYellow) {
            System.out.println("Slow down.");
        } else {
            System.out.println("Stop.");
        }
    }
}
