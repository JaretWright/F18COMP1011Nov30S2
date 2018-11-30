public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from " +Thread.currentThread().getName()+
                " a Thread created by implmenting a Runnable interface");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("I'm back after a little rest...call me Vlad");
    }
}
