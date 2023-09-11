import java.util.Scanner;


public class DataBase {

    private SuperHero[] superheroListe;
    int count = 0;

    public DataBase(){
        this.superheroListe = new SuperHero[5];
    }

    public void addSuperHero(String name, String realName, String superPower, int yearCreated, String isHuman, int strength){
        superheroListe[count++] = new SuperHero(name, realName, superPower, yearCreated, isHuman, strength);
    }

    Scanner keyboard = new Scanner(System.in);



    public void printDatabBase(){
        System.out.println("velkommen til superhelte academiet");
        System.out.println("1. opret superhelt");
        System.out.println("2. afslut program");

        int starterProgram = keyboard.nextInt();

        if (starterProgram == 1){
            System.out.println("hvor mange helte vil du lave ( min. 1  - max. 5)");
            int numberOfHeroes = keyboard.nextInt();
            for (int i = 0; i < numberOfHeroes; i++) {
                System.out.println("HELT " + (i+1) + " ud af " + numberOfHeroes);
                System.out.println("hvad er navnet på din superhelt");
                String name = keyboard.next();
                System.out.println("hvad er din superhelts rigtige navn");
                String realName = keyboard.next();
                System.out.println("hvad er din superhelts superkraft");
                String superPower = keyboard.next();
                System.out.println("hvornår blev din superhelt født");
                int yearCreated = keyboard.nextInt();
                System.out.println("er din superhelt menneske");
                String isHuman = keyboard.next();
                System.out.println("hvor stærk er din superhelt");
                int strength = keyboard.nextInt();

                addSuperHero(name, realName, superPower, yearCreated, isHuman, strength);

            }
    }
    }
}

