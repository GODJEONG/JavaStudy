
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
	private Str name;
	private A aged;
	
	// constructor
	
	public HasA() {
		System.out.println("HasA");
		name="";
		aged= new A();
	}
// setter getter method --------------------------------------------
	
	public static void main(Str[] args) {
		
		HasA has = new HasA(); 

		has.setAge(100);
		has.setName("Superman");
		
		System.out.println(has.getName());
		System.out.println(has.getAge());

	}
	  // -----------------------------------------
	
	public void setName(Str name) {
		this.name = name;
	}

	public void setAge(int a) {
		this.aged.setA(a);
	}

	public Str getName() {
		return name;
	}

	public int getAge() {
		return this.aged.getA();
	}
	
}
  
	

// ========================================