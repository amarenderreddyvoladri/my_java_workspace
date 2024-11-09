package oops;

class Test {
    int a = 10;
    static int b = 20;
    
    
    public static void main(String[] args) {
    	//int c;
        Test t1 = new Test();
        System.out.println(t1.a+"....."+t1.b); 
        
        t1.a = 444;
        t1.b = 555;
        System.out.println(t1.a+"....."+t1.b);
        
        Test t2 = new Test();
        System.out.println(t2.a+"....."+t2.b);        
        
    }
}