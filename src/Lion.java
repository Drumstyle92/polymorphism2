/**
 * @author Drumstyle92
 * animal subclass
 */
public class Lion extends Animal{
    /**
     *
     * @param name name of the lion that we will indicate.
     * constructor taken from the Animal class.
     *
     */
    public Lion(String name) {
        super(name);
    }

    /**
     * method taken from the Animal class for sound.
     */
    public void animalSound(){
        System.out.println(" The sound of the "+ this.animalName +" is roarrrr!");
    }
}
