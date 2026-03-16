class xyz extends Thread {
    public void run() {
        try {
            Thread.sleep(10000);
        }
        catch(Exception e ) { }     // yup it can be empty noic
        System.out.print("Hello3");
    }
    public static void main(String[] args) {
        xyz x = new xyz();
        x.start();
    }
}