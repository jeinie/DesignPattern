public class LGComputerFactory implements ComputerFactory { // 모든 LG 부품 객체들을 만든다.
    public LGKeyboard createKeyboard() {
        return new LGKeyboard();
    }

    public LGMouse createMouse() {
        return new LGMouse();
    }
}
