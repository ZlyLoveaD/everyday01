package everyday01;

class Tank{
	int howFull=0;
	Tank(){this(0);};
	Tank(int fullness){
		howFull=fullness;
	}
	void sayHowFull() {
		if (howFull==0) {
			System.out.println("Tank是空的");
		}else {
			System.out.println("Tank的状态时是"+howFull);
		}
	}
	void empty() {
		howFull=0;
	}
	protected void finalize() {
		if (howFull!=0) {
			System.out.println("错误 : 坦克不为空");
		}
	}
}

public class TankTest {
	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank(3);
		Tank t3 = new Tank(5);
		t2.empty();
		new Tank(6);
		System.out.println("Check tank:");
		System.out.println("tank1:");
		t1.sayHowFull();
		System.out.println("tank2:");
		t2.sayHowFull();
		System.out.println("tank3:");
		t3.sayHowFull();
		System.out.println("first forced gc():");
		System.gc();//错误 : 坦克不为空
		
	}
}
