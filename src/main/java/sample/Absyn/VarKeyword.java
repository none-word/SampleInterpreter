package sample.Absyn; // Java Package generated by the BNF Converter.

public class VarKeyword extends VarKW {
  public VarKeyword() { }

  public <R,A> R accept(sample.Absyn.VarKW.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof sample.Absyn.VarKeyword) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}
