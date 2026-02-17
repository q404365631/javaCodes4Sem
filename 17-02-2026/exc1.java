class exc {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;      // yea 0 is not an integer
            System.out.println("Division: " +(a/b));        // ArithematicException
        }
        catch (Exception e) {
            System.out.println("Error: " +e);
        }
    }
}