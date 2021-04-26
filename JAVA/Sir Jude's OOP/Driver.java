import java.util.Scanner;

public class Driver {
        public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);

                Bank bank = new Bank(" Bank BCA");
                System.out.println("Hello, this is " + bank.getBankName());
                Account account = new Account(0);
                float bal = 0;


                // breaks loop at the label
                candy:
                while (true) {
                        System.out.print(" Menu: \n"
                                + "1. Add Customer \n"
                                + "2. Deposit Money \n"
                                + "3. Withdraw Money \n"
                                + "4. EXIT\n"
                                + "Enter selection: ");

                        // input of choice
                        int options = scan.nextInt();

                        // menu choices outcome
                        switch (options) {
                                case 1:
                                        System.out.print("Enter your first name: ");
                                        String firstName = scan.next();
                                        System.out.print("Enter your last name: ");
                                        String lastName = scan.next();
                                        //adds customer into list of customers in bank class
                                        bank.addCustomer(firstName, lastName);
                                        bank.getCustomer(0).setAccount(new Account(0));
                                        System.out.println(firstName + " " + lastName + "'s account has successfully created and balance is " + account.getBalance());
                                        break;
                                case 2:
                                        System.out.print("Enter the value to Withdraw: ");
                                        double amtWithdraw = scan.nextDouble();
                                        scan.nextLine();
                                        boolean check = account.withdraw(amtWithdraw);

                                        if (check) {
                                                System.out.println("New balance: " + account.getBalance());
                                        } else {
                                                System.out.println("Balance not enough or input is negative.");
                                        }
                                        break;
                                case 3:
                                        System.out.print("Enter the value to deposit: ");
                                        double amtDeposit = scan.nextDouble();
                                        scan.nextLine();
                                        boolean check2 = account.deposit(amtDeposit);
                                        if (check2) {
                                                System.out.println("New balance: " + account.getBalance());
                                        } else {
                                                System.out.println("Input cannot be less than 0.");
                                        }
                                        break;
                                case 4:
                                        System.out.println("EXIT");
                                        break candy;
                                default:
                                        System.out.println(" byebye");
                                        break candy;
                        }
                }

        }
}
