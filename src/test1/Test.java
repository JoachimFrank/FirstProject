package test1;

public class Test {

	public Test() {
	}
	
	private String sanitize( String str ) {
		if( !str.isEmpty() ) {
		str = str.trim();
		}
		str = str.toLowerCase();
		return str;
		}

	public static void main(String[] args) {
		Test test = new Test();
		String s = "Frank";
		System.out.println(s);
test.sanitize(s);
System.out.println(s);
	}
//neu
	//neu
}
