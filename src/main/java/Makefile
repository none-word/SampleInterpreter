JAVAC=javac
JAVAC_FLAGS=-sourcepath .
JAVA=java
JAVA_FLAGS=
CUP=java_cup.Main
CUPFLAGS=-nopositions -expect 100
JLEX=JLex.Main
all: test

test: absyn sample/Yylex.class sample/PrettyPrinter.class sample/Test.class sample/ComposVisitor.class sample/AbstractVisitor.class sample/FoldVisitor.class sample/AllVisitor.class sample/parser.class sample/sym.class sample/Test.class

.PHONY: absyn

%.class: %.java
	${JAVAC} ${JAVAC_FLAGS} $^

absyn: sample/Absyn/Program.java sample/Absyn/ProgramExprs.java sample/Absyn/ListExpr.java sample/Absyn/Idts.java sample/Absyn/Idents.java sample/Absyn/ListIdent.java sample/Absyn/Expr.java sample/Absyn/Import.java sample/Absyn/Var.java sample/Absyn/ConstTrue.java sample/Absyn/ConstFalse.java sample/Absyn/If.java sample/Absyn/FuncCall.java sample/Absyn/Func.java sample/Absyn/TypeAlFunc.java sample/Absyn/AnonymFunc.java sample/Absyn/TypeAlAnonymFunc.java sample/Absyn/Return.java sample/Absyn/NilKeyword.java sample/Absyn/TypeAliasing.java sample/Absyn/VarTypeAnnotation.java sample/Absyn/GlVarTypeAnnotation.java sample/Absyn/FuncTypeAnnotation.java sample/Absyn/TypeAscription.java sample/Absyn/TypeAscWithTypeAl.java sample/Absyn/EInt.java sample/Absyn/EDouble.java sample/Absyn/EStr.java sample/Absyn/Not.java sample/Absyn/And.java sample/Absyn/Or.java sample/Absyn/OnlyDecl.java sample/Absyn/OnlyGlDecl.java sample/Absyn/InitDecl.java sample/Absyn/InitGlDecl.java sample/Absyn/TableDecl.java sample/Absyn/GlTableDecl.java sample/Absyn/InitTableDecl.java sample/Absyn/InitGlTableDecl.java sample/Absyn/InitFuncDecl.java sample/Absyn/TableElementCall.java sample/Absyn/TableElementAssignment.java sample/Absyn/Assignment.java sample/Absyn/LetBinding.java sample/Absyn/ComaExprs.java sample/Absyn/Vars.java sample/Absyn/FArgs.java sample/Absyn/FuncArgs.java sample/Absyn/ListDec.java sample/Absyn/Type.java sample/Absyn/StringType.java sample/Absyn/BoolType.java sample/Absyn/IntType.java sample/Absyn/DoubleType.java sample/Absyn/TableType.java sample/Absyn/VoidType.java sample/Absyn/FuncType.java sample/Absyn/TypeAl.java sample/Absyn/TypeAlIdent.java sample/Absyn/VarKW.java sample/Absyn/VarKeyword.java sample/Absyn/TAnnot.java sample/Absyn/TypeAnnotation.java sample/Absyn/Dec.java sample/Absyn/Declaration.java sample/Absyn/TypeAlDecl.java sample/Absyn/GlDec.java sample/Absyn/GlDeclaration.java sample/Absyn/TypeAlGlDec.java sample/Absyn/Field.java sample/Absyn/TypeAnField.java sample/Absyn/LBField.java sample/Absyn/Fields.java sample/Absyn/LBFields.java sample/Absyn/ListField.java
	${JAVAC} ${JAVAC_FLAGS} $^

sample/Yylex.java: sample/Yylex
	${JAVA} ${JAVA_FLAGS} ${JLEX} sample/Yylex

sample/sym.java sample/parser.java: sample/sample.cup
	${JAVA} ${JAVA_FLAGS} ${CUP} ${CUPFLAGS} sample/sample.cup
	mv sym.java parser.java sample/

sample/Yylex.class: sample/Yylex.java sample/sym.java

sample/sym.class: sample/sym.java

sample/parser.class: sample/parser.java sample/sym.java

sample/PrettyPrinter.class: sample/PrettyPrinter.java

