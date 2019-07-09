package everyday01;
//书中例子
class Person{
	public void eat(Apple apple) {
		System.out.println("Yummy");
	}
}

class Peeler{
	static Apple peel(Apple apple) {
		return apple;
	}
}

class Apple{
	Apple getPeeled() {
		//this代表本类对象的引用
		return Peeler.peel(this);
	}
}

//练习8 编写具有两个方法的类
//第一个方法内调用第二个方法两次 第一次不使用this 第二次使用
class Doc{
	void intubate() {
		System.out.println("准备患者");
		//第一次不使用this
		laryngoscopy();
		//第二次使用  只是为了验证其起作用 实践中无需添加系统已经加好
		this.laryngoscopy();
	}

	void laryngoscopy() {
		System.out.println("使用喉镜");
	}
}


public class ThisExample {
	int i = 0;
	ThisExample Increment() {
		i++;
		return this;
	}
	void print() {
		System.out.println("i="+i);
	}
	public static void main(String[] args) {
		ThisExample xExample = new ThisExample();
		xExample.Increment().Increment().Increment().print();
		//i=3   通过this返回对当前对象的引用
		
		new Person().eat(new Apple());
		//Yummy
		
		new Doc().intubate();
		//准备患者
		//使用喉镜
		//使用喉镜
	}
}
