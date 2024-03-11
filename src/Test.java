import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {

		SimpleDateFormat format = new SimpleDateFormat("MMdd");
		Date now = new Date();
		String now_dt = format.format(now);
		System.out.print(now_dt);
	}
}
