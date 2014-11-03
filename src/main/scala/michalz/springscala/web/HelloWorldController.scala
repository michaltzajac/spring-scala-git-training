package michalz.springscala.web

import org.springframework.web.bind.annotation.{RequestMapping, RestController}

import scala.beans.BeanProperty

case class MsgContainer(@BeanProperty message: String)

@RestController
class HelloWorldController {

  @RequestMapping(Array("/hello"))
  def helloWorldHandler() = {
    MsgContainer("Hello World!")
  }
}
