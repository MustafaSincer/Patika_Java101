package BoxingGame;

public class Fighter {

    String Name;
    int Health;
    int Damage;
    int weight;
    double dogde;
    double start;

    Fighter(String Name, int Health,int Damage,int weight, double dogde,double start){

        this.Name=Name;
        this.Health = Health;
        this.Damage = Damage;
        this.weight = weight;
        this.dogde = dogde;
        this.start = start;



    }

    public int Hit(Fighter foe){

        if (foe.isStart()){
            System.out.println("###########");
            System.out.println(foe.Name+ " boksör vuruşla başladı");

            if (this.isDodge()){

                System.out.println(this.Name+ "vuruşu blokladı");
                return this.Health;

            }else {
                System.out.println(foe.Name + "=>" + this.Name+ "" +foe.Damage+ "vurdu" );
                if( this.Health-foe.Damage < 0){
                    return 0;
                }

                return this.Health- foe.Damage;

            }




        }
        else {
            System.out.println(this.Name +" boksör vuruşla başladı");
            if(foe.isDodge()){
                System.out.println(foe.Name+ "vuruşu blokladı");
                return foe.Health;
            }else{

                System.out.println(this.Name + ">=" + foe.Name+ " " +this.Damage+ "vurdu");
                if( foe.Health-this.Damage < 0){
                    return 0;
                }
                return   foe.Health-this.Damage;
            }








        }

    }






    public boolean isStart(){

        double randamValue = Math.random() * 100;

        return randamValue < this.start;



    }

    public boolean isDodge(){

        double randomValue = Math.random() *100;

        return randomValue < this.dogde;



    }


}
