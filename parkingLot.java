import java.util.Scanner;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import javax.lang.model.util.ElementScanner14;
import javax.sound.sampled.SourceDataLine;

interface Person{
    public void customerId(int i);
    public void customerName(int i);
    public void vehicleType(int i);
    public void entryTime(int i);
    public void exitTime(int i);
    public void floor(String p,int i);
    public void paymentStatus(int i);
}
class Atten implements Person{
    Scanner sc = new Scanner(System.in);
    String S[][] = new String[100][7];
    //This array is used to store data in order
    public void customerId(int i){
        System.out.print("Enter Customer id: ");
        S[i][0] = sc.next();

    }
    public void customerName(int i){
        System.out.print("Enter Customer Name: ");
        S[i][1] = sc.next();

    }
    public void vehicleType(int i){
        System.out.println("Enter Vehicle Type: ");
        System.out.println("1.Handicapped\n2.Bicycle\n3.Car\n4.EVCar\n5.Truck");
        S[i][2] =  sc.next();
    }
    public void entryTime(int i){
        System.out.println("Enter Entry Time: ");
        S[i][3] = sc.next();
    }
    public void exitTime(int i){
        System.out.println("Entry Exit Time: ");
        S[i][4] = sc.next();
    }
    public void floor(String p,int i){
        S[i][5] = p;
    }
    public void paymentStatus(int i){
        S[i][6] = "Not_Paid";
    }
}
//Cost is different for different Vehicles
class costOfVehicle{
    public int rent(String a){
        if(a.equals("1"))
            return 40;
        else if(a.equals("2"))
            return 40;
        else if(a.equals("3"))
            return 60;
        else if(a.equals("4"))
            return 70;
        else{
            return 80;
        }
    }
}
class Floor{
    int noOfMaxHandicappedSpots;
    int noOfMaxBicycleSpots;
    int noOfMaxCarSpots;
    int noOfMaxEvCarSpots;
    int noOfMaxTruckSpots;

}
class F0 extends Floor{

    void noOfMaxHandicappedSpots(int a1){
        this.noOfMaxHandicappedSpots=a1;
    }
    void noOfMaxBicycleSpots(int a2){
        this.noOfMaxBicycleSpots=a2;
    }
    void noOfMaxCarSpots(int a3){
        this.noOfMaxCarSpots=a3;
    }
    void noOfMaxEvCarSpots(int a4){
        this.noOfMaxEvCarSpots =a4;
    }
    void noOfMaxTruckSpots(int a5){
        this.noOfMaxTruckSpots = a5;
    }
}
class F1 extends Floor{

    void noOfMaxHandicappedSpots(int b1){
        this.noOfMaxHandicappedSpots=b1;
    }
    void noOfMaxBicycleSpots(int a2){
        this.noOfMaxBicycleSpots=a2;
    }
    void noOfMaxCarSpots(int a3){
        this.noOfMaxCarSpots=a3;
    }
    void noOfMaxEvCarSpots(int a4){
        this.noOfMaxEvCarSpots =a4;
    }
    void noOfMaxTruckSpots(int a5){
        this.noOfMaxTruckSpots = a5;
    }
}
class F2 extends Floor{
    int noOfMaxHandicappedSpots;
    int noOfMaxBicycleSpots;
    int noOfMaxCarSpots;
    int noOfMaxEvCarSpots;
    int noOfMaxTruckSpots;
    void noOfMaxHandicappedSpots(int c1){
        this.noOfMaxHandicappedSpots=c1;
    }
    void noOfMaxBicycleSpots(int a2){
        this.noOfMaxBicycleSpots=a2;
    }
    void noOfMaxCarSpots(int a3){
        this.noOfMaxCarSpots=a3;
    }
    void noOfMaxEvCarSpots(int a4){
        this.noOfMaxEvCarSpots =a4;
    }
    void noOfMaxTruckSpots(int a5){
        this.noOfMaxTruckSpots = a5;
    }
}
abstract class paymentMode{
    abstract void money(int a);
}
interface accountDetails{

    public void cardHolderName();
    public void Pin();
}
class cashMode extends paymentMode{
    void money(int a){
        System.out.println("Pay Cash of "+ a);
        System.out.println("Payment Done");
    }
}
class cardMode extends paymentMode implements accountDetails{
    Scanner sc = new Scanner(System.in);
    void money(int a){
        System.out.println("Enter card details");
    }
    public void cardHolderName(){
        System.out.println("Enter Card Holder Name: ");
        String S = sc.next();
    }
    public void Pin(){
        System.out.println("Enter PIN: ");
        String Pin = sc.next();
        System.out.println("Payment Successful");
    }

}
class scanMode extends paymentMode {
    //Attendent Show the Scanner
    void money(int a){
        System.out.println("Scan ");
        System.out.println("Payment Succesful");
    }
}



