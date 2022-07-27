import java.util.Scanner;


public class ATMExample
{
    //main method starts
    public static void main(String args[] )
    {
        int atmnumber=1234;
        int atmpin=1444;
        Scanner scn=new Scanner(System.in);
        System.out.println("entger the atmnumber:");
        int cardnumber=scn.nextInt();
        System.out.println("entger the atmpin:");
        int pin =scn.nextInt();
        if((atmnumber==cardnumber) && (atmpin==pin)){
            System.out.println("enter the SBI BANK system");
        }else{
            System.out.println("denied access :wrong card number and pin");
            System.exit(0);
        }

        int balance = 50000, withdraw, deposit;


        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("enter the choice  you want to perform:");

            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter money to be withdrawn:");


                    withdraw = sc.nextInt();


                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    }
                    else
                    {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Enter money to be deposited:");

                    deposit = sc.nextInt();

                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:

                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;

                case 4:

                    System.exit(0);
            }
        }
    }
}


  
