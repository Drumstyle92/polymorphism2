/**
 * @author Drumstyele92
 * animal subclass
 */
public class Cow extends Animal{
    /**
     *
     * @param name name of the Cow that we will indicate.
     * constructor taken from the Animal class.
     *
     */
    public Cow(String name) {
        super(name);
    }

    /**
     * method taken from the Animal class for sound.
     */
    public void animalSound(){
        System.out.println(" The sound of the " + this.animalName + " is muuuuuuu!");
    }
}
