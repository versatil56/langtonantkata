package langtonsAnt

import org.scalatest._

class LantonsAntSpec extends FlatSpec with Matchers {

  "An ant" should {
    "be defined in the application" in {
      val ant = new Ant()
      ant.isInstanceOf[Ant] shouldBe true
    }
  }

}
