public class Cheese extends ToppingDecorator{
    public Cheese() { }

    @Override
    public String Name() {
        return name.insert(0, "치즈").toString();
    }

    @Override
    public int Kcal() {
        return kcal + 50;
    }
}