public class Main {
    public static void main(String[] args) {
        MusicalInstrument violin = new Violin();
        MusicalInstrument trombone = new Trombone();
        MusicalInstrument ukulele = new Ukulele();
        MusicalInstrument cello = new Cello();

        MusicalInstrument[] instruments = {violin, trombone, ukulele, cello};

        for (MusicalInstrument instrument : instruments) {
            instrument.show();
            instrument.sound();
            instrument.desc();
            instrument.history();
            System.out.println();
        }
    }
}
