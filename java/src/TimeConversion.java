public class TimeConversion {
    public static void printArray(String[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static String timeConversion(String s) {
        // Split string
        String[] str = s.split(":");

        // Take the hour and convert to Integer
        int hour = Integer.parseInt(str[0]); // hh

        // Take min, sec, period
        String min = str[1]; // mm
        String secPeriod = str[2]; // ssPM
        String sec = str[2].substring(0, secPeriod.length() - 2); // ss
        String period = str[2].substring(secPeriod.length() - 2, secPeriod.length()); // PM
 
        // Build new time string
        String newTimeString = "";

        // Check 12 hours format and convert to 24 hours format
        if((0 <= hour && hour < 12) && (period.equalsIgnoreCase("AM"))) {
            newTimeString = String.format("%02d", hour) + ":" + min + ":" + sec;
        } else if((0 <= hour && hour < 12) && (period.equalsIgnoreCase("PM"))) {
            newTimeString = (hour + 12) + ":" + min + ":" + sec;
        } else if((hour == 12) && (period.equalsIgnoreCase("AM"))) {
            newTimeString = "00" + ":" + min + ":" + sec;
        } else if((hour == 12) && (period.equalsIgnoreCase("PM"))) {
            newTimeString = hour + ":" + min + ":" + sec;
        }

        return newTimeString;
    }
    public static void main(String[] args) {
        String s = "12:05:45PM";
        System.out.println(timeConversion(s));
    }
}
