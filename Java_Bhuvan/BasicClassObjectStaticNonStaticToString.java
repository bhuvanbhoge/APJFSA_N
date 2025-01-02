package bhuvan;

public class BasicClassObjectStaticNonStaticToString {
	int p=10;			//non static void(instance)
	static int q=20;		//static(no need to create obj)
	
	public String toString() {
		return "P: " + p + " , Q: "+q;
	}
	
	public static void main(String[] args) {
		BasicClassObjectStaticNonStaticToString b = new BasicClassObjectStaticNonStaticToString();
		System.out.println(b.p);	// 10
		System.out.println(b);		// P: 10 , Q: 40
		
		b.q=40;
		System.out.println(b);		// P: 10 , Q: 40
		
		BasicClassObjectStaticNonStaticToString b1 = new BasicClassObjectStaticNonStaticToString();
		System.out.println(b1);		// P: 10 , Q: 40
		
		BasicClassObjectStaticNonStaticToString b2 = b1;
		System.out.println(b1==b2);		// true
		
		String s = "hello";
        String s1=new String("hello");
        String s2=new String("hello");
        System.out.println(s==s1);  	//false "different location"
        System.out.println(s.equals(s1));  		//true "checking data inside"
        System.out.println(s1==s2); 		//false   "checcking location"
        System.out.println(s1.equals(s2));  	//true "checking data inside"
        System.out.println(s.equals(s2));  		//true "checking data inside"
        
	}
}
