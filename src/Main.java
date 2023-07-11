import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the value");
//        String value = input.nextLine();
//        System.out.println(value);
        float result = geometry.area(23);
        System.out.println("Area of the circle = "+result);

        float areaOfRectangle = rectangle.area(34,23 );
        System.out.println("Area of rectangle = "+areaOfRectangle);

        guessNumber.numbergame();
    }
}
