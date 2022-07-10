def NormalSalary(Hours:Int): Int=
{
  Hours*250
}

def OTSalary(Hours:Int): Int=
{
  Hours*85
}
def Salary(x:Int,y:Int): Int=
{
  (NormalSalary(x) + OTSalary(y)) * 88/100
}

println(Salary(40,30))