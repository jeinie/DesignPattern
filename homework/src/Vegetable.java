public class Vegetable extends ToppingDecorator{

    public Vegetable() {

    }
    @Override
    public String Name() {
        return name.insert(0, "야채").toString();
    }

    @Override
    public int Kcal() {
        return kcal + 10;
    }
}
