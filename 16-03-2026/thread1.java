class xyz extends Thread {
    public void run() {
        System.out.print("Hello1");
    }
    public static void main(String[] args) {
         xyz x = new xyz();
         x.start();
    }
}