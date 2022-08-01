def main(args:Array[String]):Unit={
    println(formatNames("Benny",ChangeUpper(_)))
    println(formatNames("Niroshan".substring(0,2), ChangeUpper(_))+formatNames("Niroshan".substring(2),ChangeLower(_)))
    println(formatNames("Saman",ChangeLower(_)))
    println(formatNames("Kumara".substring(0,1), ChangeUpper(_))+formatNames("Kumara".substring(1,5),ChangeLower(_)) +formatNames("Kumara".substring(5),ChangeUpper(_)))

}

def ChangeUpper(s: String):String ={
    s.ChangeUpperCase()
}

def ChangeLower(s: String):String ={
    s.ChangeLowerCase()
}

def formatNames(name:String, func:String => String):String={
    func(name)
}