import java.util.*;

class InvalidAmountException extends Exception {
    InvalidAmountException(String msg) {
        super(msg);
    }
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class bal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int amti = 5000;        
        int amtw = sc.nextInt();

        try{
            if(amtw < 0) {
                throw new InvalidAmountException("Invalid amount");
            }
            if(amtw > amti) {
                throw new InsufficientBalanceException("Insufficient Balance");
            }
            amti = amti-amtw;
        }
        catch (Exception e) {
            System.err.print(e);
        }
        finally { sc.close(); }
    }
}