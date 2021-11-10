public class Security extends Officer{
    private String documation;

    public Security(String name, String surName, String ePosta, String telNo, String department, String mesai, String documation) {
        super(name, surName, ePosta, telNo, department, mesai);
        this.documation = documation;
    }

    public String getDocumation() {
        return documation;
    }

    public void setDocumation(String documation) {
        this.documation = documation;
    }

    public void nobet(){
        System.out.println("nobete geldi");
    }
}
