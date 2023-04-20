import java.util.*;

enum WeekDay {
	Monday, Tuesday, Wednesday , Thursday , Friday , Saturday , Sunday
}

public class EnumClass {

	public static void main(String [] args) {

		WeekDay day = WeekDay.Monday;

		for (WeekDay wd : WeekDay.values()) {
			System.out.println(wd);
		}

	}
}