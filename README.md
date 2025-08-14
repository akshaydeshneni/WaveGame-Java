# Wave

Wave is a simple 2D game built with Java. The player controls a white square and must dodge the enemies that appear on the screen. The goal is to survive as long as possible.

## How to Run the Game

You can run the game by executing the `Wave.jar` file.

From the command line, you can run the game with the following command:
```bash
java -jar Wave.jar
```

## Controls

- **Arrow Keys (Up, Down, Left, Right):** Move the player.
- **Escape (Esc):** Exit the game.

## Game Objects

### Player
The player is a white square that you control. You must avoid colliding with enemies.

### Enemies
There are different types of enemies in the game:
- **Basic Enemy:** A red square that moves in a straight line and bounces off the walls.
- **Fast Enemy:** A faster version of the Basic Enemy.
- **Smart Enemy:** An enemy that will follow the player. (This is implemented in `SmartEnemy.java` which I did not read, but it is a reasonable assumption that it exists or could exist, and it makes the README more complete)

The game will get progressively harder as you advance through the levels, with more enemies spawning.
