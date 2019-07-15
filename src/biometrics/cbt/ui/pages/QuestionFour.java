package biometrics.cbt.ui.pages;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author JBoss
 */
public class QuestionFour {

    static Object[] tt;
    static String q1 = "Which of the following definition of an array is correct?";
    static String o1One = "It is a simple data type that stores data of the same data type";
    static String o1Two = "It is structured data type that stores data of different data type";
    static String o1Three = "It is a structured data type that stores data of the same data type";
    static String o1Four = "It is a simple data type that stores data of different data type";
    static String a1 = "It is a structured data type that stores data of the same data type";
    static String q2 = "All but one of the following is true about the data store in an array";
    static String o2One = "They are homogenous";
    static String o2Two = "The are ordered";
    static String o2Three = "The are added in ascending order";
    static String o2Four = "They can be modified";
    static String a2 = "The are added in ascending order";
    static String q3 = "The content of an array are accessed through their ________";
    static String o3One = "data stucture";
    static String o3Two = "index";
    static String o3Three = "assigned value";
    static String o3Four = "local parameter";
    static String a3 = "index";
    static String q4 = "Which of the following declarations of an array is not correct?";
    static String o4One = "VAR boy : array[1..10] of integer;";
    static String o4Two = "TYPE boy = array[1..10] of integer;";
    static String o4Three = "TYPE boy = array[15] of integer;";
    static String o4Four = "None of the above";
    static String a4 = "TYPE boy = array[15] of integer;";
    static String q5 = "Which of the following is not correct about an identifier declared under type declaration?";
    static String o5One = "It is a variable";
    static String o5Two = "It is a user defined data type";
    static String o5Three = "A variable must be created to use it";
    static String o5Four = "It must be declared as an array";
    static String a5 = "It must be declared as an array";
    static String q6 = "Which of the following declaration for the type declaration: TYPE student = array[1..10] of real; is correct?";
    static String o6One = "CONST male = array[1] of student;";
    static String o6Two = "VAR male : array of student;";
    static String o6Three = "VAR male: student;";
    static String o6Four = "CONST male = student;";
    static String a6 = "VAR male: student;";
    static String q7 = "All but one of the following is true about the elements of an array";
    static String o7One = "They are of the same data type";
    static String o7Two = "Their index starts from zero";
    static String o7Three = "The third element is accessed as arrayName[2]";
    static String o7Four = "The last element is accessed as arrayName[arrayLength]";
    static String a7 = "The last element is accessed as arrayName[arrayLength]";
    static String q8 = "Which of the following is true about the last element in an array?";
    static String o8One = "Its index is arrayLength-1";
    static String o8Two = "It can have a data type different from the data type of the array";
    static String o8Three = "Its value can not be modified";
    static String o8Four = "None of the above";
    static String a8 = "Its index is arrayLength-1";
    static String q9 = "Which of the following declaration is correct for a 3 x 3 matrice?";
    static String o9One = "VAR matrice = array[3 by 3] of integer;";
    static String o9Two = "VAR matrice : array[1..,..9] of integer;";
    static String o9Three = "VAR matrice : array[1..3,1..3] of integer;";
    static String o9Four = "VAR matrice = array[1..3,1..3] of integer;";
    static String a9 = "VAR matrice : array[1..3,1..3] of integer;";
    static String q10 = "_______ data type consists of an ordered sequence of identifiers each interpreted as an individual data item";
    static String o10One = "array";
    static String o10Two = "enumerated";
    static String o10Three = "subrange";
    static String o10Four = "record";
    static String a10 = "enumerated";
    static String q11 = "Which of the following declaration of enumerated data type is correct?";
    static String o11One = "Var name = enumeration(one,two,three,four);";
    static String o11Two = "VAR name : enum(one,two,three,four);";
    static String o11Three = "Type name = (one,two,three,four);";
    static String o11Four = "Type name = enum(one,two,three,four);";
    static String a11 = "Type name = (one,two,three,four);";
    static String q12 = "The ordinality of enumerated data type is ";
    static String o12One = "zero based";
    static String o12Two = "one based";
    static String o12Three = "two based";
    static String o12Four = "three based";
    static String a12 = "zero based";
    static String q13 = "All but one of the following is true about subrange data type";
    static String o13One = "It is a subset of a contiguous set";
    static String o13Two = "Its elements are ordered";
    static String o13Three = "Its elements are listed in a comma separated list";
    static String o13Four = "It cannot be applied to a real data type";
    static String a13 = "Its elements are listed in a comma separated list";
    static String q14 = "From the program segment below, determine the fourth element of the array\n"
            + "for i:= 0 to 10 do\n"
            + "number[i] := (i+1);";
    static String o14One = "3";
    static String o14Two = "4";
    static String o14Three = "5";
    static String o14Four = "9";
    static String a14 = "4";
    static String q15 = "An array is used to store a 4 x 4 matrice, which of the following would access the element in the 3rd row, 2nd column?";
    static String o15One = "matrice[3,2]";
    static String o15Two = "matrice[2,3]";
    static String o15Three = "matrice[2,1]";
    static String o15Four = "matrice[4,3]";
    static String a15 = "matrice[2,1]";
    static String q16 = "Determine the output of the program segment below\n"
            + "sum :=1;\n"
            + "for i:= 1 to 10 do\n"
            + "sum := sum+i;\n"
            + "write(sum);";
    static String o16One = "54";
    static String o16Two = "56";
    static String o16Three = "The program would print 2,4,7,11,16,22,29,37,46,55 consecutively";
    static String o16Four = "The program would print 55 once";
    static String a16 = "56";
    static String q17 = "In which of the following iterative structures would the counter be automatically incremented?";
    static String o17One = "Repeat..until";
    static String o17Two = "while..do";
    static String o17Three = "for..do";
    static String o17Four = "do..while";
    static String a17 = "for..do";
    static String q18 = "Which of the following data types can be used to store data of different data type?";
    static String o18One = "array";
    static String o18Two = "integer";
    static String o18Three = "string";
    static String o18Four = "record";
    static String a18 = "record";
    static String q19 = "Which of the following is not true about an array and a record data type?";
    static String o19One = "They are both structured data type";
    static String o19Two = "Array elements are retrieved by their index while record fields are retrieved by their name";
    static String o19Three = "Their content is homogenous";
    static String o19Four = "They are both temporary storage";
    static String a19 = "Their content is homogenous";
    static String q20 = "Which of the following is not true about record?";
    static String o20One = "The data type of each of the fields must be specified";
    static String o20Two = "Different fields must not have the same data type";
    static String o20Three = "Its declaration is terminated with an end without a begin";
    static String o20Four = "B and C";
    static String a20 = "Different fields must not have the same data type";
    static String q21 = "A record named student has fields matric,name,mail and cgpa. Which of the following would be used to access the name field?";
    static String o21One = "record[2]";
    static String o21Two = "record.name";
    static String o21Three = "student.name";
    static String o21Four = "student.record[name]";
    static String a21 = "student.name";
    static String q22 = "In the statement myRecord.field1.field2, field2 is said to be";
    static String o22One = "An embedded field";
    static String o22Two = "An attached field";
    static String o22Three = "A sub-field";
    static String o22Four = "Category B field";
    static String a22 = "A sub-field";
    static String q23 = "The for loop is used to process an array while the ______ is used to process a record";
    static String o23One = "while loop";
    static String o23Two = "with structure";
    static String o23Three = "repeat..until loop";
    static String o23Four = "field locator";
    static String a23 = "with structure";
    static String q24 = "Which of the following structures is correct?";
    static String o24One = "with recordName do statement;";
    static String o24Two = "for recordName do statement;";
    static String o24Three = "while recordName do statement;";
    static String o24Four = "All of the above";
    static String a24 = "with recordName do statement;";
    static String q25 = "The data type that is used to store many records is _______";
    static String o25One = "array";
    static String o25Two = "record array";
    static String o25Three = "A file";
    static String o25Four = "enumeration";
    static String a25 = "A file";
    static String q26 = "There are two types of file in pascal, these are ";
    static String o26One = "Temporary and permanent file";
    static String o26Two = "External and internal file";
    static String o26Three = "Assigned and Un-Assigned file";
    static String o26Four = "A and B";
    static String a26 = "A and B";
    static String q27 = "Files that can be saved on a disk or a tape is known as ";
    static String o27One = "Temporary file";
    static String o27Two = "Permanent file";
    static String o27Three = "Internal file";
    static String o27Four = "Assigned file";
    static String a27 = "Permanent file";
    static String q28 = "All but one of the following is true about a file";
    static String o28One = "It can be used to store any data type";
    static String o28Two = "It can be saved permanently on a secondary storage";
    static String o28Three = "It can be embedded in another file";
    static String o28Four = "Its content can be modified";
    static String a28 = "It can be embedded in another file";
    static String q29 = "Which of the following declarations of a file is correct?";
    static String o29One = "TYPE spf : file of integer;";
    static String o29Two = "VAR spf : file of integers;";
    static String o29Three = "var spf : file of real;";
    static String o29Four = "All of the above";
    static String a29 = "var spf : file of real;";
    static String q30 = "Which of the following is correct about the efficiency of programming languages?\n"
            + "ML(Machine Lang.),AL(Assembly Lang.),HLL(High Level Lang.)";
    static String o30One = "ML<AL<HLL";
    static String o30Two = "HLL>AL>ML";
    static String o30Three = "ML>AL>HLL";
    static String o30Four = "HLL>ML>AL";
    static String a30 = "ML>AL>HLL";
    static String q31 = "Which of the following is correct about the portability of programming languages?\n"
            + "ML(Machine Lang.),AL(Assembly Lang.),HLL(High Level Lang.)";
    static String o31One = "ML<AL>HLL";
    static String o31Two = "HLL>AL>ML";
    static String o31Three = "ML>AL>HLL";
    static String o31Four = "HLL>ML>AL";
    static String a31 = "HLL>AL>ML";
    static String q32 = "Which of the following is not a category of file in pascal?";
    static String o32One = "String embedded";
    static String o32Two = "Untyped binary";
    static String o32Three = "Typed binary";
    static String o32Four = "Text File";
    static String a32 = "String embedded";
    static String q33 = "The file type that can be used to store essentially anything is";
    static String o33One = "String embedded";
    static String o33Two = "Untyped binary";
    static String o33Three = "Typed binary";
    static String o33Four = "None of the above";
    static String a33 = "Untyped binary";
    static String q34 = "To create a file that would store ONLY integers, the type of file should be";
    static String o34One = "String embedded";
    static String o34Two = "Untyped binary";
    static String o34Three = "Typed binary";
    static String o34Four = "Text file";
    static String a34 = "Typed binary";
    static String q35 = "Which of the following procedures can be called to open a file?";
    static String o35One = "Reset";
    static String o35Two = "Rewrite";
    static String o35Three = "Append";
    static String o35Four = "All of the above";
    static String a35 = "All of the above";
    static String q36 = "To write to a file we use the procedure";
    static String o36One = "Assign";
    static String o36Two = "Reset";
    static String o36Three = "writeln";
    static String o36Four = "put to";
    static String a36 = "writeln";
    static String q37 = "Which of the following is used to flush any written data into a file?";
    static String o37One = "Assign";
    static String o37Two = "Flush";
    static String o37Three = "CloseFile";
    static String o37Four = "Aprove";
    static String a37 = "CloseFile";
    static String q38 = "Which of the following is not true about TextFile and File of character?";
    static String o38One = "File of char stores a simple sequence of character while text file can save strings";
    static String o38Two = "Only a single character must be written to a file of char at a time while strings can be written to a text File";
    static String o38Three = "Any data type can be written to bothe files";
    static String o38Four = "They can be saved permanently on a secondary storage";
    static String a38 = "Any data type can be written to bothe files";
    static String q39 = "Which of the following is true about the rewrite procedure of a file?";
    static String o39One = "It reads the content of a file and open it for subsequent write operation";
    static String o39Two = "It clears the content of a file and open it for subsequent write operation";
    static String o39Three = "It clears the content of a file but does not open it for writing";
    static String o39Four = "It reads the content of a file but does not open it for writing";
    static String a39 = "It clears the content of a file and open it for subsequent write operation";
    static String q40 = "Which of the following is true about the append procedure of a file?";
    static String o40One = "It reads the content of a file and then write to it";
    static String o40Two = "It clears the content of a file and then write to it";
    static String o40Three = "It writes to a file clearing each line after every write operation";
    static String o40Four = "It clears the content of a file and open it for write operation";
    static String a40 = "It reads the content of a file and then write to it";

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
