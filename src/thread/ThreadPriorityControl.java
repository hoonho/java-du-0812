public class ThreadPriorityControl implements Runnable {
    private int start;
    private int end;

    public ThreadPriorityControl(int start, int end) {
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
        Thread first = new Thread(new ThreadPriorityControl(1, 7), "first1");
        first.setPriority(Thread.MIN_PRIORITY);
        System.out.println("first priority = " + first.getPriority());

        Thread second = new Thread(new ThreadPriorityControl(8, 14), "second1");
        second.setPriority(Thread.MAX_PRIORITY);
        System.out.println("second priority = " + second.getPriority());

        Thread third = new Thread(new ThreadPriorityControl(15, 21), "third1");
        // 기본 우선순위 사용
        System.out.println("third priority = " + third.getPriority());

        first.start();
        second.start();
        third.start();
    }
}

