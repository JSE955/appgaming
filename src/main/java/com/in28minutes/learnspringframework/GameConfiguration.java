package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.PacManGame;


@Configuration
public class GameConfiguration {
	@Bean
	public GamingConsole game() {
		var game = new PacManGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
	/*@Bean
	public MarioGame mario() {
		return new MarioGame();
	}
	
	@Bean
	public PacManGame pacman() {
		return new PacManGame();
	}
	
	@Bean
	public SuperContraGame contra() {
		return new SuperContraGame();
	}*/
}
