package Border;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


//시간
public class MyDate {
	public String time() {
		LocalTime now=LocalTime.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		String formatedNow=now.format(formatter);
		System.out.println(formatedNow);
		return  formatedNow;
	}
//날짜
	public void date() {
		LocalDate now=LocalDate.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy/MM/dd   ");
		String formatedNow=now.format(formatter);
		System.out.print(formatedNow);
		
	}
}
