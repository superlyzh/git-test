package com.pluto.cusromermanager;
//客户信息管理系统主界面类（视图类）

public class CustomerView {
    private CustomerLiist customers = new CustomerLiist(10);

    /**
     * 主菜单
     */
    public void enterMainMenu() {
        boolean loopFlag = true;
        do {
            System.out.println("-----------------客户信息管理软件-----------------");
            System.out.println("                   1 添 加 客 户");
            System.out.println("                   2 修 改 客 户");
            System.out.println("                   3 删 除 客 户");
            System.out.println("                   4 客 户 列 表");
            System.out.println("                   5 退       出");
            System.out.println();
            System.out.print("                   请选择(1-5)：");
            char c = CMUtility.readMenuSelection();

            switch (c) {
                case '1':
                    //添加用户
                    addNewCustomer();
                    break;
                case '2':
                    //修改
                    modifyCustomer();
                    break;
                case '3':
                    //删除
                    deleteCustomer();
                    break;
                case '4':
                    //用户列表
                    listAllCustomers();
                    break;
                case '5':
                    //退出
                    System.out.println("确认是否退出(Y/N)：");
                    char yn = CMUtility.readChar();
                    if (yn == 'Y') {
                        loopFlag = false;
                    }
                    break;
            }
        } while (loopFlag);

    }

    /**
     * 添加用户
     */
    private void addNewCustomer() {
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(20);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(11);
        System.out.print("邮箱：");
        String email = CMUtility.readString(30);
        //把客户信息封装到对象
        Customer c = new Customer(name, gender, age, phone, email);
        //把对象添加到数组中
        boolean flag = customers.addCustomer(c);
        if (flag) {
            System.out.println("---------------------添加完成---------------------");
        } else {
            System.out.println("容量已满，添加失败！");
        }

    }

    /**
     * 修改客户信息
     */
    private void modifyCustomer() {
        System.out.println("---------------------修改客户---------------------");
        System.out.println("请选择待修改客户编号(-1退出)：");

        Customer customer = null;
        int id = -1;
        //无限循环
        for (; ; ) {
            //输入用户编号
            id = CMUtility.readInt();
            if (id == -1) {
                return;//结束方法
            }
            //判断此编号的客户是否存在
            customer = customers.getCustomer(id - 1);
            if (customer == null) {
                System.out.println("无法找到指定客户！");
            } else {
                break;
            }
        }
        //获取新对象的信息
        System.out.print("姓名(" + customer.getName() + ")：");
        String name = CMUtility.readString(20, customer.getName());
        System.out.print("姓别(" + customer.getGender() + ")：");
        char gender = CMUtility.readChar(customer.getGender());
        System.out.print("年龄(" + customer.getAge() + ")：");
        int age = CMUtility.readInt(customer.getAge());
        System.out.print("电话(" + customer.getPhone() + ")：");
        String phone = CMUtility.readString(11, customer.getPhone());
        System.out.print("邮箱(" + customer.getEmail() + ")：");
        String email = CMUtility.readString(30, customer.getEmail());
        //把用户信息封装成对象
        Customer cust = new Customer(name, gender, age, phone, email);

        boolean flag = customers.replaceCustomer(id - 1, cust);

        if (flag) {
            System.out.println("---------------------修改完成---------------------");
        } else {
            System.out.println("修改失败");
        }

    }

    /**
     * 删除客户
     */
    private void deleteCustomer() {
        System.out.println("---------------------删除客户---------------------");
        System.out.println("请选择待删除客户编号(-1退出)：");
        Customer customer = null;
        int id = -1;
        //无限循环
        for (; ; ) {
            //输入用户编号
            id = CMUtility.readInt();
            if (id == -1) {
                return;//结束方法
            }
            //判断此编号的客户是否存在
            customer = customers.getCustomer(id - 1);
            if (customer == null) {
                System.out.println("无法找到指定客户！");
            } else {
                break;
            }
        }

        System.out.println("确认是否删除(Y/N)：");
        char yn = CMUtility.readChar();
        if (yn == 'Y') {
            customers.deleteCustomer(id - 1);
            System.out.println("---------------------删除完成---------------------");
        }
    }

    /**
     * 查看用户列表
     */
    private void listAllCustomers(){
        System.out.println("---------------------------客户列表---------------------------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
        Customer[] cs = customers.getAllCustomers();
        for (int i = 0; i < cs.length; i++) {
            System.out.println(i+1+"\t"+cs[i].getName()+"\t"+cs[i].getGender()+"\t"
                    +cs[i].getAge()+"\t"+cs[i].getPhone()+"\t"+cs[i].getEmail());
        }
        System.out.println("-------------------------客户列表完成-------------------------");
    }

    public static void main(String[] args) {
        CustomerView cv = new CustomerView();
        cv.enterMainMenu();
    }
}
