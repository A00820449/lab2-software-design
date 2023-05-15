package lab1;

public class WhipDecorator implements Beverage {
    Beverage wrapee;
    public WhipDecorator(Beverage wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public void prepare() {
        System.out.println("Añadiendo crema batida...");
        wrapee.prepare();
    }
}
