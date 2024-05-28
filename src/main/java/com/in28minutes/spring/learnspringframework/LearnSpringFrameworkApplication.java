package com.in28minutes.spring.learnspringframework;

import com.in28minutes.spring.learnspringframework.game.GamingConsole;
import com.in28minutes.spring.learnspringframework.game.GameRunner;
import com.in28minutes.spring.learnspringframework.game.MarioGame;
import com.in28minutes.spring.learnspringframework.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		//GamingConsole game = new MarioGame();
		//GamingConsole game2 = new SuperContraGame();
		//GameRunner runner = new GameRunner(game2);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
	}

}
