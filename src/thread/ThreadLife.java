public class ThreadLife implements Runnable {

    private int start;
    private int end;

    public ThreadLife(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + " number = " + i);
        }
    }

    public static void main(String[] args) {
        // 각 스레드가 서로 다른 범위를 처리하도록 분할
        Thread first = new Thread(new ThreadLife(1, 7), "first1");
        Thread second = new Thread(new ThreadLife(8, 14), "second1");
        Thread third = new Thread(new ThreadLife(15, 21), "third1");

        first.start();
        second.start();
        third.start();
    }
}

