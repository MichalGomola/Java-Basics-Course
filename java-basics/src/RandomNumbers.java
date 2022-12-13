public class RandomNumbers {
    public static void main(String[] args) {
        System.out.print(rollDice());
    }
    public static int rollDice() {
        return (int) (Math.random()*6+1); // returns value between 1 and 6
    }
}
