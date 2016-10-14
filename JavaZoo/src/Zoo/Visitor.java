package Zoo;
import java.util.Scanner;

/**
 * Created by christiancampbell on 10/12/16.
 */
public class Visitor extends Person {
    String location;
    public static Scanner scannerV = new Scanner (System.in);



    public Visitor(String n, String g, String a, String l) {
        super(n, g, a);
        location = l;


    }


    public static String getLocation(){
        System.out.println("Where are you from?");
        String location1 = scannerV.nextLine();
        return location1;
    }

    public static String getName(){
        System.out.println("What is your name?");
        String name1 = scannerV.nextLine();
        return name1;
    }

    public static String getGender(){
        System.out.println("What is your gender?");
        String gender1 = scannerV.nextLine();
        return gender1;
    }
    public static String getAge(){
        System.out.println("What is your age?");
        String age1 = scannerV.nextLine();
        return age1;
    }

    public static void buildAPerson(){
        Visitor v1 = new Visitor (getName(), getGender(), getAge(), getLocation());

        list.add(v1.displayInfo());
        System.out.println(v1.displayInfo());


    }
    public String displayInfo(){
        return "**************" + "\n" + "Visitor:" + "\n" + "Name: " + name + "\n" + "Gender: " + gender + "\n" + "Age: " + age + "\n" + "Living Area: " + location;

    }
//    public static void displayArray(){
//        System.out.println("People that are visitors: " + "\n");
//        for(String Items : list){
//            System.out.println(Items + "\n");
//    }
}
