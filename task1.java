import java.util.*;

public class task1{
    public static void main( String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String id,name,cltype,datee,bdplc,dest;
        int a,password=1234,choice,age,tno,pnr,lastopn;

        do{  
    System.out.println("*************************************************************************************************");
    System.out.println("*                            WELCOME TO THE ONLINE RESERVATION SYSTEM                           *");
    System.out.println("*************************************************************************************************");
        System.out.println("*** Reservation System ***");
        System.out.println("Enter 1 for Reservation form");
        System.out.println("Enter 2 for Cancellation form");
        System.out.print("Enter here:   ");
        choice = sc.nextInt();

        if(choice == 1){
              System.out.println("*** User Login Form: ***");
              System.out.print("Enter Your Userid:   ");
              id = sc.next();
            System.out.print("Enter Your Password:   ");
           password = sc.nextInt();
           if(password == 1234){ 
            System.out.println("*** Reservation form ***");
            System.out.print("Enter your name:   ");
            name = sc.next();
            System.out.print("Enter your age:   ");
            age = sc.nextInt();
            System.out.print("Enter train number(12303 , 75463 , 76653 , 55123 , 12398):   ");
             tno = sc.nextInt();
                if(tno == 12303){
                    System.out.println("Train Name:   Delhi Express");
                }else if(tno == 75463){
                    System.out.println("Train Name:   Sikkim Express");
                }else if(tno == 76653){
                    System.out.println("Train Name:   Chandigarh Express");
                }else if(tno == 55123){
                    System.out.println("Train Name:   Mumbai Express");
                }else if(tno == 12398){
                    System.out.println("Train Name:   Jaipur Express");
                }else{
                    System.out.println("Enter valid train number!");
                }
             System.out.print("Enter class type:   ");
              cltype = sc.next();
            System.out.print("Enter date of the journey:   ");
            datee = sc.next();
            System.out.print("Enter Boarding Platform:   ");
             bdplc = sc.next();
            System.out.print("Enter your destination:   ");
             dest = sc.next();
             if(tno == 12303){
                 System.out.println("Your PNR number is:   7365");
                }else if(tno == 75463){
                  System.out.println("Your PNR number is:   9998");
                }else if(tno == 76653){
                    System.out.println("Your PNR number is:   1462");
                }else if(tno == 55123){
                    System.out.println("Your PNR number is:   6543");
                }else if(tno == 12398){
                    System.out.println("Your PNR number is:   5646");
                }else{
                    System.out.println("Wrong Details!");
                }
            System.out.println("*** You are successfully Registered ***");
            }else{
                System.out.println("*** Wrong Password!!! ***");
            }    
        }else if(choice == 2){
            System.out.println("*** User Login Form: ***");
            System.out.println("Enter details as per reservation form:");
            System.out.print("Enter Your Userid:   ");
            id = sc.next();
            System.out.print("Enter Your Password:   ");
           password = sc.nextInt();
            if(password == 1234){ 
            System.out.println("*** Cancelation Form ***");
            System.out.print("Enter your PNR number:   ");
            pnr = sc.nextInt();
            System.out.print("*Are you sure & want to cancel your trip?( Enter 1=yes or 2=no):   ");
            lastopn = sc.nextInt();
            if( lastopn == 1 )
            { 
            System.out.println("*** You'r form is cancelled successfully ***");
            }else if( lastopn == 2 ){
                System.out.println("*** Try Again! ***");
            }

             }else{
                System.out.println("*** Wrong Password!!! ***");
            } 
        }
        System.out.println();
        System.out.println("Want to go to the Reservation Interface again?");
        System.out.print("Press 1 for YES ang 2 for NO:   " );
        a = sc.nextInt();
        }while( a == 1);
    }
}