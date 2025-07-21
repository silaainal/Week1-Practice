public class Main {

    public static String greet (String name){
        return "Hello "+name+"!";
    }

    public static void main(String[] args) {
        String day = "Monday";
        int age = 18;

        if (age >= 18) {
            System.out.println("You are old enough to vote!");
        } else {
            System.out.println("You are too young to vote!");
        }

        switch (day) {
            case "Monday":
                System.out.println("Start of the week.");
                break;
            case "Friday":
                System.out.println("Almost weekend!");
                break;
            default:
                System.out.println("Just another day!");
        }

        for (int i = 1; i <= age; i++) {
            System.out.println("I am learning to code from start!");
            System.out.println(i);
        }

        int x = 1;
        while (x < 7) {
            System.out.println("I am trying my best!");
            System.out.println(x);
            x++;
        }

        System.out.println(greet("Sıla"));
    }
}