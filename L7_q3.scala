object L7_q3 extends App {

  def filterPrime(numbersList: List[Int]): List[Int] = {
    def isPrime(num: Int): Boolean = {
      if (num <= 1) false
      else if (num == 2) true
      else !(2 to (Math.sqrt(num).toInt + 1)).exists(i => num % i == 0)
    }

    numbersList.filter(num => isPrime(num))
  }

  val NumbersList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val resultList = filterPrime(NumbersList)
  println(resultList)


}
