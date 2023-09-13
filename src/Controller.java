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
}
