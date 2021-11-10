abstract class Trade(val id: Integer, val symbol: String, val quantity: Integer, private var price: Double = 0) {

  def isExecutable() : Boolean

  override def toString = s"Trade($id, $symbol, $quantity, $price)"

  if (isExecutable() == true)
    println("An equity trade")
  else
    println("An FX trade")


// val p = new Trade(1,"AAPL", 2, 1)
  def price = value()
  def positive_prices (value : Double) : Double= {
   if (value >=0)
        price = value : Double
 }

  def value () : Double = {quantity * price}

}

class Trade2(val id: Integer, val symbol: String, val quantity: Integer){

}
