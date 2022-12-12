public class Variables {
    public static void main(String[] args) {
        int passengers;
        passengers = 0;
        // 1st bus stop
        passengers += 5;
        // 2nd bus stop
        passengers -= 3;
        // 3rd bus stop
        passengers = passengers - 1 + 5;

        System.out.println("passengers in a bus after third stop: " + passengers);

    }
}
