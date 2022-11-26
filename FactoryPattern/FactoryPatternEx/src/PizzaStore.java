public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String pizza_type) {
        Pizza pizza; // 추상 클래스와 인터페이스로는 직접 인스턴스를 만들 수가 없음

        pizza = factory.createPizza(pizza_type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
