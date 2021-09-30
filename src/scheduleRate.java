import java.util.*;
public class scheduleRate {
    public static void main(String[] args) {
        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("task timer on fixed rate");
                }
            }

            ;
        };

        t.schedule(tt, 500, 1000);
    }
    }
