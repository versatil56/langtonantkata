package langtonsAnt

import org.scalatest._

class LantonsAntSpec extends FlatSpec with Matchers {

  "An ant" should
    "be defined in the application" in {
      val ant = new Ant()
      ant.isInstanceOf[Ant] shouldBe true
    }

  it should "be aware of its current position" in {
    val ant = new Ant()
    ant.currentPosition shouldBe (0,0)
  }
}

case class Ant(){
  def currentPosition : (Int,Int) = ???
}
