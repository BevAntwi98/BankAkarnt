import java.util.ArrayList;

public class Account {
    /*
     * name of account
     */
    private String name;
    /*
     * current balance of the account
     */
    private double balance;
    /*
     * the account id number
     */
    private String uid;
    /*
     * user object that is the owner of this account
     */
    private User owner;
    /*
     * list of transactions for this accounts
     */
    private ArrayList<Transaction> transactions;
}