package sample.Absyn; // Java Package generated by the BNF Converter.

public class TableElementCall extends Expr {
  public final String ident_1, ident_2;
  public TableElementCall(String p1, String p2) { ident_1 = p1; ident_2 = p2; }

  public <R,A> R accept(sample.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof sample.Absyn.TableElementCall) {
      sample.Absyn.TableElementCall x = (sample.Absyn.TableElementCall)o;
      return this.ident_1.equals(x.ident_1) && this.ident_2.equals(x.ident_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.ident_1.hashCode())+this.ident_2.hashCode();
  }


}
