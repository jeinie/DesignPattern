public class Client {
    public static void main(String[] args) {
//        ComputerFactory computerFactory = new ComputerFactory();
//        computerFactory.createComputer("Samsung");
//        computerFactory.createComputer("LG");

        FactoryOfComputerFactory factoryOfComputerFactory = new FactoryOfComputerFactory();
//        factoryOfComputerFactory.createComputer("LG");
        factoryOfComputerFactory.createComputer("Samsung");
    }
}