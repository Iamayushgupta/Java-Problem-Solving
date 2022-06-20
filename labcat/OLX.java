package com.company.labcat;
import java.util.*;

public class OLX {

    int post_id;
    String post_expiry;
    String post_owner;

    OLX(int post_id, String post_expiry, String post_owner){
        this.post_id = post_id;
        this.post_expiry = post_expiry;
        this.post_owner = post_owner;
    }

    OLX(){
        post_id = 0;
        post_expiry = "";
        post_owner = "";
    }
}

class home extends OLX{
    String post_type;
    double carpet_area;
    double price;
    boolean car_parking;
    int no_of_rooms;

    home(){
        super();
        post_type = "";
        carpet_area = 0.0;
        price = 0.0;
        car_parking = false;
        no_of_rooms = 0;
    }

    home(int post_id, String post_expiry, String post_owner, String post_type, double carpet_area, double price, boolean car_parking, int no_of_rooms){
        super(post_id, post_expiry, post_owner);
        this.post_type = post_type;
        this.carpet_area = carpet_area;
        this.car_parking = car_parking;
        this.price = price;
        this.no_of_rooms = no_of_rooms;
    }
}

class vehicle extends OLX{
    String vehicleType;
    double price;
    boolean insurance;
    String model;
    int no_of_kilometers;

    vehicle(){
        super();
        vehicleType = "";
        price = 0.0;
        insurance = false;
        model = "";
        no_of_kilometers = 0;
    }

    vehicle(int post_id, String post_expiry, String post_owner, String vehicleType, double price, boolean insurance, String model, int no_of_kilometers){
        super(post_id, post_expiry, post_owner);
        this.vehicleType = vehicleType;
        this.price = price;
        this.insurance = insurance;
        this.model = model;
        this.no_of_kilometers = no_of_kilometers;
    }
}

class customer{
    private static int post_id;
    private static double carpet_area;
    private static double price;
    private static boolean car_parking;
    private static int no_of_rooms;
    String name;
    String OLX_id;

    static List<home> homeList = new ArrayList();
    static List<vehicle> vehicleList = new ArrayList();

    customer(){
        name = "";
        OLX_id = "";
    }

    customer(String name, String OLX_id){
        this.name = name;
        this.OLX_id = OLX_id;
    }
    static void post(int post_id, String post_expiry, String post_owner, String post_type, double carpet_area, double price, boolean car_parking, int no_of_rooms){
        customer.post_id = post_id;
        customer.carpet_area = carpet_area;
        customer.price = price;
        customer.car_parking = car_parking;
        customer.no_of_rooms = no_of_rooms;
        home Home = new home( post_id, post_expiry,  post_owner,  post_type, carpet_area,  price,  car_parking,  no_of_rooms);
        homeList.add(Home);
    }

    static void post(int post_id, String post_expiry, String post_owner, String vehicleType,int  price,boolean  insurance, String model, int no_of_kilometers){
        vehicle vehicle = new vehicle( post_id, post_expiry,  post_owner,  vehicleType,  price,  insurance,  model,  no_of_kilometers);
        vehicleList.add(vehicle);
    }

    static void search(String type){
        if (type.equals("Home")) {
            for (home Home : homeList){
                System.out.println("Post Id: " + Home.post_id);
                System.out.println("Owner Name: " + Home.post_owner);
                System.out.println("Carpet Area: " + Home.carpet_area);
                System.out.println("Price: " + Home.price);
                System.out.println("Car Parking: " + Home.car_parking);
                System.out.println("No of Rooms: " + Home.no_of_rooms);
                System.out.println();
            }
        } else {
            for (vehicle Vehicle : vehicleList){
                System.out.println("Post Id: " + Vehicle.post_id);
                System.out.println("Owner Name: " + Vehicle.post_owner);
                System.out.println("Vehicle Type: " + Vehicle.vehicleType);
                System.out.println("Vehicle Model: " + Vehicle.model);
                System.out.println("Price: " + Vehicle.price);
                System.out.println("Insurance: " + Vehicle.insurance);
                System.out.println("Kilometers: " + Vehicle.no_of_kilometers);
                System.out.println();
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to do today?");
        System.out.println("1. Post a property/vehicle");
        System.out.println("2. Search a property/vehicle");
        System.out.println("Please enter your choice number");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("What do you want to post?");
                System.out.println("1. Property");
                System.out.println("2. Vehicle");
                System.out.println("Please enter your choice number");
                int ch = sc.nextInt();

                switch(ch){
                    case 1:
                        System.out.println("Enter Carpet Area:");
                        double carpet_area = sc.nextDouble();
                        System.out.println("Enter Price");
                        double price = sc.nextDouble();
                        System.out.println("Enter post type: Sale/Rent");
                        String post_type = sc.next();
                        System.out.println("Enter no of rooms");
                        int no_of_rooms = sc.nextInt();
                        System.out.println("Is car parking available? True/False");
                        boolean car_parking = sc.nextBoolean();
                        System.out.println("Enter post expiry date in DD/MM/YY");
                        String post_expiry = sc.nextLine();
                        String name= " ayush";

                        post((int)(Math.random()*10000), post_expiry, name, post_type, carpet_area, price, car_parking, no_of_rooms);

                        break;

                    case 2:
                        System.out.println("Enter Model:");
                        String model = sc.nextLine();
                        System.out.println("Enter Price");
                        price = sc.nextDouble();
                        System.out.println("Enter Vehicle type");
                        String vehicleType = sc.next();
                        System.out.println("Enter no of kilometers");
                        int no_of_kilometers = sc.nextInt();
                        System.out.println("Is car insured? True/False");
                        boolean insurance = sc.nextBoolean();
                        System.out.println("Enter post expiry date in DD/MM/YY");
                        post_expiry = sc.nextLine();
                        String name1="Parus";

                        post((int)(Math.random()*10000), post_expiry, name1, vehicleType, (int) price, insurance, model, no_of_kilometers);

                        break;

                    default:
                        System.out.println("Invalid Input");
                        break;
                }

                break;

            case 2:
                System.out.println("What do you want to search?");
                System.out.println("1. Property");
                System.out.println("2. Vehicle");
                System.out.println("Please enter your choice number");
                int ch1 = sc.nextInt();

                switch(ch1){
                    case 1:
                        search("Property");
                        break;

                    case 2:
                        search("Vehicle");
                        break;

                    default:
                        System.out.println("Invalid Input");
                        break;
                }

                break;

            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}