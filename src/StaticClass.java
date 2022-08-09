
public class StaticClass {
  public String name;
  public static String lastName="remyaaaaa";
  
  

static{
	  System.out.println("inside static block");
  }

public StaticClass() {
	super();
	System.out.println("inside default constructor");
}

public StaticClass(String name) {
	super();
	this.name = name;
	
	System.out.println("inside field constructor");
}
}
