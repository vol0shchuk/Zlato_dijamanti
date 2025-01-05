public class Cello extends MusicalInstrument {
    public Cello() {
        super("Cello");
    }

    @Override
    public void sound() {
        System.out.println("The cello produces a warm and rich sound.");
    }

    @Override
    public void desc() {
        System.out.println("Description: The cello is a large string instrument, played with a bow and often used in orchestras.");
    }

    @Override
    public void history() {
        System.out.println("History: The cello was developed in the 16th century in Italy.");
    }
}
