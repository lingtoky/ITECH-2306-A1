package A1;

public class Customer {
    //客户名字
    String name;
    //订单日期
    String date;
    //订单时间
    String time;
    //订单地址
    String address;
    //客户电话号码
    String phoneNumber;

    public Customer() {
    }

    //构造方法
    public Customer(String name, String day, String time, String address, String phoneNumber) {
        this.name = name;
        this.date = day;
        this.time = time;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}
