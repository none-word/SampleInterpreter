package sample.Absyn; // Java Package generated by the BNF Converter.

public abstract class Field implements java.io.Serializable {
  public abstract <R,A> R accept(Field.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(sample.Absyn.TypeAnField p, A arg);
    public R visit(sample.Absyn.LBField p, A arg);

  }

}