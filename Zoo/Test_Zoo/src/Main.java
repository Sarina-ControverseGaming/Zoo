public class Main {
    public static void main(String[] args) {

        //Attributes
        Animal[] auflistungTiere = new Animal[4];

        //Objekterstellung, String name, byte age, Species species, Diet diet, Origin origin, Sex sex, Status status
    Animal lion1 = new Animal(
            "Kevin",
            12,
            Animal.Species.LÖWE,
            Animal.Diet.FLEISCH,
            Animal.Origin.AFRIKA,
            Animal.Sex.MALE,
            Animal.Status.HEALTHY);

    Mammal lion2 = new Mammal(
            "Sarina",
            10,
            Animal.Species.LÖWE,
            Animal.Diet.FLEISCH,
            Animal.Origin.AFRIKA,
            Animal.Sex.FEMALE,
            Animal.Status.HEALTHY,
            "smooth");

    Reptile lizard1 = new Reptile(
            "Kori",
            8,
            Animal.Species.ECHSE,
            Animal.Diet.FLEISCH,
            Animal.Origin.AFRIKA,
            Animal.Sex.FEMALE,
            Animal.Status.HEALTHY,
            true);

    Mammal lion3 = new Mammal ("Christian", 13, Animal.Species.LÖWE, Animal.Diet.FLEISCH, Animal.Origin.AUSTRALIEN, Animal.Sex.MALE, Animal.Status.HUNGRY, "curly");

        //Array befüllen
        auflistungTiere[0] = lizard1;
        auflistungTiere[1] = lion1;
        auflistungTiere[2] = lion2;
        auflistungTiere[3] = lion3;

        //Testausgaben
        for (int i = 0; i < auflistungTiere.length; i++){
            //System.out.println(auflistungTiere[i].name);
            auflistungTiere[i].info();
            System.out.println();
        }



    }

}