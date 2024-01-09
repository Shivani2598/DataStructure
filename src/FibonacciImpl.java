public class FibonacciImpl {
    public static void main(String args[]){
        int first=1;
        int second=1;
        int next;
        System.out.println(first+"\n"+second);
        for(int i=0;i<10;i++){
            next=first+second;
            System.out.println(next);
            first=second;
            second=next;
        }
    }
}
