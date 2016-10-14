package Zoo;

import java.util.Scanner;

/**
 * Created by christiancampbell on 10/12/16.
 */
public class Tigers extends Animal {
    public static Scanner scannerT = new Scanner (System.in);
    String color;
    public Tigers(String n, String ty, String s, String te, String c) {
        super(n, ty, s, te);
        color = c;
    }
    public static String getName(){
        System.out.println("What is the animal's name?");
        String name1 = scannerT.nextLine();
        return name1;
    }

    public static String getType(){
        System.out.println("What is the animal's type?");
        String type1 = scannerT.nextLine();
        return type1;
    }
    public static String getSpecies(){
        System.out.println("What is the animal's species?");
        String species1 = scannerT.nextLine();
        return species1;
    }
    public static String getTemperament(){
        System.out.println("What is the animal's temperament");
        String temperament1 = scannerT.nextLine();
        return temperament1;
    }
    public static String getColor(){
        System.out.println("What color is the tiger?");
        String color1 = scannerT.nextLine();
        return color1;
    }
    public static void buildAnAnimal(){
        Tigers t1 = new Tigers (getName(), getType(), getSpecies(), getTemperament(), getColor());

        list.add(t1.displayInfo());
        System.out.println(t1.displayInfo());
    }


    public String displayInfo(){
        return "**************" + "\n" + "Name: " + name + "\n" + "Type: " + type + "\n" + "Species: " + species + "\n" + "Temperament: " + temperament + "\n" + "Color: " + color + "\n" + "Exhibit: " + Exhibit.TIGER.exhibit;

    }
}
