// Date Created: 17-03-2026
// Last Edited: 18-03-2026

class xyz extends Thread {
    public void disp(String name) {
        for(int i=0; i<=3; i++) {
            System.out.print("Welcome " +name);
        }
    }
    public void run() {
        disp(obj);      // obj cannot be resolved to a variable
    }
    public static void main(String[] args) {
        xyz x1,x2;
        x1 = new xyz("ABC");        // The constructor xyz(String) is undefined
        x2 = new xyz("BCD");        // The constructor xyz(String) is undefined

        x1.start();
        x2.start();
    }
}