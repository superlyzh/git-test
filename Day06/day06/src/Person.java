public class Person {
    private String Name;
    private int Age;
    private double Weight;

    public Person() {
        super();
    }

    public Person(String name, int age, double weight) {
        Name = name;
        Age = age;
        Weight = weight;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Weight=" + Weight +
                '}';
    }
}
