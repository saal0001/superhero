import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        DataBase dataBase = new DataBase();
        Controller controller = new Controller(dataBase);
        //dataBase.printDatabBase();

        int brugerValg = 0;


        while (brugerValg != 9) {
            System.out.println("velkommen til superhelte academiet");
            System.out.println("1. opret superhelt");
            System.out.println("2. vis superhelt");
            System.out.println("9. afslut program");

            brugerValg = keyboard.nextInt();

            if (brugerValg == 1) {

                System.out.println("hvor mange helte vil du lave ( min. 1)");
                int numberOfHeroes = keyboard.nextInt();
                for (int i = 0; i < numberOfHeroes; i++) {
                    System.out.println("HELT " + (i + 1) + " ud af " + numberOfHeroes);
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
                    controller.addSuperHero(name, realName, superPower, yearCreated, isHuman, strength);
                }

                }
            if (brugerValg == 2) {
                System.out.println("superhelte i academiet");
                for (SuperHero superHero : controller.hentSuperHero()) {
                    System.out.println(superHero);
                }
            }
            }
        }
    }
