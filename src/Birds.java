public class Birds extends Animals implements Flyable {
    @Override
    public void nutrition() {
        System.out.println("Birds are eating");
    }

    @Override
    public void movement() {
        System.out.println("Birds are moving");
    }

    @Override
    public void reproduction() {
        System.out.println("Birds are reproducing");
    }

    @Override
    public void adaptation() {
        System.out.println("Birds are adaptive");
    }

    @Override
    public void socialInteraction() {
        System.out.println("Birds are interactive");
    }
    @Override
    public void fly() {
        System.out.println("Birds are flying");
    }

}
