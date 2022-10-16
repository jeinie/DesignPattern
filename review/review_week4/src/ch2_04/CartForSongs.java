package ch2_04;

import java.util.ArrayList;
import java.util.Iterator;

public class CartForSongs {
    ArrayList<Song> cart = new ArrayList<Song>();
    public double calculateTotalPrice() {
        double total = 0.0;
        Iterator<Song> itr = cart.iterator();

        while(itr.hasNext()) {
            Song s = itr.next();
            total = total + s.getPrice();
        }
        return total;
    }

    // 노래 s를 장바구니에 추가
    public void add(Song s) {
        cart.add(s);
    }
}
