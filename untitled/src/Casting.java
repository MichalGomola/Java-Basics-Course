public class Casting {
    public static void main(String[] args){
        double current = 17;
        double rate = 1.5;
        double future = current * rate;
        System.out.println(future);
        int approx = (int) future;
        System.out.println(approx);

        int x = 5;
        int y = 2;
        int div = x/y;
        System.out.println(div);
        System.out.println((double)x/y);
    }
}
