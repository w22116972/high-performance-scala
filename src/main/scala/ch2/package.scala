package object ch2 {
  case class Price(value: BigDecimal)
  case class OrderId(value: Long)

  sealed trait LimitOrder {
    def id: OrderId
    def price: Price
  }

  case class BuyLimitOrder(id: OrderId, price: Price) extends LimitOrder
  case class SellLimitOrder(id: OrderId, price: Price) extends LimitOrder
  case class Execution(orderId: OrderId, price: Price)
}
