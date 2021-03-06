package sample.Absyn; // Java Package generated by the BNF Converter.

public class FuncArgs extends FArgs {
  public final ListDec listdec_;
  public FuncArgs(ListDec p1) { listdec_ = p1; }

  public <R,A> R accept(sample.Absyn.FArgs.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof sample.Absyn.FuncArgs) {
      sample.Absyn.FuncArgs x = (sample.Absyn.FuncArgs)o;
      return this.listdec_.equals(x.listdec_);
    }
    return false;
  }

  public int hashCode() {
    return this.listdec_.hashCode();
  }


}
