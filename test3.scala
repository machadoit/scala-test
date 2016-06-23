//The error in line 17 will disapear when the scalastyle is updated

class Batata {

  //Error ProcedureDeclarationChecker
  def foo() {
    var ola = 33
    42 + 2 + 44
    var yey = 22
    33
    
    var moreIssues = 1234
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
