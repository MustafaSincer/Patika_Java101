package StudentInfSystem;

public class Student {

    String Name;
    String stdno;
    String clasess;
    Course matematik;
    Course kimya;
    Course fizik;
    double avarage;


    boolean isPass;

    Student(String Name, String stdno, String clasess, Course matematik, Course kimya, Course fizik) {

        this.Name = Name;
        this.stdno = stdno;
        this.clasess = clasess;
        this.matematik = matematik;
        this.kimya = kimya;
        this.fizik = fizik;

    }

    void addBulkExamNote(int matematikEx, int kimyaEx, int fizikEx,int matematikSoz,int kimyaSoz,int fizikSoz) {


        if ((matematikEx>= 0 & matematikEx<=100)& (matematikSoz >= 0 & matematikSoz <=100)){

            System.out.println("Geçerli Not girdiniz:");
            this.matematik.Note=matematikEx;
            this.matematik.soz_Note=matematikSoz;


        }else{

            System.out.println("Geçersiz not girdiniz");
        }if ((kimyaEx>= 0 & kimyaEx<=100)& (kimyaSoz >= 0 & kimyaSoz <=100)){

            System.out.println("Geçerli Not girdiniz:");
            this.kimya.Note=kimyaEx;
            this.kimya.soz_Note=kimyaSoz;


        }else{

            System.out.println("Geçersiz not girdiniz");
        }if ((fizikEx>= 0 & fizikEx<=100)& (fizikEx >= 0 & fizikEx <=100)){

            System.out.println("Geçerli Not girdiniz:");
            this.fizik.Note=fizikEx;
            this.fizik.soz_Note=fizikSoz;


        }else{

            System.out.println("Geçersiz not girdiniz");
        }






    }
    void calcAvarage(){

        this.avarage = ((0.8*this.matematik.Note + 0.2*this.matematik.soz_Note)+ (0.80 * this.kimya.Note + 0.20 * this.kimya.soz_Note)+(0.80*this.fizik.Note+0.20*this.fizik.soz_Note)) /3.0;


        System.out.println("Not ortalaması :"+ this.avarage);


    }

    void isPass(){

        if(avarage>65){

            System.out.println("Dersi geçtiniz");
        }else{

            System.out.println("Dersten kaldınız");
        }



    }

    void infoStudent(){

        System.out.println("Öğrenci ismi : "+this.Name);
        System.out.println("Öğrenci  matematik notları :"+this.matematik.Note+ this.matematik.soz_Note + "Fizik notları"
        +this.fizik.Note+this.fizik.soz_Note+ "Kimya notları :"+ this.kimya.Note+ this.kimya.soz_Note);






    }

}