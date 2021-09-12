
/**
 *This class +++Insert Description here+++
 *
 * @author Ryan T.
 * @author Yan Z.
 * @author Ninxin G.
 * @author Jaime T.
 * Date: 04/11/2021
 */
public class GoFishyPlayer extends Player{
    
   
    public GoFishyPlayer(String name){
        super(name);  
    }
    // A method to initialize the instance of the game, with the players.
    @Override
    public void play(){
      GoFishyGame game = new GoFishyGame();
      game.getPlayers().add(this);
      game.play();
      game.declareWinner();
    }
}
