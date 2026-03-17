class xyz extends Thread {
    public void disp(String name) {
        for(int i=0; i<=3; i++) {
            System.out.print("Welcome " +name);
        }
    }
    public void run() {
        disp(obj);
    }
    public static void main(String[] args) {
        xyz x1,x2;
        x1 = new xyz("ABC");
        x2 = new xyz("BCD");

        x1.start();
        x2.start();
    }
}