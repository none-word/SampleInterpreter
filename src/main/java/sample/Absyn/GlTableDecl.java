package sample.Absyn; // Java Package generated by the BNF Converter.

public class GlTableDecl extends Expr {
  public final GlDec gldec_;
  public final String ident_1, ident_2;
  public GlTableDecl(GlDec p1, String p2, String p3) { gldec_ = p1; ident_1 = p2; ident_2 = p3; }

  public <R,A> R accept(sample.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof sample.Absyn.GlTableDecl) {
      sample.Absyn.GlTableDecl x = (sample.Absyn.GlTableDecl)o;
      return this.gldec_.equals(x.gldec_) && this.ident_1.equals(x.ident_1) && this.ident_2.equals(x.ident_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.gldec_.hashCode())+this.ident_1.hashCode())+this.ident_2.hashCode();
  }


}
