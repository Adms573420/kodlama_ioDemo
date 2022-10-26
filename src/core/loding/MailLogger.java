package core.loding;

public class MailLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Maile loglandi: "+data);
    }
}
