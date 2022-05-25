package sample.Absyn; // Java Package generated by the BNF Converter.

public class TypeAlAnonymFunc extends Expr {
  public final String ident_1, ident_2;
  public final FArgs fargs_;
  public final Program program_;
  public TypeAlAnonymFunc(String p1, FArgs p2, Program p3, String p4) { ident_1 = p1; fargs_ = p2; program_ = p3; ident_2 = p4; }

  public <R,A> R accept(sample.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof sample.Absyn.TypeAlAnonymFunc) {
      sample.Absyn.TypeAlAnonymFunc x = (sample.Absyn.TypeAlAnonymFunc)o;
      return this.ident_1.equals(x.ident_1) && this.fargs_.equals(x.fargs_) && this.program_.equals(x.program_) && this.ident_2.equals(x.ident_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(37*(this.ident_1.hashCode())+this.fargs_.hashCode())+this.program_.hashCode())+this.ident_2.hashCode();
  }


}
