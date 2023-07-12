import java.util.Scanner;
public class guessNumber {

    public static void numbergame(){
        Scanner input = new Scanner(System.in);
        int randomNumber = 1 + (int)(100 * Math.random());
        int tries = 5;
        boolean correct = false;
        while(tries > 0){
            System.out.print("Please enter the value to guess a number = ");
            int guess = input.nextInt();
            if(guess == randomNumber){
                System.out.println("Your Correctly guessed" + guess);
                correct = true;
                break;
            }else if(guess > randomNumber){
                System.out.println("You have wrongly guessed, and guessed value is high");
                tries--;
            }else{
                System.out.println("You have wrongly guessed, and guessed value is low");
                tries--;
            }
        }
        if(!correct){
            System.out.println("You are out of tries");
        }
        print(randomNumber);
    }

    public static void print(int value){
        System.out.println(value);
    }




}
