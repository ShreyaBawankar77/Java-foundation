import java.util.HashMap;

public class HashMapExample1 {

	public static void main(String[] args) {
		HashMap<Integer,String> data = new HashMap<Integer,String>();
		
		data.put(100, "ABC");
		data.put(101, "BCD");
		data.put(102, "CDE");
		data.put(103, "DEF");
		data.put(104, "EFG");
		data.put(105, "FGH");
		data.put(100, "ABCD");

		System.out.println(data);
		System.out.println();
		System.out.println(data.get(100)); //we get the name of the roll no 100;
		// HashMap doesn't allow duplicate, it just shows the updated value. 
	}

}
