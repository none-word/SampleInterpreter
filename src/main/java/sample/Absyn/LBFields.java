package sample.Absyn; // Java Package generated by the BNF Converter.

public class LBFields extends Fields {
  public final ListField listfield_;
  public LBFields(ListField p1) { listfield_ = p1; }

  public <R,A> R accept(sample.Absyn.Fields.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof sample.Absyn.LBFields) {
      sample.Absyn.LBFields x = (sample.Absyn.LBFields)o;
      return this.listfield_.equals(x.listfield_);
    }
    return false;
  }

  public int hashCode() {
    return this.listfield_.hashCode();
  }


}