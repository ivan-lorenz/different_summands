import org.scalacheck.Prop.forAll
import org.scalacheck.{Gen, Properties}
import scala.collection.JavaConverters._

object DifferentSummandsCheck extends Properties("DifferentSummands"){

  val genNonNegativesInts: Gen[Int] = Gen.choose(1, 10000)

  property("compute different summands") =
    forAll(genNonNegativesInts){n  =>
      val result = DifferentSummands.optimalSummands(n).asScala
      val assertion = result.foldLeft(0){_ + _} == n
      if (!assertion)
        System.out.println("ERROR EN F[" + n + "]")
      assertion
    }

}
