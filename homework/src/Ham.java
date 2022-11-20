public class Ham extends ToppingDecorator{
    public Ham() {
    }

    @Override
    public String Name() {
        return name.insert(0, "햄").toString();
    }

    @Override
    public int Kcal() {
        return kcal + 200;
    }
}
