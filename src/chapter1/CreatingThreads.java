package chapter1;

public class CreatingThreads {

    public static void main(String[] args) {

        Runnable r = () -> System.out.println("Learning concurrency");

        Thread thread = new Thread(r, "test");
        System.out.println("Thread's name : " + thread.getName());
        System.out.println("Thread's id : " + thread.getId());
        System.out.println("Thread's alive status : " + thread.isAlive());
        System.out.println("Thread's state : " + thread.getState());
        System.out.println("Thread's priority : " + thread.getPriority());

        Thread notName = new Thread(r);
        notName.setName("Named after creation");
        System.out.println("Thread's name : " + notName.getName());
        System.out.println("Thread's id : " + notName.getId());
        System.out.println("Thread's alive status : " + notName.isAlive());
        System.out.println("Thread's state : " + notName.getState());
        System.out.println("Thread's priority : " + notName.getPriority());

        thread.start();
        System.out.println(thread.getState());

        notName.start();


    }

}
