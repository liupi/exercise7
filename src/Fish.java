public class Fish extends Animal {
    private String group;

    public Fish() {
        super();
        this.group = "";
    }

    public Fish(String group, String name, int age) {
        super(name, age);
        this.group = group;
    }

    public Fish(String group, String name, int age, int weight) {
        super(name, age, weight);
        this.group = group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public void eat(String food) {
        System.out.println("Fish eats food: " + food);
    }

    @Override
    public void getVoice(){
        System.out.println("Fish makes sound");
    }

    @Override
    public String toString() {
        return "Fish{" + "name=" + getName() + ", age=" + getAge() +
                ", weight=" + getWeight() + ", group=" + getGroup() + '}';
    }
}
