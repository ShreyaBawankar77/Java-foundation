class Student {
    int id;
    String name;
    void display(){ System.out.println(id+" "+name); }
}

class Main1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 1;
        s.name = "Shreya";
        s.display();
    }
}
