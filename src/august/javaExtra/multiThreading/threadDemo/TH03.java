package august.javaExtra.multiThreading.threadDemo;

public class TH03 {
    public static void main(String[] args) {
        // 1 worker Class to do task from 1 to 5
        // if want to do another task from 1 to 100,  so  i have to create another worker Class

        ThreadGroup threadGroup = new ThreadGroup("Workers");


        Worker1TH03 w1 = new Worker1TH03(threadGroup, "W1");
        w1.start(); // cant use .run() bcoz then it will be out of the Thread Mechanism

        Worker1TH03 w2 = new Worker1TH03(threadGroup, "W2");
        w2.start();

        // This above 2 Threads will do Their own Task

//        and this below code is run by "main" thread irrespective of the above 2 threads
//        Both will do their work separately

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        // It depends on the CPU Scheduler to allow threads to do their tasks
        // it is random in nature
    }
}

// Thread by Class

class Worker1TH03 extends Thread{

    Worker1TH03(ThreadGroup threadGroup, String name){
        super(threadGroup, name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}