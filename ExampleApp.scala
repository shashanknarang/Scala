package Example
/**
  * Created by Shashank.Narang on 11/23/2016.
  */

object primes extends App {
  def isPrime(n: Int) = (2 until n) forall (n % _ != 0)
  for (i <- 1 to 100 if isPrime(i)) println(i)
}