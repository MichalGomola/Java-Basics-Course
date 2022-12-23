public class ProblemSetFour {
    public static void main(String[] args) {
        //question 1
        int i = 10;
        while (i < 50) {
            i = i*2;
        }
        System.out.println(i);
    }

    // question 2
    public static int factoria(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // question 3
    public int indexOfFirstOccurrence(String[] stringArray, String target) {
        int len = stringArray.length;
        for (int i = 0; i < len; i++) {
            if (target.equals(stringArray[i])) {
                return i;
            }
        }
        return -1;
    }

    // question 4
    public int yearsTilOneMillion(double initialBalance) {
        double balance = 1.05 * initialBalance;
        int years = 1;
        while (balance < 1000000) {
            balance *= 1.05;
            years++;
        }
        return years;
    }

    // question 5
    public void printInReverse(String[] stringArray) {
        int len = stringArray.length;
        for (int i = len-1; i >= 0; i--) {
            System.out.println(stringArray[i]);
        }
    }

    // question 6
    public int findRange(int[] intArray) {
        int max = intArray[0];
        int min = intArray[0];
        int len = intArray.length;
        for (int i = 0; i < len; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        return max - min;
    }

    //question 8
    public static int diceRoll() {
        return (int) (Math.random()*6+1);
    }

    public static int monopolyRoll() {
        int a = diceRoll();
        int b = diceRoll();
        int sum = a + b;
        if (a != b) {
            return sum;
        } else {
            int counter = 1;
            while (a == b) {
                a = diceRoll();
                b = diceRoll();
                sum = sum + a + b;
                if (a == b) {
                    counter++;
                }
                if (counter == 3) {
                    System.out.println("You go to jail!");
                    return 0;
                }
            }
        }
        return sum;
    }
}
