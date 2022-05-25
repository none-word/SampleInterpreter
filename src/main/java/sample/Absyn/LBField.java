package sample.Absyn; // Java Package generated by the BNF Converter.

public class LBField extends Field {
  public final Dec dec_;
  public final Expr expr_;
  public LBField(Dec p1, Expr p2) { dec_ = p1; expr_ = p2; }

  public <R,A> R accept(sample.Absyn.Field.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof sample.Absyn.LBField) {
      sample.Absyn.LBField x = (sample.Absyn.LBField)o;
      return this.dec_.equals(x.dec_) && this.expr_.equals(x.expr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.dec_.hashCode())+this.expr_.hashCode();
  }


}