package Zoo;
import java.util.Scanner;

/**
 * Created by christiancampbell on 10/11/16.
 */
public class Zoo {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        while(true){
        System.out.println("**********************" + "\n" + "What would you like to accomplish at our Zoo?" + "\n" + "Press 1 to add people records" + "\n" + "Press 2 to add Animals" + "\n" + "Press 3 to see all people entered" + "\n" + "Press 4 to see all animals listed" + "\n" + "Press 5 to quit" + "\n" +"**********************");
        int choice = scanner.nextInt();

               switch(choice){
                   case 1:
                       Person.pick();
                       break;
                   case 2:
                       Animal.pick();
                       break;
                   case 3:
                       Person.displayArray();
                       break;
                   case 4:
                       Animal.displayArray();
                       break;

               }

        if( choice == 5){
            System.out.println("Thanks for coming to our zoo!");
            break;
        }
        }
    }
}
