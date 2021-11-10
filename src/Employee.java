public abstract class Employee {
    private String name;
    private String surName;
    private String ePosta;
    private String telNo;

    public Employee(String name, String surName, String ePosta,String telNo) {
        this.name = name;
        this.surName = surName;
        this.ePosta = ePosta;
        this.telNo=telNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getePosta() {
        return ePosta;
    }

    public void setePosta(String ePosta) {
        this.ePosta = ePosta;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public void giris(){
        System.out.println(this.getName()+" "+this.getSurName()+" in the universty");
    }
    public void cikis(){
        System.out.println(this.getName()+" "+this.getSurName()+" out the universty");
    }
    public void yemekhane(){
        System.out.println(this.getName()+" "+this.getSurName()+" in the dining hall");
    }
    public void giris(String girisSaati,String cikisSaati){
        System.out.println(girisSaati+" de girdi "+cikisSaati+" de cikti");
    }


}

