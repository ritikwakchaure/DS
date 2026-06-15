public class MonitorLockExample {

    public synchronized void task1() {
        try {
            System.out.println("inside task1 - lock taken by " + Thread.currentThread().getName());
            Thread.sleep(10000);
            System.out.println("task1 completed - lock released by " + Thread.currentThread().getName());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void task2() {
        System.out.println("task2, but before synchronized - " + Thread.currentThread().getName());

        synchronized (this) {
            System.out.println("task2, inside synchronized - lock taken by " + Thread.currentThread().getName());
        }
    }

    public void task3() {
        System.out.println("task3 - no lock needed - " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MonitorLockExample obj = new MonitorLockExample();
          MonitorLockExample obj1 = new MonitorLockExample();
        Thread t1 = new Thread(() -> obj.task1(), "T1");
        Thread t2 = new Thread(() -> obj1.task1(), "T1");

        // Thread t2 = new Thread(() -> obj.task2(), "T2");
        // Thread t3 = new Thread(() -> obj.task3(), "T3");

        t1.start();
        t2.start();
        // t3.start();
    }
}