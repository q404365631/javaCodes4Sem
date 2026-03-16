class xyz extends Threadn {
    public void run() {
        System.out.print("Hello1");
    }
    public static void main(String[] args) {
         xyz x = new xyz();
         x.Start();         // wat da heck y start not workin?
    }
}