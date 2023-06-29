package sets.enumsets;

import java.util.EnumSet;
import java.util.LinkedHashSet;

public class EnumSteTest {

    public static void main(String[] args) {
        enum Week {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

        var workDays = EnumSet.range(Week.MONDAY, Week.FRIDAY);
        var weekends = EnumSet.range(Week.SATURDAY, Week.SUNDAY);
        var everyday = EnumSet.allOf(Week.class);

        System.out.println(workDays);

    }
}
