import java.util.*;
class ATM{
    int amount;
    float balance;
    float depositamount;
    float withdrawamount;
    int num;
    int AcNo=5050;
    int accountnumber;
    int pin=1234;
    int PIN;
    int usrno;
    void Details(){
        System.out.println("Enter Account Number :");
        Scanner ac=new Scanner(System.in);
        accountnumber=ac.nextInt();
        if(AcNo==accountnumber){
            Menu();
        }
        else{
            System.out.println("Incorrect Accountnumber");
            Details();
        }
    }
        void Menu(){
        System.out.println("Hello XYZ");
        System.out.println("Press 1 For Check Balance \nPress 2 For Deposit Amount \nPress 3 For Withdraw Amount\nPress 4 To Exit");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num==1){
            AvailableBalane();
        }
        else if(num==2){
           DepositAmount();
        }
        else if(num==3){
            WithdrawAmount();
        }
        else if(num==4){
            Details();
        }
        else {
            System.out.println("Enter Valid Number");
        }
    }
    void AvailableBalane(){
            System.out.println("Enter PIN");
            Scanner p=new Scanner(System.in);
            PIN=p.nextInt();
            if(pin==PIN){
            System.out.println("Available Balance is :"+balance);
            Exit();
        }
        else{
            System.out.println("Incorrect Pin");
            Details();
        }          
    }
    void DepositAmount(){
        System.out.println("Enter Amount To Be Deposited");
        Scanner d=new Scanner(System.in);
        depositamount=d.nextFloat();
        System.out.println("Enter PIN");
        Scanner p=new Scanner(System.in);
        PIN=p.nextInt();
        if(pin==PIN){
            System.out.println("RS"+depositamount+" Is Deposited Successfully \n");
            balance=balance+depositamount;
            System.out.println("Available Balance is :"+balance);
            Exit();
    }
    else{
        System.out.println("Incorrect Pin");
        Details();
    }
}   
    void WithdrawAmount(){
        System.out.println("Enter Amount To Be Withdrawn");
        Scanner w=new Scanner(System.in);
        withdrawamount=w.nextFloat();
        System.out.println("Enter PIN");
        Scanner p=new Scanner(System.in);
        PIN=p.nextInt();
        if(pin==PIN){
        if(withdrawamount>balance){
            System.out.println("Insufficent Balance");
            System.out.println("Available Balance is :"+balance);
            Exit();   
        }
        else{
            System.out.println("RS"+withdrawamount+" Withdraw Successfully \n Please Collect Your Money");
            balance=balance-withdrawamount;
            System.out.println("Available Balance is :"+balance);
            Exit();
        }     
    }
    else{
        System.out.println("Incorrect pin");
        Details();
    }
    }
    void Exit(){
        System.out.println("Press 1 For Menu \nPress 2 For Exit");
        Scanner usr=new Scanner(System.in);
        usrno =usr.nextInt();
        if(usrno==1){
            Menu();
        }
        else if(usrno==2){
            Details();
        }
        else{
            System.out.println("Wrong Press");
            Exit();
        }
    }
    public static void main(String[] args) {
        ATM a=new ATM();
        a.Details();
    }
}