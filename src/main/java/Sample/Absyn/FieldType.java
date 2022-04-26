package Sample.Absyn; // Java Package generated by the BNF Converter.

public class FieldType extends FieldTypeExpr {
  public final String ident_;
  public final Type type_;
  public FieldType(String p1, Type p2) { ident_ = p1; type_ = p2; }

  public <R,A> R accept(Sample.Absyn.FieldTypeExpr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof Sample.Absyn.FieldType) {
      Sample.Absyn.FieldType x = (Sample.Absyn.FieldType)o;
      return this.ident_.equals(x.ident_) && this.type_.equals(x.type_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.ident_.hashCode())+this.type_.hashCode();
  }


}
