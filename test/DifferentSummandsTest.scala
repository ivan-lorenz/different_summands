import org.scalatest.FlatSpec
import scala.collection.JavaConverters._

class DifferentSummandsTest extends FlatSpec {

  behavior of "DifferentSummands"

  it should "compute number of prize places for a case" in {
    assert(DifferentSummands.optimalSummands(6).asScala === List(1,2,3))
  }

  it should "compute number of prize places for b case" in {
    assert(DifferentSummands.optimalSummands(8).asScala === List(1,2,5))
  }

  it should "compute number of prize places for c case" in {
    assert(DifferentSummands.optimalSummands(2).asScala === List(2))
  }

}
