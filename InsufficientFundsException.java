
package account;

/**
 *  Michael Arrey
 * Lab #3
 * I Promise I wrote this code...
 */
public class InsufficientFundsException extends Exception{
    private String Message = "Inssufficient Funds in Account...";

    public String toString(){
        return Message;
    }
    
    public void display(){
    System.out.println(Message);
    }
    
}
