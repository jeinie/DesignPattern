public class TemplateMethodTest {
    public static void main(String[] args) {
        Tea myTea = new Tea(); // Tea 객체 생성
        myTea.prepareRecipe(); // 템플릿 메소드 호출

        System.out.println("----------------------------");
        Coffee myCoffee = new Coffee();
        myCoffee.prepareRecipe();
    }
}