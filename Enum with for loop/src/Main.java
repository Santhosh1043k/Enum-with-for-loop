import java.util.EnumSet;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Main {
    public static void main(String[] args) {
        for (Day day : EnumSet.range(Day.MONDAY,Day.SATURDAY)) {

            System.out.println(day);
        }


        }
    }
