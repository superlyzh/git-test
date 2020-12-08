public class EmployeeDemo {
    public static void main(String[] args) {
        Employ e = new Employ();
        e.setEmpName("张三");
        e.setEmpNo("s001");
        e.setSalary(5000);
        e.setGender("男");
        e.getInfo();

        new Employ("s002").getInfo();
        new Employ("s003","李四").getInfo();
        new Employ("s004","王五",6000).getInfo();
        new Employ("S005","赵六",8000,"女").getInfo();
    }


}

