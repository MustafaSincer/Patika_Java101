package BoxingGame;

public class Main {
    public static void main(String[] args) {

       Fighter alex = new Fighter("Alex", 150, 10,80,55,45);
       Fighter marc = new Fighter("Marc", 120,15,85,65,85);
       Fighter khabib = new Fighter("Khabib",130,20,75,70,50);
       Fighter tyson = new Fighter("Tyson",150,15,90,50,50);

       Ring r = new Ring(khabib,tyson,1300,5);
       r.run();


    }
}
