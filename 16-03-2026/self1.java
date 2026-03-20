class A implements Runnable {
    public void run() {
        System.out.print("Hello");
    }

    public static void main(String[] args) {
        A obj = new A();
        Thread t = new Thread(obj);
        t.start();
    }
}