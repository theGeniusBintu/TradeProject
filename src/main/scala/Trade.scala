abstract class Trade(val id: Integer, val symbol: String, val quantity: Integer, private var price: Double = 0) {

  def isExecutable() : Boolean

  override def toString = s"${getClass.getName} ($id, $symbol, $quantity, $price)"

// def equity() : String =  if (isExecutable() == true)
//              return "Equity"
//  def fx() : String = if (isExecutable()==false)
//              return "FX"


// val p = new Trade(1,"AAPL", 2, 1)

  def positive_prices (value : Double)= {
   if (value >=0)
        price = value
 }

  def value () : Double = {quantity * price}

}

class Trade2(val id: Integer, val symbol: String, val quantity: Integer){

}
