package com.cognixia.jump.classandobjects;

public class AbstractClassAndInterfaceDriver {

	public static void main(String[] args) {

		// Showing inheritance and polymorphism in 
		// instantiating objects
		BasketBallPlayer bBallPlayer1 = new BasketBallPlayer();
		TeamSport bBallPlayer2 = new BasketBallPlayer();
		BallPlayer bBallPlayer3 = new BasketBallPlayer();
		GamePlayer bBallPlayer4 = new BasketBallPlayer();
		
		GamePlayer[] team1 = new GamePlayer[5];
		
		System.out.println(bBallPlayer1.callTimeOut());
		System.out.println(bBallPlayer2.callTimeOut());
		
		BallPlayer.showClock();
		
		System.out.println(bBallPlayer3.gameInPlay());
	}

}
