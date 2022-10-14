package prac_03;

import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {
        Member member = new Member("kim", 1000);
        Member member1 = new Member("lee", 5000);

        Book book = new Book("title1", 10, 2000);
        Book book1 = new Book("title2", 5, 30000);

        Rental rental = new Rental(member, book, new BookDiscount());
        rental.discountedState();
        System.out.println();

        Rental rental1 = new Rental(member1, book1, new MemberDiscount());
        rental1.discountedState();

        //member.buyBook(book); // 책 구매
        //member1.buyBook(book1); // 책 구매


    }
}
