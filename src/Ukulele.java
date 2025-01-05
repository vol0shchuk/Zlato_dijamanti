public class Ukulele extends MusicalInstrument {
    public Ukulele() {
        super("Ukulele");
    }

    @Override
    public void sound() {
        System.out.println("The ukulele produces a light and cheerful sound.");
    }

    @Override
    public void desc() {
        System.out.println("Description: The ukulele is a small string instrument, commonly associated with Hawaiian music.");
    }

    @Override
    public void history() {
        System.out.println("History: The ukulele originated in Hawaii in the late 19th century.");
    }
}
