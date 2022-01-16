package Assignments;

public class MRunnableThread implements Runnable{
	 
    public static int myCount = 0;
    public MRunnableThread(){
         
    }
    public void run() {
        while(MRunnableThread.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++MRunnableThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        MRunnableThread mrt = new MRunnableThread();
        Thread t = new Thread(mrt);
        t.start();
        while(MRunnableThread.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++MRunnableThread.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}
