package michalz.springscala

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.{ComponentScan, Configuration}

/**
 * Created by michal on 28.10.14.
 */

@EnableAutoConfiguration
@Configuration
@ComponentScan
class ApplicationConfig

object SpringScalaApplication extends App {
  SpringApplication.run(classOf[ApplicationConfig], args:_*)
}
