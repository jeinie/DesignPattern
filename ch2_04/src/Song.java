public class Song {
    /*
    private String mode; // 현재 세일 중인지 (OnSale or TodayEvent) 아니면 세일하지 않고 있는 중인지를 표시하는 변수

    // 현재 mode를 새롭게 세팅하는 코드
    public void setMode(String mode) {
        this.mode = mode;
    }

    // 현재 선택된 노래의 가격을 return 하는 코드
    public double getPrice() {
        return 10.0;
    }

    // 현재 선택된 노래의 모드를 return 하는 코드
    public String getDiscountMode() {
        return this.mode;
    }
    */

    private DiscountedMode mode;
    public void setMode(DiscountedMode mode) {
        this.mode = mode;
    }

    public double getPrice() {
        return 10.0 - (10.0 * this.mode.getDiscountRate());
    }
}
