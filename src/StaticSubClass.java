
public class StaticSubClass extends StaticClass{
	public int i;
	public StaticSubClass(int i) {
		
		this.i = i;
		System.out.println("construtor para block child");
	}
	static int j=8;
	static {
		System.out.println("static block child");
	}
	public StaticSubClass() {
		
		System.out.println("construtor block child");
	}
}
