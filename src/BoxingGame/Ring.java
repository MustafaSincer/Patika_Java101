package BoxingGame;

public class Ring {

    Fighter f1;
    Fighter f2;

    int maxweight;
    int minweight;

    Ring(Fighter f1,Fighter f2,int maxweight,int minweight){

        this.f1 = f1;
        this.f2 = f2;
        this.maxweight = maxweight;
        this.minweight = minweight;


    }

    public void run(){


        if(checkWeight()){
            while(f1.Health > 0 && f2.Health>0){

                System.out.println("############Yeni Round###########");

                f2.Health= f1.Hit(f2);
                if(isWin()){
                    break;
                }
                f1.Health =f2.Hit(f1);

                if(isWin()){

                    break;

                }
                printScore();

            }
        }else{

            System.out.println("Sporcu sıkletleri uyuşmuyor!!!");
        }




    }



    public boolean checkWeight(){

        if((f1.weight >= minweight && f1.weight <= maxweight) && (f2.weight >= minweight && f2.weight<= maxweight)){

            return true;
        }else{

            System.out.println("Sıkletler uyumlu değil");
            return false;
        }



    }
    public boolean isWin(){
        if (f1.Health == 0){

            System.out.println(f2.Name+ "maçı kazandı!!");
            return true;
        } else if (f2.Health == 0) {
            System.out.println(f1.Name + "Maçı kazandı !!!");
            return true;

        }else{
            return false;
        }


    }
    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.Name + " Kalan Can \t:" + f1.Health);
        System.out.println(f2.Name + " Kalan Can \t:" + f2.Health);
    }






}
