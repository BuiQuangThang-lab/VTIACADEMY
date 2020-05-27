import java.time.LocalDate;
import java.util.Random;

public class Rundom_Number {
	
//----------------lấy ngỗng nhiên số nguyên----------------------------//
	
//	public static void runndomInt() {
//		Random random = new Random();
//		int x = random.nextInt();
//		System.out.println(x);
//	}
//	
//----------------lấy ngỗng nhiên số nguyên----------------------------//
//	public static void runndomFloat() {
//		Random random = new Random();
//		float y = random.nextFloat();
//		System.out.println(y);
//	}
	
//	public static void rundomArray() {
//		String[] name = {"Bùi Quang Thắng", "Hoàng Thu Loan", "Đinh Công Hải", "Phí Min Long"};
//		Random random = new Random();
//		int i = random.nextInt(name.length);
//		System.out.println(name[i]);
//	}
	
//	public static void rundomDate() {
//		Random random = new Random();
//		int minDay = (int) LocalDate.of(1195,7,24).toEpochDay();
//		int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
//		long randomInt = minDay + random.nextInt(maxDay - minDay);
//		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
//		System.out.println(randomDay);
//	}
	// lấy ngỗng nhiên 1 ngày  trong khoảng thời gian 1 năm trở lại đây-//
	
//	public static void rundomDatesinceOneYear() {
//		Random random = new Random();
//		int now = (int) LocalDate.now().toEpochDay(); 
//		long randomInt = now - random.nextInt(365);
//		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
//		System.out.println(randomDay);
//	}
	
	// lấy ngỗng nhiên 1 ngày trong quá khứ:
	
//	public static void oneDateOfPast() {
//		Random random = new Random();
//		int nowDay = (int) LocalDate.now().toEpochDay();
//		long randomPastInt = random.nextInt(nowDay);
//		LocalDate randomPastDay = LocalDate.ofEpochDay(randomPastInt);
//    	System.out.println(randomPastDay);
//	}
	
	// Lấy ngỗng nhiên số có 3 chữ số:
	
//	public static void digit_3_Number() {
//		Random random = new Random();
//		int a = random.nextInt(999 - 100 + 1) + 100;
//		System.out.println(a);
//	}
	
	
	
    public static void main(String[] args) {
//    	runndomInt();
//    	runndomFloat();
//    	rundomArray();
//    	rundomDate();
//    	rundomDatesinceOneYear();
//    	oneDateOfPast();
//    	digit_3_Number();
	}
}
