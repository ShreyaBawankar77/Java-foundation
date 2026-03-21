interface A1 {
    void display();
}
class B1 implements A1 {
    public void display(){ System.out.println("Interface"); }
}
class Main7 {
    public static void main(String[] args) {
        B1 obj = new B1();
        obj.display();
    }
}
