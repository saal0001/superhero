import java.util.ArrayList;

public class Controller {
    private DataBase dataBase = new DataBase();
    private ArrayList<SuperHero> superHeroListe = new ArrayList<SuperHero>();

   public Controller(DataBase dataBase){
        this.dataBase = dataBase;
    }

    public void addSuperHero(String name, String realName, String superPower, int yearCreated, String isHuman, int strength) {
        dataBase.addSuperHero(name, realName, superPower, yearCreated, isHuman, strength);
    }

    public ArrayList<SuperHero> hentSuperHero(){
        return dataBase.hentSuperHero();
    }

    public void editSuperHero(String søgNavn, String nytNavn, String nytRigtigNavn, String nySuperPower, int nytÅrOprettet, String nyIsHuman, int nytStrength){
       dataBase.editSuperHero(søgNavn,nytNavn, nytRigtigNavn, nySuperPower, nytÅrOprettet, nyIsHuman, nytStrength);
    }

    public void visSuperHelt(String søgNavn){
       dataBase.visSuperHelt(søgNavn);
    }

}
