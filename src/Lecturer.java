public class Lecturer extends Academician{
    private String DoorNo;

    public Lecturer(String name, String surName, String ePosta, String telNo, String bolum, String unvan, String doorNo) {
        super(name, surName, ePosta, telNo, bolum, unvan);
        DoorNo = doorNo;
    }

    public String getDoorNo() {
        return DoorNo;
    }

    public void setDoorNo(String doorNo) {
        DoorNo = doorNo;
    }

    public void senatoToplanti(){
        System.out.println(this.getName()+" senato toplantisi yapildi ");
    }
    public  void  sinavYap(){
        System.out.println(this.getName()+" sinav yapti.");
    }
}
