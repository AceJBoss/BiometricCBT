package biometrics.cbt.ui.pages;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author JBoss
 */
public class QuestionThree {

    static Object[] tt;
    static String q1 = "Which of the following operators would produce a result of type real when used on integers?";
    static String o1One = "+";
    static String o1Two = "DIV";
    static String o1Three = "/";
    static String o1Four = "MOD";
    static String a1 = "/";
    static String q2 = "Which of the following operators is used to perform truncated division?";
    static String o2One = "/";
    static String o2Two = "DIV";
    static String o2Three = "MOD";
    static String o2Four = "TRUNC";
    static String a2 = "/";
    static String q3 = "Evaluate the expression below:\n35MOD3";
    static String o3One = "11";
    static String o3Two = "2";
    static String o3Three = "11.666667";
    static String o3Four = "33.2";
    static String a3 = "2";
    static String q4 = "Which of the following is a valid exponential operator supported by pascal?";
    static String o4One = "^";
    static String o4Two = "*";
    static String o4Three = "exp";
    static String o4Four = "None of the above";
    static String a4 = "None of the above";
    static String q5 = "Evaluate the expression below:\n(r DIV s)*s + (r MOD s)";
    static String o5One = "r+s";
    static String o5Two = "r";
    static String o5Three = "s";
    static String o5Four = "(r+s)/s";
    static String a5 = "r";
    static String q6 = "Which of the following operator can't be used with a real type variable?";
    static String o6One = "/";
    static String o6Two = "MOD";
    static String o6Three = "*";
    static String o6Four = "+";
    static String a6 = "MOD";
    static String q7 = "Evaluate the expression: abs(-7)";
    static String o7One = "-7";
    static String o7Two = "-3.5";
    static String o7Three = "7";
    static String o7Four = "3.5";
    static String a7 = "7";
    static String q8 = "Given that x = 2, evaluate the expression odd(x)";
    static String o8One = "2";
    static String o8Two = "True";
    static String o8Three = "-2";
    static String o8Four = "False";
    static String a8 = "False";
    static String q9 = "Consider the snippet below:\n"
            + "VAR w,x,y,z: integer;\n"
            + "...\n"
            + "Read(w,x);\n"
            + "Read(y,z);\n"
            + "suppose that the input file contain two separate files (17,33,21,14) and (25,65,91,0), evaluate the values of w, x, y and z respectively";
    static String o9One = "17, 33, 25, 65";
    static String o9Two = "21, 14, 91, 0";
    static String o9Three = "17, 33, 21, 14";
    static String o9Four = "25, 65, 91, 0";
    static String a9 = "17, 33, 21, 14";
    static String q10 = "What is the output of the program snippet below:\n"
            + "CONST name = 'sade';\n"
            + "...\n"
            + "write('My name is ',name);\n"
            + "writeln('I am a lady');";
    static String o10One = "The program prints 'My name is sadeIam a lady' on the same line";
    static String o10Two = "The program prints 'My name is sade' and then 'I am a lady' on the next line";
    static String o10Three = "The program prints 'My name is sade, I am a lady' on the same line";
    static String o10Four = "The program would return an error";
    static String a10 = "The program prints 'My name is sadeIam a lady' on the same line";
    static String q11 = "Structure statements in pascal can be all but one of the follwing: ";
    static String o11One = "Compound statements";
    static String o11Two = "Simple statements";
    static String o11Three = "Conditional Statements";
    static String o11Four = "Repetitive Statements";
    static String a11 = "Simple statements";
    static String q12 = "Pascal includes three standard identifiers that represent constants, this includes all but one of the following";
    static String o12One = "maxint";
    static String o12Two = "false";
    static String o12Three = "true";
    static String o12Four = "minint";
    static String a12 = "minint";
    static String q13 = "Given that u<13, evaluate the expression NOT(u>=13)";
    static String o13One = "true";
    static String o13Two = "false";
    static String o13Three = "u>13: false, u=13: true";
    static String o13Four = "None of the above";
    static String a13 = "true";
    static String q14 = "Which of the following pascal structures is not used for selection?";
    static String o14One = "if...then";
    static String o14Two = "if...then...else";
    static String o14Three = "if...else";
    static String o14Four = "nested if";
    static String a14 = "if...else";
    static String q15 = "Which of the following is case structure used for in pascal?";
    static String o15One = "selection";
    static String o15Two = "condition";
    static String o15Three = "repetition";
    static String o15Four = "iteration";
    static String a15 = "selection";
    static String q16 = "Repetition in pascal is also reffered to as one of the following";
    static String o16One = "looping";
    static String o16Two = "conditional selection";
    static String o16Three = "iteration";
    static String o16Four = "A and C";
    static String a16 = "A and C";
    static String q17 = "Pascal inludes two types of looping, these are?";
    static String o17One = "conditional and unconditional";
    static String o17Two = "iterational and non-iterational";
    static String o17Three = "selection and repetition";
    static String o17Four = "conditional and iterational";
    static String a17 = "conditional and unconditional";
    static String q18 = "Evaluate the output of the snippet below:\n"
            + "i:=0;\n"
            + "while(i<10) do\n"
            + "begin\n"
            + "writeln('I am a student');\n"
            + "end;";
    static String o18One = "The program would print 'I am a student' nine times";
    static String o18Two = "The program would print 'I am a student' ten times";
    static String o18Three = "The program would print 'I am a student' eleven times";
    static String o18Four = "The program would return an error";
    static String a18 = "The program would print 'I am a student' ten times";
    static String q19 = "Which of the following is not correct about while...do and repeat...until structures";
    static String o19One = "They would both execute at least once";
    static String o19Two = "Repeat...until would execute at least once but while...do may not execute at all";
    static String o19Three = "Repeat...until executes from false to true but while...do executes from true to false";
    static String o19Four = "The body of while...do can take multiple statements while the body of repeat...until takes one statement";
    static String a19 = "They would both execute at least once";
    static String q20 = "Which of the following statement is used for unconditional iteration";
    static String o20One = "for...do";
    static String o20Two = "while...do";
    static String o20Three = "repeat...until";
    static String o20Four = "case structure";
    static String a20 = "for...do";
    static String q21 = "Which of the following is not a valid 'for loop' in pascal?";
    static String o21One = "for int counter:= initial to final do";
    static String o21Two = "for int counter:= final to initial do";
    static String o21Three = "for int counter:= final downto final do";
    static String o21Four = "None of the above";
    static String a21 = "None of the above";

