package everyday01;


public class EnumTest {
	public enum Bills{
		一,二,五,十,二十,五十,一百
	} 
	
	public static void main(String[] args) {
		for (Bills b : Bills.values()) {
			//System.out.println(b+"---"+b.ordinal());
			/*一---0
			二---1
			五---2
			十---3
			二十---4
			五十---5
			一百---6*/
			switch (b) {
			case 一:
				System.out.println("1元");
				break;
			case 二:
				System.out.println("2元");
				break;
			case 五:
				System.out.println("5元");
				break;
			case 十:
				System.out.println("10元");
				break;
			case 二十:
				System.out.println("20元");
				break;
			case 五十:
				System.out.println("50元");
				break;
			case 一百:
				System.out.println("100元");
				break;
			default:
				break;
			}
			
		}
	}
}
