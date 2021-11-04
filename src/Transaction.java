import java.sql.Date;

public class Transaction {

    /*
     * the amount of this transaction
     */
    private double amount;

    /*
     * time and date if the transaction
     */
    private Date timestamp;

    /*
     * a memo? for this transaction
     */
    private String memo;

    /*
     * The account in whch the transaction was performed.
     */
    private Account inAccount;


    
}
