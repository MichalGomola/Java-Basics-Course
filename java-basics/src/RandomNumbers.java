public class RandomNumbers {
    public static void main(String[] args) {
        System.out.print(rollDice(6));
    }
    /*
    * rollDice function makes a dice roll
    * @param sides - the number of sides dice have (int)
    *
    * @return random roll value (int)
     */
    public static int rollDice(int sides) {
        return (int) (Math.random()*sides+1); // returns value between 1 and 6
    }
}
