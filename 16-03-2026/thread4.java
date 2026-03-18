// Date Created: 17-03-2026
// Last Edited: 17-03-2026

class xyz extends Thread {
    public void run() {
        for(int i = 0; i<=3; i++) {
            try {
                Thread.sleep(10000);
            }
            catch(Exception e) { }

            System.out.println(i);
            System.out.println("Thread Name: " +Thread.currentThread().getName());      // sometin new
        }
    }
    public static void main(String[] args) {
        xyz x1, x2;
        x1 = new xyz();
        x2 = new xyz();
        x1.start();
        x2.start();
    }
}