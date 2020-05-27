import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class FomartDate {

//----------------------Định dạng Việt Nam-----------------------------//
//	public static void VnType() {
//		
//		Date createDate = new Date(2020-01-19);
//		
//		Locale locale = new Locale("vi", "VN");
//
//		DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
//
//		String date = dateformat.format(createDate);
//
//		System.out.println(date);	
//	}

//--------------------Năm – tháng – ngày – giờ – phút – giây -----------------//

//	public static void dateTime() {
//		Date createDate = new Date(2020 - 01 - 19);
//		String pattern = "yyyy-MM-dd-HH-mm-ss";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//		System.out.println(simpleDateFormat.format(createDate));
//	}
	
//-----------------------Chỉ in ra ngày-------------------------------------------//
//	
//	public static void onlyDate() {
//		Date createDate = new Date(2020 - 01 - 19);
//		String pattern1 = "dd";
//		SimpleDateFormat sdf = new SimpleDateFormat(pattern1);
//		String Qdate = sdf.format(createDate);
//		System.out.println(Qdate);
//	}
//	//--------------------chỉ in ra năm-----------------------------------------//
//	public static void onlyYear() {
//		Date createDate = new Date(2020 - 01 - 19);
//		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
//		String Qdate1 = sdf1.format(createDate);
//		System.out.println(Qdate1);
//	}
	
	//----------------------in ra tháng và năm---------------------------------------//
	
//	public static void month_Year() {
//		Date createDate = new Date(2020 - 01 - 19);
//		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM");
//		String Qdate2 = sdf2.format(createDate);
//		System.out.println(Qdate2);
//	}
	
	//----------------------in ra tháng và ngày----------------------------------------------//
	
//	public static void date_Month() {
//		Date createDate = new Date(2020 - 01 - 19);
//		SimpleDateFormat sdf3 = new SimpleDateFormat("MM-dd");
//		String Qdate3 = sdf3.format(createDate);
//		System.out.println(Qdate3);
//	}

	public static void main(String[] args) {
//		VnType();
//		dateTime();
//		onlyDate();
//		onlyYear();
//		month_Year();
//		date_Month();
	}
}