clean:
	rm -f sample/Absyn/*.class sample/*.class

distclean: vclean

vclean:
	 rm -f sample/Absyn/Program.java sample/Absyn/ProgramExprs.java sample/Absyn/ListExpr.java sample/Absyn/Idts.java sample/Absyn/Idents.java sample/Absyn/ListIdent.java sample/Absyn/Expr.java sample/Absyn/Import.java sample/Absyn/Var.java sample/Absyn/ConstTrue.java sample/Absyn/ConstFalse.java sample/Absyn/If.java sample/Absyn/FuncCall.java sample/Absyn/Func.java sample/Absyn/TypeAlFunc.java sample/Absyn/AnonymFunc.java sample/Absyn/TypeAlAnonymFunc.java sample/Absyn/Return.java sample/Absyn/NilKeyword.java sample/Absyn/TypeAliasing.java sample/Absyn/VarTypeAnnotation.java sample/Absyn/GlVarTypeAnnotation.java sample/Absyn/FuncTypeAnnotation.java sample/Absyn/TypeAscription.java sample/Absyn/TypeAscWithTypeAl.java sample/Absyn/EInt.java sample/Absyn/EDouble.java sample/Absyn/EStr.java sample/Absyn/Not.java sample/Absyn/And.java sample/Absyn/Or.java sample/Absyn/OnlyDecl.java sample/Absyn/OnlyGlDecl.java sample/Absyn/InitDecl.java sample/Absyn/InitGlDecl.java sample/Absyn/TableDecl.java sample/Absyn/GlTableDecl.java sample/Absyn/InitTableDecl.java sample/Absyn/InitGlTableDecl.java sample/Absyn/InitFuncDecl.java sample/Absyn/TableElementCall.java sample/Absyn/TableElementAssignment.java sample/Absyn/Assignment.java sample/Absyn/LetBinding.java sample/Absyn/ComaExprs.java sample/Absyn/Vars.java sample/Absyn/FArgs.java sample/Absyn/FuncArgs.java sample/Absyn/ListDec.java sample/Absyn/Type.java sample/Absyn/StringType.java sample/Absyn/BoolType.java sample/Absyn/IntType.java sample/Absyn/DoubleType.java sample/Absyn/TableType.java sample/Absyn/VoidType.java sample/Absyn/FuncType.java sample/Absyn/TypeAl.java sample/Absyn/TypeAlIdent.java sample/Absyn/VarKW.java sample/Absyn/VarKeyword.java sample/Absyn/TAnnot.java sample/Absyn/TypeAnnotation.java sample/Absyn/Dec.java sample/Absyn/Declaration.java sample/Absyn/TypeAlDecl.java sample/Absyn/GlDec.java sample/Absyn/GlDeclaration.java sample/Absyn/TypeAlGlDec.java sample/Absyn/Field.java sample/Absyn/TypeAnField.java sample/Absyn/LBField.java sample/Absyn/Fields.java sample/Absyn/LBFields.java sample/Absyn/ListField.java sample/Absyn/Program.class sample/Absyn/ProgramExprs.class sample/Absyn/ListExpr.class sample/Absyn/Idts.class sample/Absyn/Idents.class sample/Absyn/ListIdent.class sample/Absyn/Expr.class sample/Absyn/Import.class sample/Absyn/Var.class sample/Absyn/ConstTrue.class sample/Absyn/ConstFalse.class sample/Absyn/If.class sample/Absyn/FuncCall.class sample/Absyn/Func.class sample/Absyn/TypeAlFunc.class sample/Absyn/AnonymFunc.class sample/Absyn/TypeAlAnonymFunc.class sample/Absyn/Return.class sample/Absyn/NilKeyword.class sample/Absyn/TypeAliasing.class sample/Absyn/VarTypeAnnotation.class sample/Absyn/GlVarTypeAnnotation.class sample/Absyn/FuncTypeAnnotation.class sample/Absyn/TypeAscription.class sample/Absyn/TypeAscWithTypeAl.class sample/Absyn/EInt.class sample/Absyn/EDouble.class sample/Absyn/EStr.class sample/Absyn/Not.class sample/Absyn/And.class sample/Absyn/Or.class sample/Absyn/OnlyDecl.class sample/Absyn/OnlyGlDecl.class sample/Absyn/InitDecl.class sample/Absyn/InitGlDecl.class sample/Absyn/TableDecl.class sample/Absyn/GlTableDecl.class sample/Absyn/InitTableDecl.class sample/Absyn/InitGlTableDecl.class sample/Absyn/InitFuncDecl.class sample/Absyn/TableElementCall.class sample/Absyn/TableElementAssignment.class sample/Absyn/Assignment.class sample/Absyn/LetBinding.class sample/Absyn/ComaExprs.class sample/Absyn/Vars.class sample/Absyn/FArgs.class sample/Absyn/FuncArgs.class sample/Absyn/ListDec.class sample/Absyn/Type.class sample/Absyn/StringType.class sample/Absyn/BoolType.class sample/Absyn/IntType.class sample/Absyn/DoubleType.class sample/Absyn/TableType.class sample/Absyn/VoidType.class sample/Absyn/FuncType.class sample/Absyn/TypeAl.class sample/Absyn/TypeAlIdent.class sample/Absyn/VarKW.class sample/Absyn/VarKeyword.class sample/Absyn/TAnnot.class sample/Absyn/TypeAnnotation.class sample/Absyn/Dec.class sample/Absyn/Declaration.class sample/Absyn/TypeAlDecl.class sample/Absyn/GlDec.class sample/Absyn/GlDeclaration.class sample/Absyn/TypeAlGlDec.class sample/Absyn/Field.class sample/Absyn/TypeAnField.class sample/Absyn/LBField.class sample/Absyn/Fields.class sample/Absyn/LBFields.class sample/Absyn/ListField.class
	 rm -f sample/Absyn/*.class
	 rmdir sample/Absyn/
	 rm -f sample/Yylex sample/sample.cup sample/Yylex.java sample/VisitSkel.java sample/ComposVisitor.java sample/AbstractVisitor.java sample/FoldVisitor.java sample/AllVisitor.java sample/PrettyPrinter.java sample/Skeleton.java sample/Test.java sample/sym.java sample/parser.java sample/*.class
	rm -f Makefile
	rmdir -p sample/

