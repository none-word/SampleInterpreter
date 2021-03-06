package TypeCheckerTests;
import Intepreter.*;
import org.junit.*;
import sample.Absyn.*;
import sample.Yylex;
import sample.parser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Paths;

public class FuncTests {
    private static final String filePathWithTests = System.getProperty("user.dir") + Paths.get("/src/test/java/TypeCheckerTests/TestFiles/funcTests.smpl");
    private static ListExpr exprs;
    private static TypeChecker typeChecker;

    @BeforeClass
    public static void setUp(){
        Yylex l = null;
        parser parser;
        try
        {
            l = new Yylex(new FileReader(filePathWithTests));
        }
        catch(FileNotFoundException e)
        {
            System.err.println("Error: File not found: " + filePathWithTests);
            System.exit(1);
        }

        parser = new parser(l);
        try {
            ProgramExprs programExprs = ((ProgramExprs) parser.pProgram());
            exprs = programExprs.listexpr_;
        }
        catch (Exception e){
            System.out.println("Parse error in line " + e.getMessage());
        }

        typeChecker = new TypeChecker();
    }

    @AfterClass
    public static void finished() {
    }

    @Test
    public void test_1() throws TypeException, UndefinedIdentifierExpression {
        var type = typeChecker.typeOf(new Context(), exprs.get(0));
        Assert.assertTrue(typeChecker.isSameType(type, new IntType()));
    }

    @Test
    public void test_2() throws TypeException, UndefinedIdentifierExpression {
        var type = typeChecker.typeOf(new Context(), exprs.get(1));
        Assert.assertTrue(typeChecker.isSameType(type, new BoolType()));
    }

    @Test(expected = TypeException.class)
    public void test_3() throws TypeException, UndefinedIdentifierExpression {
        var type = typeChecker.typeOf(new Context(), exprs.get(2));
    }

    @Test
    public void test_4() throws TypeException, UndefinedIdentifierExpression {
        var type = typeChecker.typeOf(new Context(), exprs.get(3));
        Assert.assertTrue(typeChecker.isSameType(type, new IntType()));
    }

    @Test
    public void test_5() throws TypeException, UndefinedIdentifierExpression {
        var type = typeChecker.typeOf(new Context(), exprs.get(4));
        Assert.assertTrue(typeChecker.isSameType(type, new IntType()));
    }

    @Test(expected = TypeException.class)
    public void test_6() throws TypeException, UndefinedIdentifierExpression {
        var type = typeChecker.typeOf(new Context(), exprs.get(5));
    }

    @Test
    public void test_7() throws TypeException, UndefinedIdentifierExpression {
        var type = typeChecker.typeOf(new Context(), exprs.get(6));
        Assert.assertTrue(typeChecker.isSameType(type, new VoidType()));
    }

    @Test(expected = TypeException.class)
    public void test_8() throws TypeException, UndefinedIdentifierExpression {
        var type = typeChecker.typeOf(new Context(), exprs.get(7));
    }

    @Test
    public void test_9() throws TypeException, UndefinedIdentifierExpression {
        var context = new Context();
        var type = typeChecker.typeOf(context, exprs.get(8));
        type = typeChecker.typeOf(context, exprs.get(9));
        type = typeChecker.typeOf(context, exprs.get(10));
        type = typeChecker.typeOf(context, exprs.get(11));

        Assert.assertTrue(typeChecker.isSameType(type, new IntType()));
    }

    @Test(expected = TypeException.class)
    public void test_10() throws TypeException, UndefinedIdentifierExpression {
        var context = new Context();
        var type = typeChecker.typeOf(context, exprs.get(12));
        type = typeChecker.typeOf(context, exprs.get(13));
        type = typeChecker.typeOf(context, exprs.get(14));
        type = typeChecker.typeOf(context, exprs.get(15));
    }

    @Test(expected = TypeException.class)
    public void test_11() throws TypeException, UndefinedIdentifierExpression {
        var context = new Context();
        var type = typeChecker.typeOf(context, exprs.get(16));
        type = typeChecker.typeOf(context, exprs.get(17));
        type = typeChecker.typeOf(context, exprs.get(18));
        type = typeChecker.typeOf(context, exprs.get(19));
    }

    @Test(expected = TypeException.class)
    public void test_12() throws TypeException, UndefinedIdentifierExpression {
        var context = new Context();
        var type = typeChecker.typeOf(context, exprs.get(20));
        type = typeChecker.typeOf(context, exprs.get(21));
        type = typeChecker.typeOf(context, exprs.get(22));
        type = typeChecker.typeOf(context, exprs.get(23));
        type = typeChecker.typeOf(context, exprs.get(24));
        type = typeChecker.typeOf(context, exprs.get(25));
    }

    @Test
    public void test_13() throws TypeException, UndefinedIdentifierExpression {
        var context = new Context();
        var type = typeChecker.typeOf(context, exprs.get(26));
        type = typeChecker.typeOf(context, exprs.get(27));
        type = typeChecker.typeOf(context, exprs.get(28));
        type = typeChecker.typeOf(context, exprs.get(29));

        Assert.assertTrue(typeChecker.isSameType(type, new IntType()));
    }

    @Test(expected = TypeException.class)
    public void test_14() throws TypeException, UndefinedIdentifierExpression {
        var context = new Context();
        var type = typeChecker.typeOf(context, exprs.get(30));
        type = typeChecker.typeOf(context, exprs.get(31));
        type = typeChecker.typeOf(context, exprs.get(32));
        type = typeChecker.typeOf(context, exprs.get(33));
    }

    @Test(expected = UndefinedIdentifierExpression.class)
    public void test_15() throws TypeException, UndefinedIdentifierExpression {
        var context = new Context();
        var type = typeChecker.typeOf(context, exprs.get(34));
        type = typeChecker.typeOf(context, exprs.get(35));
        type = typeChecker.typeOf(context, exprs.get(36));
        type = typeChecker.typeOf(context, exprs.get(37));
    }

    @Test(expected = TypeException.class)
    public void test_16() throws TypeException, UndefinedIdentifierExpression {
        var context = new Context();
        var type = typeChecker.typeOf(context, exprs.get(38));
        type = typeChecker.typeOf(context, exprs.get(39));
        type = typeChecker.typeOf(context, exprs.get(40));
        type = typeChecker.typeOf(context, exprs.get(41));
    }

    @Test
    public void test_17() throws TypeException, UndefinedIdentifierExpression {
        var context = new Context();
        var type = typeChecker.typeOf(context, exprs.get(42));
        type = typeChecker.typeOf(context, exprs.get(43));
        type = typeChecker.typeOf(context, exprs.get(44));
        type = typeChecker.typeOf(context, exprs.get(45));
        Assert.assertTrue(typeChecker.isSameType(type, new IntType()));
    }
}
