//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal[] animal = new Animal[]{
                new Mammal("Dog", "Max", 1 , 5),
                new Dog("Small", "Dog", "Bim", 5, 7),
                new Bird("White", "Owl", 2, 3),
                new Pigeon("Domestic", "Brown", "Pippin", 5, 1),
                new Fish("Bony", "Ra", 1, 1),
                new Blowfish("Toxic", "Pufferfish", "Fugu", 8)
        };

        animal[0].eat("meat");
        animal[1].eat("chicken");
        animal[2].eat("insect");
        animal[3].eat("bread");
        animal[4].eat("worm");
        animal[5].eat("algae");

        System.out.println();

        animal[0].getVoice();
        animal[1].getVoice();
        animal[2].getVoice();
        animal[3].getVoice();
        animal[4].getVoice();
        animal[5].getVoice();

        System.out.println();

        System.out.println(animal[0]);
        System.out.println(animal[1]);
        System.out.println(animal[2]);
        System.out.println(animal[3]);
        System.out.println(animal[4]);
        System.out.println(animal[5]);

    }
}