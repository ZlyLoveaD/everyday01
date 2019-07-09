package everyday01;

class Window{
	Window(int marker) {
		System.out.println("Window("+marker+")");
	}
}

class House{
	Window w1 = new Window(1);
	House() {
		System.out.println("hOUSE()");
		w3 = new Window(33);
	}
	Window w3 = new Window(3);
	void f() {System.out.println("F()");}
	Window w2 = new Window(22);
}

public class OrderOfInitialzation {
	public static void main(String[] args) {
		House h = new House();
		h.f();
		//Window(1)
		//Window(3)
		//Window(22)
		//hOUSE()
		//Window(33)
		//F()
	}
}
