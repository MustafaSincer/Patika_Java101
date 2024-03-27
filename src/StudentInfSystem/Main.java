package StudentInfSystem;

public class Main {
    public static void main(String[] args) {

        Teacher tMath = new Teacher("Esra Sincer","555","math");
        Teacher tChem = new Teacher("Onur Demirel","111","Chem");
        Teacher tPhy = new Teacher("Dilek Çetin","222","Phy");

        tMath.printTeacherInfo();
        tPhy.printTeacherInfo();

        Course matematik = new Course("Matematik","101","math");
        Course fizik = new Course("Fizik","101","Phy");
        Course kimya = new Course("Kimya","101", "Chem");

        matematik.addTeacher(tMath);
        fizik.addTeacher(tPhy);
        kimya.addTeacher(tChem);

        matematik.printTeacher();

        Student s1 = new Student("Ali","222","4",matematik,kimya,fizik);

        Student s2 = new Student("Ayşe","333","3",matematik,kimya,fizik);

        Student s3 = new Student("Fatma","444","2",matematik,fizik,kimya);


        s1.addBulkExamNote(60,75,85,35,45,66);
        s2.addBulkExamNote(75,85,95,66,78,96);


        s1.calcAvarage();
        s2.calcAvarage();

        s1.isPass();


    }
}
