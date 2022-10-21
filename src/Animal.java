/**
 * @author Drumstyele92
 * parent class with characteristics and methods on animals.
 */
public class Animal {
    /**
     * Name of the animal
     */
    public String animalName;

    /**
     *
     * @param name parameter on which the name of the animal is indicated.
     * Constructor of the Animal class.
     *
     */
    public Animal(String name){
        this.animalName = name;
    }

    /**
     * method on animal sounds.
     */
    public void animalSound(){
        System.out.println(this.animalName + "has the default animal sound.");
    }
}
