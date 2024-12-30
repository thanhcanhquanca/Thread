public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " đang chạy: " + i);

        }
    }
    public static class RunnableExample {
        public static void main(String[] args) {
            Thread thread1 = new Thread(new MyRunnable());
            Thread thread2 = new Thread(new MyRunnable());

            thread1.start();
            thread2.start();
        }
    }
}
