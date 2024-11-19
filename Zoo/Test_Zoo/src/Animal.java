public class Animal {
    // Attributes
    protected String name;
    protected int age;
    protected Species species;
    protected Diet diet;
    protected Origin origin;
    protected Sex sex;
    protected Status status;

    //Constructor
    public Animal(String name, int age, Species species, Diet diet, Origin origin, Sex sex, Status status) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.diet = diet;
        this.origin = origin;
        this.sex = sex;
        this.status = status;
    }

    //Getter & Setter
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
        else {
            System.out.println("Das Alter darf nicht negativ sein.");
        }
    }

    public int getAge() {
        return age;
    }

    //Methods
    public void feed() {
    /*
    wenn status = hungry, dann Fütterung durch Staff
    Ausnahme: wenn status = sick, dann Spezialfutter
    wenn Fütterung erfolgt, dann status = ok
    Futterart muss zu Spezies passen
     */

    System.out.println(name + ", Art: " + species + ", wird mit " + diet + " gefüttert.");
    }

    public void clean() {
    // wenn status = dirty, dann Säuberung durch Staff
    }

    public void treat() {
    /*
    wenn status = sick, dann Behandlung durch Staff
    wenn status = sick, dann Separierung in spezielles Gebäude
     */
    }

    public void move() {
    // das Tier bewegt sich
        System.out.println(name + " bewegt sich im Gehege.");
    }

    public void transfer() {
     /*
    wenn status = sick, dann Separierung in spezielles Gebäude
    wenn neues Tier, dann Zuweisung in Gehege
    wenn status = dead, dann Entfernung aus Gehege
     */
    }

    public void info(){
        // gibt alle Informationen zu Tieren aus
        System.out.println("Name: " + name);
        System.out.println("Alter: " + age);
        System.out.println("Spezies: " + species);
        System.out.println("Futter: " + diet);
        System.out.println("Herkunft: " + origin);
        System.out.println("Geschlecht: " + sex);
        System.out.println("Status: " + status);
    }

    //Enums
    public enum Species {
        LÖWE, ECHSE
    }
    public enum Diet {
        FLEISCH, OBST, GEMÜSE, PFLANZEN, INSEKTEN
    }
    public enum Origin {
        NORDAMERIKA, EUROPA, SÜDAFRIKA, AFRIKA, ASIEN, AUSTRALIEN, ANTARKTIS
    }
    public enum Sex {
        FEMALE, MALE
    }
    public enum Status {
        HEALTHY, SICK, DIRTY, HUNGRY, DEAD, IN_TREATMENT
    }
}
