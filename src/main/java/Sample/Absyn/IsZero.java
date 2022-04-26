package Sample.Absyn; // Java Package generated by the BNF Converter.

public class IsZero extends Expr {
  public final Expr expr_;
  public IsZero(Expr p1) { expr_ = p1; }

  public <R,A> R accept(Sample.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof Sample.Absyn.IsZero) {
      Sample.Absyn.IsZero x = (Sample.Absyn.IsZero)o;
      return this.expr_.equals(x.expr_);
    }
    return false;
  }

  public int hashCode() {
    return this.expr_.hashCode();
  }


}
