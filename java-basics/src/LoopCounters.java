public class LoopCounters {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Warning #" + i);
        }

        for (int i = 1; i <= 3; i++) {
            int x = i - 1;
            System.out.println(x);
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println(i*2);
        }

        int sum = 0;
        for (int i = 15; i <= 20; i++) {
            sum += i;
        }
        System.out.println(sum);

        for (int i = 3; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
