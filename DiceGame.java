public class DiceGame {

    public static void main(String[] args) {

        System.out.println("Creating a default d6...");
        Die d6 = new Die();
        System.out.println("Creating a d20...");
        Die d20 = new Die(20);
        System.out.println("reating percentile die (a special d7)...");
        Die d7 = new Die(7);
        System.out.println("The current side up for " + d6.getName() + " is " + d6.getSideUp());
        System.out.println("The current side up for " + d20.getName() + " is " + d20.getSideUp());
        System.out.println("The current side up for Percentile  is " + d7.getSideUp());


        //test roll method
        System.out.println("\nTesting the roll method");


        System.out.println("\nRolling the d6...");
        d6.roll();
        System.out.println("The new value is " + d6.getSideUp());
        System.out.println("Rolling the d20...");
        d20.roll();
        System.out.println("The current side up for d20 is " + d20.getSideUp());

        System.out.println("Rolling the Percentile...");
        d7.roll();
        System.out.println("The new value is " + d7.getSideUp());

        System.out.println("\nSetting the d20 to show 20...");
        d20.setSideUp(20);
        System.out.println("The side up is now " + d20.getSideUp() + ". Finally.");

    }
}
