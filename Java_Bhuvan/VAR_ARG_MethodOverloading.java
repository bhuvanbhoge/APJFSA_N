package bhuvan;

public class VAR_ARG_MethodOverloading {
	int eid=101;
    String ename = "Bhuvan";
    float salary = 500000.00f;
    
    
	public static void main(String[] args) {
		Sum();              // * dont need to create obj because Sum method is made with the static keyword
        Sum(1);
        Sum(22,33,55);
        Sum(11,22,33,44);   //method overloading
        
        VAR_ARG_MethodOverloading p = new VAR_ARG_MethodOverloading();    //without static so we have to create obj
        p.Products(1);
        p.Products(11,22);//method overloading
        
        VAR_ARG_MethodOverloading emp = new VAR_ARG_MethodOverloading();  //without static so we have to create obj
        System.out.println(emp);

	}
	
	//var-arg
    public static void Sum(int...a){
        int count = 0;
        for(int i:a){
            count += i;
        }
        System.out.println("Total : "+count);
    }
    
    public void Products(int...p){
        int pCount =0;
        for(int i:p){
            pCount++;
            System.out.println("Product : "+i + " Count:" + pCount);
        } 
    }
    
    public String toString(){
        return "Employee id : "+eid + ", Employee Name : " + ename + ", Employee Salary :" + salary;
    }
}
