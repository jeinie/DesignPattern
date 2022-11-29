public class FactoryOfComputerFactory {
    // 컴퓨터 객체 생성
    public void createComputer(String type) {
        ComputerFactory computerFactory = null;

        switch (type) {
            case "LG":
                computerFactory = new LGComputerFactory();
                break;
            case "Samsung":
                computerFactory = new SamsungComputerFactory();
                break;
        }

        computerFactory.createKeyboard();
        computerFactory.createMouse();
    }
}
