import java.sql.Date;

public class Annotations {

	public void Question1() {
		@SuppressWarnings("deprecation")
		Date date = new Date(18, 05, 2020);
		System.out.println(date);
	}
	
}