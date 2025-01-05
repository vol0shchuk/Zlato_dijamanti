public class Violin extends MusicalInstrument {
    public Violin() {
        super("Violin");
    }

    @Override
    public void sound() {
        System.out.println("The violin produces a rich and vibrant sound.");
    }

    @Override
    public void desc() {
        System.out.println("Description: The violin is a string instrument with four strings, played with a bow.");
    }

    @Override
    public void history() {
        System.out.println("History: The violin originated in Italy during the 16th century.");
    }
}
