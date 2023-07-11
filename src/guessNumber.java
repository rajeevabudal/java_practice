import java.util.Scanner;
public class guessNumber {

    public static void numbergame(){
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());
        print(number);
    }

    public static void print(int value){
        System.out.println(value);
    }


}
