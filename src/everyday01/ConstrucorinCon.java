package everyday01;

public class ConstrucorinCon {
	int petalCount = 0;
	String s = "initial value";
	ConstrucorinCon(int petals) {
		petalCount = petals;
		System.out.println("只能有一个构造器.petalCount="+petalCount);
	}
	ConstrucorinCon(String ss){
		this.s=ss;//s=ss
		System.out.println("只能有一个构造器.s="+ss);
	}
	ConstrucorinCon(String s , int petals){
		this(petals);//构造器调用必须置于最起始处否则会报错
		//this(s);//这里会报错 this只能调一个
		this.s=s;//this.s代表数据成员 s代表参数s
		System.out.println("String & int args");
	}
	ConstrucorinCon(){
		this("hi", 47);
		System.out.println("没有参数的默认构造器");
	}
	void printPetalCount() {
		//this(11)//除了构造器可以调构造器别的方法都不行
		System.out.println("petalCount:"+petalCount);
		System.out.println("s:"+s);
	}
	public static void main(String[] args) {
		ConstrucorinCon c = new ConstrucorinCon();
		c.printPetalCount();
		//只能有一个构造器.petalCount=47
		//String & int args
		//没有参数的默认构造器
		//petalCount:47
		//s:hi
		ConstrucorinCon c1 = new ConstrucorinCon("wwww");
		c1.printPetalCount();
//		只能有一个构造器.s=wwww
//		petalCount:0
//		s:wwww
		ConstrucorinCon c2 = new ConstrucorinCon(111);
		c2.printPetalCount();
//		只能有一个构造器.petalCount=111
//		petalCount:111
//		s:initial value

	}
}
