public class Duck extends Pet{
    public Duck(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    @Override
    public String toString() {
        return "Name: " + name
                + ", Age:" + age
                + ", Sex:" + sex;
    }
}
