public class Reptile extends Animal {
    //Attributes
    boolean isPoisonous;

    //Constructor
    public Reptile (String name, int age, Animal.Species species, Animal.Diet diet, Animal.Origin origin, Animal.Sex sex, Animal.Status status, boolean isPoisonous) {
        super(name, age, species, diet, origin, sex, status);
        this.isPoisonous = isPoisonous;
    }

    //Methods
    public void sunbath(){
        System.out.println(name + " sonnt sich.");
    }

    @Override
    public void move(){
        System.out.println(name + " krabbelt durch's Gehege.");
    }

    @Override
    public void info(){
        // gibt alle Informationen zu Tieren aus
        super.info();
        if (isPoisonous) {
            System.out.println("Giftig: Ja");
        }
        else {
            System.out.println("Giftig: Nein");
        }
    }
}