    static String q22 = "The syntax of a goto statement in pascal is_______";
    static String o22One = "GOTO: Label;";
    static String o22Two = "goto label;";
    static String o22Three = "GOTO := label;";
    static String o22Four = "goto = label;";
    static String a22 = "goto label;";
    static String q23 = "One advantage of modularization in pascal is that";
    static String o23One = "It makes programming simple";
    static String o23Two = "It decomposes program into bits";
    static String o23Three = "It avoids the need for redundant (repeated) codes";
    static String o23Four = "It improve program efficiency";
    static String a23 = "It avoids the need for redundant (repeated) codes";
    static String q24 = "The two programming structures used for modularization in pascal are";
    static String o24One = "Repeat...until and while...do";
    static String o24Two = "selection and iteration";
    static String o24Three = "procedure and function";
    static String o24Four = "sub-unit and case structure";
    static String a24 = "procedure and function";
    static String q25 = "When the statements contained in a procedure has been executed, one of the following happens";
    static String o25One = "The program terminates";
    static String o25Two = "The program executes the procedure again";
    static String o25Three = "The program transfers control to the next statement after the procedure reference";
    static String o25Four = "The program restarts";
    static String a25 = "The program transfers control to the next statement after the procedure reference";
    static String q26 = "Which of the following is correct about the declaration of procedure in pascal?";
    static String o26One = "procedure name;";
    static String o26Two = "procdure name(formal parameters);";
    static String o26Three = "procedure name(formal parameters):return_type;";
    static String o26Four = "A and B";
    static String a26 = "A and B";
    static String q27 = "Variables declared within procedures are known as";
    static String o27One = "local variable";
    static String o27Two = "global variable";
    static String o27Three = "formal variable";
    static String o27Four = "actual variable";
    static String a27 = "local variable";
    static String q28 = "A parameter used during procedure call is known as";
    static String o28One = "local parameter";
    static String o28Two = "global parameter";
    static String o28Three = "formal parameter";
    static String o28Four = "actual parameter";
    static String a28 = "formal parameter";
    static String q29 = "Which of the following is not a must in procedure call";
    static String o29One = "Number of actual parameter must be the same as the formal parameter";
    static String o29Two = "The data types of actual parameters must match that of the formal parameters";
    static String o29Three = "The order of the formal parameter must match the actual parameter";
    static String o29Four = "Actual parameters must have the same name as formal parameters";
    static String a29 = "Actual parameters must have the same name as formal parameters";
    static String q30 = "Which of the following is true about a function?";
    static String o30One = "It has a return type";
    static String o30Two = "It has the same declaration as a procedure";
    static String o30Three = "It can be declared in the body of the program";
    static String o30Four = "It must be called within a repetitive statement";
    static String a30 = "It has a return type";
    static String q31 = "Which of the following declarations of a function is not correct?";
    static String o31One = "function name : type";
    static String o31Two = "function name (formal parameters) : type";
    static String o31Three = "function name (formal parameters)";
    static String o31Four = "None of the above";
    static String a31 = "function name (formal parameters)";
    static String q32 = "The ability of a function to call itself within its declaration is called_______";
    static String o32One = "repetition";
    static String o32Two = "function reference";
    static String o32Three = "recursion";
    static String o32Four = "iteration";
    static String a32 = "recursion";
    static String q33 = "Which of the following operators require that the second operand be non-zero?";
    static String o33One = "+";
    static String o33Two = "*";
    static String o33Three = "/";
    static String o33Four = "-";
    static String a33 = "/";
    static String q34 = "Evaluate the expression: (13DIV2)/(15MOD4)";
    static String o34One = "6";
    static String o34Two = "2";
    static String o34Three = "0.333";
    static String o34Four = "2.667";
    static String a34 = "2";
    static String q35 = "Computer programs that are written to solve specific problems are reffered to as ____________";
    static String o35One = "System softwares";
    static String o35Two = "Default packages";
    static String o35Three = "Application softwares";
    static String o35Four = "problem solving softwares";
    static String a35 = "Application softwares";
    static String q36 = "Which of the following keywords is not contained in a pascal header?";
    static String o36One = "BEGIN";
    static String o36Two = "PROGRAM";
    static String o36Three = "INPUT";
    static String o36Four = "OUTPUT";
    static String a36 = "BEGIN";
    static String q37 = "A simple expression is an example of _______ statement";
    static String o37One = "simple";
    static String o37Two = "compound";
    static String o37Three = "conditional";
    static String o37Four = "repetitive";
    static String a37 = "simple";
    static String q38 = "A pascal program can contain statements categorized into all but one of the following sections";
    static String o38One = "sequence";
    static String o38Two = "iteration";
    static String o38Three = "compound";
    static String o38Four = "selection";
    static String a38 = "compound";
    static String q39 = "Which of the following is not true about pascal?";
    static String o39One = "Its structure is made of two sections";
    static String o39Two = "Every pascal statement must start with a begin statement";
    static String o39Three = "It is not case sensitive";
    static String o39Four = "It can be used to develop a software";
    static String a39 = "Every pascal statement must start with a begin statement";
    static String q40 = "Which of the following is not true about the operators = and := in pascal?";
    static String o40One = " := is an assignment operator";
    static String o40Two = " = is used for comparison";
    static String o40Three = " := is used during constant declaration";
    static String o40Four = " = can be used to form boolean expressions";
    static String a40 = " := is used during constant declaration";

