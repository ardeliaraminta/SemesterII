import java.util.Scanner;

public class Driver {
        public static void main(String[] args){
                Scanner scan = new Scanner(System.in);

                Bank bank = new Bank(" Bank BCA");
                System.out.println("Hello, this is " + bank.getBankName());
                Account account = new Account(0);
                float bal = 0;

                int choice;
                do {
                        System.out.println(" Menu: \n"
                                + "1. Add Customer \n"
                                + "2. Deposit Money \n"
                                + "3. Withdraw Money n"
                                + "4. EXIT\n"
                                + "Enter selection: ");

                        choice = scan.nextInt();

                        switch (choice){
                                case 1:
                                        String firstName="";
                                        String lastName="";
                                        System.out.println("Enter first name");
                                        firstName=scan.next();
                                        System.out.println("Enter last name");
                                        firstName=scan.next();
                                        bank.addCustomer(firstName, lastName);
                                        bank.getCustomer(0).setAccount(new Account(0));
                                        System.out.println(firstName + " " + lastName + "'s account has successfully created and balance is " + account.getBalance());                                        break;

                                case 2:
                                        System.out.println("Amount for Withdrawal : ");
                                        bal=scan.nextFloat();
                                        if(bank.getCustomer(0).getAccount().withdraw(bal)){
                                                System.out.println("Your balance is: ");
                                                System.out.print(bank.getCustomer(0).getAccount().getBalance());
                                                System.out.println();
                                        }
                                        else{
                                                System.out.print("Insufficient funds");
                                        }
                                        break;

                                case 3:
                                        System.out.println("Enter amount to deposit: ");
                                        bal=scan.nextFloat();
                                        if(bank.getCustomer(0).getAccount().deposit(bal)){
                                                System.out.println("Your current balance is: ");
                                                System.out.print(bank.getCustomer(0).getAccount().getBalance());
                                                System.out.println();
                                        }
                                        else{
                                                System.out.print("Invalid input");
                                        }
                                        break;
                                case 4:
                                        System.out.println("You balance is: ");
                                        System.out.print(bank.getCustomer(0).getAccount().getBalance());
                                        break;

                        }

                }while(choice!=5);
        }
}