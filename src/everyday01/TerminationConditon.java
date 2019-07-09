package everyday01;

//练习10 
//编写具有finalize()方法的类  并在方法中打印消息
//在main中为该类创建一个对象并解释该行为
class WebBank{
	boolean loggedIn = false;
	WebBank(boolean logStatus){
		loggedIn = logStatus;
	}
//	void logIn() {
//		loggedIn=true;
//	}
	void logOut() {
		loggedIn = false;
	}
	protected void finalize() {
		if (loggedIn) {
			System.out.println("错误,仍然登录");
			//super.finalize();
		}
	}
}

class Book{
	boolean checkedOut = false;
	Book(boolean checkOut) {
		checkedOut = checkOut;
	}
	void checkIn() {
		checkedOut = false;
	}
	protected void finalize() {
		if (checkedOut) {
			System.out.println("Error:checked out");
			//super.finalize();
		}
	}
}

public class TerminationConditon {
	public static void main(String[] args) {
		Book novel = new Book(true);
		novel.checkIn();
		new Book(true);
		//Error:checked out  没有被checkIn的书 checkedOut为true
		System.gc();
		
		//练习10
		WebBank bank1 = new WebBank(true);
		WebBank bank2 = new WebBank(true);
		new WebBank(true);
		bank1.logOut();
		System.out.println("Try 1: "); 
		System.runFinalization();
		System.out.println("Try 2: "); 	
		Runtime.getRuntime().runFinalization();
		System.out.println("Try 3: "); 
		System.gc();
		System.out.println("Try 4: ");
		// using deprecated since 1.1 method:
		System.runFinalizersOnExit(true);
//		System.out.println(bank1.loggedIn);
//		bank1.logOut();
//		System.out.println(bank1.loggedIn);
//		System.out.println(bank2.loggedIn);
//		bank2.logIn();
//		System.out.println(bank2.loggedIn);
//		System.gc();
		
	}
}
