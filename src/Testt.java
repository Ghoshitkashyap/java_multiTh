public class Testt  implements Runnable{

    public void run()
    {   //override thread method(run)
        //thread task
        System.out.println("thread task 1 is here");
    }

    public static void main(String[] args) {
        {
            Testt t=new Testt();
            Thread th=new Thread(t);//object create of thread class
            th.start();//invoke thread

        }
    }
}


