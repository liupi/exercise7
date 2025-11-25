public class Bird extends Animal {
    private String featherColor;

    public Bird() {
        super();
        this.featherColor = "";
    }

    public Bird(String featherColor, int age) {
        setAge(age);
        this.featherColor = featherColor;
    }

    public Bird(String featherColor, String name, int age, int weight) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void eat(String food) {
        System.out.println("Bird eats food: " + food);
    }

    @Override
    public void getVoice() {
        System.out.println("Bird makes sound");
    }

    @Override
    public String toString() {
        return "Bird{" + "name=" + getName() + ", age=" + getAge() +
                ", weight=" + getWeight() + "featherColor=" + featherColor + '}';
    }
}
