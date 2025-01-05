public class Trombone extends MusicalInstrument {
    public Trombone() {
        super("Trombone");
    }

    @Override
    public void sound() {
        System.out.println("The trombone produces a deep and resonant sound.");
    }

    @Override
    public void desc() {
        System.out.println("Description: The trombone is a brass instrument with a telescoping slide mechanism.");
    }

    @Override
    public void history() {
        System.out.println("History: The trombone was developed in the 15th century in Europe.");
    }
}
