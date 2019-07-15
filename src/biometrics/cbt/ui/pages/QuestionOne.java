package biometrics.cbt.ui.pages;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author JBoss
 */
public class QuestionOne {

    protected static ArrayList<String> questions, answers;
    static Object[] tt;
    static String q1 = "The computer software that translates a high level language to a machine language is a _____________";
    static String o1One = "translator";
    static String o1Two = "compiler";
    static String o1Three = "interpreter";
    static String o1Four = "all of the above";
    static String a1 = "all of the above";
    static String q2 = "A compiler converts a computer program otherwise known as _________ into an equivalent machine code";
    static String o2One = "object code";
    static String o2Two = "high level code";
    static String o2Three = "source code";
    static String o2Four = "byte code";
    static String a2 = "source code";
    static String q3 = "A compiler is a ________";
    static String o3One = "hardware";
    static String o3Two = "software";
    static String o3Three = "machine ware";
    static String o3Four = "people ware";
    static String a3 = "software";
    static String q4 = "Which of the following is not a characteristic of machine language";
    static String o4One = "It is portable";
    static String o4Two = "It is cumbersome";
    static String o4Three = "It is not easy to debug";
    static String o4Four = "It wastes time";
    static String a4 = "It is portable";
    static String q5 = "Which of the following programming languages is the most efficient?";
    static String o5One = "Assembly Language";
    static String o5Two = "Machine Language";
    static String o5Three = "High Level Language";
    static String o5Four = "Very High Level Language";
    static String a5 = "Machine Language";
    static String q6 = "Which of the following is not a high level language?";
    static String o6One = "Ada";
    static String o6Two = "Cobol";
    static String o6Three = "PASCAL";
    static String o6Four = "None of the above";
    static String a6 = "None of the above";
    static String q7 = "Assembly languages are converted to machine language by means of _________";
    static String o7One = "assembler";
    static String o7Two = "interpreter";
    static String o7Three = "compiler";
    static String o7Four = "A and B above";
    static String a7 = "assembler";
    static String q8 = "Which of the following is not a programming tool?";
    static String o8One = "Decision table";
    static String o8Two = "flowchart";
    static String o8Three = "pseudo code";
    static String o8Four = "None of the above";
    static String a8 = "None of the above";
    static String q9 = "Machine Langugage is made up of _______";
    static String o9One = "special characters";
    static String o9Two = "bits";
    static String o9Three = "subsidiary of assembly codes";
    static String o9Four = "english-like statements";
    static String a9 = "bits";
    static String q10 = "Assembly language is made up of _______";
    static String o10One = "bits";
    static String o10Two = "special characters";
    static String o10Three = "Mneumonics";
    static String o10Four = "English-like statements";
    static String a10 = "Mneumonics";
    static String q11 = "What is the full meaning of ALU?";
    static String o11One = "American Localization Union";
    static String o11Two = "Arithmetic and Logic Unit";
    static String o11Three = "Assistance Logical Unit";
    static String o11Four = "Arithmetic Lexical Unit";
    static String a11 = "Arithmetic and Logic Unit";
    static String q12 = "The computer system is made up of the input, output and ________ unit";
    static String o12One = "logical unit";
    static String o12Two = "control unit";
    static String o12Three = "process unit";
    static String o12Four = "all of the above";
    static String a12 = "process unit";
    static String q13 = "Which of the following can't be regarded as a computer machine?";
    static String o13One = "I-Pad";
    static String o13Two = "calculator";
    static String o13Three = "Wrist watch";
    static String o13Four = "palmtops";
    static String a13 = "Wrist watch";
    static String q14 = "The native language of the computer system is the _________ which is made up of _________";
    static String o14One = "Assembly language, special characters";
    static String o14Two = "Machine Language, 0s and 1s";
    static String o14Three = "Machine Language, special characters";
    static String o14Four = "None of the above";
    static String a14 = "Machine Language, 0s and 1s";
    static String q15 = "Which of the following statements is true?";
    static String o15One = "The human brain is just as important as the computer system";
    static String o15Two = "The human is more intelligent that the computer system";
    static String o15Three = "The human brain is not as intelligent as the computer system";
    static String o15Four = "The human brain when compared with the computer system is not intelligent";
    static String a15 = "The human is more intelligent that the computer system";
    static String q16 = "Which of the following correctly define an algorithm?";
    static String o16One = "It is the sequential steps of solving a computational task";
    static String o16Two = "It is the methods involved in solving a programming problem";
    static String o16Three = "It is diagramatic/graphical representation of a computer program";
    static String o16Four = "It is the sequential steps of solving a computational task written in any language";
    static String a16 = "It is the sequential steps of solving a computational task written in any language";
    static String q17 = "The terminal symbol of a flowchart is a/an ________";
    static String o17One = "parallelogram";
    static String o17Two = "ellipse";
    static String o17Three = "rhombus";
    static String o17Four = "kite";
    static String a17 = "ellipse";
    static String q18 = "A flowchart is a _________";
    static String o18One = "diagram";
    static String o18Two = "graphical representation of an algorithm";
    static String o18Three = "diagramatic representation of a computer program";
    static String o18Four = "method of debugging a computer program";
    static String a18 = "graphical representation of an algorithm";
    static String q19 = "Which of the following is not a type of computer?";
    static String o19One = "Hybrid computer";
    static String o19Two = "Conceptual computer";
    static String o19Three = "Analog computer";
    static String o19Four = "Digital computer";
    static String a19 = "Conceptual computer";
    static String q20 = "The input/output symbol of a flowchart is _________";
    static String o20One = "kite";
    static String o20Two = "rhombus";
    static String o20Three = "parallelogram";
    static String o20Four = "rectangle";
    static String a20 = "parallelogram";
    static String q21 = "Which of the following is not an advantage of high level language?";
    static String o21One = "uniformity";
    static String o21Two = "simplicity";
    static String o21Three = "portability";
    static String o21Four = "dependency";
    static String a21 = "dependency";
    static String q22 = "A pascal program is _________";
    static String o22One = "Assembled";
    static String o22Two = "Interpreted";
    static String o22Three = "Compiled";
    static String o22Four = "Coded";
    static String a22 = "Compiled";
    static String q23 = "The major difference between a compiler and a translator is that";
    static String o23One = "A compiler translates the whole source code at once while the translator translates line by line";
    static String o23Two = "A compiler translates high level languages to machine language while translator is any software that translates to machine language";
    static String o23Three = "A compiler translates very fast while a translator translates slowly";
    static String o23Four = "A translator is faster than a compiler";
    static String a23 = "A compiler translates high level languages to machine language while translator is any software that translates to machine language";
    static String q24 = "Which of the following is not a charateristic of programming languages?";
    static String o24One = "It has a vocabulary that consists of all alphabet";
    static String o24Two = "It has a structure that contains keywords, expressions and statements";
    static String o24Three = "It has syntax rule forming statements";
    static String o24Four = "Does not require a translator for the compter to understand it";
    static String a24 = "Does not require a translator for the compter to understand it";
    static String q25 = "The difference between a compiler and an interpreter is that";
    static String o25One = "A compiler is not faster than an interpreter";
    static String o25Two = "A compiler translates source code at once while the interpreter translates line by line";
    static String o25Three = "An interpreter translates high level language while compilers translates very high level language";
    static String o25Four = "A and B above";
    static String a25 = "A compiler translates source code at once while the interpreter translates line by line";
    static String q26 = "The information displayed on the VDU is known as __________";
    static String o26One = "hard copy";
    static String o26Two = "human copy";
    static String o26Three = "soft copy";
    static String o26Four = "visual copy";
    static String a26 = "soft copy";
    static String q27 = "The full meaning of RAM is ___________";
    static String o27One = "Read Accessing Memory";
    static String o27Two = "Random Access Memory";
    static String o27Three = "Radiation Allowed Memory";
    static String o27Four = "None of the above";
    static String a27 = "Random Access Memory";
    static String q28 = "Which of the following is regarded as a volatile memory?";
    static String o28One = "RAM";
    static String o28Two = "ROM";
    static String o28Three = "EEPROM";
    static String o28Four = "APROM";
    static String a28 = "RAM";
    static String q29 = "Information saved on the ROM";
    static String o29One = "Is lost on power loss";
    static String o29Two = "Is saved permanently and cannot be altered";
    static String o29Three = "Is saved permanently but can be modified";
    static String o29Four = "Is saved temporarily and can be altered";
    static String a29 = "Is saved permanently and cannot be altered";
    static String q30 = "Which of the following is not a secondary memory?";
    static String o30One = "Flash drive";
    static String o30Two = "Magnetic tape";
    static String o30Three = "Hard disk";
    static String o30Four = "RAM";
    static String a30 = "RAM";
    static String q31 = "The part of the computer system that controls the activities of all other units is ________";
    static String o31One = "RAM";
    static String o31Two = "Hard disk";
    static String o31Three = "CPU";
    static String o31Four = "Monitor";
    static String a31 = "CPU";
    static String q32 = "The VDU is also known as ________";
    static String o32One = "Monitor";
    static String o32Two = "Graphical unit";
    static String o32Three = "GDU";
    static String o32Four = "Visual monitor adapter";
    static String a32 = "Monitor";
    static String q33 = "Which of the following is not part of the processing unit of the computer system?";
    static String o33One = "Registers";
    static String o33Two = "Control Unit";
    static String o33Three = "Arithmetic Logical Unit";
    static String o33Four = "Visual Display Unit";
    static String a33 = "Visual Display Unit";
    static String q34 = "The part of the computer system that can be seen and felt is the _______";
    static String o34One = "software";
    static String o34Two = "hardware";
    static String o34Three = "people ware";
    static String o34Four = "user ware";
    static String a34 = "hardware";
    static String q35 = "Computer programs are written majorly to _________";
    static String o35One = "control the affairs of the computer system";
    static String o35Two = "help human";
    static String o35Three = "change how the computer perform its functions";
    static String o35Four = "Enhance the functionality of the computer system";
    static String a35 = "control the affairs of the computer system";
    static String q36 = "Which of the following is not a hardware?";
    static String o36One = "Keyboard";
    static String o36Two = "RAM";
    static String o36Three = "Operating System";
    static String o36Four = "Printer";
    static String a36 = "Operating System";
    static String q37 = "The information produced by a printer is known as ________";
    static String o37One = "softcopy";
    static String o37Two = "hardcopy";
    static String o37Three = "intermediate copy";
    static String o37Four = "proof reading";
    static String a37 = "hardcopy";
    static String q38 = "High level languages are translated into machine language because";
    static String o38One = "Machine language is more portable than high level language";
    static String o38Two = "The computer does not understand a high level language";
    static String o38Three = "High level language contains special characters";
    static String o38Four = "Machine Language is not easy to debug";
    static String a38 = "The computer does not understand a high level language";
    static String q39 = "Which of the following is not a characteristic of an algorithm?";
    static String o39One = "It must be precise";
    static String o39Two = "It must not be too lengthy";
    static String o39Three = "It must be finite";
    static String o39Four = "It must have an input and one or more output";
    static String a39 = "It must not be too lengthy";
    static String q40 = "Which of the following must be represented only once in a flowchart?";
    static String o40One = "decision symbol";
    static String o40Two = "terminal symbol";
    static String o40Three = "input/output symbol";
    static String o40Four = "process symbol";
    static String a40 = "terminal symbol";
    static String q41 = "Which of the following is not a basic component of the computer system?";
    static String o41One = "Main Memory";
    static String o41Two = "Mass Memory";
    static String o41Three = "Central Processing Unit";
    static String o41Four = "None of the above";
    static String a41 = "None of the above";
    static String q42 = "The unit of the computer that converts user's information to computer understandable form and transfer it to memory is the ____________";
    static String o42One = "Central Processing Unit";
    static String o42Two = "Input Unit";
    static String o42Three = "Output Unit";
    static String o42Four = "Main Memory";
    static String a42 = "Input Unit";
    static String q43 = "The unit of the computer that converts computer messages & results of a computer operation to a user understandable form is the _________";
    static String o43One = "Central Processing Unit";
    static String o43Two = "Input Unit";
    static String o43Three = "Output Unit";
    static String o43Four = "Main Memory";
    static String a43 = "Output Unit";
    static String q44 = "The type of computer which measure changes in continuous physical or electrical states is __________";
    static String o44One = "Analog Computer";
    static String o44Two = "Digital Computer";
    static String o44Three = "Conceptual Computer";
    static String o44Four = "Hybrid Computer";
    static String a44 = "Analog Computer";
    static String q45 = "The type of computer that perform calculation by counting numbers which are represented in discrete states of the computer's electronic circuitry is ________";
    static String o45One = "Analog Computer";
    static String o45Two = "Digital Computer";
    static String o45Three = "Conceptual Computer";
    static String o45Four = "Hybrid Computer";
    static String a45 = "Digital Computer";
    static String q46 = "A memory device which does not lose data on power loss is known as a ________";
    static String o46One = "Volatile Memory";
    static String o46Two = "Non Volatile Memory";
    static String o46Three = "Main Memory";
    static String o46Four = "Cache Memory";
    static String a46 = "Non Volatile Memory";
    static String q47 = "Which of the following is not a characteristic of the main memory?";
    static String o47One = "It is relatively cheap";
    static String o47Two = "It has a fast access time";
    static String o47Three = "It has a relatively large size";
    static String o47Four = "None of the above";
    static String a47 = "It has a relatively large size";
    static String q48 = "Which of the following is a characteristic of the mass memory";
    static String o48One = "It is relatively cheap";
    static String o48Two = "It has fast access time";
    static String o48Three = "It has a relatively large size";
    static String o48Four = "None of the above";
    static String a48 = "It has a relatively large size";
    static String q49 = "The Central Processing Unit is made up of all but one of the following";
    static String o49One = "Control Unit";
    static String o49Two = "Mass Memory";
    static String o49Three = "Registers";
    static String o49Four = "Arithmetic and Logic Unit";
    static String a49 = "Mass Memory";
    static String q50 = "The part of the computer system which execute logical operations is known as _______";
    static String o50One = "Random Access Memory";
    static String o50Two = "Central Processing Unit";
    static String o50Three = "Arithmetic and Logic Unit";
    static String o50Four = "B and C";
    static String a50 = "B and C";
    static String q51 = "The type of memory whose size is usually in few kilobytes that acts as a temporary holding area for instruction and data is known as _______";
    static String o51One = "Random Access Memory";
    static String o51Two = "Register";
    static String o51Three = "Mass Memory";
    static String o51Four = "Logical Memory";
    static String a51 = "Register";
    static String q52 = "Which of the following is not one of the broad categories of software?";
    static String o52One = "Translators";
    static String o52Two = "System Software";
    static String o52Three = "Utility Program";
    static String o52Four = "Application Software";
    static String a52 = "Utility Program";
    static String q53 = "The type of software which manages computer resources such as processor and memories is the ______?";
    static String o53One = "Translators";
    static String o53Two = "System Software";
    static String o53Three = "Utility Program";
    static String o53Four = "Application Software";
    static String a53 = "System Software";
    static String q54 = "Windows 8 is regarded as ________ type of operating system?";
    static String o54One = "Multi-Tier Operating System";
    static String o54Two = "Network Operating System";
    static String o54Three = "Single User Operating System";
    static String o54Four = "Multi-User Operating System";
    static String a54 = "Single User Operating System";
    static String q55 = "Operating Systems are classified into all but one of the following types";
    static String o55One = "Multi-Tier Operating System";
    static String o55Two = "Network Operating System";
    static String o55Three = "Single User Operating System";
    static String o55Four = "Multi-User Operating System";
    static String a55 = "Multi-Tier Operating System";
    static String q56 = "Utility programs is a type of _________";
    static String o56One = "Translators";
    static String o56Two = "System Software";
    static String o56Three = "Compiler";
    static String o56Four = "Application Software";
    static String a56 = "Application Software";
    static String q57 = "Which of the following is not a utility program";
    static String o57One = "Lotus 1";
    static String o57Two = "PartitionManager";
    static String o57Three = "Norton Antivirus";
    static String o57Four = "McAfee";
    static String a57 = "Lotus 1";
    static String q58 = "How many stages are involved in programming";
    static String o58One = "5";
    static String o58Two = "7";
    static String o58Three = "6";
    static String o58Four = "8";
    static String a58 = "6";
    static String q59 = "Which of the following is not one of the stages involved in programming?";
    static String o59One = "Designing solution";
    static String o59Two = "Implementation";
    static String o59Three = "Designing algorithm";
    static String o59Four = "Prunning";
    static String a59 = "Prunning";
    static String q60 = "Which of the stages of programming involves writing pseudocodes?";
    static String o60One = "Designing solution";
    static String o60Two = "Implementation";
    static String o60Three = "Designing algorithm";
    static String o60Four = "Prunning";
    static String a60 = "Designing solution";
    static String q61 = "The trapezoidal symbol is used to indicate _______ in flowchart";
    static String o61One = "Direction";
    static String o61Two = "On-page connection";
    static String o61Three = "Off-page connection";
    static String o61Four = "processing symbol";
    static String a61 = "Off-page connection";
    static String q62 = "The translator uses _______ to convert a compiled program into executable form";
    static String o62One = "Interpreter";
    static String o62Two = "Off line compiler";
    static String o62Three = "Linker/Loader";
    static String o62Four = "Offline translator";
    static String a62 = "Linker/Loader";

