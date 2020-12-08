package oop;

public class DemoStdent {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setAge(1);
        stu.setName("张三");
        stu.setScore(100);

        System.out.println(stu.toString());
        stu.Study();
        stu.Eat();
    }
}
