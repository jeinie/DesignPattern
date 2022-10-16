package ch2_04;

public class Main {
    public static void main(String[] args) {
        // 4개의 노래 생성
        Song s1 = new Song();
        s1.setMode(new NonDiscounted());
        Song s2 = new Song();
        s2.setMode(new NonDiscounted());
        Song s3 = new Song();
        s3.setMode(new OnSale());
        Song s4 = new Song();
        s4.setMode(new TodayEvent());

        // s1, s2, s3, s4를 장바구니에 넣는 코드
        CartForSongs c = new CartForSongs();
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);

        System.out.println(c.calculateTotalPrice());
    }
}