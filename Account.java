
package account;


public class Account {

   //variable decleration 
    
    private double balance;
    private String owner;
    private float AcctNo;
    private double amount; 
    
    public Account(){ 
    //defualt consrtuctor with no arg.
    }
    //use of constructor to initialize all variables.
    public Account(double balance, String owner, int AcctNo){
    this.balance = balance;
    this.owner = owner;
    this.AcctNo = AcctNo;
    }
    
    //set() and get() for all variables.
    public void setBalance(double balance){
    this.balance = balance;
    }
    
    public void setOwner(String owner){
    this.owner = owner;
    }
    
    public void setAcctNo(float AcctNo){
    this.AcctNo = AcctNo;
    }
    
    public double getBalance(){
    return balance;
    }
    
    public String getOwner(){
    return owner;
    }
    
    public float getAcctNo(){
    return AcctNo;
    }
    
    public void deposit(double balance){
        //parse in balance in the deposit()
    this.balance = balance;
    
    }
    
    public void withdrawal(double amount) throws InsufficientFundsException{
        
        //subtract amount from balance to get current balance. 
        balance = balance - this.amount;
        
        if(balance < amount){
        throw new InsufficientFundsException();
        }
        else if(amount <= 0){
        System.out.println("Sorry you cannot withdraw...$" +amount);
        }
        else{
        System.out.println("Thank you for withdrawing...$" +amount);
        }
    }
    
    public void display1(){
    
        System.out.println(getBalance()+ " "+getOwner()+ " "+ getAcctNo());
    }
    public static void main(String[] args) {
       
        Account a1 = new Account(2222,"Frank",1000);
         
        a1.deposit(100.00); // try and catch block around withdrawal 
     
        try{
        a1.withdrawal(-5.00);
        }
        catch(InsufficientFundsException ex){
        ex.display();
        }
        

        
    }
    
}
 
