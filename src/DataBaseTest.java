import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {
DataBase dataBase;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        dataBase = new DataBase();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void addSuperHero() {
        int startSize = dataBase.hentSuperHero().size();
        dataBase.addSuperHero("zakzak","saka","super styrke",0,"ja",2000000);
        int expectetValue = startSize +1;
        int actualValue = dataBase.hentSuperHero().size();
        assertEquals(expectetValue,actualValue);
    }


    @org.junit.jupiter.api.Test
    void editSuperHero() {

        dataBase.editSuperHero("zakzak","zaza","sak","luft",1,"ja",2102101);

        String expectedName= "zaza"; String expectedRealName="sak"; String expectedSuperPower="luft"; int expectedYearCreated=1; String expectedIsHuman="ja"; int expectedStrength=2102101;

        String actualName = dataBase.visSuperHelt("zakzak").getName();
        String actualRealName = dataBase.visSuperHelt("zakzak").getRealName();
        String actualSuperPower = dataBase.visSuperHelt("zakzak").getSuperPower();
        int actualYearCreated = dataBase.visSuperHelt("zakzak").getYearCreated();
        String actualIsHuman = dataBase.visSuperHelt("zakzak").getIsHuman();
        int actualStrength = dataBase.visSuperHelt("zakzak").getStrength();

        assertEquals(expectedName,actualName);
        assertEquals(expectedRealName,actualRealName);
        assertEquals(expectedSuperPower,actualSuperPower);
        assertEquals(expectedYearCreated,actualYearCreated);
        assertEquals(expectedIsHuman,actualIsHuman);
        assertEquals(expectedStrength,actualStrength);

    }

    @org.junit.jupiter.api.Test
    void visSuperHelt() {

    }
}