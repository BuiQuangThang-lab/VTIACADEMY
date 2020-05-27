import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class String_works {
	
	//-------------------Question1-------------------------------//
	
    public static void count_words() {
    	System.out.println("Nhập vào một chuỗi: ");
    	Scanner scan = new Scanner(System.in);
    	String a = scan.nextLine();
    	int count = 0;
    	for(int i = 1; i < a.length() -1 ; i++) {
    		if(a.charAt(i) != ' ' && a.charAt(i) != '\t') {
    			if(a.charAt(i-1) == ' ') {
        			count++;
        		}
    		}
    	}
    	
    	System.out.println(count+1);
    }
	
	
	//---------------------Question2-----------------------------------//
	
    public static void join_String() {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Nhập vào một chuỗi 1: ");
    	String a = scan.nextLine();
    	System.out.println("Nhập vào một chuỗi 2: ");
    	String b = scan.nextLine();
    	System.out.println(a + " " + b);
	}
    
  //---------------------Question3-----------------------------------//
    
    public static void TitleCase() {
    	System.out.println("Nhập vào Tên: ");
    	Scanner scan = new Scanner(System.in);
    	String a = scan.nextLine();
    	scan.close();
    	String[] arr = a.split(" ");
    	for(int i = 0; i < arr.length; i++) {
    		if(arr[i].charAt(0) < 91) {
    			char Upper = Character.toUpperCase(arr[i].charAt(0));
    			String a1 = a.replace(arr[i].charAt(0),Upper);
    			
    			System.out.println(a1);
    		}
    		
    	}
    	
    }
  
  //---------------------Question4-----------------------------------//
    
    public static void In_Character() {
    	System.out.println("Nhập vào Tên: ");
    	Scanner scan = new Scanner(System.in);
    	String a = scan.nextLine();
    	
    	
    	char[] character = a.toCharArray();
    	for(int i = 0; i < character.length; i++) {
    		System.out.println("Kí tự thứ " + (i+1) + " là: " + Character.toUpperCase(character[i]));
    	}
    }
    
  //---------------------Question5-----------------------------------//
    
    public static void full_Name() {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Nhập vào Họ: ");
    	String a = scan.nextLine();
    	System.out.println("Nhập vào tên: ");
    	String b = scan.nextLine();
    	System.out.println("Họ và tên: " + a +" "+ b);
    }
    
    //---------------------Question6-----------------------------------//
    
    public static void Name() {
    	System.out.println("Nhập vào họ và tên: ");
    	Scanner scan = new Scanner(System.in);
    	String a = scan.nextLine();
    	
    	String[] ten = a.split(" ");
    	for(int i = 0; i < ten.length; i++) {
    		if(i < ten.length -1) {
    			System.out.println("Họ là: " + ten[i]);
    		}else {
    			System.out.println("Tên là: " + ten[i]);
    		}
    	}
    }
    
  //---------------------Question7-----------------------------------//
    
    public static void Question7() {
    	System.out.println("Nhập vào họ và tên: ");
    	Scanner scan = new Scanner(System.in);
    	String a = scan.nextLine();
    	for(int i = 0; i < a.length() ; i++) {
    		if(a.charAt(0) == ' ' || a.charAt(a.length()) == '\t') {
    		    String a1 = a.replace(a.substring(a.charAt(a.length())), "");
    		    String a2 = a1.replace(a1.substring(a1.charAt(0)), "");	
    		    System.out.println(a2);
    		}
    	}
    	
    }
    
    //---------------------Question10-----------------------------------//
    
    public static void invert() {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("word 1: ");
    	String a = scan.nextLine();
    	System.out.println("word 2: ");
    	String b = scan.nextLine();
    	
    	StringBuffer stringBuffer = new StringBuffer(a);
    	String a1 = stringBuffer.reverse().toString();
    	if(a1 == b) {
    		System.out.println("True");
    	}else {
    		System.out.println("fault");
    	}
    }
    
  //---------------------Question11-----------------------------------//
    
    public static void Question11() {
    	System.out.println("Nhập vào một chuỗi: ");
    	Scanner scan = new Scanner(System.in);
    	String a = scan.nextLine();
    	int count = 0;
    	for(int i = 0; i < a.length(); i++) {
    		for(int j = i+1; j < a.length()-1; j++) {
    			if(a.charAt(i) == a.charAt(j)) {
    				count++;
    				String b = a.replace(a.substring(a.charAt(0)), "");
    			}
    		}
    	}
    	if(count == 0) {
    		System.out.println("NOT");
    	}
    	if (count == 1) {
    		System.out.println(count);
    	}
    }
    
    
  //---------------------Question12-----------------------------------//
    
    public static String reverse(String input) {
    	char[] in = input.toCharArray();
    	int begin = 0;
    	int end = in.length - 1;
    	char temp;
    	while(end>begin) {
    		temp = in[begin];
    		in[begin] = in[end];
    		in[end] = temp;
    		end --;
    		begin ++;
    	}
    	return new String(in);
    }
    
  //---------------------Question13-----------------------------------//
    
    public static void hasNumber() {
    	System.out.println("Nhập vào Tên: ");
    	Scanner scan = new Scanner(System.in);
    	String a = scan.nextLine();
    	
    	
    	char[] character = a.toCharArray();
    	for(int i = 0; i < character.length; i++) {
    		int b = (int)(character[i]);
    		if(b < 10) {
    			System.out.println("True");
    		}else {
    			System.out.println("Fault");
    		}
    	} 	 
    }
    
  //---------------------Question14-----------------------------------//
    
    
    public static void replace_w() {
    	String a = "VTI Academy" ;
    	String b = a.replace("e", "*");
    	System.out.println(b);
    	
    }
    
  //---------------------Question15-----------------------------------//
    
    
    
    public static void revert() {
    	System.out.println("Nhập vào Tên: ");
    	Scanner scan = new Scanner(System.in);
    	String a = scan.nextLine();
    	
    	String[] words = a.split(" ");
		
		String rev = "" ;
		for(int i = words.length -1; i >= 0; i--) {
			rev += words[i] + " ";
			
		}
		System.out.println(rev);
    }
    
    
  //---------------------Question16-----------------------------------//  
    
   
    public static void Question16(){
        Scanner scanner = new Scanner(System.in);
        String s1;
        String s2;
        int n;
        System.out.println("Chuỗi: ");
        s1 = scanner.nextLine();
        System.out.println("Nhập n: ");
        n = scanner.nextInt();
        if (s1 == null || s1.isEmpty()){
            System.out.println("No");
            return;
        }
        if (s1.length() % n != 0){
            System.out.println("No");
            return;
        }

        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < s1.length()/n; i++) {
            arrayList.add(s1.substring(i*n,(i+1)*n));
        }
        for (String x: arrayList) {
            System.out.println(x + "\n");
        }
        scanner.close();
    }
    
    //-------------------------Question17-------------------------------------//
    public static void duplicate() {
    	
    	int result = 1;
    	char kiTu = 0;
    	
    	System.out.println("Nhập vào chuỗi: ");
    	Scanner scan = new Scanner(System.in);
    	String a = scan.nextLine();
    	int count = 0;
    	char[] character = a.toCharArray();
    	for(int i = 0; i < character.length; i++) {
    		for(int j = i+1; j < character.length - 1; j++) {
    			if(a.charAt(i) == a.charAt(j)) {
    				continue;
    			}result = 0;
    			kiTu = a.charAt(i);
    		}
    	}
    	if(result == 1) {
    		System.out.println("NO");
    	}else {
    		System.out.println("Kí tự trùng: " + kiTu);
    	}
    }
    
//------------------------------Question18--------------------------------------------------       
        public static void Question18(){
            Scanner scanner = new Scanner(System.in);
            StringBuilder chuoi;

            System.out.println("Mời bạn nhập vào một chuỗi: ");
            chuoi = new StringBuilder(scanner.nextLine());
            for (int i = 0; i < chuoi.length()-1; i++) {
                for (int j = i+1; j< chuoi.length(); j++){
                    if (chuoi.charAt(i) == chuoi.charAt(j)){
                        chuoi.deleteCharAt(j);
                        j--;
                    }
                }
            }
            System.out.println(chuoi);
        }

    
     public static void main(String[] args) {
    	 count_words();
    	 join_String();
    	 
    	 In_Character();
    	 full_Name();
    	 Name();
    	 invert();
    	 hasNumber();
    	 revert();
    	 Question16();
    	 duplicate();
    	 Question18();
    	 
	}
}
