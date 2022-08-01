def OddOrEven(M:Int):String=
    M match{
        case x if x%2 ==0  =>"Even"
        case x if x%2 ==1  =>"Odd"
    }
    

var Number = scala.io.StdIn.readInt()
if(Number<=0)
    print("Zero or Negative")
print(OddOrEven(Number))