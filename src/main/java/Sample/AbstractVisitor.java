package Sample;
import Sample.Absyn.*;
/** BNFC-Generated Abstract Visitor */
public class AbstractVisitor<R,A> implements AllVisitor<R,A> {
/* Program */
    public R visit(Sample.Absyn.ProgramExprs p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(Sample.Absyn.Program p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Expr */
    public R visit(Sample.Absyn.Var p, A arg) { return visitDefault(p, arg); }
    public R visit(Sample.Absyn.ConstTrue p, A arg) { return visitDefault(p, arg); }
    public R visit(Sample.Absyn.ConstFalse p, A arg) { return visitDefault(p, arg); }
    public R visit(Sample.Absyn.If p, A arg) { return visitDefault(p, arg); }
    public R visit(Sample.Absyn.FuncCall p, A arg) { return visitDefault(p, arg); }
    public R visit(Sample.Absyn.Func p, A arg) { return visitDefault(p, arg); }
    public R visit(Sample.Absyn.Return p, A arg) { return visitDefault(p, arg); }
    public R visit(Sample.Absyn.Not p, A arg) { return visitDefault(p, arg); }
    public R visit(Sample.Absyn.And p, A arg) { return visitDefault(p, arg); }
    public R visit(Sample.Absyn.Or p, A arg) { return visitDefault(p, arg); }
    public R visit(Sample.Absyn.ConstZero p, A arg) { return visitDefault(p, arg); }
    public R visit(Sample.Absyn.Succ p, A arg) { return visitDefault(p, arg); }
    public R visit(Sample.Absyn.Pred p, A arg) { return visitDefault(p, arg); }
    public R visit(Sample.Absyn.IsZero p, A arg) { return visitDefault(p, arg); }


    public R visit(Sample.Absyn.EInt p, A arg) { return visitDefault(p, arg); }
    public R visit(Sample.Absyn.EDouble p, A arg) { return visitDefault(p, arg); }
    public R visit(Sample.Absyn.EStr p, A arg) { return visitDefault(p, arg); }
    public R visit(Sample.Absyn.OnlyDecl p, A arg) { return visitDefault(p, arg); }
    public R visit(Sample.Absyn.InitDecl p, A arg) { return visitDefault(p, arg); }

    public R visitDefault(Sample.Absyn.Expr p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* ComaExprs */
    public R visit(Sample.Absyn.Vars p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(Sample.Absyn.ComaExprs p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* FArgs */
    public R visit(Sample.Absyn.FuncArgs p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(Sample.Absyn.FArgs p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Type */
    public R visit(Sample.Absyn.StringType p, A arg) { return visitDefault(p, arg); }
    public R visit(Sample.Absyn.BoolType p, A arg) { return visitDefault(p, arg); }
    public R visit(Sample.Absyn.UnitType p, A arg) { return visitDefault(p, arg); }
    public R visit(Sample.Absyn.IntType p, A arg) { return visitDefault(p, arg); }
    public R visit(Sample.Absyn.DoubleType p, A arg) { return visitDefault(p, arg); }
    public R visit(Sample.Absyn.TableType p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(Sample.Absyn.Type p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Dec */
    public R visit(Sample.Absyn.Declaration p, A arg) { return visitDefault(p, arg); }
    public R visit(Sample.Absyn.LocalVarDeclaration p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(Sample.Absyn.Dec p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }

}
