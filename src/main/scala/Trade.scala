class Trade(val id: Integer, val symbol: String, val quantity: Integer, private var price: Integer = 0) {

  override def toString = s"Trade($id, $symbol, $quantity, $price)"


// val p = new Trade(1,"AAPL", 2, 1)
  def price = price
  def positive_prices (value : Double) : Double= {
   if (value >=0)
        price = value
        else
            println("Can't take this price")
 }

}

class Trade2(val id: Integer, val symbol: String, val quantity: Integer){

}
