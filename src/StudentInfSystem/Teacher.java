package StudentInfSystem;

public class Teacher {
    String Name;
    String mpno;
    String Branch;

    Teacher(String Name,String mpno,String Branch){

        this.Name = Name;
        this.mpno = mpno;
        this.Branch = Branch;


    }


    void printTeacherInfo(){
        System.out.println("#########################");
        System.out.println("Teacher Name :" +this.Name);
        System.out.println("Teacher Mobile Phone: "+ this.mpno);
        System.out.println("Teacher Branch :" + this.Branch);



    }

}
