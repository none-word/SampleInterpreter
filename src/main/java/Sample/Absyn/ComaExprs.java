package Sample.Absyn; // Java Package generated by the BNF Converter.

public abstract class ComaExprs implements java.io.Serializable {
  public abstract <R,A> R accept(ComaExprs.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(Sample.Absyn.Vars p, A arg);

  }

}
