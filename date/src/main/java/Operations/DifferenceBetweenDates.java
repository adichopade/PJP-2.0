package Operations;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DifferenceBetweenDates {

	public long daysBetweenDates(LocalDate date1, LocalDate date2) {
		return ChronoUnit.DAYS.between(date1, date2);
		
	}

	public long monthsBetweenDates(LocalDate date1, LocalDate date2) {
		long noOfDaysBetween = ChronoUnit.MONTHS.between(date1, date2);
		return noOfDaysBetween;
		
	}

	public long yearBetweenDates(LocalDate date1, LocalDate date2) {
		long noOfDaysBetween = ChronoUnit.YEARS.between(date1, date2);
		return noOfDaysBetween;
		
	}
}
