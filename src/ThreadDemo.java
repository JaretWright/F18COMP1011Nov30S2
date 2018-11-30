public class ThreadDemo {
    public static void main(String[] args)
    {

        //Create a Thread using a class that implements Runnable
        new Thread(new HelloRunnable()).start();
        System.out.println("Thread in main is called: "+Thread.currentThread().getName());

        //create a Thread using a class that extends Thread
        new HelloThread().start();

        //create a new Thread by creating a new Runnable object
        Runnable r1 = new Runnable(){

            @Override
            public void run() {
                System.out.println("Hello from " + Thread.currentThread().getName() +
                         " not using a Lambda expression with Priority " +
                        Thread.currentThread().getPriority());
            }
        };

        Runnable r2 = () -> System.out.println("Hello from " + Thread.currentThread().getName()+
                            " using a Lambda expression with Priority "+Thread.currentThread().getPriority());

        Thread t1 = new Thread(r1, "JDub thread");
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();


    }
}
