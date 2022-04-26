package Sample.Absyn; // Java Package generated by the BNF Converter.

public class ConstZero extends Expr {
  public ConstZero() { }

  public <R,A> R accept(Sample.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof Sample.Absyn.ConstZero) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}
