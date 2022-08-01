def Interest(M:Double):Double=
    M match{
        case x if x<0 => 0
        case x if x<20000 =>x*0.02
        case x if x<200000=>x*0.04
        case x if x<2000000 =>x*0.35
        case x if x >= 20000000=>x*0.65
    }
    
print(Interest(20000))