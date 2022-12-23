public class keepRolling {
    public static void main(String[] args) {
        int dice1 = rollDice(6);
        int dice2 = rollDice(6);
        int dice3 = rollDice(6);
        int dice4 = rollDice(6);
        int dice5 = rollDice(6);
        int counter = 1;
        System.out.println("Dice1: " + dice1 + ", Dice2: " + dice2 + ", Dice3: " + dice3 + ", Dice4: " + dice4 + ", Dice5: " + dice5);
        while (!(dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)) {
            dice1 = rollDice(6);
            dice2 = rollDice(6);
            dice3 = rollDice(6);
            dice4 = rollDice(6);
            dice5 = rollDice(6);
            counter++;
            System.out.println("Dice1: " + dice1 + ", Dice2: " + dice2 + ", Dice3: " + dice3 + ", Dice4: " + dice4 + ", Dice5: " + dice5);
        }
        System.out.println("You get yhatzee: " + dice1 + " after " + counter + " rolls");
    }

    public static int rollDice(int sides) {
        return (int) (Math.random()*sides+1); // returns value between 1 and 6
    }
}
