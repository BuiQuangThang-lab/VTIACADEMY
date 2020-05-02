import java.util.Date;

public class Default_value {
	
	public static void Account() {
		Account[] account = new Account[5];
	    int i;
	    for(i = 0; i < account.length; i ++) {
	    	account[i] = new Account();
	    	account[i].ten = "ten" + i;
	    	account[i].email = "email" + i;
	    	account[i].CreateDate = new Date();
	    }
		for(i = 0; i < account.length; i++) {
			System.out.println("\nTen: "+ account[i].ten + "\nMail: "+ account[i].email + "\nCreateDate: " + account[i].CreateDate);
		}
	}
	
	
    public static void main(String[] args) {
    	Account();
    	
	}
}
