def coverPrice(r:Int):Double ={
    (r*24.95)*60/100
}

def shippingCost(r:Int):Double={
  if(r>50)
  {
    3 + 0.75*(r-50)
  }
  else
  {
    3
  }
}

def Total(r :Int):Double =
{
  shippingCost(r) + coverPrice(r)
}

println("Total price = "+Total(60))