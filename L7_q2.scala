object L7_q2 extends App {

  def calculateSquare(numbersList:List[Int]):List[Int]={

    numbersList.map(x => x * x);

  }

  //List of numbers that inputs to the function
  val ListNumbers=List(1,2,3,4,5);

  //resultList is the returned List with squre numbers.
  val resultList=calculateSquare(ListNumbers);

  println(resultList);


}
