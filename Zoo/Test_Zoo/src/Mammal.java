public class Mammal extends Animal {
    //Attributes
    private String furType;

    //Constructor
    public Mammal(String name, int age, Species species, Diet diet, Origin origin, Sex sex, Status status, String furType) {
        super(name, age, species, diet, origin, sex, status);
        this.furType = furType;
    }

    //Methods
    public void nurse() {
        if (sex == Sex.FEMALE) {
            System.out.println(name + " säugt ihre Jungen.");
        }
        else {
            System.out.println(name + " kann keine Jungen säugen.");
        }
    }

    @Override
    public void move(){
        System.out.println(name + ", das Säugetier, läuft durch's Gehege.");
    }

    @Override
    public void info(){
        // gibt alle Informationen zu Tieren aus
        super.info();
        System.out.println("Fell: " + furType);
    }
}


