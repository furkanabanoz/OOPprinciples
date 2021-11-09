public class LabAssistant extends Assistant {
    public LabAssistant(String name, String surName, String ePosta, String telNo, String bolum, String unvan, String ofisSaati) {
        super(name, surName, ePosta, telNo, bolum, unvan, ofisSaati);
    }
    public void lablaraGir(){
        System.out.println(this.getName()+" lablara gir");
    }
    public void derseGir(){
        System.out.println(this.getName()+" derse gir");
    }
}
