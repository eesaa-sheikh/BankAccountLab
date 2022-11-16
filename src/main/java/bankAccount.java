import java.util.Scanner;
import java.util.Date;

public class bankAccount {
    private double balance = 0;
    double dateOfBirth;
    int accountNumber;
    double prevTransac;
    String showMethod;
    String eesaa;
    String sheikh;
    String welcomeMessage;
    double bal;
    int years = 2;

    Date currentDate = new Date();// current date


    //I made the constructor
    bankAccount(String firstName, String lastName, int accNum, double dOB, double balance) {
        eesaa = firstName;
        sheikh = lastName;
        accountNumber = accNum;
        dateOfBirth = dOB;
        this.balance = balance;


    }

    public bankAccount() {

    }

    //interest
    void riseInterest(double years) {
        double interest = .69;
        double interestBalance = (0.69 * balance) / 100;
        double newInterest = interestBalance - balance;
        System.out.println("your balance interest will be" + interestBalance);
    }
    //hell0

    //For testing deposit


    //deposit your money in £
    void deposit(double amount) {
        if (!(amount == 0)) {
            balance = balance + amount;
            System.out.println("you have have £" + balance);


        }
    }

    //withdraw
    void withdraw(double amount) {
        if (amount != 0) {
            balance = balance - amount;
            System.out.println("you have have withdrawn £" + balance);

        }

    }

    void getprevTransac() {
        if (prevTransac > 0) {
            System.out.println("you have deposited: £ " + prevTransac);
        } else if (prevTransac < 0) {
            System.out.println("you have withdrawn: £ " + prevTransac);

        } else {
            System.out.println("Nothing has occured");
        }
    }

    public void optionMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println(currentDate);
        System.out.println("---- " + accountNumber + " ----");
        System.out.println("Hello " + eesaa + sheikh + " ! ");
        System.out.println("----Welcome to the bank of Eesaa!----" + " Bio " + dateOfBirth);
        System.out.println();
        System.out.println("Balance: £" + balance);
        System.out.println("----What would you like to do----");
        System.out.println();
        System.out.println("A. Deposit");
        System.out.println("B.Withdraw");
        System.out.println("C.Show Balance");
        System.out.println("D.Pay interest");
        System.out.println("E. Close the app");

        String option = sc.nextLine();

        if (option.equals("A") || option.equals("a")) {
            System.out.println("please enter a value to Deposit");
            double amount = sc.nextDouble();
            System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§");
            deposit(amount);
            System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§");

            System.out.println();
        }

        //withdraw
        if (option.equals("B") || option.equals("b")) {
            System.out.println("please enter a value to Withdraw");
            double amount2 = sc.nextDouble();
            withdraw(amount2);
            System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§");
            if (amount2 > balance) {
                System.out.println("You have went past your overdraft");
                System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§");

                System.out.println();
            }
        }

        if (option.equals("C") || option.equals("c")) {
            System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§");
            System.out.println("You have £" + balance);
            System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§");
            System.out.println();
        }
        if (option.equals("D") || option.equals("d")) {
            System.out.println("You now have to pay an interest so it will be deducted from your account");
            riseInterest(balance);

        } else if (option.equals("E") || option.equals("E")) {
            System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§");
            System.out.println("Thank you for using this program");
            System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§");

        }

        //withdraw

    }
    //testing Deposit

    public Double Newdeposit(Double a, Double b) {
        return a + b;

    }

public Double Newwithdraw(Double a, Double b) {
        return a - b;
    //testing Deposit
}}












