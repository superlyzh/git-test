public class UserDemo {
    public static void main(String[] args) {
        User user = new User();
        user.setId("S001");
        user.setName("张三");
        user.setPassword("1234");
        user.setGender("男");
        user.setAge(19);
        user.setAddress("湖南省长沙市");
        System.out.println(user.toString());
    }
}
