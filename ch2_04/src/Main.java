public class Main {
    public static void main(String[] args) {
        // s1, s2, s3, s4 라는 4개의 노래를 생성하는 코드
        Song s1 = new Song();
        s1.setMode("NonDiscounted"); // s1 = 세일이 안되는 노래
        Song s2 = new Song();
        s2.setMode("NonDiscounted"); // s2 = 세일이 안되는 노래
        Song s3 = new Song();
        s3.setMode("OnSale"); // s3 = 10% 할인 중인 노래
        Song s4 = new Song();
        s4.setMode("TodayEvent"); // s4 = 30% 할인 중인 노래

        // s1, s2, s3, s4를 장바구니에 담는 코드
        CartForSongs c = new CartForSongs();
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);

        // 장바구니 c에 들어있는 노래의 총 가격을 계산하는 코드
        System.out.println(c.calculateTotalPrice());
    }
}