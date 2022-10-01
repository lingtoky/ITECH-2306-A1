package A1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        ArrayList<Order> orderArrayList=new ArrayList<>();

        boolean anotherOrder = true;
        while(anotherOrder){
            Customer customer=setCustomer();
            selectDish(orderArrayList);
            System.out.println("Do you want to enter another order for home delivery? (y/n):");
            String userInput;
            userInput= scan.nextLine();
            if(userInput.charAt(0)=='n'){
                System.out.println("--------------------------------------------------");
                showCustomer(customer);
                showOrder(orderArrayList);
                System.out.println("--------------------------------------------------");
                anotherOrder=false;
                System.out.println("Thank you.");
            } else if (userInput.charAt(0)=='y') {
                System.out.println("--------------------------------------------------");
                showCustomer(customer);
                showOrder(orderArrayList);
                System.out.println("--------------------------------------------------");
                for (int i = 0; i <orderArrayList.size();) {
                    orderArrayList.remove(i);
                }
            }
        }
    }

    public static Customer setCustomer(){
        String name;
        String adress;
        String day;
        String phoneNumber;
        String time;

        Scanner scan=new Scanner(System.in);

        System.out.println("Workout Foods");
        System.out.print("Please enter the name of the customer making a booking:");
        name=scan.nextLine();
        System.out.print("What is the date the food is required(eg:15/09/22):");
        day=scan.nextLine();
        System.out.print("What is the time for the home delivery(eg:10:00 am):");
        time=scan.nextLine();
        System.out.print("What is the address to deliver to:");
        adress=scan.nextLine();
        System.out.print("What is a phone number for the customer:");
        phoneNumber=scan.nextLine();
        System.out.print("Thankyou.");
        Customer aCustomer=new Customer(name,day,time,adress,phoneNumber);
        return aCustomer;
    }

    public static void setDish(String dishName,ArrayList<Order> orderArrayList,double price){
        Scanner scan=new Scanner(System.in);
        System.out.print("How many "+dishName+" ("+price+"$ each) "+ "would you like:");
        int per= scan.nextInt();
        scan.nextLine();
        Order o1=new Order(dishName,price,per);
        orderArrayList.add(o1);
        showOrder(orderArrayList);
    }

    public static void selectDish(ArrayList<Order> orderArrayList) {
        Scanner scan=new Scanner(System.in);
        boolean stillRunnin=true;
        while (stillRunnin){
            showMeue();
            System.out.print("What would you like to add to the booking order:");
            String dishName=scan.nextLine();

//            int per;

            switch (dishName){
                case "Chicken & Chorizo Paella 360g":
                    setDish(dishName,orderArrayList,9.95);
                    break;
                case "Low carb Moussaka":
                    setDish(dishName,orderArrayList,10.5);
                    break;
                case "Vitality Veggie":
                    setDish(dishName,orderArrayList,13.95);
                    break;
                case "Angus Beef & Veg Lasagne":
                    setDish(dishName,orderArrayList,15.50);
                    break;
                case "Chicken  Cacciatore & Roast Pumpkin":
                    setDish(dishName,orderArrayList,11.95);
                    break;
                case "Healthy Meal Kit for 2 people":
                    setDish(dishName,orderArrayList,23.49);
                    break;
                case "Value 10 Complete Meal Box":
                    setDish(dishName,orderArrayList,123);
                    break;
                default:
                    System.out.println("Wrong input!");
                    stillRunnin=false;
                    break;
            }
        }
    }

    public static void showMeue(){
        System.out.println("The following are options you can add to your catering booking order:");
        System.out.println("1.Chicken & Chorizo Paella 360g (9.95$ per serving)");
        System.out.println("2.Low carb Moussaka (10.50$ per serving)");
        System.out.println("3.Vitality Veggie (13.95$ per pack)");
        System.out.println("4.Angus Beef & Veg Lasagne (15.50$ per pack)");
        System.out.println("5.Chicken  Cacciatore & Roast Pumpkin (11.95$ per meal)");
        System.out.println("6.Healthy Meal Kit for 2 people (23.49$ per box)");
        System.out.println("7.Value 10 Complete Meal Box (123$ per box)");
    }

    public static void showOrder(ArrayList<Order> orderArrayList){
        double sum=0;
        System.out.println("Ordered items:");
        for (int i = 0; i < orderArrayList.size(); i++) {
            Order order=orderArrayList.get(i);
            System.out.println(order.getPer()+" x "+order.getDishName()+"("+order.getDishPrice()+" each)"+"----------"+order.getDishPrice()* order.getPer());
            sum+=order.getDishPrice()* order.getPer();
        }
        if (sum>=100){
            System.out.println("Total cost: $"+sum);
            System.out.println();
        }else {
            System.out.println("Total cost (includes $5 delivery fee): $"+(sum+5));
            System.out.println();
        }
    }

    public static void showCustomer(Customer customer){
        System.out.println("Name:"+customer.getName());
        System.out.println("Adress:"+customer.getAdress());
        System.out.println("PhoneNumber:"+customer.getPhoneNumber());
        System.out.println("Date:"+customer.getDay());
        System.out.println("Time:"+customer.getTime());
    }
}
