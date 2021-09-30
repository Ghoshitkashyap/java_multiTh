import java.util.concurrent.Executors;
        import java.util.concurrent.TimeUnit;
        import java.lang.Thread;

public class threadpoolterminate {
    public static void main(final String[] args) throws InterruptedException {
        ThreadPoolExecuter executor = (ThreadPoolExecuter)Executors.newCachedThreadPool();
        executor.submit(new Task());
        executor.submit(new Task());
        executor.shutdown();
        System.out.println("get task count after:"+executor.getTaskCount());
        System.out.println("Is executor is terminated:"+executor.isTerminated());


    }
    static class Task implements Runnable{
        @Override
        public void run(){
            try{
                Long duration =(long)(Math.random()*5);
                System.out.println("running thread name:"+Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(duration);

                System.out.println("completed thread name:"+Thread.currentThread().getName());


            }catch (InterruptedException e)
            {}
        }
    }
}