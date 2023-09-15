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

    public ArrayList<SuperHero> hentSuperHero() {
        return superheroListe;
    }

    public void editSuperHero(String søgNavn, String nytNavn, String nytRigtigNavn, String nySuperPower, int nytÅrOprettet, String nyIsHuman, int nytStrength) {
        for (SuperHero editSuperHero : superheroListe) {
            if (editSuperHero.getName().equals(søgNavn)) {
                editSuperHero.setName(nytNavn);
                editSuperHero.setRealName(nytRigtigNavn);
                editSuperHero.setSuperPower(nySuperPower);
                editSuperHero.setYearCreated(nytÅrOprettet);
                editSuperHero.setIsHuman(nyIsHuman);
                editSuperHero.setStrength(nytStrength);
            }

        }
    }
    public SuperHero visSuperHelt(String søgNavn){
        for (SuperHero superHero:superheroListe) {
            if (superHero.getName().equals(søgNavn)){
                System.out.println(hentSuperHero());
                return superHero;
            }
        }
        return null;
    }
}




