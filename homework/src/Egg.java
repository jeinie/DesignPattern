public class Egg extends ToppingDecorator{
    public Egg() {

    }

    @Override
    public String Name() {
        return name.insert(0, "달걀").toString();
    }

    @Override
    public int Kcal() {
        return kcal + 100;
    }
}
