public class MusicalInstrument {
    private String name;

    public MusicalInstrument(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("This instrument produces a unique sound.");
    }

    public void show() {
        System.out.println("Instrument: " + name);
    }

    public void desc() {
        System.out.println("Description: This is a musical instrument used to produce music.");
    }

    public void history() {
        System.out.println("History: The history of this instrument dates back to ancient times.");
    }
}
