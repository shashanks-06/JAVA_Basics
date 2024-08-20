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