package sample.Absyn; // Java Package generated by the BNF Converter.

public class TableElementAssignment extends Expr {
  public final String ident_1, ident_2;
  public final Expr expr_;
  public TableElementAssignment(String p1, String p2, Expr p3) { ident_1 = p1; ident_2 = p2; expr_ = p3; }

  public <R,A> R accept(sample.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof sample.Absyn.TableElementAssignment) {
      sample.Absyn.TableElementAssignment x = (sample.Absyn.TableElementAssignment)o;
      return this.ident_1.equals(x.ident_1) && this.ident_2.equals(x.ident_2) && this.expr_.equals(x.expr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.ident_1.hashCode())+this.ident_2.hashCode())+this.expr_.hashCode();
  }


}