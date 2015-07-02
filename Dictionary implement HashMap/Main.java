package ex5;

public class Main {
	public static void main(String[] args) {
		Dictionary<String, String, Integer> myDictionary = new Dictionary<>();

		myDictionary.put("Hello", "Xin chao", 1);
		myDictionary.put("One", "So mot", 2);
		System.out.println(myDictionary.get("Hello", "Xin chao"));
		System.out.println(myDictionary.containKey("One", "So mot"));
		
	}
}
