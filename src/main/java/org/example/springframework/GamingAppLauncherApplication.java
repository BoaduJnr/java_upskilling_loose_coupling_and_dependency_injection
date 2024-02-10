package org.example.springframework;


import org.example.springframework.game.GamerRunner;
import org.example.springframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("org.example.springframework.game")
public class GamingAppLauncherApplication {

    public static void main(String[] args) {

            /*Loose Coupling With Spring Bean*/
    try(

            var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)
            ){
        context.getBean(GamingConsole.class).up();
        context.getBean(GamerRunner.class).run();

    }
    }

}
