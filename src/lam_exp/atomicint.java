package lam_exp;
import java.util.concurrent.atomic.AtomicInteger;
public class atomicint {
    static class Counter{
        private AtomicInteger c=new AtomicInteger(0);
        public void increment(){
            c.getAndIncrement();
        }
        public int value(){
            return  c.get();
        }
    }public static void main(String[] args)  throws  InterruptedException{
        final Counter counter =new Counter();
        for(int i=0;i<1000;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    counter.increment();
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println("final number should be 1000"+ counter.value());
    }




}
