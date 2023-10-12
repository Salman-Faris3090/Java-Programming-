package QuestionTen;

public class Finalize {
    public static void main(String[] args) {
        Finalize fin = new Finalize();        
        fin = null;
        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void finalize() throws Throwable {
        try {
                   System.out.println("Finalize method called: Clean up resources here.");
        } finally {
            super.finalize();
        }
    }
}

   
