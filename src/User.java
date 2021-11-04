import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class User {

    // private to encapsulate values (hiding sensitive data from users),
    /*
     * to do this you must also use public get and set methods to update a value
     */

    /* first name of the user */
    private String firstName;

    /* last name of the user */
    private String lastname;

    // uuid stands for universal unique id code for user
    private String uuid;

    /*
     * pin of user (dont want to store actual password values. hash stores user pin
     */

    private byte pinHash[];

    // each user has list of accounts
    private ArrayList<Account> accounts;

    public User(String firstName, String lastName, String pin, Bank theBank) {

        // stores the hash version of the pin, rather than storing it for security
        // reasons
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            // getting bytes of pin objects and digesting the through md5 algroith
            // returns a different list of bytes and stores them as pin bytes
            this.pinHash=md.digest(pin.getBytes());
        } catch (NoSuchAlgorithmException e) {
            System.out.println("error, caught algorithm exception");
            e.printStackTrace();
            System.exit(1);
        }

        // gets a new , unique iniversal ID for the user;
        this.uuid = theBank.getNewUserUUID(){};

        // create.empty list of acounts
        this.accounts=new ArrayList<Account>();

        // print log message
        System.out.printf("New user %s, %s with ID: %s created.\n", args)


        // create empty list of accounts
        




    }

}