//The error in line 17 will disapear when the scalastyle is updated

class Batata {

  //Error ProcedureDeclarationChecker
  def foo() {
    42
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
