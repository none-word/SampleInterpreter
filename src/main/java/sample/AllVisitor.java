package sample;

import sample.Absyn.*;

/** BNFC-Generated All Visitor */
public interface AllVisitor<R,A> extends
  sample.Absyn.Program.Visitor<R,A>,
  sample.Absyn.Expr.Visitor<R,A>,
  sample.Absyn.ComaExprs.Visitor<R,A>,
  sample.Absyn.FArgs.Visitor<R,A>,
  sample.Absyn.Type.Visitor<R,A>,
  sample.Absyn.TypeKW.Visitor<R,A>,
  sample.Absyn.VarKW.Visitor<R,A>,
  sample.Absyn.TAnnot.Visitor<R,A>,
  sample.Absyn.TAscript.Visitor<R,A>,
  sample.Absyn.Dec.Visitor<R,A>
{}