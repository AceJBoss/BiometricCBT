package biometrics.cbt.ui.pages;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author JBoss
 */
public class QuestionTwo {

    static Object[] tt;
    static String q1 = "Pascal can be regarded as one of the following types of programming language";
    static String o1One = "Commercial";
    static String o1Two = "General Purpose";
    static String o1Three = "Scientific";
    static String o1Four = "Artificial Intelligence";
    static String a1 = "General Purpose";
    static String q2 = "Which of the following languages did Pascal derive its root from?";
    static String o2One = "COBOL";
    static String o2Two = "RPG/Z";
    static String o2Three = "ALGOL-60";
    static String o2Four = "LISP";
    static String a2 = "ALGOL-60";
    static String q3 = "Pascal can be regarded as a ________ type of programming language";
    static String o3One = "Object Oriented";
    static String o3Two = "Structured";
    static String o3Three = "Case Sensitive";
    static String o3Four = "Query generating";
    static String a3 = "Structured";
    static String q4 = "Pascal was named after ________ who lived between _______";
    static String o4One = "Blaise Pascal 1632-1662";
    static String o4Two = "Blaise Pascal 1623-1662";
    static String o4Three = "Brunnete Pascal 1832-1862";
    static String o4Four = "Brunnete Pascal 1662-1823";
    static String a4 = "Blaise Pascal 1623-1662";
    static String q5 = "The structure of a pascal program is made up of two sections namely ______ and _________";
    static String o5One = "Header and Statement";
    static String o5Two = "Declaration and Statement";
    static String o5Three = "Header and Block";
    static String o5Four = "Block and Statement";
    static String a5 = "Header and Block";
    static String q6 = "Which of following declaration of pascal's header is not correct?";
    static String o6One = "ProGram header (input, output);";
    static String o6Two = "program areaOfTriangle (i, o);";
    static String o6Three = "PROGRAM record (input, output);";
    static String o6Four = "PROGRAM permiter (i, o);";
    static String a6 = "PROGRAM record (input, output);";
    static String q7 = "All but one of the following is correct about pascal";
    static String o7One = "It is case sensitive";
    static String o7Two = "It is not case sensitive";
    static String o7Three = "It is compiled";
    static String o7Four = "It is translated";
    static String a7 = "It is case sensitive";
    static String q8 = "Which of the following is correct about the header of a pascal program";
    static String o8One = "It is divided into three sections";
    static String o8Two = "It is usually written on a single line";
    static String o8Three = "It starts with the keyword 'program' which is always written in capital";
    static String o8Four = "All of the above";
    static String a8 = "It is usually written on a single line";
    static String q9 = "The block of a pascal program is made up of two sections namely: ";
    static String o9One = "Header and Declaration";
    static String o9Two = "Declaration and Statement";
    static String o9Three = "Procedure and Function";
    static String o9Four = "Begin and End";
    static String a9 = "Declaration and Statement";
    static String q10 = "Which of the following is the correct order of declaration in pascal?";
    static String o10One = "Label, Constant, Variable, Type, Procedure, Function";
    static String o10Two = "Constant, Variable, Type, Procedure, Function";
    static String o10Three = "Label, Constant, Type, Variable, Procedure, Function";
    static String o10Four = "Label, Constant, Procedure, Function, Variable, Type";
    static String a10 = "Label, Constant, Type, Variable, Procedure, Function";
    static String q11 = "Every statement in pascal is terminated by __________";
    static String o11One = "A colon";
    static String o11Two = "A Semicolon";
    static String o11Three = "An apostrophe";
    static String o11Four = "A comma";
    static String a11 = "A Semicolon";
    static String q12 = "Which of the following correctly define an identifier?";
    static String o12One = "It is the name given to a program and its variables";
    static String o12Two = "It is the name given to any program element such as variables, constant, program name etc.";
    static String o12Three = "It is a predefined name given to program elements such as a constant, a variable etc.";
    static String o12Four = "It is the name given to program elements such as a constant, variable written in pascal case";
    static String a12 = "It is the name given to any program element such as variables, constant, program name etc.";
    static String q13 = "Which of the following is the correct way of writing comments in pascal";
    static String o13One = "(*comment*)";
    static String o13Two = "{comment}";
    static String o13Three = "('comment')";
    static String o13Four = "A and B";
    static String a13 = "A and B";
    static String q14 = "Which of the following declarations of a label is correct?";
    static String o14One = "Label 10;";
    static String o14Two = "Label myLab = 10;";
    static String o14Three = "Label myLab := 10;";
    static String o14Four = "All of the above";
    static String a14 = "Label 10;";
    static String q15 = "The main purpose of labels in a pascal program is ________";
    static String o15One = "To control program flow";
    static String o15Two = "To stop program execution";
    static String o15Three = "To give a title to the program";
    static String o15Four = "To make translation easy";
    static String a15 = "To control program flow";
    static String q16 = "Which of the following declarations of a variable is correct?";
    static String o16One = "VARIABLE ade = 35 : integer;";
    static String o16Two = "var ade : real;";
    static String o16Three = "VAR input : integer;";
    static String o16Four = "B and C";
    static String a16 = "var ade : real;";
    static String q17 = "Which of the following is correct about a constant?";
    static String o17One = "It is a program element whose value can be modified during program execution";
    static String o17Two = "It is a program element whose value won't change during program execution";
    static String o17Three = "It is a program element that is assigned value during execution";
    static String o17Four = "None of the above";
    static String a17 = "It is a program element whose value won't change during program execution";
    static String q18 = "Which of the following is true about a variable?";
    static String o18One = "Its value can't be modified during program execution";
    static String o18Two = "Its value can be modified during execution";
    static String o18Three = "It's always assigned value before execution";
    static String o18Four = "It can be declared during execution";
    static String a18 = "Its value can be modified during execution";
    static String q19 = "Which of the following declarations of a constant is correct?";
    static String o19One = "CONST myConst;";
    static String o19Two = "const CONSTANT = 30;";
    static String o19Three = "CONSTANT myConst = 35;";
    static String o19Four = "constant myConst;";
    static String a19 = "const CONSTANT = 30;";
    static String q20 = "Which of the following is correct about Type in pascal?";
    static String o20One = "It is declared immediately before constant declaration";
    static String o20Two = "It is used to make user defined declarations";
    static String o20Three = "It is always declared in capital";
    static String o20Four = "All of the above";
    static String a20 = "It is used to make user defined declarations";
    static String q21 = "The statement part of a pascal program starts with ________";
    static String o21One = "START";
    static String o21Two = "BEGIN;";
    static String o21Three = "BEGIN";
    static String o21Four = "START;";
    static String a21 = "BEGIN";
    static String q22 = "All but one of the following is correct about identifiers";
    static String o22One = "It can be alphanumeric";
    static String o22Two = "It can be separated by a special character";
    static String o22Three = "It must not begin with a number";
    static String o22Four = "It can not contain special characters";
    static String a22 = "It can be separated by a special character";
    static String q23 = "Which of the following isn't a valid identifier";
    static String o23One = "ade";
    static String o23Two = "area-Of-Circle";
    static String o23Three = "header";
    static String o23Four = "programme";
    static String a23 = "area-Of-Circle";
    static String q24 = "Which of the following is not among the pascal character set?";
    static String o24One = "^";
    static String o24Two = ":=";
    static String o24Three = "\\";
    static String o24Four = "..";
    static String a24 = "\\";
    static String q25 = "Which of the following is not a type of statement in pascal?";
    static String o25One = "Simple";
    static String o25Two = "Structured";
    static String o25Three = "Reference";
    static String o25Four = "Pointer";
    static String a25 = "Reference";
    static String q26 = "Which of the following is not a valid simple-type data in pascal?";
    static String o26One = "integer";
    static String o26Two = "real";
    static String o26Three = "array";
    static String o26Four = "boolean";
    static String a26 = "array";
    static String q27 = "Which of the following is true about integers?";
    static String o27One = "It can be separated by comma";
    static String o27Two = "It can contain decimal";
    static String o27Three = "It can't contain spaces";
    static String o27Four = "It can't be preceded by a sign";
    static String a27 = "It can't contain spaces";
    static String q28 = "Which of the following is not a valid integer";
    static String o28One = "25000.00";
    static String o28Two = "+10253";
    static String o28Three = "600";
    static String o28Four = "2300";
    static String a28 = "25000.00";
    static String q29 = "Which of the following data type can contain exponent?";
    static String o29One = "integer";
    static String o29Two = "array";
    static String o29Three = "real";
    static String o29Four = "char";
    static String a29 = "real";
    static String q30 = "Which of the following is not a valid real number?";
    static String o30One = "-15.0e9";
    static String o30Two = "15e-9";
    static String o30Three = "250.36";
    static String o30Four = "360";
    static String a30 = "15e-9";
    static String q31 = "Simple-type data is subdivided into _______ and _______";
    static String o31One = "Standard and structured";
    static String o31Two = "Standard and defined";
    static String o31Three = "Standard and user-defined";
    static String o31Four = "user-defined and structured";
    static String a31 = "Standard and user-defined";
    static String q32 = "Enumerated and Sub-range are types of _______ data type";
    static String o32One = "Structured";
    static String o32Two = "user-defined";
    static String o32Three = "boolean";
    static String o32Four = "String";
    static String a32 = "user-defined";
    static String q33 = "Set is one of ______ data type";
    static String o33One = "Structured";
    static String o33Two = "user-defined";
    static String o33Three = "boolean";
    static String o33Four = "String";
    static String a33 = "Structured";
    static String q34 = "Identify the wrong statement in the following pascal program\n"
            + "PROGRAM identifier(input, output);\n"
            + "BEGIN\n"
            + "write('Hello World!');\n"
            + "END.";
    static String o34One = "line one";
    static String o34Two = "line three";
    static String o34Three = "line four";
    static String o34Four = "None of the above";
    static String a34 = "None of the above";
    static String q35 = "What is the output of the pascal snippet below?\n"
            + "var pi = 3.142;\n"
            + "write('The value of pi is: 'pi);";
    static String o35One = "The value of pi is: 3.142";
    static String o35Two = "The value of pi is 3.142";
    static String o35Three = "The value of pi is:3.142";
    static String o35Four = "The program would return an error";
    static String a35 = "The program would return an error";
    static String q36 = "An expression is defined as ";
    static String o36One = "A collection of operands";
    static String o36Two = "A collection of operands joined by operators";
    static String o36Three = "A collection of algebraic terms";
    static String o36Four = "Addition of two or more operands";
    static String a36 = "A collection of operands joined by operators";
    static String q37 = "Which of the following is not a condition for an expression?";
    static String o37One = "Two successive operators are not permitted";
    static String o37Two = "An expression can consist of a single identifier used as a constant or variable";
    static String o37Three = "Constants must always be preceded by a variable";
    static String o37Four = "A function name can be used in place of a constant or variable identifier within an expression";
    static String a37 = "Constants must always be preceded by a variable";
    static String q38 = "Which of the following is not a type of statement in pascal?";
    static String o38One = "Simple statement";
    static String o38Two = "Conditional statement";
    static String o38Three = "Structured statement";
    static String o38Four = "Functional statement";
    static String a38 = "Functional statement";
    static String q39 = "Simple statements is used to do all but one of the following";
    static String o39One = "Assign a data item to a variable";
    static String o39Two = "Access a self contained computational module";
    static String o39Three = "write procedures";
    static String o39Four = "Transfer program control";
    static String a39 = "write procedures";
    static String q40 = "A procedure is accessed by ______";
    static String o40One = "A simple statement consisting of procedure name followed by a compulsory list of parameters";
    static String o40Two = "A structured statement consisting of procedure name followed by a compulsory list of parameters";
    static String o40Three = "A simple statement consisting of procedure name followed by an optional list of parameters";
    static String o40Four = "A compound statement consisting of procedure name followed by a compulsory list of parameters";
    static String a40 = "A simple statement consisting of procedure name followed by an optional list of parameters";

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
