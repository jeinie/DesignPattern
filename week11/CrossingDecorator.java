public class CrossingDecorator extends DisplayDecorator{

    public CrossingDecorator(Display decorateDisplay) {
        super(decorateDisplay);
    }

    public void draw() {
        super.draw();
        drawCrossing();
    }

    private void drawCrossing() {
        System.out.println("\t횡단보도 표시");
    }
}
