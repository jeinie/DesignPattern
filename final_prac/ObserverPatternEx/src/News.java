import java.util.ArrayList;
import java.util.List;

public class News {

    // 구독자 리스트
    private List<Observer> observers = new ArrayList<Observer>();

    // 1. 옵저버 리스트에 추가
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // 2. 옵저버 리스트에서 제거
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    // 3. 옵저버들에게 뉴스를 알림
    public void notifyObservers(String news_contents) {
        for (int i=0; i<observers.size(); i++) {
            Observer o = observers.get(i);
            o.receive(news_contents);
        }
    }
}

