package sample.Absyn; // Java Package generated by the BNF Converter.

public abstract class Dec implements java.io.Serializable {
  public abstract <R,A> R accept(Dec.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(sample.Absyn.Declaration p, A arg);
    public R visit(sample.Absyn.TypeAlDecl p, A arg);

  }

}
