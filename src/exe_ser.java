import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class exe_ser {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        AtomicInteger atomicInteger=new AtomicInteger();
        for(int i=0;i<50;i++)
        {
            executorService.submit(()->{
                int i1=0;
                while(i1<100 && !Thread.currentThread().isInterrupted()){
                    System.out.println("task number "+atomicInteger.get());
                    System.out.println("Execution number "+ ++i1);

                }
                atomicInteger.getAndIncrement();
        });
        }
        executorService.shutdown();
        executorService.shutdownNow();

        }

    }






