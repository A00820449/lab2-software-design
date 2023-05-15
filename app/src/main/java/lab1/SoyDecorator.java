package lab1;

public class SoyDecorator implements Beverage {
    Beverage wrapee;
    public SoyDecorator(Beverage wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public void prepare() {
        System.out.println("Añadiendo soya...");
        wrapee.prepare();
    }
}
