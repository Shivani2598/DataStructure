public class MultiThreadingExtendingThread {
    public static void main(String args[]){
        int numberOfThreads=10;
        for(int i=0;i<numberOfThreads;i++){
            MultiThreadingDemo obj=new MultiThreadingDemo();
            obj.start();
        }
    }
}
class MultiThreadingDemo extends Thread{
    public void run(){
        try{
            System.out.println(Thread.currentThread().getId());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
