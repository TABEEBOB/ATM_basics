
package account;


public class InsufficientFundsException extends Exception{
    private String Message = "Inssufficient Funds in Account...";

    public String toString(){
        return Message;
    }
    
    public void display(){
    System.out.println(Message);
    }
    
}
