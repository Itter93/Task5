public class Pet {
    String name;
    int age;
    String color;
    String sex;

    @Override
    public String toString() {
        return "Name: " + name
                + ", Age:" + age
                + ", Color:" + color;
    }
}
