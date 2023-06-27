public class Mammals extends Animals implements Lactatable {

    @Override
    public void nutrition() {
        System.out.println("Mammals are eating");
    }

    @Override
    public void movement() {
        System.out.println("Mammals are moving");
    }

    @Override
    public void reproduction() {
        System.out.println("Mammals are reproducing");
    }

    @Override
    public void adaptation() {
        System.out.println("Mammals are adaptive");
    }

    @Override
    public void socialInteraction() {
        System.out.println("Mammals are interactive");
    }

    @Override
    public void lactate() {
        System.out.println("Mammals are lactating");
    }
}
