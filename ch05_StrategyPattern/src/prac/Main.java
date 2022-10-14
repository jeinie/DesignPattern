package prac;

// Strategy Pattern
// 각 변경사하을 클래스로 캡슐화
public class Main {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("prac.TaekwonV");
        Robot atom = new Atom("prac.Atom");

        // taekwonV 이동 기능, 공격 기능 설정
        taekwonV.setMovingStrategy(new WalkingStrategy());
        taekwonV.setAttackStrategy(new MissileStrategy());

        // atom 이동 기능, 공격 기능 설정
        atom.setMovingStrategy(new FlyingStrategy());
        atom.setAttackStrategy(new PunchStrategy());

        System.out.println("My name is " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println();

        System.out.println("My name is " + atom.getName());
        atom.move();
        atom.attack();
    }
}