public interface ComputerFactory {
    /*public void createComputer(String type) {
        KeyboradFactory keyboradFactory = new KeyboradFactory();
        MouseFactory mouseFactory = new MouseFactory();

        keyboradFactory.createKeyboard(type);
        mouseFactory.createMouse(type);

        System.out.println("---- " + type + " 컴퓨터 완성 ----");
    }*/

    public Keyboard createKeyboard();
    public Mouse createMouse();
}
