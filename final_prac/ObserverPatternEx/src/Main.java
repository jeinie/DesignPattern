import java.nio.channels.NonWritableChannelException;

public class Main {
    public static void main(String[] args) {
        News news = new News();
        Subscriber1 subscriber1 = new Subscriber1("김철수");
        Subscriber2 subscriber2 = new Subscriber2("김영희");

        news.attach(subscriber1);
        news.attach(subscriber2);

        String news_contents = "러시아-우크라이나 관련 뉴스입니다.";
        news.notifyObservers(news_contents);

        System.out.println("==================================");

        news.detach(subscriber1);
        news.notifyObservers(news_contents);
    }
}