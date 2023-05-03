public class Cat implements AnimalSound{
    private String name;

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String printingSound(String suffix) {
        return suffix;
    }
}
