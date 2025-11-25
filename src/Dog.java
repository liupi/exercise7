public class Dog extends Mammal {
    private String size;

    public Dog() {
        super();
    }

    public Dog(String size, String name, int age) {
        super(name, age);
        this.size = size;
    }

    public Dog(String size, String species, String name, int age, int weight) {
        super(species, name, age, weight);
        this.size = size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return this.size;
    }

    public void paw() {
        System.out.println("Dog gives a paw");
    }

    @Override
    public void drinkMilk() {
        System.out.println("Dog drinks milk");
    }

    @Override
    public void eat(String food) {
        System.out.println("Dog eats food: " + food);
    }

    @Override
    public void getVoice(){
        System.out.println("Dog makes sound");
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + getName() + ", age=" + getAge() +
                ", weight=" + getWeight() + ", species=" + getSpecies() + ", size=" + getSize() +  '}';
    }

}
