import java.io.*;
class FileDemo {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("a.txt");
        fw.write("Hello");
        fw.close();
    }
}
