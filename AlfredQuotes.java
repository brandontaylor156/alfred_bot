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
        return String.format("It is %s.", time);
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
