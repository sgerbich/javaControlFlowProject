import java.util.*;

public class controlflow {
    public static void main(String[] args) {
        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("whats your name?");
        String firstName = input.nextLine();
        System.out.printf("Hello %s?", firstName);
        System.out.println();
        System.out.println("Do you want to continue?");
        String keepgoing = input.nextLine();

        while(keepgoing.equalsIgnoreCase("yes") || keepgoing.equalsIgnoreCase("y"))
        {

            
            getNumbers.lotto();

            System.out.println();


            System.out.println("Do you want to try again?");
            
            keepgoing = input.next();

       
            
        }

        System.out.println("Please come back later for a survey");
        input.close();
    }
}
