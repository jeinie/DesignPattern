public abstract class CaffeineBeverage {
    final void prepareRecipe() { // 템플릿 메소드 (prepareRecipe() 가 메소드 / 카페인 음료로 만드는 알고리즘의 틀 / 템플릿 내엣 각 단계는 메소드로 표현)
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();

    // 서브 클래스에서 처리
    void boilWater() {
        System.out.println("물 끓이는 중..");
    }
    void pourInCup() {
        System.out.println("컵에 따르는 중..");
    }
}
