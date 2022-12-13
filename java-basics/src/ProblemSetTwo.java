public class ProblemSetTwo {
    public static void main(String[] args) {
        // question 1
        double balance = 0;
        balance = balance + 20; //Add quarter 1 profits (thousands).
        balance = balance - 25; //Subtract quarter 1 expenses (thousands).
        balance = balance + 30; //Add quarter 2 profits (thousands).
        balance = balance - 25; //Subtract quarter 1 expenses (thousands).
        if (balance < 0) {
            System.out.println("We’re in the red!");
        } else if (balance > 0) {
            System.out.println("We made a profit!");
        } else {
            System.out.println("We broke even.");
        }

        // question 2
        int dogs = 1;
        int cats = 2;
        if (dogs > 0 && cats == 0) {
            if (dogs > 1) {
                System.out.println("Dog lover");
            } else {
                System.out.println("Dog person");
            }
        } else if (cats > 0 && dogs == 0) {
            if (cats > 1) {
                System.out.println("Cat lover");
            } else {
                System.out.println("Cat person");
            }
            System.out.println("Meow!");
        } else if (cats > 0 && dogs > 0) {
            if (dogs > cats) {
                System.out.println("I guess you like dogs more");
            } else if (dogs == cats) {
                System.out.println("I guess you like both equally");
            } else {
                System.out.println("I guess you like cats more");
            }
        } else {
            System.out.println("What, don’t you like pets?");
        }

        // question 3
        boolean canSeeplayer = true;
        boolean playerPoweredUp = false;

        if (canSeeplayer) {
            if (!playerPoweredUp) {
                System.out.println("Attack!");
            } else {
                System.out.println("Run away!");
            }
        } else {
            System.out.println("Wander.");
        }

        // question 4
        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 60.0;

        if (isSnowing || isRaining || temperature < 50) {
            System.out.println("Let's stay home.");
        } else {
            System.out.println("Let's go out!");
        }

        // question 5
        int time = 18;
        String timeOfDay;

        if (5 <= time && time < 12) {
            timeOfDay = "morning";
        } else if (12 <= time && time < 20) {
            timeOfDay = "daytime";
        } else {
            timeOfDay = "night";
        }

        // question 6
        int weekday = 5;
        boolean holiday = false;

        if (weekday >= 1 && weekday <= 5 && !holiday) {
            System.out.println("Wake up at 7:00");
        } else {
            System.out.println("Sleep in!");
        }

        // question 8
        int dayOfWeek = 1;
        String schedule;

        switch (dayOfWeek) {
            case 1: schedule = "Gym in the morning."; break;
            case 2: schedule = "Class after work."; break;
            case 3: schedule = "Meetings all day."; break;
            case 4: schedule = "Work from home."; break;
            case 5: schedule = "Game night after work."; break;
            case 6: case 7: default: schedule = "Free!"; break;
        }
        System.out.println(schedule);
    }
}
