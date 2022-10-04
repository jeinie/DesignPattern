// 멀티스레딩 환경에서 uniqueInstance 객체가 여러 개 생성될 수 있는 위험성을 가지고 있음
public class Singleton {
    // 하나 뿐인 singleton 성격을 부여하기 위해서는 정적 변수로
    //private static Singleton uniqueInstance; // Singleton 클래스의 하나뿐인 인스턴스를 저장하는 정적 변수
    //private static Singleton uniqueInstance = new Singleton(); // 정적 초기화 부분에서 Singleton 인스턴스를 생성한다.
    private volatile static Singleton uniqueInstance; // volatile 키워드를 사용하면 멀티스레딩을 쓰더라도 uniqueInstance 변수가
    // Singleton 인스턴스로 초기화되는 과정이 올바르게 진행됨

    // DCL: Double-checked Locking <- getInstance()에서 동기화되는 부분을 줄일 수 있다.
    // * 자바 1.4 이전 버전에서는 DCL 쓸 수 없다.
    // 인스턴스가 생성되어 있는지 확인한 다음, 생성되어 있지 않았을 때만 동기화할 수 있음
    // 처음에만 동기화하고, 나중에는 동기화하지 않아도 됨


    // 기타 인스턴스 변수

    private Singleton() { // 생성자를 private으로 선언했기 때문에 Singleton 클래스 내부에서만 클래스의 인스턴스를 만들 수 있음

    }

    // 외부에서 이 메소드에 접근하는 코드를 짜면 static이 아닐 경우 에러남
    // 클래스가 컴파일되는 과정에서 Singleton 객체를 new 로 생성하지 않아도 사용할 수 있도록 static 붙인다.
    // getInstance() 메소드는 클래스의 인스턴스를 만들어서 리턴
    // getInstance()에 synchronized 키워드만 추가하면 한 스레드가 메소드 사용을 끝내기 전까지 다른 스레드는 기다려야 한다.
    // 즉, 2개의 스레드가 이 메소드를 동시에 실행하는 일은 일어나지 않는다.
    public static synchronized Singleton getInstance() {
        /* Singleton 인스턴스가 바로 생성돼서 uniqueInstance에 할당이 되었으므로 이 코드는 의미가 없음
        if(uniqueInstance == null) {
            uniqueInstance = new Singleton(); // 게으른 인스턴스 생성 (Lazyinstatiation): 인스턴스가 필요한 상황이 닥치기 전까지 아예 인스턴스를 생성하지 않음
        }*/
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    // 기타 메소드
    // Singleton 역시 보통 클래스이다. Singleton 클래스 내부에도 다른 인스턴스 변수나 메소드를 가질 수 있다.

}
