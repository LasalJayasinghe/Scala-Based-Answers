def Attendees(a:Int):Int=
{
  120 + (15 -a)/5 *20
}

def Revenue(a:Int):Int=
{
  Attendees(a) * a
}

def Cost(a:Int):Int=
{
  3*Attendees(a) +500 
}

def profit(a:Int):Int=
{
  Revenue(a) - Cost(a)
}

// println("Enter Ticket price:");
// val a = scala.io.StdIn.readInt()
println(profit(30))
println(profit(25))
println(profit(20))
println(profit(15))
println(profit(10))
println(profit(5))
