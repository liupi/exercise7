public class Mammal extends Animal {
    private String species;

    public Mammal() {
        super();
        this.species = "";
    }

    public Mammal(String species, int age) {
        this.species = species;
        this.setAge(age);
    }

    public Mammal(String species,  int age, String name) {
        this.species = species;
        this.setAge(age);
        this.setName(name);
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return this.species;
    }

    @Override
    public void eat(String food) {
        System.out.println("Mammal eats food: " + food);
    }

    @Override
    public void getVoice(){
        System.out.println("Mammal makes sound");
    }

    @Override
    public String toString() {
        return "Mammal{" + "name=" + getName() + ", age=" + getAge() +
                ", weight=" + getWeight() + ", species=" + getSpecies() + '}';
    }
}
