public class Blowfish extends Fish{
    private String toxicLevel;

    public Blowfish() {
        super();
        this.toxicLevel = "";
    }

    public Blowfish(String toxicLevel, String group, String name, int age, int weight) {
        super(group, name, age,  weight);
        this.toxicLevel = toxicLevel;
    }

    public Blowfish(String toxicLevel, String group, String name, int age) {
        super(group, name, age);
        this.toxicLevel = toxicLevel;
    }

    public void setToxicLevel(String toxicLevel) {
        this.toxicLevel = toxicLevel;
    }

    public String getToxicLevel() {
        return toxicLevel;
    }

    public void blow() {
        System.out.println("Blowfish blows");
    }

    @Override
    public void hide() {
        System.out.println("Blowfish hides");
    }

    @Override
    public void eat(String food) {
        System.out.println("Blowfish eats food: " + food);
    }

    @Override
    public void getVoice(){
        System.out.println("Blowfish makes sound");
    }

    @Override
    public String toString() {
        return "Blowfish{" + "name=" + getName() + ", age=" + getAge() +
                ", weight=" + getWeight() + ", group=" + getGroup() + ", toxicLevel=" + toxicLevel + '}';
    }
}
