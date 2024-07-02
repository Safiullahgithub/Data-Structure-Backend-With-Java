import java.util.EnumSet;






public class Main {
    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[] args) {
        // Create an EnumSet containing all days of the week
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println("All days: " + allDays);

        // Create an EnumSet containing no days
        EnumSet<Day> noDays = EnumSet.noneOf(Day.class);
        System.out.println("No days: " + noDays);

        // Add specific days to the set
        noDays.add(Day.MONDAY);
        noDays.add(Day.WEDNESDAY);
        System.out.println("Some days: " + noDays);

        // Create an EnumSet containing a range of days
        EnumSet<Day> workDays = EnumSet.range(Day.MONDAY, Day.FRIDAY);
        System.out.println("Work days: " + workDays);

        // Create an EnumSet containing specific days
        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
        System.out.println("Weekend days: " + weekend);

        // Perform set operations
        EnumSet<Day> nonWorkDays = EnumSet.complementOf(workDays);
        System.out.println("Non-work days: " + nonWorkDays);

        // Iterate over the EnumSet
        System.out.print("Iterating over allDays: ");
        for (Day day : allDays) {
            System.out.print(day + " ");
        }
    }
}
