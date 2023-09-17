import java.util.Scanner;
public class UserInterFace {
    Scanner keyboard = new Scanner(System.in);

    DataBase dataBase = new DataBase();
    Controller controller = new Controller(dataBase);


    public void startProgram(){


    String searchName;
    int brugerValg = 0;


        while (brugerValg != 9) {
        System.out.println("velkommen til superhelte academiet");
        System.out.println("1. opret superhelt");
        System.out.println("2. vis superhelt");
        System.out.println("3. find superhelt");
        System.out.println("4. rediger superhelt");
        System.out.println("9. afslut program");

        if (!keyboard.hasNextInt()){
            String text = keyboard.next();
            System.out.println(text +" er ikk et gyldigt tegn");
            System.out.println("vælg et af de følgende valgmuligheder");
            System.out.println();
            System.out.println("1. opret superhelt");
            System.out.println("2. vis superhelt");
            System.out.println("3. find superhelt");
            System.out.println("4. rediger superhelt");
            System.out.println("9. afslut program");
        }
        brugerValg = keyboard.nextInt();

        if (brugerValg == 1) {

            System.out.println("hvor mange helte vil du lave ( min. 1)");
            if (!keyboard.hasNextInt()){
                String text = keyboard.nextLine();
                System.out.println(text +" er ikke et gyldigt tegn prøv igen");
            }
            int numberOfHeroes = keyboard.nextInt();
            keyboard.nextLine();
            for (int i = 0; i < numberOfHeroes; i++) {
                System.out.println("HELT " + (i + 1) + " ud af " + numberOfHeroes);
                System.out.println("hvad er navnet på din superhelt");
                String name = keyboard.nextLine();
                System.out.println("hvad er din superhelts rigtige navn");
                String realName = keyboard.nextLine();
                System.out.println("hvad er din superhelts superkraft");
                String superPower = keyboard.nextLine();
                System.out.println("hvornår blev din superhelt født");
                if (!keyboard.hasNextInt()){
                    String text = keyboard.next();
                    System.out.println(text +" er ikke et gyldigt tegn prøv igen");
                }
                int yearCreated = keyboard.nextInt();
                System.out.println("er din superhelt menneske");
                String isHuman = keyboard.next();
                System.out.println("hvor stærk er din superhelt");
                if (!keyboard.hasNextInt()){
                    String text = keyboard.next();
                    System.out.println("er ikk et gyldigt tegn prøv igen");
                }
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
            if (brugerValg == 3){
                System.out.println("find din superhelt");
                keyboard.nextLine();
                searchName = keyboard.nextLine();
                for (SuperHero superHero: controller.hentSuperHero()
                ) {
                    if (superHero.getName().contains(searchName)){
                        System.out.println("superhelte fundet");
                        System.out.println(superHero);
                    }

                }
        }
            if (brugerValg == 4){
                System.out.println("søg efter superhelt");
                String søgNavn = keyboard.nextLine();
                controller.visSuperHelt(søgNavn);
                System.out.println("hvad skal superheltens nye navn være");
                String nytNavn = keyboard.nextLine();
                System.out.println("hvad skal superheltens nye rigtige navn være");
                String nytRigtigNavn = keyboard.nextLine();
                System.out.println("hvad skal superheltens nye super kræft være");
                String nySuperPower = keyboard.nextLine();
                System.out.println("hvad skal superheltens nye fødeselsår være");
                if (!keyboard.hasNextInt()){
                    String text = keyboard.next();
                    System.out.println(text +" er ikke et gyldigt tegn prøv igen");
                }
                int nytÅrOprettet = keyboard.nextInt();
                System.out.println("skal superhelten stadig  være menneske");
                String nyIsHuman = keyboard.next();
                System.out.println("hvad skal superheltens nye styrke være");
                if (!keyboard.hasNextInt()){
                    String text = keyboard.next();
                    System.out.println(text + " er ikke et gyldigt tegn prøv igen");
                }
                int nytStrength = keyboard.nextInt();
                controller.editSuperHero(søgNavn,nytNavn,nytRigtigNavn, nySuperPower,nytÅrOprettet, nyIsHuman, nytStrength);

            }
    }
}
}