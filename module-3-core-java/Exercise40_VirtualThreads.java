public class Exercise40_VirtualThreads {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {
            int threadNumber = i;

            Thread.startVirtualThread(() -> {
                System.out.println("Hello from Virtual Thread " + threadNumber);
            });
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Total Time Taken: "
                + (endTime - startTime) + " ms");
    }
}