import java.util.*;

public class task2 {
    public static void main(String[] args){
        int a,pin = 2023,atmpin,count = 0,damount=0,wamount=0,accountno,total = 10000, transfermoney = 0;
        do{  
        System.out.println("*************************************************************************************************");
        System.out.println("*                                  WELCOME TO THE ATM INTERFACE                                 *");
        System.out.println("*************************************************************************************************");
        System.out.println("1. Deposite");
        System.out.println("2. Withdraw");
        System.out.println("3. Transfer");
        System.out.println("4. Transection History");
        System.out.println("5. Quit");
         System.out.print("Enter your choice:            ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1: System.out.print("Enter your ATM pin here:   ");
                    atmpin = sc.nextInt();
                    if(pin == atmpin){  
                    System.out.print("Enter the amount you want to deposite:   ");
                     damount = sc.nextInt();
                    total = total + damount;
                    System.out.println("*** Your amount is successfully added to your bank account! ***");
                    System.out.println("Your total amount is:   " +total);
                count++;
                    }else{
                        System.out.println("*** WRONG PIN!!! ***");
                    }
                    break;
            case 2: System.out.print("Enter your ATM pin here:    ");
                    atmpin = sc.nextInt();
                    if(pin == atmpin){ 
                        System.out.print("Enter the amount you want to withdraw:   ");
                         wamount = sc.nextInt();
                    if( total >= wamount){ 
                    total = total - wamount;
                     System.out.println("Your total amount is:   " +total);
                    System.out.println("*** Kindly collect your money! ***");
                count++;
                    }else{
                        System.out.println("*** Your balance is less! ***");
                    }
                     }else{
                        System.out.println("*** WRONG PIN!!! ***");
                    }
                    break;
            case 3: System.out.print("Enter your ATM pin here:   ");
                     atmpin = sc.nextInt();
                    if(pin == atmpin){ 
                    System.out.print("Enter the bank holder's account number:   ");
                     accountno = sc.nextInt();
                    System.out.print("Enter the amount you want to tranfer:   ");
                    int tamount = sc.nextInt();
                    if( total > tamount){
                    total -= tamount;
                    transfermoney = transfermoney + tamount;
                     System.out.println("Your total amount is:   " +total);
                    System.out.println("The amount transfered is:   " + transfermoney);
                 count++;
                    }else{
                        System.out.println("*** Your balance is less! ***");
                    }
                     }else{
                        System.out.println("*** WRONG PIN!!! ***");
                    }
                    break;
            case 4: System.out.print("Enter your ATM pin here:   ");
                     atmpin = sc.nextInt();
                    if(pin == atmpin){
                        System.out.println("** TRANSECTION HISTORY ***");
                        System.out.println("The number of times you have used the ATM INTERFACE is:   " +count);
                        System.out.println("The last amount deposited is:   " +damount);
                        System.out.println("The last amount withdrawn is:   " +wamount);
                        System.out.println("The last amount transfered is:   " +transfermoney);
                    System.out.println("The total amount left in your account is:   " +total );

                     }else{
                        System.out.println("*** WRONG PIN!!! ***");
                    }
                    break;
            case 5: System.out.println("*** Thank You ***");
                    break;
        }
        System.out.println();
        System.out.println("Want to go to your account again?");
        System.out.print("Press 1 for YES ang 2 for NO:   " );
        a = sc.nextInt();
        }while( a == 1);

    }   
}
