
public class Q1 implements Runnable{

public void run()
{   //override thread method(run)
    //thread task
    System.out.println("thread task is here");
}

        public static void main(String[] args) {
            {
                Q1 t=new Q1();
                Thread th=new Thread();//object create of thread class
                th.start();//invoke thread

            }
        }
}
