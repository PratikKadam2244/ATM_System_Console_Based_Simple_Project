import java.util.Scanner;

class ATM
{
    float Balance;
    int pin=5497;

    public void checkpin()
    {
        System.out.println("Enter Your Pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin==pin)
        {
           System.out.println(" ");
           menu();
        }
        else
        {
            System.out.println("Incorrect Pin.");
            System.out.println(" ");
            checkpin();   
        }
    }

    public void menu()
    {
        System.out.println("Your Choice:-");
        System.out.println(" ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");
        System.out.println("Enter Your Choices:-");

        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        System.out.println(" ");

        if(opt==1)
        {
            CheckBalance();
        }
        else if(opt==2)
        {
            WithdrawMoney();
        }
        else if(opt==3)
        {
            DepositMoney();
        }
        else if(opt==4)
        {
            System.out.println("Your Card Is Removed, Thanks For Visit.");
            System.out.println(" ");
            return;
        }
        else
        {
            System.out.println("Invalid Input.");
        }
    }

    public void CheckBalance()
    {
        System.out.println("Balance: "+ Balance);
        System.out.println(" ");
        menu();
    }

    public void WithdrawMoney()
    {
        System.out.println("Enter Amount To Withdraw: ");
        Scanner sc=new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance)
        {
            System.out.println("Insufficient Balance.");
            System.out.println(" ");
        }
        else
        {
            Balance=Balance-amount;
            System.out.println("Money Withdraw Successful.");
            System.out.println(" ");
        }
        menu();
    }

    public void DepositMoney()
    {
        System.out.print("Enter A Amount: ");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        Balance=Balance+amount;
        System.out.println("Money Deposited Successfully.");
        System.out.println(" ");
        menu();
    }
}

class ATMMachine
{
    public static void main(String[] args)
    {
        ATM ref=new ATM();
        ref.checkpin();
    }

}