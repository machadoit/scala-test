import scala.util.{Failure, Success, Try}


object myObject {
  var cenas=123
  var another=1234124
  def MyFuntion(bla: Int) {
    var ola = 123
    var adeus = 123
    var yo= 123
        var ola = 123
    var adeus = 123
        var ola = 123
    var adeus = 123
        var ola = 123
    var adeus = 123
        var ola = 123
    var adeus = 123
        var ola = 123
    var adeus = 123
    var wtv = 567
    Try(1 / 0) match {
      case Success(content) => "yey"
      case Failure(fail) => "nop"
    }

    List(1, 2, 3).collectFirst {
      case bla if bla > 2 => "yey"
      case blaa if blaa > 1 => "nop"
    }

    //BUM!!!
    List(1, 2, 3).map {
      case bla if bla > 2 => "yey"
      case blaa if blaa > 1 => "nop"
    }
    
    var bla = 12
    
    bla
  }
}
