import scala.io.StdIn._
import scala.compiletime.ops.float
import scala.compiletime.ops.double
object Question4 extends App{

def IsOdd(a :Double):Unit={
        var b = a-2;
        if(b==0)
        {
            println("Even Number")
        }
        else if(b<2)
        {
            println("Odd  Number")
        }
        else{
            IsOdd(b);
        }
    }

    print("Enter a value:")
    var n=readInt()
    IsOdd(n);
}