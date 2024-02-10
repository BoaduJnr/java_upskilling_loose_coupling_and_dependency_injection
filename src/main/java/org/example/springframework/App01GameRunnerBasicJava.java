package org.example.springframework;


import org.example.springframework.game.GamerRunner;
import org.example.springframework.game.MarioGame;
import org.example.springframework.game.PacManGame;
import org.example.springframework.game.SuperContraGame;

public class App01GameRunnerBasicJava {

    public static void main(String[] args) {

            /*Loose Coupling With Basic Java*/
        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame(); //Object creation
        var pacManGame = new PacManGame();
        var gameRunner = new GamerRunner(superContraGame); //Wiring dependencies NB: Game(GamingConsole) is a dependency of GameRunner
        gameRunner.run();

    }

}
