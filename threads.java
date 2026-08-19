package package2;

public class threads implements Runnable 
{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

class Demo {

    public static void main(String[] args) {

        threads task = new threads();

        Thread t = new Thread(task);

        t.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
