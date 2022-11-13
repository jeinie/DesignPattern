import java.nio.channels.NonWritableChannelException;

public class Main {
    public static void main(String[] args) {
        News news = new News();
        Subscriber1 subscriber1 = new Subscriber1("김철수");
        Subscriber2 subscriber2 = new Subscriber2("김영희");

        // 구독자 등록
        news.attach(subscriber1);
        news.attach(subscriber2);

        String news_contents = "러시아-우크라이나 관련 뉴스입니다."; // 뉴스 발간
        news.notifyObservers(news_contents); // 구독자에게 알리기

        System.out.println("==================================");

        news.detach(subscriber1); // 구독 취소
        news.notifyObservers(news_contents);
    }
}