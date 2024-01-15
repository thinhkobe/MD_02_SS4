package baitap.bai3;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        // Tạo đối tượng StopWatch
        StopWatch stopwatch = new StopWatch();

        // Khởi động thuật toán sắp xếp chọn cho một mảng 100,000 số
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }

        // Bắt đầu đo thời gian
        stopwatch.start();

        // Thực hiện thuật toán sắp xếp chọn
        selectionSort(array);

        // Dừng đo thời gian
        stopwatch.stop();

        // Hiển thị thời gian thực thi
        System.out.println("Thời gian thực thi: " + stopwatch.getElapsedTime() + " milliseconds");
    }

    // Phương thức sắp xếp chọn
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
