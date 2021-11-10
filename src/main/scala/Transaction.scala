class Transaction(override val id: Integer, override val symbol: String, override val quantity: Integer, override val price: Double)
extends Equity( id: Integer, symbol: String, quantity: Integer, price: Double) with FeePayable with Taxable {
  def result : Double =    value() + flat_fee
  def amount : Double = result + (tax * result)
}
