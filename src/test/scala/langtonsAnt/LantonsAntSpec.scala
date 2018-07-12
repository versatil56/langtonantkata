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

  it should "be aware of its facing direction" in {
    val ant = new Ant()
    ant.facingDirection shouldBe 0 // East
  }
}

case class Ant(x: Int = 0, y: Int = 0){
  def currentPosition : (Int,Int) = (x, y)
  def facingDirection : Int = ???
}
