package august.javaExtra.multiThreading.threadDemo;

public class TH02 {
    public static void main(String[] args) {

        Thread t = Thread.currentThread(); // Thread is a Class which Implements from Interface - Runnable
                                            // .currentThread() is and static native method
                                            // native -> imported from third party program (made with C++ or C)

        for (int i = 0; i <= 10 ; i++) {
            System.out.println(t.getName() + i + " - " + t.getThreadGroup() + " - " + t.getPriority());
        }
    }
}
