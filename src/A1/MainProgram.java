package A1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        ArrayList<Order> orderArrayList=new ArrayList<Order>();

//        setCustomer();
        int flag=1;
        while (flag==1){
            setDish(orderArrayList);
            showOrder(orderArrayList);
            System.out.println("Do you want to keep ordering? (Type 1 to continue, 0 to exit) :");
            flag=scan.nextInt();
            if (flag==0){
                break;
            }
        }

    }

    public static void setCustomer(){
        String name;
        String adress;
        String day;
        String phoneNumber;
        String time;

        Scanner scan=new Scanner(System.in);

        System.out.println("Workout Foods");
        System.out.print("Please enter the name of the customer making a booking:");
        name=scan.nextLine();
        System.out.print("What is the date the food is required(eg:15/09/22): ");
        day=scan.nextLine();
        System.out.print("What is the time for the home delivery(eg:10:00 am):");
        time=scan.nextLine();
        System.out.print("What is the address to deliver to:");
        adress=scan.nextLine();
        System.out.print("What is a phone number for the customer:");
        phoneNumber=scan.nextLine();
        System.out.print("Thankyou.");
        Customer aCustomer=new Customer(name,day,time,adress,phoneNumber);
    }

    public static void setDish(ArrayList<Order> orderArrayList) {
        int per;
        Scanner scan=new Scanner(System.in);

        Dishes d1=new Dishes(1,"Chicken & Chorizo Paella 360g",9.95);
        Dishes d2=new Dishes(2,"Low carb Moussaka",10.5);
        Dishes d3=new Dishes(3,"Vitality Veggie",13.95);
        Dishes d4=new Dishes(4,"Angus Beef & Veg Lasagne",15.50);
        Dishes d5=new Dishes(5,"Chicken  Cacciatore & Roast Pumpkin",11.95);
        Dishes d6=new Dishes(6,"Healthy Meal Kit for 2 people",23.49);
        Dishes d7=new Dishes(7,"Value 10 Complete Meal Box",123);

        System.out.println("The following are options you can add to your catering booking order:");
        System.out.println(d1.getDishId()+" "+d1.getDishName()+"("+d1.getDishPrice()+"$ per serving)");
        System.out.println(d2.getDishId()+" "+d2.getDishName()+"("+d2.getDishPrice()+"$ per serving)");
        System.out.println(d3.getDishId()+" "+d3.getDishName()+"("+d3.getDishPrice()+"$ per pack)");
        System.out.println(d4.getDishId()+" "+d4.getDishName()+"("+d4.getDishPrice()+"$ per pack)");
        System.out.println(d5.getDishId()+" "+d5.getDishName()+"("+d5.getDishPrice()+"$ per meal)");
        System.out.println(d6.getDishId()+" "+d6.getDishName()+"("+d6.getDishPrice()+"$ per box)");
        System.out.println(d7.getDishId()+" "+d7.getDishName()+"("+d7.getDishPrice()+"$ per box)");
        System.out.println("8.退出");
        System.out.print("What would you like to add to the booking order:");
        String choice=scan.nextLine();
        switch (choice){
            case "Chicken & Chorizo Paella":
                Order o1=new Order();
                o1.setDishName(d1.getDishName());
                o1.setDishPrice(d1.getDishPrice());
                System.out.println("How many "+d1.getDishName()+" ("+d1.getDishPrice()+"$ each) "+ "would you like:");
                per= scan.nextInt();
                o1.setPer(per);
                orderArrayList.add(o1);
                break;
            case "Low carb Moussaka":
                Order o2=new Order();
                o2.setDishName(d2.getDishName());
                o2.setDishPrice(d2.getDishPrice());
                System.out.println("How many "+d2.getDishName()+" ("+d2.getDishPrice()+"$ each) "+ "would you like:");
                per= scan.nextInt();
                o2.setPer(per);
                orderArrayList.add(o2);
                break;
            case "Vitality Veggie":
                Order o3=new Order();
                o3.setDishName(d3.getDishName());
                o3.setDishPrice(d3.getDishPrice());
                System.out.println("How many "+d3.getDishName()+" ("+d3.getDishPrice()+"$ each) "+ "would you like:");
                per= scan.nextInt();
                o3.setPer(per);
                orderArrayList.add(o3);
                break;
            case "Angus Beef & Veg Lasagne":
                Order o4=new Order();
                o4.setDishName(d4.getDishName());
                o4.setDishPrice(d4.getDishPrice());
                System.out.println("How many "+d4.getDishName()+" ("+d4.getDishPrice()+"$ each) "+ "would you like:");
                per= scan.nextInt();
                o4.setPer(per);
                orderArrayList.add(o4);
                break;
            case "Chicken  Cacciatore & Roast Pumpkin":
                Order o5=new Order();
                o5.setDishName(d5.getDishName());
                o5.setDishPrice(d5.getDishPrice());
                System.out.println("How many "+d5.getDishName()+" ("+d5.getDishPrice()+"$ each) "+ "would you like:");
                per= scan.nextInt();
                o5.setPer(per);
                orderArrayList.add(o5);
                break;
            case "Healthy Meal Kit for 2 people":
                Order o6=new Order();
                o6.setDishName(d6.getDishName());
                o6.setDishPrice(d6.getDishPrice());
                System.out.println("How many "+d6.getDishName()+" ("+d6.getDishPrice()+"$ each) "+ "would you like:");
                per= scan.nextInt();
                o6.setPer(per);
                orderArrayList.add(o6);
                break;
            case "Value 10 Complete Meal Box":
                Order o7=new Order();
                o7.setDishName(d7.getDishName());
                o7.setDishPrice(d7.getDishPrice());
                System.out.println("How many "+d7.getDishName()+" ("+d7.getDishPrice()+"$ each) "+ "would you like:");
                per= scan.nextInt();
                o7.setPer(per);
                orderArrayList.add(o7);
                break;
        }

    }

    public static void showOrder(ArrayList<Order> orderArrayList){
        double sum=0;
        System.out.println("Ordered items:");
        for (int i = 0; i < orderArrayList.size(); i++) {
            Order order=orderArrayList.get(i);
            System.out.println(order.getPer()+" x "+order.getDishName()+"("+order.getDishPrice()+" each)");
            sum+=order.getDishPrice()* order.getPer();
        }
        if (sum>=100){
            System.out.println("Total cost: $"+sum);
        }else {
            System.out.println("Total cost (includes $5 delivery fee): $"+(sum+5));
        }
    }
}
