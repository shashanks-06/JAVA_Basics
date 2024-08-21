package august.javaExtra.multiThreading.threadDemo;

public class TH04 {

    public static void main(String[] args) {
        Runnable w1 = new Worker1TH04();
        Thread t1 = new Thread(w1);
        t1.start();

        Runnable w2 = new Worker1TH04();
        Thread t2 = new Thread(w2);
        t2.start();
        t2.setPriority(7);

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " -- " + Thread.currentThread().getName());
        }
    }
}

class Worker1TH04 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName());
//                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

// Why we are calling the start() method but overriding the run() method?
// => If run() method is called then it will behave like a normal method and we would not be able to take advantage of
//    multithreading.
//    When a start() method is called through run() method then a separate thread is being allocated to execution of
//    run() method.
//    So, if more than one thread calls the start() method that means their run() method is being executed by separate
//    threads (these threads run simultaneously)