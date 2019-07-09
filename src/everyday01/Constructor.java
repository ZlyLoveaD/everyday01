package everyday01;

/**
* Copyright 
* FileName: Constructor.java
* 类的详细说明
*
* @author  zly
* @Date    2019-7-5
* @version 1.00
*/

/*5.1 用构造器确保初始化    
//练习一
//创建一个包含单元化String引用的类。
证明:此引用由Java初始化为null。
*/
class Test {
	String s;		
}

//练习2，第158页
/* 创建一个在定义时就被初始化了的String的类
 *  以及另一个由构造函数初始化的String
 *  两种方法的区别。
 */
class Test2 {
	String s1;
	String s2 = "hello";
	String s3;
	Test2() {
		s3 = "world";
	}
}

public class Constructor {
	public static void main(String[] args) {
		//测试1
		Test test = new Test();
		System.out.println(test.s);//null
		
		//测试2
		//定义时初始化和构造器初始化的差异：变量定义时初始化的次数是一次，
		//如上面的变量s2；而构造器初始化的次数是两次，首先编译器发现s3没有初始化，
		//自动为s3赋null值，然后在构造方法中，再次初始化为“world”。
		Test2 test2 = new Test2();
		System.out.println(test2.s1);//null
		System.out.println(test2.s2);//hello
		System.out.println(test2.s3);//world
	}
}









