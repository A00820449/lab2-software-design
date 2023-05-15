package lab1;

public class MilkDecorator implements Beverage {
    Beverage wrapee;
    public MilkDecorator(Beverage wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public void prepare() {
        System.out.println("Añadiendo leche...");
        wrapee.prepare();
    }
}
