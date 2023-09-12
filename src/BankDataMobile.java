import java.util.Scanner;

public class BankDataMobile {
    public static void main(String[] args) {

        //initialize variables with customer data

        String nameClient = "Jacob Mars";
        String accountType = "Current Account";
        double balance = 3220.00;
        int option = 0;

        //show corresponding customer data

        System.out.println("--------------------------------------");
        System.out.println("\nClient Information");
        System.out.println("Client Name: " + nameClient);
        System.out.println("Your Account Type: " + accountType);
        System.out.println("Your Account Balance: " + balance);
        System.out.println("\n--------------------------------------");

        //show options menu

        String menu = """
                Enter the number that corresponds to your choice:
                1 - Check Balance
                2 - Transfer Value
                3 - Receive Value
                4 - Exit
                                
                """;

        //Use the While Loop and an if condition to send data and receive data from the client

        Scanner choiceOption = new Scanner(System.in);

        while (option != 4)
        {
            System.out.println(menu);
            option = choiceOption.nextInt();

            if (option == 1)
            {
                System.out.println("The your current account is " + balance);
            }

            else if (option == 2) {
                System.out.println("What is amount you want to transfer?");
                double bankTransfer = choiceOption.nextDouble();

                if (balance < bankTransfer) {
                    System.out.println("Transfer unrealized. You don't have enough balance in your bank account!!");
                }
                else {
                    balance -= bankTransfer;
                    System.out.println("Transfer completed successfully! New balance " + balance);
                }
            }

            else if (option == 3) {
                System.out.println("Amount received: ");
                double bankTransfer = choiceOption.nextDouble();
                balance += bankTransfer;
                System.out.println("New balance " + balance);
            }

            else if (option != 4) {
                System.out.println("Invalid option!! Enter a number corresponding to the menu option!!");
            }

        }

    }

}
