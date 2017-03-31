//The error in line 17 will disapear when the scalastyle is updated

class Batata {

  //Error ProcedureDeclarationChecker
  def foo() {
    var ola = 33
    42 + 2 + 44
    var yey = 22
    33
    var bye = 22
    22
  }

  def betterFoo() = {
    42
  }

}

class Foo(s: String) {
  def this(){
    this("Bar")
  }
}
