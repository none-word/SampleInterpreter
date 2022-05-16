package sample.Absyn; // Java Package generated by the BNF Converter.

public class TypeAscription extends TAscript {
  public final TAnnot tannot_;
  public final Type type_;
  public TypeAscription(TAnnot p1, Type p2) { tannot_ = p1; type_ = p2; }

  public <R,A> R accept(sample.Absyn.TAscript.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof sample.Absyn.TypeAscription) {
      sample.Absyn.TypeAscription x = (sample.Absyn.TypeAscription)o;
      return this.tannot_.equals(x.tannot_) && this.type_.equals(x.type_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.tannot_.hashCode())+this.type_.hashCode();
  }


}
