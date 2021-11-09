public class Academician extends Employee{
    private String bolum;
    private String unvan;
    public Academician(String name, String surName, String ePosta, String telNo,String bolum,String unvan) {
        super(name, surName, ePosta, telNo);
        this.bolum=bolum;
        this.unvan=unvan;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public  void derseGir(){
        System.out.println(this.getName()+" "+this.getSurName()+" going to working class");
    }
}
