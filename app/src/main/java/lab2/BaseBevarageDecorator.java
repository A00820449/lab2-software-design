package lab2;

public class BaseBevarageDecorator implements Beverage {
    private Beverage wrapee;
    public BaseBevarageDecorator(Beverage wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public void prepare() {
        wrapee.prepare();
    }
}
