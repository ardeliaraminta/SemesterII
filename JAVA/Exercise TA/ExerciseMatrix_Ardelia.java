import java.util.Scanner;

public class ExerciseMatrix {
    public static void main(String[] args) {


        //multiplication of square matrix
        // legit if u ask me to explain i don't even understand my own code just gitu deh

        int a;

        //scanner time
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the base of matrix: ");

        // input of the numbers of matrix row wise
        a = input.nextInt();


        //create arrays
        int[][] l = new int[a][a];
        int[][] b = new int[a][a];
        int[][] c = new int[a][a];

        System.out.println("enter the elements of 1st matrix row wise \n");

        // for loops for accessing rows and columns
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                l[i][j] = input.nextInt();
            }
        }

        System.out.println("enter the elements of 2nd matrix row wise \n");

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                b[i][j] = input.nextInt();
            }
        }

        System.out.println("hold, we're multiplying the matrices..");

        // multiplication
        // i use 3 for loops here
        //1. to access per rows, columns and finally the multiplication

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                for (int k = 0; k < a; k++) {
                    c[i][j] = c[i][j] + l[i][k] * b[k][j];
                }
            }
        }
        System.out.println(" HERE IT IS ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