    protected static ArrayList<String> questions, options, answers;

    public static ArrayList<String> question() {
        questions = new ArrayList<String>();
        ArrayList<String> tempQ = new ArrayList<String>();
        String[] q = new String[]{q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20, q21, q22, q23, q24, q25, q26, q27, q28, q29,
            q30, q31, q32, q33, q34, q35, q36, q37, q38, q39, q40};
        for (int i = 0; i < 40; i++) {
            tempQ.add(q[i]);
        }
        Set<Integer> set = new HashSet<Integer>(10);
        for (int i = 0; set.size() < 10; i++) {
            Random ran = new Random();
            set.add(1 + ran.nextInt(39));
        }
        tt = set.toArray();
        for (int i = 0; i < 10; i++) {
            questions.add(tempQ.get(Integer.valueOf(tt[i].toString())));
        }
        return questions;
    }

    public static ArrayList<String> option() {
        options = new ArrayList<String>();
        ArrayList<String> tempO = new ArrayList<String>();
        String[] o = new String[]{o1One, o1Two, o1Three, o1Four, o2One, o2Two, o2Three, o2Four, o3One, o3Two, o3Three, o3Four, o4One, o4Two, o4Three, o4Four,
            o5One, o5Two, o5Three, o5Four, o6One, o6Two, o6Three, o6Four, o7One, o7Two, o7Three, o7Four, o8One, o8Two, o8Three, o8Four,
            o9One, o9Two, o9Three, o9Four, o10One, o10Two, o10Three, o10Four, o11One, o11Two, o11Three, o11Four, o12One, o12Two, o12Three, o12Four,
            o13One, o13Two, o13Three, o13Four, o14One, o14Two, o14Three, o14Four, o15One, o15Two, o15Three, o15Four, o16One, o16Two, o16Three, o16Four,
            o17One, o17Two, o17Three, o17Four, o18One, o18Two, o18Three, o18Four, o19One, o19Two, o19Three, o19Four, o20One, o20Two, o20Three, o20Four,
            o21One, o21Two, o21Three, o21Four, o22One, o22Two, o22Three, o22Four, o23One, o23Two, o23Three, o23Four, o24One, o24Two, o24Three, o24Four,
            o25One, o25Two, o25Three, o25Four, o26One, o26Two, o26Three, o26Four, o27One, o27Two, o27Three, o27Four, o28One, o28Two, o28Three, o28Four,
            o29One, o29Two, o29Three, o29Four, o30One, o30Two, o30Three, o30Four, o31One, o31Two, o31Three, o31Four, o32One, o32Two, o32Three, o32Four,
            o33One, o33Two, o33Three, o33Four, o34One, o34Two, o34Three, o34Four, o35One, o35Two, o35Three, o35Four, o36One, o36Two, o36Three, o36Four,
            o37One, o37Two, o37Three, o37Four, o38One, o38Two, o38Three, o38Four, o39One, o39Two, o39Three, o39Four, o40One, o40Two, o40Three, o40Four};
        for (int i = 0; i < 160; i++) {
            tempO.add(o[i]);
        }
        for (int i = 0; i < 10; i++) {
            int j = Integer.valueOf(tt[i].toString());
            for (int l = (j * 4); l < ((j * 4) + 4); l++) {
                options.add(tempO.get(l));
            }
        }
        return options;
    }

    public static ArrayList<String> answer() {
        answers = new ArrayList<String>();
        ArrayList<String> tempA = new ArrayList<String>();
        String[] a = new String[]{a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30,
            a31, a32, a33, a34, a35, a36, a37, a38, a39, a40};
        for (int i = 0; i < 40; i++) {
            tempA.add(a[i]);
        }
        for (int i = 0; i < 10; i++) {
            answers.add(tempA.get(Integer.valueOf(tt[i].toString())));
        }
        return answers;
    }
}
