package sample.Absyn; // Java Package generated by the BNF Converter.

public class InitFuncDecl extends Expr {
  public final String ident_;
  public final Expr expr_;
  public InitFuncDecl(String p1, Expr p2) { ident_ = p1; expr_ = p2; }

  public <R,A> R accept(sample.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof sample.Absyn.InitFuncDecl) {
      sample.Absyn.InitFuncDecl x = (sample.Absyn.InitFuncDecl)o;
      return this.ident_.equals(x.ident_) && this.expr_.equals(x.expr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.ident_.hashCode())+this.expr_.hashCode();
  }


}