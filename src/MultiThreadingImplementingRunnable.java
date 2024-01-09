public class MultiThreadingImplementingRunnable{
    public static void main(String args[]){
        int threads=5;
        for(int i=00;i<threads;i++){
            Thread obj = new Thread(new demo());
            obj.start();
        }
    }
}
class demo implements Runnable{
    public void run(){
        try {
            System.out.println(Thread.currentThread().getId());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
