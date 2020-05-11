import java.util.*;

public class getNumbers {
    public static void lotto(){
        Scanner input = new Scanner(System.in);
        System.out.println("favorite pet name?");
        String petName = input.nextLine();

        System.out.println("how old is it?");
        int petAge = input.nextInt();

        System.out.println("whats your lucky number?");
        int luckyNum = input.nextInt();

        System.out.println("favorite quarterback?");
        // String favQB = input.nextLine();
        
        System.out.println("whats theyre jersey number?");
        int jerseyNum = input.nextInt();

        System.out.println("two digit model year of your car?");
        int carModel = input.nextInt();

        System.out.println("favorite actor?");
        // String favActor = input.nextLine();

        System.out.println("give me a random number between 1-50");
        int randomNum = input.nextInt();

        int magicBall = jerseyNum;
        while(magicBall > 75){
            magicBall= magicBall -75;
        }

        int lottoNum2 = petName.charAt(2);
        while(lottoNum2 > 65){
            lottoNum2 = lottoNum2 - 65;
        }
        
        int lottoNum3 = carModel + luckyNum;
        while (lottoNum3 > 65){
            lottoNum3 = lottoNum3 - 65;
        }

        int lottoNum4 = randomNum * (int) (Math.random() * 50);
        while (lottoNum4 > 65){
            lottoNum4 = lottoNum4 - 65;
        }

        int lottoNum5 = 42;

        int lottoNum6 = jerseyNum+ petAge + luckyNum;
        while (lottoNum6 > 65){
            lottoNum6 = lottoNum6 - 65;
        }


        System.out.printf("Your lucky numbers are %d %d %d %d %d Magic Ball: %d", lottoNum2, lottoNum3, lottoNum4, lottoNum5, lottoNum6, magicBall);
        

        input.close();
    }
}