package Sample.Absyn; // Java Package generated by the BNF Converter.

public class Declarators extends Dec {
  public final String ident_;
  public final Type type_;
  public Declarators(String p1, Type p2) { ident_ = p1; type_ = p2; }

  public <R,A> R accept(Sample.Absyn.Dec.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof Sample.Absyn.Declarators) {
      Sample.Absyn.Declarators x = (Sample.Absyn.Declarators)o;
      return this.ident_.equals(x.ident_) && this.type_.equals(x.type_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.ident_.hashCode())+this.type_.hashCode();
  }


}
