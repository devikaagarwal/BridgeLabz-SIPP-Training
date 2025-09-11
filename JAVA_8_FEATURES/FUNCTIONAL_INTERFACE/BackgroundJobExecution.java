public class BackgroundJobExecution {
    public static void main(String[] args) {
        Runnable job = () -> {
            try {
                Thread.sleep(1000);
                System.out.println("Background job completed.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(job);
        thread.start();
    }
}

