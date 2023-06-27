public class Fishes extends Animals implements NotBreathable {
    @Override
    public void nutrition() {
        System.out.println("Fishes are eating");
    }

    @Override
    public void movement() {
        System.out.println("Fishes are moving");
    }

    @Override
    public void reproduction() {
        System.out.println("Fishes are reproducing");
    }

    @Override
    public void adaptation() {
        System.out.println("Fishes are adaptive");
    }

    @Override
    public void socialInteraction() {
        System.out.println("Fishes are interactive");
    }

    @Override
    public void notBreathable() {
        System.out.println("Fishes aren't breathing");
    }
}
