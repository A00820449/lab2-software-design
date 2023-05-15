package lab1;

public class MilkDecorator extends BaseBevarageDecorator {
    public MilkDecorator(Beverage wrapee) {
        super(wrapee);
    }

    @Override
    public void prepare() {
        System.out.println("Añadiendo leche...");
        super.prepare();
    }
}
