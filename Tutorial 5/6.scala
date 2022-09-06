import scala.io.StdIn._
import scala.util.control.Breaks._

object Question6 extends App{

   def Func(n:Int):Int={
    if(n<=1)
    {
        n
    }
    else
    {
        Func(n-1) +Func(n-2)
    }
   }

    def printFibo(n:Int,i:Int):Unit={
      if(n==i)
          break
       else
         println(Func(i))
      printFibo(n,i+1)
      
}

  print("Enter a Number : ")
  var n=readInt()

  printFibo(n,0)
}