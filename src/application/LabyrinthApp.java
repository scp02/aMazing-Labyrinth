package application;

/*
Date: November 28, 2021
Title: aMAZEing Labyrinth
Description: Game to simulate the real life board game, "The aMAZEing Labyrinth" with several changed rules.
Areas of Concern: If multiple players are on the same position, one player overlaps the other until they move from that position.
External Resources:
    Reading and writing to files: Author - Wayan Saryada. Link: https://kodejava.org/how-do-i-store-objects-in-file/.
    Icons from: https://game-icons.net/
    Game instructions from: https://www.ravensburger.org/spielanleitungen/ecm/Spielanleitungen/26448%20Anl%201946529.pdf?ossl=pds_text_Spielanleitung
Major Skills:
    Composition
    Object-Oriented Programming
    File reading and writing
    Recursion
    Action Listener to add functionality
    Handling images files
 */

// create and start the game
public class LabyrinthApp {
    public static void main(String[] args) {
        new HomeScreen();
    }
}

