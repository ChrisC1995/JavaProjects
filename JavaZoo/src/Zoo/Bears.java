package Zoo;

import java.util.Scanner;

/**
 * Created by christiancampbell on 10/12/16.
 */
public class Bears extends Animal {
    public static Scanner scannerB = new Scanner (System.in);
    String weight;
    public Bears(String n, String ty, String s, String te, String w) {
        super(n, ty, s, te);
        weight = w;

    }

    public static String getName(){
        System.out.println("What is the animal's name?");
        String name1 = scannerB.nextLine();
        return name1;
    }

    public static String getType(){
        System.out.println("What is the animal's type?");
        String type1 = scannerB.nextLine();
        return type1;
    }
    public static String getSpecies(){
        System.out.println("What is the animal's species?");
        String species1 = scannerB.nextLine();
        return species1;
    }
    public static String getTemperament(){
        System.out.println("What is the animal's temperament");
        String temperament1 = scannerB.nextLine();
        return temperament1;
    }
    public static String getWeight(){
        System.out.println("What is the bears weight?");
        String mane1 = scannerB.nextLine();
        return mane1;
    }
    public static void buildAnAnimal(){
        Bears b1 = new Bears (getName(), getType(), getSpecies(), getTemperament(), getWeight());

        list.add(b1.displayInfo());
        System.out.println(b1.displayInfo());
    }


    public String displayInfo(){
        return "**************" + "\n" + "Name: " + name + "\n" + "Type: " + type + "\n" + "Species: " + species + "\n" + "Temperament: " + temperament + "\n" + "Weight: " + weight + "\n" + "Exhibit: " + Exhibit.BEAR.exhibit;

    }
}
