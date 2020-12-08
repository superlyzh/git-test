package oop;

public class Student {
    private String name;
    private int age;
    private double score;

    public void Study(){
        System.out.println("好好学习,天天向上");
    }

    public void Eat(){
        System.out.println("吃饭");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 1){
            System.out.println("年龄输入有误,请重新输入");
            this.age = 0;
        }else {
            this.age = age;
        }
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if(score > 100|| score < 0){
            System.out.println("成绩输入有误,请重新输入");
            this.score = 0;
        }else {
            this.score = score;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
