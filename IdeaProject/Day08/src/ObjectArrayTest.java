public class ObjectArrayTest {
    public static void main(String[] args) {
        Student[] stu = new Student[3];

        stu[0] = new Student();
        stu[0].name = "张三";
        stu[0].score = 96;

        stu[1] = new Student();
        stu[1].name = "李四";
        stu[1].score = 95;

        stu[2] = new Student();
        stu[2].name = "王五";
        stu[2].score = 50;

        Student[] temp = new Student[1];
        for (int j = 0; j < stu.length-1; j++) {
            for (int i = 0; i < stu.length-1; i++) {
                if(stu[i].getScore() > stu[i+1].getScore()){
                    temp[0] = stu[i];
                    stu[i] = stu[i+1];
                    stu[i+1] = temp[0];
                }
            }

        }
        for (int i = 0; i < stu.length; i++) {
            System.out.println(stu[i].getName()+"-------"+stu[i].getScore());
        }
    }
}
