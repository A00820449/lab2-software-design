package lab1;

public class MochaDecorator implements Beverage {
    Beverage wrapee;
    public MochaDecorator(Beverage wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public void prepare() {
        System.out.println("Añadiendo café moca...");
        wrapee.prepare();
    }
}
