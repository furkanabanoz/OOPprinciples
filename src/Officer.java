public class Officer extends Employee {
    private String department;
    private String mesai;

    public Officer(String name, String surName, String ePosta, String telNo, String department, String mesai) {
        super(name, surName, ePosta, telNo);
        this.department = department;
        this.mesai = mesai;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }

    public void calis(){
        System.out.println(this.getName()+" "+this.getSurName()+" calismaya basladi");
    }
}

