import scala.io.StdIn._
import scala.util.control.Breaks._

object Question3 extends App{
    println("Enter value:")
    var n =readInt()

    def addFunction(a:Int,b:Int):Int={
        if(a<1)
        {
        print("Total =" +b)
        break}
        else
            {
                addFunction(a-1,b+a)
            }
    }

    addFunction(n,0);
}