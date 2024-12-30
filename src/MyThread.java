class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " đang chạy: " + i);

        }
    }
    public static class ThreadMain {
        public static void main(String[] args) {
            Thread thread1 = new Thread(new MyThread());
            Thread thread2 = new Thread(new MyThread());


            thread1.start();
            thread2.start();

        }
    }
}
