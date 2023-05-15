package lab1;

public class MochaDecorator extends BaseBevarageDecorator {
    public MochaDecorator(Beverage wrapee) {
        super(wrapee);
    }

    @Override
    public void prepare() {
        System.out.println("Añadiendo café moca...");
        super.prepare();
    }
}
