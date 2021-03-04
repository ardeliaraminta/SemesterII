import java.util.Scanner;

public class ExerciseWeek2 {
    public static void main(String[] args) {

        //
        Scanner star = new Scanner(System.in);
        System.out.println("how many rows do you want for the stars?");
        int starRows = star.nextInt();

        for (int a = 1; a <= starRows; ++a) {
            for (int g = 1; g <= a; ++g) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //upside half triangle
        Scanner halfT = new Scanner(System.in);
        System.out.println(" how many rows you want for the stars ? ");
        int halfTriangle = halfT.nextInt();

        for (int y = 0; y < halfTriangle; y++) {
            for (int x = 0; x < halfTriangle; x++) {
                System.out.print((x >= y) ? "*" : " ");
            }

            System.out.println();
        }

        Scanner triangle = new Scanner(System.in);

        System.out.println(" how many rows you want for the stars ? ");
        int starRows2 = triangle.nextInt();
        int initial = 1;


        for (int a = starRows2; a > 0; a--) {
            for (int s = 1; s <= a * 2; s++) {
                System.out.print(" ");
            }

            //print s value where s value will be from 1 to initial
            for (int s = 1; s <= initial; s++) {
                System.out.print("* ");
            }

            //print s value where s value will be from initial-1 to 1
            for (int s = initial - 1; s >= 1; s--) {
                System.out.print("* ");
            }
            System.out.println();

            //increment
            initial++;
        }
    }

}