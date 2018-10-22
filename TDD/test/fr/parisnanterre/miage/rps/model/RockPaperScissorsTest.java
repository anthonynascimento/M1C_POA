package fr.parisnanterre.miage.rps.model;

import org.testng.annotations.*;


import static org.testng.Assert.*;

public class RockPaperScissorsTest {

    RockPaperScissors game;

    @BeforeMethod
    public void setUp() throws Exception {
        game = new RockPaperScissors();
    }

    @AfterMethod
    public void tearDown() throws Exception{
        game = null;
    }

    @Test
    public void testPlay() throws Exception{
        assertEquals(game.play(RPSEnum.ROCK, RPSEnum.SCISSORS), Result.WIN);
    }

    @Test
    public void testPlay2() throws Exception{
        assertEquals(game.play(RPSEnum.ROCK, RPSEnum.PAPER), Result.LOST);
    }

    @DataProvider( name = "winData")
    public Object[][] createWinData() {
        return new Object[][]{{RPSEnum.PAPER, RPSEnum.ROCK},{RPSEnum.ROCK, RPSEnum.SCISSORS},{RPSEnum.SCISSORS, RPSEnum.PAPER}};
    }

    @DataProvider ( name = "tieData")
    public Object[][] createTieData() {
        return new Object[][]{{RPSEnum.PAPER, RPSEnum.PAPER},{RPSEnum.ROCK, RPSEnum.ROCK},{RPSEnum.SCISSORS, RPSEnum.SCISSORS}};
    }

    @DataProvider ( name = "lostData")
    public Object[][] createLostData() {
        return new Object[][]{{RPSEnum.PAPER, RPSEnum.SCISSORS},{RPSEnum.ROCK, RPSEnum.PAPER},{RPSEnum.SCISSORS, RPSEnum.ROCK}};
    }

    /*@Parameters({"paper","rock"})
    @Test*/
    @Test ( dataProvider = "winData")
    void testWinPlay ( RPSEnum p1 , RPSEnum p2 ) {
        assertEquals(game.play(p1,p2),Result.WIN);
    }

    /*@Parameters({"paper","paper"})
    @Test*/
    @Test ( dataProvider = "tieData")
    void testTiePlay(RPSEnum p1, RPSEnum p2) {
        assertEquals(game.play(p1, p2), Result.TIE);
    }

    /*@Parameters({"paper","scissors"})
    @Test*/
    @Test ( dataProvider = "lostData")
    void testLostPlay(RPSEnum p1, RPSEnum p2) {
        assertEquals(game.play(p1, p2), Result.LOST);
    }
}