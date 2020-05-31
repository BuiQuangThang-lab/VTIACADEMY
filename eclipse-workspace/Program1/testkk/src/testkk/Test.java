package testkk;

public class Test {
	static int a; 
	int b; 
	public Test() { 
	int c; 
	c = a; 
	a++; 
	b += c; 
	} 
	public static void main(String args[]) {    
	new Test();
	System.out.println(Test.a);
	}
}
