package Zoo;

import java.util.Scanner;

/**
 * Created by christiancampbell on 10/12/16.
 */
public class Lions extends Animal {

    public static Scanner scannerL = new Scanner (System.in);
    String Mane;
    public Lions(String n, String ty, String s, String te, String m) {
        super(n, ty, s, te);
        Mane = m;
    }
    public static String getName(){
        System.out.println("What is the animal's name?");
        String name1 = scannerL.nextLine();
        return name1;
    }

    public static String getType(){
        System.out.println("What is the animal's type?");
        String type1 = scannerL.nextLine();
        return type1;
    }
    public static String getSpecies(){
        System.out.println("What is the animal's species?");
        String species1 = scannerL.nextLine();
        return species1;
    }
    public static String getTemperament(){
        System.out.println("What is the animal's temperament");
        String temperament1 = scannerL.nextLine();
        return temperament1;
    }
    public static String getManeLength(){
        System.out.println("How long is the lions mane?");
        String mane1 = scannerL.nextLine();
        return mane1;
    }
        public static void buildAnAnimal(){
        Lions l1 = new Lions (getName(), getType(), getSpecies(), getTemperament(), getManeLength());

        list.add(l1.displayInfo());
        System.out.println(l1.displayInfo());
    }


    public String displayInfo(){
        return "**************" + "\n" + "Name: " + name + "\n" + "Type: " + type + "\n" + "Species: " + species + "\n" + "Temperament: " + temperament + "\n" + "Mane Length: " + Mane + "\n" + "Exhibit: " + Exhibit.LION.exhibit;

    }
}
