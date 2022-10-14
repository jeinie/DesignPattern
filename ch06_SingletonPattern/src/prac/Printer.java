package prac;

public class Printer {
    // printer 라는 정적 변수에 Printer 인스턴스를 만들어 초기화
    private static Printer printer = null;
    private int counter = 0;
    private Printer() { }

    public synchronized static Printer getPrinter() {
        if (printer == null) {
            printer = new Printer();
        }
        return printer;
    }
    public void print(String str) {
        counter++;
        System.out.println(str + counter);
    }
}
