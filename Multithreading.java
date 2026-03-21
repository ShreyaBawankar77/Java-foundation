class MyThread extends Thread {
    public void run(){ System.out.println("Thread"); }
}
class Main8 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
