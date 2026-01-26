
package currenttimeam.pm;

public class CurrentTimeAMPM {

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        
        long totalSeconds = time/1000;
        long hours24 = ((totalSeconds/3600)% 24 +6) % 24;
        long remainingSeconds = totalSeconds % 3600; 
        long minutes = remainingSeconds /60;
        long seconds = remainingSeconds % 60;
        
        long hours12;
        String period;
        
        if(hours24 == 0){
            hours12 = 12;
            period = "AM";
        } else if(hours24<12) {
            hours12 = hours24;
            period = "AM";
        }else if (hours24 == 12) {
            hours12 = 12;
            period = "PM";
        } else {
            hours12 = hours24 - 12;
            period = "PM";
        }
        System.out.printf("Current Time Is: %02d:%02d:%02d %s%n", hours12, minutes,seconds, period);
    }
    
}
