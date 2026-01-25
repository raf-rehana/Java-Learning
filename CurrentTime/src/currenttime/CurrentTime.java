
package currenttime;

public class CurrentTime {

    public static void main(String[] args) {
       long time = System.currentTimeMillis();
       long totalSeconds = time/1000;
       long hours = (((totalSeconds/3600)%24)+6)% 24;

       long remainingSeconds = totalSeconds % 3600;
       long minutes = remainingSeconds/60;
       long seconds = remainingSeconds % 60;
       
        System.out.println("Current Time Is: " + hours + ":" + minutes + ":" + seconds + " GMT+6");
    }
    
}
