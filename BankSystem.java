import java.util.Scanner; // Required to use Scanner
class Main {
   static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
       //java banking program 
       //decalre variables
       double balance=0;
       boolean isRunning=true;
       int choice;
       //Display menu
       while (isRunning){
       
           System.out.println("************");
       System.out.println("BANK SYSTEM");
       System.out.println("************");
       System.out.println("1.Show Balance");
       System.out.println("2.Deposit");
       System.out.println("3.Withdraw");
       System.out.println("************");
       
       //Get and procces users choice
       choice=scanner.nextInt();
       switch(choice){
       case 1->showBalance(balance);
       case 2-> balance += deposit();
       case 3->balance -= withdraw(balance);
       case 4->{
           System.out.println("Thank you for banking with us!");
           isRunning=false;
       }
       default->System.out.println("INVALID CHOICE");
       }
       }
       scanner.close();
    }
    //showBalance()
    static void showBalance(double balance){
         System.out.println("************");
        System.out.printf("$%.2f\n",balance);
         System.out.println("************");
    }
     //deposit()
    static double deposit(){
        double amount;
        System.out.print("Enter amount to deposit:");
        amount=scanner.nextDouble();
        if (amount< 0){
           System.out.println("Amount can't be negative");
            return 0;
        } else {
            System.out.println("Amount Deposited\n");
            return amount;
        }
    }
    //withdraw
    static double withdraw(double balance){
        double amount;
        System.out.println("Enter amount to withdraw : ");
         amount=scanner.nextDouble();
         if (amount>balance){
             System.out.println("Insufficient Balance");
             return 0;
             }
         else if(amount<0){
             System.out.println("Negative Amount");
             return 0;
         }
         else {
             System.out.println("Withdrawl Succesful");
             return amount;
         }
    }
}