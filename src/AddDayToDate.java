import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class AddDayToDate implements Serializable{

	public static void main(String[] args) {
		Date d = new Date(0);
		String ds = "12/12/2004";
		DateFormat df = DateFormat.getInstance();
		try {
			df.parse(ds);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		d.setTime((1000*60*60*24) + d.getTime());
		
		System.out.println(d);
	}
	
}
