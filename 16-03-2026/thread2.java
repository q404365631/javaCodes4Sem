class xyz {
    public void run() {
        System.out.println("Hello2");
    }
    public static void main(String[] args) {
        xyz x = new xyz();
        Thread t = new Thread(x);       // wta da heck
        t.start();
    }
}