public class SamsungComputerFactory implements ComputerFactory { // Samsung에 관련된 모든 부품 객체를 만든다.
    public SamsungKeyboard createKeyboard() {
        return new SamsungKeyboard();
    }

    public SamsungMouse createMouse() {
        return new SamsungMouse();
    }
}
