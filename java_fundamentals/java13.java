public class java13{
    static int staticvar=10;
    int instancevar=20;
    public static void main(String[] args) {
        java13 obj=new java13();
        java13 obj1=new java13();

         obj1.instancevar=200;
        staticvar=100;
        
        System.out.println("obj instancevar:"+obj.instancevar);
        System.out.println("obj1 instancevar:"+obj1.instancevar);
        System.out.println("Static var:"+staticvar);
        
    }
}