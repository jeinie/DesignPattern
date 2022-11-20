public abstract class Toast {
    StringBuffer name = new StringBuffer();
    int kcal = 0;

    public Toast() {

    }
    public void serve() {
        System.out.print("주문한 토스트 : ");
        getName();
        getKcal();
        System.out.println();
    }
    public void getName() {
        System.out.println(name);
    }
    public void getKcal() {
        System.out.println("칼로리 : " + kcal + "Kcal");
    }
    public void addTopping(ToppingDecorator td) {
        addName(td.Name());
        addKcal(td.Kcal());
    }
    public void addName(String name) {
        this.name.insert(0, name);
    }
    public void addKcal(int kcal) {
        this.kcal += kcal;
    }
}
