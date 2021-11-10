public abstract class Assistant extends Academician{
    private String  OfisSaati;

    public Assistant(String name, String surName, String ePosta, String telNo, String bolum, String unvan, String ofisSaati) {
        super(name, surName, ePosta, telNo, bolum, unvan);
        OfisSaati = ofisSaati;
    }

    public String getOfisSaati() {
        return OfisSaati;
    }

    public void setOfisSaati(String ofisSaati) {
        OfisSaati = ofisSaati;
    }

    public void quizYap(){
        System.out.println(this.getName()+" quiz yapiyor");
    }

    @Override
    public void derseGir(String saat) {

    }
}
