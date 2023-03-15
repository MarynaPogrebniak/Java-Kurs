public class Jazz extends Musician{

  Musician musicalInstrument;

  public Jazz(String name, String surname, String musicalInstrument, Musician musicalInstrument1) {
    super(name, surname, musicalInstrument);
    this.musicalInstrument = musicalInstrument1;
  }

  
}
