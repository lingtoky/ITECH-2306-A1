package A1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DishApp {

    static List<Dish> dishList=new ArrayList<>();

    public static void main(String[] args) {

        //初始化菜品
        initDish();

        //用户输入信息
//        obtainCustomerDetails();

        //向用户展示点菜名单
        while (true){
            showDishMenu();
        }


    }


    public static void obtainCustomerDetails(){
        Customer c=new Customer();
        Scanner scan=new Scanner(System.in);
        System.out.println("Workout Foods");
        System.out.print("Please enter the name of the customer making a booking:");
        c.name=scan.nextLine();
        System.out.print("What is the date the food is required:");
        c.date=scan.nextLine();
        System.out.print("What is the time for the home delivery:");
        c.time=scan.nextLine();
        System.out.print("What is the address to deliver to:");
        c.address=scan.nextLine();
        System.out.print("What is a phone number for the customer:");
        c.phoneNumber=scan.nextLine();
        System.out.println("Thank you.");
        System.out.println();
    }

    public static void showDishMenu(){
        int section;
        int per;
        double sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("The following are options you can add to your catering booking order: ");
        //遍历集合
        for (int i = 0; i < dishList.size(); i++) {
            //从集合中使用i获取每一个菜品对象
            Dish dish=dishList.get(i);
            System.out.println(dish.id+"\t"+dish.name+"\t");
        }
        System.out.println();
        System.out.println("Finished making selections");
        System.out.print("What would you like to add to the booking order:");
        section=scan.nextInt();
        System.out.print("How many "+dishList.get(section-1).name+" would you like:");
        per=scan.nextInt();
        System.out.println();
        System.out.println("Ordered items:");
        System.out.println(per+" x "+dishList.get(section-1).name);
        if((dishList.get(section-1).price*per)>100){
            sum+=(dishList.get(section-1).price*per);
            System.out.println("Total cost (includes $0 delivery fee):"+sum);
        }else {
            sum+=(dishList.get(section-1).price*per+5);
            System.out.println("Total cost (includes $5 delivery fee):"+sum);
        }
        System.out.println();
    }
    public static void initDish(){
        Dish dish1=new Dish(1,"Chicken & Chorizo Paella 360g (9.95$ per serving)",9.95);
        dishList.add(dish1);
        Dish dish2=new Dish(2,"Low carb Moussaka (10.50$ per serving)",10.50);
        dishList.add(dish2);
        Dish dish3=new Dish(3,"Vitality Veggie (13.95$ per pack)",13.95);
        dishList.add(dish3);
        Dish dish4=new Dish(4,"Angus Beef & Veg Lasagne (15.50$ per pack)",15.50);
        dishList.add(dish4);
        Dish dish5=new Dish(5,"Chicken  Cacciatore & Roast Pumpkin (11.95$ per meal)",11.95);
        dishList.add(dish5);
        Dish dish6=new Dish(6,"Healthy Meal Kit for 2 people (23.49$ per box)",23.49);
        dishList.add(dish6);
        Dish dish7=new Dish(7,"Value 10 Complete Meal Box (123$ per box)",123);
        dishList.add(dish7);
    }
}
