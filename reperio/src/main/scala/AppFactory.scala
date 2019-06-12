import akka.actor.ActorSystem
import com.typesafe.config.ConfigFactory
import com.typesafe.scalalogging.Logger


class AppFactory {

  val logger = Logger[AppFactory]
  val system = ActorSystem("reperio")
  val config = ConfigFactory.load

  def init(): this.type = {

    logger.info("Yahoo!!!")
    this
  }

}

