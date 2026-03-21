class A {
    int x;
    A(int x){ this.x = x; }
    void show(){ System.out.println(x); }
}

class Main2 {
    public static void main(String[] args) {
        A obj = new A(10);
        obj.show();
    }
}
