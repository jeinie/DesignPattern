public class StarbucksCoffee {
    public static void main(String[] args) {

        Beverage beverage = new Espresso(); // 에스프레소 주문
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1); // 모카로 데코레이팅
        beverage1 = new Mocha(beverage1); // 모카 한 샷 추가
        beverage1 = new Whip(beverage1); // 휘핑크림 추가

        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2); // 두유 추가
        beverage2 = new Mocha(beverage2); // 모카 추가
        beverage2 = new Whip(beverage2); // 휘핑 추가

        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}