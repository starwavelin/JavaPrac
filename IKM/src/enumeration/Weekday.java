package enumeration;

/**
 * 本题主要演示由 String 反解出 Enum class中的（constant） values 
 */

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY;
}

public class Weekday {
	
	private Day day;
	
	public Weekday(Day day) {
		this.day = day;
	}
	
	public void dayIsLike()
    {
        switch (day)
        {
        case MONDAY:
            System.out.println("Mondays are bad.");
            break;
        case FRIDAY:
            System.out.println("Fridays are better.");
            break;
        case SATURDAY:
        case SUNDAY:
            System.out.println("Weekends are best.");
            break;
        default:
            System.out.println("Midweek days are so-so.");
            break;
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MONDAY";
        Weekday t1 = new Weekday(Day.valueOf(str));
        t1.dayIsLike();
	}
}