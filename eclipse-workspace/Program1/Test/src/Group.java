
public class Group {
    int id;
    String name;
    Account[] account;
    String [] UserName; 
    public Group(int id, String name, String[] UserName ) {
    	this.id = id;
    	this.name = name;
    	this.UserName = UserName;  	
    	
    	for(int i = 0; i < account.length; i++) {
    		Account a = new Account(UserName[i]);
    		a.userName = UserName[i];
    	}
    	
    	
    }
    
    
   
}
