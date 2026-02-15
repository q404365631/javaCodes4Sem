
abstract class abst {
    abstract void show();
}
class xyz extends abst {
    void show() {
        System.out.println("Abstraction show function");
    }

    public static void main(String[] args) {
        xyz x = new xyz();
        x.show();
    }
}
