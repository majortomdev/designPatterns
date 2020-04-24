package decorator.com;

public abstract class PlayerDecorator implements Player {
	   protected Player decoratedPlayer;
	   protected int baseScore = 20;

	   public PlayerDecorator(Player decoratedPlayer){
	      this.decoratedPlayer = decoratedPlayer;
	   }

	   public void draw(){
		   decoratedPlayer.throwDart();
	   }	
	}
