package chapter1;

public class ThreadDemo {

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                Thread thread = Thread.currentThread();

                while (true) {
                    System.out.printf("%s is %salive and in %s state%n",
                            thread.getName(), thread.isAlive() ? "" : " not ", thread.getState());
                }
            }
        };

        Thread thread1 = new Thread(r, "thd1");

        thread1.start();

    }

}
