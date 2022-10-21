/**
 * @author Drumstyele92
 * class that contains the core of the program.
 */
public class Zoo {
    /**
     *
     * @param args main parameter.
     * main method which contains 3 class objects and methods to show various class sounds.
     *             
     */
    public static void main(String[] args) {
        // creation of objects
        Animal animal = new Animal(" Max ");
        Lion lion = new Lion(" Luis ");
        Cow cow = new Cow(" Giusy ");
        // show sounds
        System.out.println("--------------------------------------");
        animal.animalSound();
        System.out.println("--------------------------------------");
        lion.animalSound();
        System.out.println("--------------------------------------");
        cow.animalSound();



    }
}
