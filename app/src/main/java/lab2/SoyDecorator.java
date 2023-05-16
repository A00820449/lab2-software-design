package lab2;

public class SoyDecorator extends BaseBevarageDecorator {
    public SoyDecorator(Beverage wrapee) {
        super(wrapee);
    }

    @Override
    public void prepare() {
        System.out.println("Añadiendo soya...");
        super.prepare();
    }
}
