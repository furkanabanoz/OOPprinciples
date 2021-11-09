public class Main {
    public static void main(String[] args) {
       //ata sinif
        Employee employee =new Employee("Mahmut","tuncer","mahmut@gmail.com","5256335");
        //bir alt sinif
        Academician academician=new Academician("Furkan","abanoz","furkan@hotmail.com","5336979730","CENG","Arastirma gorevlisi");
        Officer officer=new Officer("kemal","sunal","kemal@gmail.com","911656547","guvenlik","08:00-17:00");
         //bir alt siniflar daha
        Lecturer lecturer=new Lecturer("kazim","yilmaz","kazim@gmail.com","565453552","CENG","prof","23");
        Assistant assistant=new Assistant("ali Riza","Bey","aliriza@gmail.com","55355","Kimya","asistan","09:00-12:30");
          //bir alt sinif daha
        LabAssistant labAssistant=new LabAssistant("Canan","Hanim","canan@gmail.com","56215","Kimya","Lab asist.","12:00-17:00");
        labAssistant.giris();
        labAssistant.derseGir();
        System.out.println(labAssistant.getName());

    }
}
