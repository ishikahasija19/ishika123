class MyThread extends Thread{
     volatile boolean running= true;
    public void run(){

        System.out.println("thread start");
    
        while(running){
        }
            System.out.println("thread stoppped");
        }
        public void stopThread(){
            running=false;
        }
    }
    public class java20{

    
    public static void main(String[] args) throws InterruptedException {
       MyThread t=new MyThread(); 
     
     t.start();
     Thread.sleep(1000);
   System.err.println("main thread  changing running false ");
   t.running=false;
    }
}
