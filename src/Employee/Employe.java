package Employee;

public class Employe {
    String name;
    int salary;
    int workHours;
    int hireYear;
    Employe(String name,int salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;


    }

    public double tax(){

        if(this.salary > 1000){

            return 0.03;

        }else{
            return 0;
        }

    }
    public int bonus( ){
        if (this.workHours > 40){

            return (this.workHours-40)*30;

        }else{

            return 0;
        }


    }
    public double raiseSalary(){

        if(2021-this.hireYear >19){

            return 0.15;
        } else if (2021-this.hireYear >9 && 2021-this.hireYear <19) {
            return 0.10;
            
        }else {
            return 0.05;
        }


    }
    public String toString(){

        System.out.println("Çalışanın ismi\t"+ this.name);
        System.out.println("Çalışanın maaşı\t"+ this.salary);
        System.out.println("Çalışanın çalışma saati :\t"+ this.workHours);
        System.out.println("Çalışanın başlangıç yılı :\t"+this.hireYear);

        double tax = tax()*this.salary;
        System.out.println("Çalışanın vergisi :\t"+ tax);


        System.out.println("Çalışanın Bonusu :\t"+ bonus());

        double raise = this.salary*raiseSalary();
        System.out.println("Çalışanın maaş artışı :\t"+ raise);

        double newValue = bonus() +this.salary-tax;

        System.out.println("Vergiler ve bonuslarla maaş\t"+ newValue);

        double newSalar = newValue+raise;
        System.out.println("Yeni maaş :\t"+ newSalar);


        return null;
    }



}


