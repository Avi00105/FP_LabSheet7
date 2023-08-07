

object L7_q1 extends App{

  def filterEvenNumbers(numberList: List[Int]): List[Int] = {

    //Lambda function for filterout even numbers
    numberList.filter(N => N % 2 == 0);


  }

  val ListNumbers=List(1,2,3,4,5,6,7,8,9,10);

  val EvenNumbersList=filterEvenNumbers(ListNumbers);

  println(EvenNumbersList);

}
