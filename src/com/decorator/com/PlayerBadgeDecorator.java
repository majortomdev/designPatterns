package com.decorator.com;

public class PlayerBadgeDecorator extends PlayerDecorator {

	   public PlayerBadgeDecorator(Player decoratedShape) {
	      super(decoratedShape);		
	   }

	   @Override
	   public void throwDart() {
		   decoratedPlayer.throwDart();	       
	      setRedBorder(decoratedPlayer);
	   }

	   private void setRedBorder(Player decoratedShape){
	      System.out.println("Border Color: Red");
	   }
	}