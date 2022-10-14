package prac_03;

// 대여 시스템
public class Rental {
    private Member member;
    private Book book;
    private PricePolicy pricePolicy; // 할인 정책

    public Rental(Member member, Book book, PricePolicy pricePolicy) {
        this.member = member;
        this.book = book;
        this.pricePolicy = pricePolicy;
        this.member.buyBook(book);
    }

    public void discountedState() {
        pricePolicy.discount();
    }
}
