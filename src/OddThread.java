class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) { // In số lẻ từ 1 đến 10
            System.out.println("OddThread - Số lẻ: " + i);
            try {
                Thread.sleep(10); // Dừng 10ms giữa mỗi lần in
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) { // In số chẵn từ 1 đến 10
            System.out.println("EvenThread - Số chẵn: " + i);
            try {
                Thread.sleep(15); // Dừng 15ms giữa mỗi lần in
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public class TestThread {
        public static void main(String[] args) {
            // Tạo đối tượng OddThread và EvenThread
            OddThread oddThread = new OddThread();
            EvenThread evenThread = new EvenThread();

            // Bắt đầu thực thi OddThread
            oddThread.start();

            // Sử dụng join() để đảm bảo OddThread kết thúc trước khi chạy EvenThread
            try {
                oddThread.join(); // Đợi OddThread kết thúc
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Sau khi OddThread kết thúc, bắt đầu EvenThread
            evenThread.start();
        }
    }
}



