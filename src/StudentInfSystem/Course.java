package StudentInfSystem;

public class Course {
    String name;
    String code ;
    String prefix;
    Teacher courseTeacher;
    int Note;
    int soz_Note;

    Course(String name,String code, String prefix){

        this.name = name;
        this.code = code;
        this.prefix = prefix;

    }

    void addTeacher(Teacher t){
        if(this.prefix.equals(t.Branch)){
            this.courseTeacher = t;

            System.out.println("Öğretmen atama işlemi başarılı");

        }else {

            System.out.println("Öğretmen atanamadı");

        }



    }
    void printTeacher(){

        if (courseTeacher != null){
            System.out.println("Teacher of courses is :"+ courseTeacher.Name);
        }else {
            System.out.println( this.name + "cant attach teacher");
        }


    }




}
