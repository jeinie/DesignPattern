package prac;

public class OFF implements State{
    private static OFF off = new OFF(); // OFF 클래스의 인스턴스로 초기화
    private OFF() { }

    public static OFF getInstance() { // 초기화된 OFF 클래스의 인스턴스 반환
        return off;
    }
    @Override
    public void on_button_pushed(Light light) {
        System.out.println("Light On!");
        light.setState(ON.getInstance());
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("반응 없음!");
    }
}
