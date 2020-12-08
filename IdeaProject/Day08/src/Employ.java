public class Employ {
    private String empNo;
    private String empName;
    private double salary;
    private String gender;

    public Employ() {
    }

    public Employ(String empNo) {
        this.empNo = empNo;
    }

    public Employ(String empNo, String empName) {
        this.empNo = empNo;
        this.empName = empName;
    }

    public Employ(String empNo, String empName, double salary) {
        this.empNo = empNo;
        this.empName = empName;
        this.salary = salary;
    }

    public Employ(String empNo, String empName, double salary, String gender) {
        this.empNo = empNo;
        this.empName = empName;
        this.salary = salary;
        this.gender = gender;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public  void  getInfo(){
        System.out.println("员工编号='" + empNo + '\'' +
                ", 员工姓名='" + empName + '\'' +
                ", 薪资=" + salary +
                ", 性别='" + gender + '\'' );
    }
}