public class parkingLot{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);


        Atten ab = new Atten();
        F0 f = new F0();
        f.noOfMaxHandicappedSpots(10);
        f.noOfMaxBicycleSpots(20);
        f.noOfMaxCarSpots(15);
        f.noOfMaxEvCarSpots(10);
        f.noOfMaxTruckSpots(15);
        F1 f1 = new F1();
        f1.noOfMaxHandicappedSpots(5);
        f1.noOfMaxBicycleSpots(15);
        f1.noOfMaxCarSpots(20);
        f1.noOfMaxEvCarSpots(10);
        f1.noOfMaxTruckSpots(15);
        F2 f2 = new F2();
        f2.noOfMaxHandicappedSpots(5);
        f2.noOfMaxBicycleSpots(10);
        f2.noOfMaxCarSpots(20);
        f2.noOfMaxEvCarSpots(10);
        f2.noOfMaxTruckSpots(10);

        int k=1;
        while(k<=10){
            System.out.println("-------------------------------- W E L C O M E -----------------------------");
            System.out.println("Choose Enter or Exit");
            System.out.println("1.Entry\n2.Exit");
            int n = sc.nextInt();
            if(n==1){

                ab.customerId(k);
                ab.customerName(k);
                ab.vehicleType(k);
                ab.paymentStatus(k);
                if(ab.S[k][2].equals("1") ){
                    System.out.println(f.noOfMaxHandicappedSpots+" slots are available in Ground Floor\n"+f1.noOfMaxHandicappedSpots+" Slots in first floor\n"+f2.noOfMaxHandicappedSpots+" slots available in second floor");
                    if(f.noOfMaxHandicappedSpots>0){
                        f.noOfMaxHandicappedSpots= f.noOfMaxHandicappedSpots-1;
                        System.out.println("           - Park in Ground Floor -        ");
                        ab.S[k][5] = "0";
                    }
                    else if(f1.noOfMaxBicycleSpots>0){
                        f1.noOfMaxHandicappedSpots = f1.noOfMaxHandicappedSpots-1;
                        System.out.println("           - Park in First Floor  -        ");
                        ab.S[k][5] = "1";
                    }
                    else if(f2.noOfMaxBicycleSpots>0){
                        f2.noOfMaxHandicappedSpots = f2.noOfMaxHandicappedSpots-1;
                        System.out.println("           - Park in Second Floor -        ");
                        ab.S[k][5] = "2";
                    }
                    else{
                        System.out.println("Vehicle Cannot be parked here");
                    }
                }
                else if(ab.S[k][2].equals("2")){
                    System.out.println(f.noOfMaxBicycleSpots+" slots are available in ground floor\n"+f1.noOfMaxBicycleSpots+" Slots in first floor\n"+f2.noOfMaxBicycleSpots+" slots available in second floor");
                    if(f.noOfMaxBicycleSpots>0){
                        f.noOfMaxBicycleSpots= f.noOfMaxBicycleSpots-1;
                        System.out.println("           - Park in Ground Floor -        ");
                        ab.S[k][5] = "0";
                    }
                    else if(f1.noOfMaxBicycleSpots>0){
                        f1.noOfMaxBicycleSpots = f1.noOfMaxBicycleSpots-1;
                        System.out.println("           - Park in First Floor  -        ");
                        ab.S[k][5] = "1";
                    }
                    else if(f2.noOfMaxBicycleSpots>0){
                        f2.noOfMaxBicycleSpots = f2.noOfMaxBicycleSpots-1;
                        System.out.println("           - Park in Second Floor -        ");
                        ab.S[k][5] = "2";
                    }
                    else{
                        System.out.println("Vehicle Cannot be parked here");
                    }
                }
                else if(ab.S[k][2].equals("3")){
                    System.out.println(f.noOfMaxCarSpots+" slots are available in ground floor\n"+f1.noOfMaxCarSpots+" Slots in first floor\n"+f2.noOfMaxCarSpots+" slots available in second floor");
                    if(f.noOfMaxCarSpots>0){
                        f.noOfMaxCarSpots= f.noOfMaxCarSpots-1;
                        System.out.println("           - Park in Ground Floor -        ");
                        ab.S[k][5] = "0";
                    }
                    else if(f1.noOfMaxCarSpots>0){
                        f1.noOfMaxCarSpots = f1.noOfMaxCarSpots-1;
                        System.out.println("           - Park in First Floor  -        ");
                        ab.S[k][5] = "1";
                    }
                    else if(f2.noOfMaxCarSpots>0){
                        f2.noOfMaxCarSpots = f2.noOfMaxCarSpots-1;
                        System.out.println("           - Park in Second Floor -        ");
                        ab.S[k][5] = "2";
                    }
                    else{
                        System.out.println("Vehicle Cannot be parked here");
                    }
                }
                else if(ab.S[k][2].equals("4")){
                    System.out.println(f.noOfMaxEvCarSpots+" slots are available in ground floor\n"+f1.noOfMaxEvCarSpots+" Slots in first floor\n"+f2.noOfMaxEvCarSpots+" slots available in second floor");
                    if(f.noOfMaxEvCarSpots>0){
                        f.noOfMaxEvCarSpots= f.noOfMaxEvCarSpots-1;
                        System.out.println("           - Park in Ground Floor -        ");
                        ab.S[k][5] = "0";
                        ab.entryTime(k);
                        System.out.println("1.Charge Vehicle\n2.No need");
                        int ch = sc.nextInt();
                        if(ch==1){
                            System.out.println("Pay amount = 30 rupees\nScan\nPayment Done");
                            System.out.println("......Charging.......");
                        }
                    }
                    else if(f1.noOfMaxEvCarSpots>0){
                        f1.noOfMaxEvCarSpots = f1.noOfMaxEvCarSpots-1;
                        System.out.println("           - Park in First Floor  -        ");
                        ab.S[k][5] = "1";
                        ab.entryTime(k);
                        System.out.println("1.Charge Vehicle\n2.No need");
                        int ch = sc.nextInt();
                        if(ch==1){
                            System.out.println("Pay amount = 30 rupees\nScan\nPayment Done");
                            System.out.println("......Charging.......");
                        }
                    }
                    else if(f2.noOfMaxEvCarSpots>0){
                        f2.noOfMaxEvCarSpots = f2.noOfMaxEvCarSpots-1;
                        System.out.println("           - Park in Second Floor -        ");
                        ab.S[k][5] = "2";
                        ab.entryTime(k);
                        System.out.println("1.Charge Vehicle\n2.No need");
                        int ch = sc.nextInt();
                        if(ch==1){
                            System.out.println("Pay amount = 30 rupees\nScan\nPayment Done");
                            System.out.println("......Charging.......");
                        }
                    }
                    else{
                        System.out.println("Vehicle Cannot be parked here");
                    }
                }
                else if(ab.S[k][2].equals("5")){
                    System.out.println(f.noOfMaxTruckSpots+" slots are available in ground floor\n"+f1.noOfMaxTruckSpots+" Slots in first floor\n"+f2.noOfMaxTruckSpots+" slots available in second floor");
                    if(f.noOfMaxTruckSpots>0){
                        f.noOfMaxTruckSpots= f.noOfMaxTruckSpots-1;
                        System.out.println("           - Park in Ground Floor -        ");
                        ab.S[k][5] = "0";
                    }
                    else if(f1.noOfMaxTruckSpots>0){
                        f1.noOfMaxTruckSpots = f1.noOfMaxTruckSpots-1;
                        System.out.println("           - Park in First Floor  -        ");
                        ab.S[k][5] = "1";
                    }
                    else if(f2.noOfMaxTruckSpots>0){
                        f2.noOfMaxTruckSpots = f2.noOfMaxTruckSpots-1;
                        System.out.println("           - Park in Second Floor -        ");
                        ab.S[k][5] = "2";
                    }
                    else{
                        System.out.println("Vehicle Cannot be parked here");
                    }
                }
                if(Integer.parseInt(ab.S[k][2]) != 4)
                    ab.entryTime(k);
                System.out.println("Collect Recipt while you exit");
                System.out.println("Thank You");
            }
            else{
                //Attendent Ask Id of the customer and enters it in the system
                System.out.println("Customer id: ");
                String CID = sc.next();
                int i=1;
                for(i=1;i<5;i++){
                    if(ab.S[i][0].equals(CID)){
                        break;
                    }
                }
                ab.exitTime(i);
                costOfVehicle cost = new costOfVehicle();
                //Note: Time Should be in Hours only.
                //24 hours format is used.
                int money =(Integer.parseInt(ab.S[i][4])- Integer.parseInt(ab.S[i][3]))*cost.rent(ab.S[i][2]);
                System.out.println("  ! Checking Payment Status !");

                if(ab.S[i][6].equals("Not_Paid")){
                    System.out.println("You have to Pay Now ");
                    System.out.println("Pay in\n1.In ₹\n2.In $ \n3.In €");
                    int r = sc.nextInt();
                    convert(r,money);
                    System.out.println("Select Mode of Payment\n1.Cash\n2.Card\n3.Scan");
                    int pMode = sc.nextInt();
                    String abcd = "paid";

                    if(pMode==1){
                        cashMode cash = new cashMode();
                        cash.money(money);
                        //Attendent collects money from customer
                        ab.S[i][6] = abcd;
                    }
                    else if(pMode==2){
                        cardMode  card = new cardMode();
                        card.money(money);
                        card.cardHolderName();
                        card.Pin();
                        ab.S[i][6] = abcd;
                    }
                    else if(pMode==3){
                        scanMode scan = new scanMode();
                        scan.money(money);
                        ab.S[i][6] = abcd;
                    }
                    else{
                        System.out.println("Invalid Payment Mode");
                    }
                }
                else{
                    System.out.println("Payment is done");
                }


                if(ab.S[i][2].equals("1")){
                    if(ab.S[i][5].equals("0"))
                        f.noOfMaxHandicappedSpots= f.noOfMaxHandicappedSpots + 1;
                    else if(ab.S[i][5].equals("1"))
                        f1.noOfMaxHandicappedSpots = f1.noOfMaxHandicappedSpots +1;
                    else if(ab.S[i][5].equals("2"))
                        f2.noOfMaxHandicappedSpots = f2.noOfMaxHandicappedSpots +1;
                    System.out.println("--------Take Exit From GATE 1--------");

                }
                else if(ab.S[i][2].equals("2")){
                    if(ab.S[i][5].equals("0"))
                        f.noOfMaxBicycleSpots= f.noOfMaxBicycleSpots + 1;
                    else if(ab.S[i][5].equals("1"))
                        f1.noOfMaxBicycleSpots = f1.noOfMaxBicycleSpots +1;
                    else if(ab.S[i][5].equals("2"))
                        f2.noOfMaxBicycleSpots = f2.noOfMaxBicycleSpots +1;
                    System.out.println("--------Take Exit From GATE 1--------");
                }
                else if(ab.S[i][2].equals("3")){
                    if(ab.S[i][5].equals("0"))
                        f.noOfMaxCarSpots= f.noOfMaxCarSpots + 1;
                    else if(ab.S[i][5].equals("1"))
                        f1.noOfMaxCarSpots = f1.noOfMaxCarSpots +1;
                    else if(ab.S[i][5].equals("2"))
                        f2.noOfMaxCarSpots = f2.noOfMaxCarSpots +1;
                    System.out.println("--------Take Exit From GATE 2--------");
                }
                else if(ab.S[i][2].equals("4")){
                    if(ab.S[i][5].equals("0"))
                        f.noOfMaxEvCarSpots= f.noOfMaxEvCarSpots + 1;
                    else if(ab.S[i][5].equals("1"))
                        f1.noOfMaxEvCarSpots = f1.noOfMaxEvCarSpots +1;
                    else if(ab.S[i][5].equals("2"))
                        f2.noOfMaxEvCarSpots = f2.noOfMaxEvCarSpots +1;
                    System.out.println("--------Take Exit From GATE 2--------");
                }
                else if(ab.S[i][2].equals("5")){
                    if(ab.S[i][5].equals("0"))
                        f.noOfMaxTruckSpots= f.noOfMaxTruckSpots + 1;
                    else if(ab.S[i][5].equals("1"))
                        f1.noOfMaxTruckSpots = f1.noOfMaxTruckSpots +1;
                    else if(ab.S[i][5].equals("2"))
                        f2.noOfMaxTruckSpots = f2.noOfMaxTruckSpots +1;
                    System.out.println("--------Take Exit From GATE 3--------");
                }
                k=k-1;

            }
            System.out.println("Press 1 if You want to continue\nPress 0 to end");
            int yes_no = sc.nextInt();
            if(yes_no==0){
                System.out.println("--------------------- End -------------------");
                break;
            }



            k=k+1;

        }
        System.out.println(k);
        System.out.println("----------------------------------------------Complete Stats for the Day---------------------------------------------");
        System.out.println("Customer ID        CustomerName       VehicleType       EntryTime          ExitTIme          Floor            PaymentStatus");
        for(int m=1;m<=k;m++){
            for(int n=0;n<7;n++){
                System.out.print(ab.S[m][n]+"                ");
            }
            System.out.println();
        }
    }
    public static void convert(int r,int money){
        if(r==1){
            System.out.println("Pay INR "+ money);
        }
        if(r==2){
            double d = money/75;
            System.out.println("Pay $ "+ d);
        }
        if(r==3){
            double d = money/78;
            System.out.println("Pay EURO "+ d);
        }
    }

}