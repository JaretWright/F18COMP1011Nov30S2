public class ThreadDemo {
    public static void main(String[] args)
    {

        //Create a Thread using a class that implements Runnable
        new Thread(new HelloRunnable()).start();
    }
}
