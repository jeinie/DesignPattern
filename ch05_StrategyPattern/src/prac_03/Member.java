package prac_03;

public class Member {
    private String name;
    private int totalPrice;

    public Member(String name, int totalPrice) {
        this.name = name;
        this.totalPrice = totalPrice;
    }

    public void buyBook(Book b) {
        totalPrice += b.getPrice();
        System.out.println(this.name + "님이 " + b.getTitle() + "을 구매하셨습니다");
    }
}
