public class DisplayDecorator extends Display {
    private Display decoratedDisplay;
    public DisplayDecorator(Display decorateDisplay) {
        this.decoratedDisplay = decorateDisplay;
    }

    public void draw() {
        decoratedDisplay.draw();
    }
}