    public static ArrayList<String> question() {
        questions = new ArrayList<String>();
        ArrayList<String> tempQ = new ArrayList<String>();
        String[] q = new String[]{q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20, q21, q22, q23, q24, q25, q26, q27, q28, q29,
            q30, q31, q32, q33, q34, q35, q36, q37, q38, q39, q40, q41, q42, q43, q44, q45, q46, q47, q48, q49, q50, q51, q52, q53, q54, q55, q56, q57, q58, q59, q60, q61, q62};
        for (int i = 0; i < 62; i++) {
            tempQ.add(q[i]);
        }
        Set<Integer> set = new HashSet<Integer>(10);
        for (int i = 0; set.size() < 10; i++) {
            Random ran = new Random();
            set.add(1 + ran.nextInt(61));
        }
        tt = set.toArray();
        for (int i = 0; i < 10; i++) {
            questions.add(tempQ.get(Integer.valueOf(tt[i].toString())));
        }
        return questions;
    }

    public static ArrayList<String> option() {
        ArrayList<String> options = new ArrayList<String>();
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
            o37One, o37Two, o37Three, o37Four, o38One, o38Two, o38Three, o38Four, o39One, o39Two, o39Three, o39Four, o40One, o40Two, o40Three, o40Four,
            o41One, o41Two, o41Three, o41Four, o42One, o42Two, o42Three, o42Four, o43One, o43Two, o43Three, o43Four, o44One, o44Two, o44Three, o44Four,
            o45One, o45Two, o45Three, o45Four, o46One, o46Two, o46Three, o46Four, o47One, o47Two, o47Three, o47Four, o48One, o48Two, o48Three, o48Four,
            o49One, o49Two, o49Three, o49Four, o50One, o50Two, o50Three, o50Four, o51One, o51Two, o51Three, o51Four, o52One, o52Two, o52Three, o52Four,
            o53One, o53Two, o53Three, o53Four, o54One, o54Two, o54Three, o54Four, o55One, o55Two, o55Three, o55Four, o56One, o56Two, o56Three, o56Four,
            o57One, o57Two, o57Three, o57Four, o58One, o58Two, o58Three, o58Four, o59One, o59Two, o59Three, o59Four, o60One, o60Two, o60Three, o60Four,
            o61One, o61Two, o61Three, o61Four, o62One, o62Two, o62Three, o62Four};
        for (int i = 0; i < 248; i++) {
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
            a31, a32, a33, a34, a35, a36, a37, a38, a39, a40, a41, a42, a43, a44, a45, a46, a47, a48, a49, a50, a51, a52, a53, a54, a55, a56, a57, a58, a59, a60, a61, a62};
        for (int i = 0; i < 62; i++) {
            tempA.add(a[i]);
        }
        for (int i = 0; i < 10; i++) {
            answers.add(tempA.get(Integer.valueOf(tt[i].toString())));
        }
        return answers;
    }
}
