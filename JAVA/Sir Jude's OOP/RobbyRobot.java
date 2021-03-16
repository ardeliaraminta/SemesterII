import java.util.Scanner;

public class RobbyRobot {
    public static void main(String[] args) {
        int robotX = 0;
        int robotY = 0;

        // breaks loop at the label
        candy:
        while(true) {
            System.out.println("[1] Location");
            System.out.println("[2] Move");
            System.out.println("[3] Reset");
            System.out.println("[4] Quit");
            System.out.print("Pick your number: ");

            // input of choice
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            scan.nextLine();

            // menu choices outcome
            switch (choice) {
                case 1:
                    System.out.println("Robby is located (" + robotX + "," + robotY + ")");
                    break;
                case 2:
                    System.out.println("Enter the direction (N,E,W,S) >>");

                    String dir = scan.nextLine();
                    int distance = scan.nextInt();
                    scan.nextLine();

                    if (dir.equalsIgnoreCase("N")) {
                        robotY += distance;
                        System.out.println("Robby moved North, " + distance + " units");
                    } else if (dir.equalsIgnoreCase("E")) {
                        robotX += distance;
                        System.out.println("Robby moved North" + distance + " units");
                    } else if (dir.equalsIgnoreCase("W")) {
                        robotX -= distance;
                        System.out.println("Robby moved West" + distance + " units");
                    } else if (dir.equalsIgnoreCase("S")) {
                        robotY -= distance;
                        System.out.println("Robby moved South" + distance + " units");
                    }
                    break;
                case 3:
                    robotX = 0;
                    robotY = 0;
                    System.out.println("Robby is reset at origin" + "(" + robotX + "," + robotY + ")");
                    break;
                case 4:
                    System.out.println("ok sad you're saying goodbye");
                    break candy;
                default:
                    System.out.println(" ERROR MY FRIEND ");
                    break;
            }

        }
    }
}
