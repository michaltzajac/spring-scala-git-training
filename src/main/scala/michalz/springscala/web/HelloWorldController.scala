package michalz.springscala.web

import michalz.springscala.web.dto.MessageContainer
import org.springframework.web.bind.annotation.{RequestMethod, RequestBody, RequestMapping, RestController}

import scala.beans.BeanProperty

@RestController
class HelloWorldController {

  @RequestMapping(Array("/hello"))
  def helloWorldHandler() = {
    new MessageContainer("Hello World!")
  }

  @RequestMapping(value = Array("/receive"), method = Array(RequestMethod.PUT))
  def readMessage(@RequestBody message: MessageContainer) = {
    new MessageContainer("Received message: " + message.getMessage())
  }
}
