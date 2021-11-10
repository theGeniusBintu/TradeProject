class FX(override val id: Integer, override val symbol: String, override val quantity: Integer, private var price: Double = 0)
  extends Trade(id: Integer, symbol: String, quantity: Integer, price: Double ){
  override def isExecutable(): Boolean = false
}
