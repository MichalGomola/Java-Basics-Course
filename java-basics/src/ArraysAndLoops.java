public class ArraysAndLoops {
    public static void main(String[] args) {
        double[] temepratures = {75, 73, 72, 80};
        double size = temepratures.length;
        double total = 0;
        for (double temp : temepratures) {
            total += temp;
        }
        double average = total/size;
        System.out.println(average);

        double[] times = {7.85, 7.32, 4.9, 6.22, 5.4, 7.3, 5.19};
        double min = times[0];
        for (double time : times) {
            if (time < min) {
                min = time;
            }
        }
        System.out.println(min);
    }
}
