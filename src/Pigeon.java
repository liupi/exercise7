public class Pigeon extends Bird{
    private String family;

    public Pigeon() {
        super();
        this.family = "";
    }

    public Pigeon(String family, String featherColor, int age) {
        super(featherColor, age);
        this.family = family;
    }

    public Pigeon(String family, String featherColor, String name, int age, int weight) {
        super(featherColor, name, age, weight);
        this.family = family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getFamily() {
        return family;
    }

    public void group() {
        System.out.println("Pigeon is grouping");
    }

    @Override
    public void fly() {
        System.out.println("Pigeon is flying");
    }

    @Override
    public void eat(String food) {
        System.out.println("Pigeon eats food: " + food);
    }

    @Override
    public void getVoice() {
        System.out.println("Pigeon makes sound");
    }

    @Override
    public String toString() {
        return "Pigeon{" + "name=" + getName() + ", age=" + getAge() +
                ", weight=" + getWeight() + "featherColor=" + getFeatherColor() +", family=" + family + '}';
    }

}
