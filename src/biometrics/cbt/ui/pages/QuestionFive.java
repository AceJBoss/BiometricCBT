package biometrics.cbt.ui.pages;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author JBoss
 */
public class QuestionFive {

    static Object[] tt;
    static String q1 = "Which of the following modes of an untyped binary file allows both read and write operation?";
    static String o1One = "fmOpen";
    static String o1Two = "fmRead";
    static String o1Three = "fmOpenRead";
    static String o1Four = "fmOpenReadWrite";
    static String a1 = "fmOpenReadWrite";
    static String q2 = "Which of the following is used to write to an untyped binary file";
    static String o2One = "Assign";
    static String o2Two = "Block Read";
    static String o2Three = "BlockWrite";
    static String o2Four = "B and C";
    static String a2 = "BlockWrite";
    static String q3 = "Which of the following can't be ragarded as a file in pascal?";
    static String o3One = "A keyboard";
    static String o3Two = "A modem";
    static String o3Three = "A touch screen";
    static String o3Four = "None of the above";
    static String a3 = "None of the above";
    static String q4 = "Which of the following file procedures is used to check for end of file?";
    static String o4One = "FilePos";
    static String o4Two = "EOF";
    static String o4Three = "CheckEnd";
    static String o4Four = "FileSize";
    static String a4 = "CheckEnd";
    static String q5 = "Which of the following file procedures is used to set file position to the end of line?";
    static String o5One = "EOF";
    static String o5Two = "SeekEOLn";
    static String o5Three = "FilePos";
    static String o5Four = "Flush";
    static String a5 = "SeekEOLn";
    static String q6 = "Which of the following file functions return the result of last file IO operation?";
    static String o6One = "Flush";
    static String o6Two = "IOResult";
    static String o6Three = "GetIOResult";
    static String o6Four = "SeekIO";
    static String a6 = "IOResult";
    static String q7 = "Which of the following is not a concept of object oriented programming?";
    static String o7One = "Encapsulation";
    static String o7Two = "Inheritance";
    static String o7Three = "Heuristic";
    static String o7Four = "Polymorphism";
    static String a7 = "Heuristic";
    static String q8 = "Visual components on a form in delphi pascal are ";
    static String o8One = "Class types";
    static String o8Two = "Objects of a class";
    static String o8Three = "Methods";
    static String o8Four = "Recursive functions";
    static String a8 = "Objects of a class";
    static String q9 = "When a variable is created for a class in object oriented pascal, it is known as ";
    static String o9One = "Method";
    static String o9Two = "Object";
    static String o9Three = "Class variable";
    static String o9Four = "None of the above";
    static String a9 = "Object";
    static String q10 = "Every class in delphi pascal has a default constructor ";
    static String o10One = "Call";
    static String o10Two = "Create";
    static String o10Three = "Assign";
    static String o10Four = "Initialize";
    static String a10 = "Create";
    static String q11 = "To define a function that has been declared in a class in delphi pascal, we access the function by writing";
    static String o11One = "ClassName(functionName)";
    static String o11Two = "ClassName[functionName]";
    static String o11Three = "ClassName.functionName";
    static String o11Four = "All of the above";
    static String a11 = "ClassName.functionName";
    static String q12 = "All but one of the following is true about overloaded methods in delphi pascal";
    static String o12One = "They are methods with the same name but diffenrent declaration";
    static String o12Two = "Overload keyword must be appended to the name of the methods";
    static String o12Three = "The methods can have the same parameter list";
    static String o12Four = "The compiler would call the appropriate method depending on parameter list";
    static String a12 = "The methods can have the same parameter list";
    static String q13 = "Which of the following is not true about methods in delphi pascal?";
    static String o13One = "Parameters can be omitted during method call";
    static String o13Two = "The self keyword is used to access any object within the body of the method";
    static String o13Three = "The method would be referenced by its name during call";
    static String o13Four = "Class methods are marked by the class keyword";
    static String a13 = "The self keyword is used to access any object within the body of the method";
    static String q14 = "All but one of the following is true about OnMouseDown and OnClick in delphi pascal";
    static String o14One = "They are both events";
    static String o14Two = "They are both used to determine when a mouse was clicked";
    static String o14Three = "They can both monitor (by taking as a parameter) the position of mouse click";
    static String o14Four = "None of the above";
    static String a14 = "They can both monitor (by taking as a parameter) the position of mouse click";
    static String q15 = "The concept of object oriented programming that deals with data hiding is_____";
    static String o15One = "Inheritance";
    static String o15Two = "Encapsulation";
    static String o15Three = "Polymorphism";
    static String o15Four = "Overriding";
    static String a15 = "Encapsulation";
    static String q16 = "Which of the following is not an access specifier?";
    static String o16One = "public";
    static String o16Two = "private";
    static String o16Three = "protected";
    static String o16Four = "internal";
    static String a16 = "internal";
    static String q17 = "Which of the following access specifiers denotes fields that are not accessible outside the unit that declares the class?";
    static String o17One = "public";
    static String o17Two = "private";
    static String o17Three = "internal";
    static String o17Four = "protected";
    static String a17 = "private";
    static String q18 = "Which of the following access specifiers indicate methods and fields accessible only to the class that dclares it and its subclasses?";
    static String o18One = "public";
    static String o18Two = "private";
    static String o18Three = "protected";
    static String o18Four = "internal";
    static String a18 = "protected";
    static String q19 = "Which of the following access specifiers denotes fields and methods that are freely accessible from any other portion of a program?";
    static String o19One = "public";
    static String o19Two = "private";
    static String o19Three = "protected";
    static String o19Four = "internal";
    static String a19 = "public";
    static String q20 = "A button in a form has a caption and an EditText has text, these are known as";
    static String o20One = "properties";
    static String o20Two = "enum";
    static String o20Three = "methods";
    static String o20Four = "functions";
    static String a20 = "properties";
    static String q21 = "Which of the following would be used to write 'SUBMIT' on a button declared as submitButton?";
    static String o21One = "submitButton.caption := 'SUBMIT';";
    static String o21Two = "submitButton.text := 'SUBMIT';";
    static String o21Three = "submitButton[caption] = 'SUBMIT';";
    static String o21Four = "submitButton.append('SUBMIT');";
    static String a21 = "submitButton.caption := 'SUBMIT';";
    static String q22 = "Which of the following would be used to write the string 'supply your username' in an editText declared as username?";
    static String o22One = "username.setText('supply your username');";
    static String o22Two = "username.append('supply your username');";
    static String o22Three = "username.text := 'supply your username';";
    static String o22Four = "username.caption := 'supply your username';";
    static String a22 = "username.text := 'supply your username';";
    static String q23 = "Which of the following would be used to write the string 'page one' on the status bar of a form (statusForm) declared as statusBar?";
    static String o23One = "statusForm.Text := 'page one';";
    static String o23Two = "statusForm.SetText('page one');";
    static String o23Three = "statusForm.statusBar.SetText('page one');";
    static String o23Four = "statusForm.statusBar.SimpleText := 'page one';";
    static String a23 = "statusForm.statusBar.SimpleText := 'page one';";
    static String q24 = "Which of the following is not correct about a constructor?";
    static String o24One = "It is a method";
    static String o24Two = "It is created to allocate memory for an instance of a class";
    static String o24Three = "Its standard name is Create";
    static String o24Four = "It must be declared before any other method";
    static String a24 = "It must be declared before any other method";
    static String q25 = "Which of the following is not correct about a destructor?";
    static String o25One = "It is a method";
    static String o25Two = "It is called to free allocated memory";
    static String o25Three = "It can't be used without the constructor";
    static String o25Four = "It is declared as Destroy by default";
    static String a25 = "It can't be used without the constructor";
    static String q26 = "Which of the following procedures is used in Delphi5 to free an object and set its reference to nil";
    static String o26One = "FreeUp";
    static String o26Two = "FreeAndNull";
    static String o26Three = "setNull";
    static String o26Four = "FreeAndNil";
    static String a26 = "FreeAndNil";
    static String q27 = "Which of the following is true about objects in delphi?";
    static String o27One = "It creates an instance of a class";
    static String o27Two = "It is registered in memory as a constant";
    static String o27Three = "It contains a reference or a pointer indicating the memory location it has been stored";
    static String o27Four = "It can be referenced from outside the class when it's declared private";
    static String a27 = "It contains a reference or a pointer indicating the memory location it has been stored";
    static String q28 = "Which of the following is true about the components placed on a form?";
    static String o28One = "The instance of their objects is created automatically";
    static String o28Two = "Their instances are built automatically by the Delphi library";
    static String o28Three = "They must all receive a caption";
    static String o28Four = "All of the above";
    static String a28 = "Their instances are built automatically by the Delphi library";
    static String q29 = "Which of the following methods is used to dispose an object in delphi pascal once we are done using it?";
    static String o29One = "dispose";
    static String o29Two = "free";
    static String o29Three = "reAssign";
    static String o29Four = "drop";
    static String a29 = "free";
    static String q30 = "Which of the following is not a memory management rule in delphi pascal?";
    static String o30One = "Every object must be created before it can be used";
    static String o30Two = "Every object must be used only once";
    static String o30Three = "Every object must be destroyed after use";
    static String o30Four = "Every object must be destroyed only once";
    static String a30 = "Every object must be used only once";
    static String q31 = "Which of the following function is used to check whether an object is nil in delphi pascal?";
    static String o31One = "Assigned";
    static String o31Two = "Free";
    static String o31Three = "Destroy";
    static String o31Four = "Monitor";
    static String a31 = "Assigned";
    static String q32 = "Which of the following declarations is correct for a class1 that wishes to inherit another class2?";
    static String o32One = "VAR class1 : class2";
    static String o32Two = "TYPE class1 = class2";
    static String o32Three = "TYPE class1 = (class)class2";
    static String o32Four = "VAR class1 : (class)class2";
    static String a32 = "TYPE class1 = (class)class2";
    static String q33 = "Which of the following is true about pascal?";
    static String o33One = "It is a case sensitive language";
    static String o33Two = "It is a strongly typed language";
    static String o33Three = "It can not be applied GUI programming";
    static String o33Four = "It is only used in learning";
    static String a33 = "It is a strongly typed language";
    static String q34 = "Which of the following keyword is used to override a late-bound method in a descendant class?";
    static String o34One = "bind";
    static String o34Two = "override";
    static String o34Three = "super";
    static String o34Four = "assign";
    static String a34 = "override";
    static String q35 = "In which of the following method types can we override a late-bound method in a descendant class?";
    static String o35One = "static method";
    static String o35Two = "dynamic method";
    static String o35Three = "virtual method";
    static String o35Four = "B and C";
    static String a35 = "B and C";
    static String q36 = "Which of the following method types would remain late-bound?";
    static String o36One = "static method";
    static String o36Two = "virtual method";
    static String o36Three = "functional method";
    static String o36Four = "un-assigned method";
    static String a36 = "virtual method";
    static String q37 = "Which of the following keyword is not connected to exception handling?";
    static String o37One = "try";
    static String o37Two = "except";
    static String o37Three = "catch";
    static String o37Four = "raise";
    static String a37 = "catch";
    static String q38 = "Which of the following keywords is used to specify block of codes that must always be executed in exception handling?";
    static String o38One = "try";
    static String o38Two = "finally";
    static String o38Three = "catch";
    static String o38Four = "raise";
    static String a38 = "finally";
    static String q39 = "The exception generated when a user attempts to divide by zero is";
    static String o39One = "DivideByZeroException";
    static String o39Two = "EDivByZero";
    static String o39Three = "NullPointerException";
    static String o39Four = "InputMismatchException";
    static String a39 = "EDivByZero";
    static String q40 = "The computer program that is used to test a written program for possible error(s) is called ________";
    static String o40One = "A tester";
    static String o40Two = "A debugger";
    static String o40Three = "A compiler";
    static String o40Four = "A checker";
    static String a40 = "A debugger";

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
