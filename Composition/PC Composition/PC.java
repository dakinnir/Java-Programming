public class PC {

    // Used this logic and fields because you can only inherit from one parent class at a time in Java
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    // The PC comprises of these three other classes
    public PC(Case theCase, Motherboard motherboard, Monitor monitor) {
        this.theCase = theCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }
    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo() {
        monitor.drawPixelAt(1200,50,"Yellow");
    }
}
