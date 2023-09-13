import java.util.ArrayList;

public class DataBase {

    private ArrayList<SuperHero> superheroListe = new ArrayList<SuperHero>();
    int count = 0;

    public DataBase() {
        this.superheroListe = new ArrayList<>();
    }

    public void addSuperHero(String name, String realName, String superPower, int yearCreated, String isHuman, int strength) {
        superheroListe.add(new SuperHero(name, realName, superPower, yearCreated, isHuman, strength));
    }

    public ArrayList<SuperHero> hentSuperHero(){
        return superheroListe;
    }
}

