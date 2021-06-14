/** 
 * GameTimerTask.java
 * @author Group J (Ryan Harding, Michael Pate, Adeline Reichert, Austin
 *                  Stephen, and Ben Wilkin)
 * Date: May 14, 2021
 * Purpose: The internal timer structure required to be able to run our
 *          game timer
 */

import java.util.TimerTask;

public class GameTimerTask extends TimerTask
{
  private GameWindow targetGame;

  public GameTimerTask(GameWindow game)
  {
    targetGame = game;
  }

  @Override
  public void run()
  {
    if(targetGame.isGameRunning()) targetGame.incTimeSeconds();
  }

};