import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
public class AlfredQuotes {
    
    Calendar rightNow = Calendar.getInstance();
    Date date = rightNow.getTime();
    SimpleDateFormat format1 = new SimpleDateFormat("h:mm a");
    String time = format1.format(date);

    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely to see you.", name);
    }

    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod.toLowerCase(), name);
    }

    public String guestGreeting(){
        if (rightNow.get(Calendar.HOUR_OF_DAY) >= 6 && rightNow.get(Calendar.HOUR_OF_DAY) <= 11)
            return String.format("It is %s. Have you eaten breakfast already?", time);
        else if (rightNow.get(Calendar.HOUR_OF_DAY) > 11 && rightNow.get(Calendar.HOUR_OF_DAY) <= 16)
            return String.format("It is %s. Midday nap perhaps?", time);
        else if (rightNow.get(Calendar.HOUR_OF_DAY) > 16 && rightNow.get(Calendar.HOUR_OF_DAY) <= 24)
            return String.format("It is %s. Where'd the sun go?", time);
        else 
            return String.format("It is %s. You better be programming rn", time);
    }
    
    public String dateAnnouncement() {
        return String.format("It is currently %s.", rightNow.getTime());
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") != -1)
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        else if (conversation.indexOf("Alfred") != -1)
            return "At your service. As you wish, naturally.";
        else 
            return "Right. And with that I shall retire.";
    }
    
}
