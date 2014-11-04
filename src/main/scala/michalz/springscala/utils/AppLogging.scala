package michalz.springscala.utils

import org.slf4j.LoggerFactory

/**
 * Created by michal on 04.11.14.
 */
trait AppLogging {

  val logger = LoggerFactory.getLogger(this.getClass)

  def debug(format: String, args: AnyRef*): Unit = {
    logger.debug(format, args:_*)
  }
  
  def info(format: String, args: AnyRef*): Unit = {
    logger.info(format, args:_*)
  }

  def warn(format: String, args: AnyRef*): Unit = {
    logger.warn(format, args:_*)
  }

  def error(format: String, args: AnyRef*): Unit = {
    logger.error(format, args:_*)
  }
}
