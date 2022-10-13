public class BallMachineTest {
    public static void main(String[] args) {
        // 볼을 5개 가지고 있는 BallMachine을 생성
        BallMachine ballMachine = new BallMachine(5);
        System.out.println(ballMachine.toString());

        ballMachine.insertCoin();
        ballMachine.turnCrank();

        System.out.println(ballMachine.toString());

        ballMachine.insertCoin();
        ballMachine.ejectCoin();
       //ballMachine.insertCoin();
        ballMachine.turnCrank(); // 오류 상황

        System.out.println(ballMachine.toString());
    }
}
