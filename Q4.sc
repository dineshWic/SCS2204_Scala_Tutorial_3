def totalCoverPrice(copies:Int):Double=24.95*copies - copies*0.4

//only for copies>=50
def totalShipping(copies:Int):Double={
  if(copies>50) 50*3+(copies-50)*0.75 else copies*3
}

def cost(copies:Int):Double={
  totalCoverPrice(copies) + totalShipping(copies)
}

cost(60)