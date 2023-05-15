package lab1;

public class WhipDecorator extends BaseBevarageDecorator {
    public WhipDecorator(Beverage wrapee) {
        super(wrapee);
    }

    @Override
    public void prepare() {
        System.out.println("Añadiendo crema batida...");
        super.prepare();
    }
}
