package ch2

import ch2.OrderBook.Commands.Command
import ch2.OrderBook.Events.Event

object OrderBook {
  // all the commands that can be handled by the OrderBook module
  object Commands {
    sealed trait Command
    case class AddLimitOrder(o: LimitOrder) extends Command
    case class CancelOrder(id: OrderId) extends Command
  }
  // events are the results of processing a command
  object Events {
    sealed trait Event
    case class OrderExecuted(buy: Execution, sell: Execution)
      extends Event
    case object LimitOrderAdded extends Event
    case object OrderCancelRejected extends Event
    case object OrderCanceled extends Event
  }
  // the entry point of the module - the current book and
  // the command to process are passed as parameters,
  // the new state of the book and the event describing the
  // result of processing the command are returned
  def handle(book: OrderBook.type, command: Command): Unit = Unit // omitted for brevity
}
