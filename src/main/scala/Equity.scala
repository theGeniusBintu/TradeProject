class Equity(override val id: Integer, override val symbol: String, override val quantity: Integer, val price: Double)
  extends Trade(id: Integer, symbol: String, quantity: Integer, price:Double ) {
  override def isExecutable(): Boolean = true


}
