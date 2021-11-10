public class IT extends Officer{
    private String gorev;

    public IT(String name, String surName, String ePosta, String telNo, String department, String mesai, String gorev) {
        super(name, surName, ePosta, telNo, department, mesai);
        this.gorev = gorev;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public void networkKurlumu(){
        System.out.println("network kuruldu");
    }
}
