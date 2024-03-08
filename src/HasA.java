
// -----------------------------------------------
class A {
	private int a;
	
	public A() {
		System.out.println("A");
			}
	
	public void setA(int a) {
		this.a = a;
	}
	public int getA() {
		return a;
	}

}

//==================================================
public class HasA {
	
	// field
	private String name;
	private A aged;
	
	// constructor
	
	public HasA() {
		System.out.println("HasA");
		name="";
		aged= new A();
	}
// setter getter method --------------------------------------------
	
	public static void main(String[] args) {
		
		HasA has = new HasA(); 

		has.setAge(100);
		has.setName("Superman");
		
		System.out.println(has.getName());
		System.out.println(has.getAge());

	}
	  // -----------------------------------------
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int a) {
		this.aged.setA(a);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return this.aged.getA();
	}
	
}
  
	

// ========================================