package com.decorator.com;

public class DecoratorPatternDD {
	   public static void main(String[] args) {

	      Player playerA = new Expert();

	      Player playerB = new PlayerBadgeDecorator(new Expert());

	      Player playerC = new PlayerBadgeDecorator(new Novice());
	      //System.out.println("Player with no badge");
	      playerA.throwDart();

	      //System.out.println("\nExpert with Black badge");
	      playerB.throwDart();

	      //System.out.println("\nNovice with Green badge");
	      playerC.throwDart();
	   }
	}