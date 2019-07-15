package biometrics.cbt.ui.pages;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.Timer;

/**
 *
 * @author JBoss
 */
public class QuestionBody extends javax.swing.JPanel {

    private final JRadioButton[] rad;
    private final ButtonGroup[] group;
    private final ArrayList<String> qOne, qTwo, qThree, qFour, qFive, qSix, qSeven, qEight, qNine, qTen,
            aOne, aTwo, aThree, aFour, aFive, aSix, aSeven, aEight, aNine, aTen,
            oOne, oTwo, oThree, oFour, oFive, oSix, oSeven, oEight, oNine, oTen;
    private static ArrayList<String>[] question, option, answer;
    private static ArrayList<String> selectedOne, selectedTwo, selectedThree, selectedFour, selectedFive, selectedSix, selectedSeven, selectedEight, selectedNine, selectedTen;
    private boolean pageOne = false, pageTwo = false, pageThree = false, pageFour = false, pageFive = false, pageSix = false, pageSeven = false, pageEight = false, pageNine = false, pageTen = false;
    private final boolean flag = false;
    static int index = 0;
    Calendar time;
    static Timer t;
    static String type;
    public static ArrayList<String> missedQuestion, missedAnswer, missedOption;

    public QuestionBody(String type, String username) {
        initComponents();
        rad = new JRadioButton[]{radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8, radio9, radio10, radio11, radio12, radio13,
            radio14, radio15, radio16, radio17, radio18, radio19, radio20};
        group = new ButtonGroup[]{group1, group2, group3, group4, group5};
        selectedOne = new ArrayList<String>();
        selectedTwo = new ArrayList<String>();
        selectedThree = new ArrayList<String>();
        selectedFour = new ArrayList<String>();
        selectedFive = new ArrayList<String>();
        selectedSix = new ArrayList<String>();
        selectedSeven = new ArrayList<String>();
        selectedEight = new ArrayList<String>();
        selectedNine = new ArrayList<String>();
        selectedTen = new ArrayList<String>();
        missedQuestion = new ArrayList<String>();
        missedAnswer = new ArrayList<String>();
        missedOption = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            for (int j = (i * 4); j < ((i * 4) + 4); j++) {
                group[i].add(rad[j]);
            }
        }
        qOne = new ArrayList<String>();
        qTwo = new ArrayList<String>();
        qThree = new ArrayList<String>();
        qFour = new ArrayList<String>();
        qFive = new ArrayList<String>();
        qSix = new ArrayList<String>();
        qSeven = new ArrayList<String>();
        qEight = new ArrayList<String>();
        qNine = new ArrayList<String>();
        qTen = new ArrayList<String>();
        oOne = new ArrayList<String>();
        oTwo = new ArrayList<String>();
        oThree = new ArrayList<String>();
        oFour = new ArrayList<String>();
        oFive = new ArrayList<String>();
        oSix = new ArrayList<String>();
        oSeven = new ArrayList<String>();
        oEight = new ArrayList<String>();
        oNine = new ArrayList<String>();
        oTen = new ArrayList<String>();
        aOne = new ArrayList<String>();
        aTwo = new ArrayList<String>();
        aThree = new ArrayList<String>();
        aFour = new ArrayList<String>();
        aFive = new ArrayList<String>();
        aSix = new ArrayList<String>();
        aSeven = new ArrayList<String>();
        aEight = new ArrayList<String>();
        aNine = new ArrayList<String>();
        aTen = new ArrayList<String>();

        question = new ArrayList[]{qOne, qTwo, qThree, qFour, qFive, qSix, qSeven, qEight, qNine, qTen};
        option = new ArrayList[]{oOne, oTwo, oThree, oFour, oFive, oSix, oSeven, oEight, oNine, oTen};
        answer = new ArrayList[]{aOne, aTwo, aThree, aFour, aFive, aSix, aSeven, aEight, aNine, aTen};
        prev.setEnabled(false);
        prev2.setEnabled(false);
        next.setEnabled(false);
        next2.setEnabled(false);
        pan1.setVisible(false);
        pan2.setVisible(false);
        pan3.setVisible(false);
        pan4.setVisible(false);
        pan5.setVisible(false);
        QuestionBody.type = type;
        if (type.equals("practice")) {
            populate();
        } else if (type.equals("exam")) {
            populateExam();
        }
        usernameLab.setText(username);
    }

    public void startTimer(int drtn) {
        time = Calendar.getInstance();
        time.set(Calendar.HOUR, 0);
        time.set(Calendar.MINUTE, drtn);
        time.set(Calendar.SECOND, 0);
        Time ti = new Time();
        t = new Timer(1000, ti);
        t.setInitialDelay(0);
        t.start();
    }

    private void display(int page) {
        area1.setText(question[page].get(0));
        area2.setText(question[page].get(1));
        area3.setText(question[page].get(2));
        area4.setText(question[page].get(3));
        area5.setText(question[page].get(4));
        for (int i = 0; i < 20; i++) {
            rad[i].setText(option[page].get(i));
            rad[i].setActionCommand(option[page].get(i));
        }
        q1.setText("Q" + String.valueOf((page * 5) + 1));
        q2.setText("Q" + String.valueOf((page * 5) + 2));
        q3.setText("Q" + String.valueOf((page * 5) + 3));
        q4.setText("Q" + String.valueOf((page * 5) + 4));
        q5.setText("Q" + String.valueOf((page * 5) + 5));
    }

    public static int submitPractice() {
        ArrayList<String>[] temp = new ArrayList[]{selectedOne, selectedTwo, selectedThree};
        if (index < 3) {
            String s1, s2, s3, s4, s5;
            try {
                s1 = group1.getSelection().getActionCommand();
            } catch (Exception e) {
                s1 = "";
            }
            try {
                s2 = group2.getSelection().getActionCommand();
            } catch (Exception m) {
                s2 = "";
            }
            try {
                s3 = group3.getSelection().getActionCommand();
            } catch (Exception b) {
                s3 = "";
            }
            try {
                s4 = group4.getSelection().getActionCommand();
            } catch (Exception v) {
                s4 = "";
            }
            try {
                s5 = group5.getSelection().getActionCommand();
            } catch (Exception f) {
                s5 = "";
            }
            temp[index].add(0, s1);
            temp[index].add(1, s2);
            temp[index].add(2, s3);
            temp[index].add(3, s4);
            temp[index].add(4, s5);
        }
        if (index != 2) {
            for (ArrayList<String> te : temp) {
                check(te);
            }
        }
        int score = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (temp[i].get(j).equals(answer[i].get(j))) {
                    score++;
                } else {
                    missedQuestion.add(question[i].get(j));
                    missedAnswer.add(answer[i].get(j));
                    for (int k = (j * 4); k < ((j * 4) + 4); k++) {
                        missedOption.add(option[i].get(k));
                    }
                }
            }
        }
        t.stop();
        return score;
    }

    public static void check(ArrayList<String> toCheck) {
        try {
            String d = toCheck.get(3);
        } catch (Exception e) {
            toCheck.add(0, "");
            toCheck.add(1, "");
            toCheck.add(2, "");
            toCheck.add(3, "");
            toCheck.add(4, "");
        }
    }

    public static int submitExam() {
        ArrayList<String>[] temp = new ArrayList[]{selectedOne, selectedTwo, selectedThree, selectedFour, selectedFive, selectedSix, selectedSeven, selectedEight, selectedNine, selectedTen};
        if (index < 9) {
            String s1, s2, s3, s4, s5;
            try {
                s1 = group1.getSelection().getActionCommand();
            } catch (Exception e) {
                s1 = "";
            }
            try {
                s2 = group2.getSelection().getActionCommand();
            } catch (Exception m) {
                s2 = "";
            }
            try {
                s3 = group3.getSelection().getActionCommand();
            } catch (Exception b) {
                s3 = "";
            }
            try {
                s4 = group4.getSelection().getActionCommand();
            } catch (Exception v) {
                s4 = "";
            }
            try {
                s5 = group5.getSelection().getActionCommand();
            } catch (Exception f) {
                s5 = "";
            }
            temp[index].add(0, s1);
            temp[index].add(1, s2);
            temp[index].add(2, s3);
            temp[index].add(3, s4);
            temp[index].add(4, s5);
        }
        if (index != 9) {
            for (ArrayList<String> temp1 : temp) {
                check(temp1);
            }
        }
        int score = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                if (temp[i].get(j).equals(answer[i].get(j))) {
                    score++;
                } else {
                    missedQuestion.add(question[i].get(j));
                    missedAnswer.add(answer[i].get(j));
                    for (int k = (j * 4); k < ((j * 4) + 4); k++) {
                        missedOption.add(option[i].get(k));
                    }
                }
            }
        }
        t.stop();
        return score;
    }

    private void populate() {
        ArrayList<String> returnedQuestion = QuestionOne.question();
        ArrayList<String> returnedQuestion2 = QuestionTwo.question();
        ArrayList<String> returnedQuestion3 = QuestionThree.question();
        ArrayList<String> returnedQuestion4 = QuestionFour.question();
        ArrayList<String> returnedQuestion5 = QuestionFive.question();
        ArrayList<String>[] ret = new ArrayList[]{returnedQuestion, returnedQuestion2, returnedQuestion3, returnedQuestion4, returnedQuestion5};
        ArrayList<String> returnedOption = QuestionOne.option();
        ArrayList<String> returnedOption2 = QuestionTwo.option();
        ArrayList<String> returnedOption3 = QuestionThree.option();
        ArrayList<String> returnedOption4 = QuestionFour.option();
        ArrayList<String> returnedOption5 = QuestionFive.option();
        ArrayList<String>[] ret2 = new ArrayList[]{returnedOption, returnedOption2, returnedOption3, returnedOption4, returnedOption5};
        ArrayList<String> returnedAnswer = QuestionOne.answer();
        ArrayList<String> returnedAnswer2 = QuestionTwo.answer();
        ArrayList<String> returnedAnswer3 = QuestionThree.answer();
        ArrayList<String> returnedAnswer4 = QuestionFour.answer();
        ArrayList<String> returnedAnswer5 = QuestionFive.answer();
        ArrayList<String>[] ret3 = new ArrayList[]{returnedAnswer, returnedAnswer2, returnedAnswer3, returnedAnswer4, returnedAnswer5};
        Set<Integer> set = new HashSet<Integer>(5);
        for (int i = 0; set.size() < 5; i++) {
            Random ran = new Random();
            set.add(1 + ran.nextInt(9));
        }
        ArrayList<String> temp = new ArrayList<String>();
        ArrayList<String> temp2 = new ArrayList<String>();
        ArrayList<String> temp3 = new ArrayList<String>();
        Object[] tt = set.toArray();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                temp.add(ret[i].get(Integer.valueOf(tt[j].toString())));
                temp3.add(ret3[i].get(Integer.valueOf(tt[j].toString())));
                int u = Integer.valueOf(tt[j].toString());
                for (int k = (u * 4); k < ((u * 4) + 4); k++) {
                    temp2.add(ret2[i].get(k));
                }
            }
            ret[i].clear();
            for (String temp1 : temp) {
                ret[i].add(temp1);
            }
            ret2[i].clear();
            for (String temp21 : temp2) {
                ret2[i].add(temp21);
            }
            ret3[i].clear();
            for (String temp31 : temp3) {
                ret3[i].add(temp31);
            }
            temp.clear();
            temp2.clear();
            temp3.clear();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                question[i].add(ret[j].get(i));
                answer[i].add(ret3[j].get(i));
                for (int k = (i * 4); k < ((i * 4) + 4); k++) {
                    option[i].add(ret2[j].get(k));
                }
            }
        }
    }

    private void populateExam() {
        ArrayList<String> returnedQuestion = QuestionOne.question();
        ArrayList<String> returnedQuestion2 = QuestionTwo.question();
        ArrayList<String> returnedQuestion3 = QuestionThree.question();
        ArrayList<String> returnedQuestion4 = QuestionFour.question();
        ArrayList<String> returnedQuestion5 = QuestionFive.question();
        ArrayList<String>[] ret = new ArrayList[]{returnedQuestion, returnedQuestion2, returnedQuestion3, returnedQuestion4, returnedQuestion5};
        ArrayList<String> returnedOption = QuestionOne.option();
        ArrayList<String> returnedOption2 = QuestionTwo.option();
        ArrayList<String> returnedOption3 = QuestionThree.option();
        ArrayList<String> returnedOption4 = QuestionFour.option();
        ArrayList<String> returnedOption5 = QuestionFive.option();
        ArrayList<String>[] ret2 = new ArrayList[]{returnedOption, returnedOption2, returnedOption3, returnedOption4, returnedOption5};
        ArrayList<String> returnedAnswer = QuestionOne.answer();
        ArrayList<String> returnedAnswer2 = QuestionTwo.answer();
        ArrayList<String> returnedAnswer3 = QuestionThree.answer();
        ArrayList<String> returnedAnswer4 = QuestionFour.answer();
        ArrayList<String> returnedAnswer5 = QuestionFive.answer();
        ArrayList<String>[] ret3 = new ArrayList[]{returnedAnswer, returnedAnswer2, returnedAnswer3, returnedAnswer4, returnedAnswer5};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                question[j].add(ret[i].get(j));
                answer[j].add(ret3[i].get(j));
                for (int k = (j * 4); k < ((j * 4) + 4); k++) {
                    option[j].add(ret2[i].get(k));
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group1 = new javax.swing.ButtonGroup();
        group2 = new javax.swing.ButtonGroup();
        group3 = new javax.swing.ButtonGroup();
        group4 = new javax.swing.ButtonGroup();
        group5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        next = new javax.swing.JButton();
        timeLab = new javax.swing.JLabel();
        prev = new javax.swing.JButton();
        pan1 = new javax.swing.JPanel();
        q1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area1 = new javax.swing.JTextArea();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        radio4 = new javax.swing.JRadioButton();
        pan5 = new javax.swing.JPanel();
        q5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        area5 = new javax.swing.JTextArea();
        radio17 = new javax.swing.JRadioButton();
        radio18 = new javax.swing.JRadioButton();
        radio19 = new javax.swing.JRadioButton();
        radio20 = new javax.swing.JRadioButton();
        start = new javax.swing.JButton();
        next2 = new javax.swing.JButton();
        prev2 = new javax.swing.JButton();
        pan4 = new javax.swing.JPanel();
        q4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        area4 = new javax.swing.JTextArea();
        radio13 = new javax.swing.JRadioButton();
        radio14 = new javax.swing.JRadioButton();
        radio15 = new javax.swing.JRadioButton();
        radio16 = new javax.swing.JRadioButton();
        pan3 = new javax.swing.JPanel();
        q3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        area3 = new javax.swing.JTextArea();
        radio9 = new javax.swing.JRadioButton();
        radio10 = new javax.swing.JRadioButton();
        radio11 = new javax.swing.JRadioButton();
        radio12 = new javax.swing.JRadioButton();
        pan2 = new javax.swing.JPanel();
        q2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        area2 = new javax.swing.JTextArea();
        radio5 = new javax.swing.JRadioButton();
        radio6 = new javax.swing.JRadioButton();
        radio7 = new javax.swing.JRadioButton();
        radio8 = new javax.swing.JRadioButton();
        usernameLab = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next.setFont(new java.awt.Font("Nyala", 1, 14)); // NOI18N
        next.setForeground(new java.awt.Color(102, 0, 0));
        next.setText("NEXT>>");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 12, 109, 34));

        timeLab.setFont(new java.awt.Font("Nyala", 1, 18)); // NOI18N
        timeLab.setForeground(new java.awt.Color(0, 51, 0));
        timeLab.setText("15:00");
        jPanel1.add(timeLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 90, 40));

        prev.setFont(new java.awt.Font("Nyala", 1, 14)); // NOI18N
        prev.setForeground(new java.awt.Color(102, 0, 0));
        prev.setText("<<PREVIOUS");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });
        jPanel1.add(prev, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 12, -1, 34));

        pan1.setBackground(new java.awt.Color(255, 255, 204));
        pan1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pan1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q1.setText("Q1");
        pan1.add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 12, -1, -1));

        area1.setEditable(false);
        area1.setColumns(20);
        area1.setFont(new java.awt.Font("Palatino Linotype", 0, 13)); // NOI18N
        area1.setLineWrap(true);
        area1.setRows(5);
        area1.setText("According to Merriam-Webster?s dictionary, administration is the management of affairs. System administration therefore, is the management of the affairs of a system and the system in this reference is the computer system. System administration is a subject matter that most authors has found writing books about superfluous");
        area1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(area1);

        pan1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 12, 670, 74));

        radio1.setText("I have therefore decided to glean the few managerial skills I have learnt over the years into this small piece");
        radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio1ActionPerformed(evt);
            }
        });
        pan1.add(radio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 93, -1, -1));

        radio2.setText("I have therefore decided to glean the few managerial skills I have learnt over the years into this small piece");
        pan1.add(radio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 116, -1, -1));

        radio3.setText("I have therefore decided to glean the few managerial skills I have learnt over the years into this small piece");
        pan1.add(radio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 139, -1, -1));

        radio4.setText("I have therefore decided to glean the few managerial skills I have learnt over the years into this small piece");
        pan1.add(radio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 162, -1, -1));

        jPanel1.add(pan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 57, 780, 190));

        pan5.setBackground(new java.awt.Color(255, 255, 204));
        pan5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pan5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q5.setText("Q5");
        pan5.add(q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 12, -1, -1));

        area5.setEditable(false);
        area5.setColumns(20);
        area5.setFont(new java.awt.Font("Palatino Linotype", 0, 13)); // NOI18N
        area5.setLineWrap(true);
        area5.setRows(5);
        area5.setText("According to Merriam-Webster?s dictionary, administration is the management of affairs. System administration therefore, is the management of the affairs of a system and the system in this reference is the computer system. System administration is a subject matter that most authors has found writing books about superfluous");
        area5.setWrapStyleWord(true);
        jScrollPane5.setViewportView(area5);

        pan5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 12, 680, 74));

        radio17.setText("I have therefore decided to glean the few managerial skills I have learnt over the years into this small piece");
        pan5.add(radio17, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 93, -1, -1));

        radio18.setText("I have therefore decided to glean the few managerial skills I have learnt over the years into this small piece");
        pan5.add(radio18, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 116, -1, -1));

        radio19.setText("I have therefore decided to glean the few managerial skills I have learnt over the years into this small piece");
        pan5.add(radio19, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 139, -1, -1));

        radio20.setText("I have therefore decided to glean the few managerial skills I have learnt over the years into this small piece");
        pan5.add(radio20, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 162, -1, -1));

        jPanel1.add(pan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 857, 780, 190));

        start.setFont(new java.awt.Font("Nyala", 1, 16)); // NOI18N
        start.setForeground(new java.awt.Color(102, 0, 0));
        start.setText("START");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        jPanel1.add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 11, 109, 34));

        next2.setFont(new java.awt.Font("Nyala", 1, 16)); // NOI18N
        next2.setForeground(new java.awt.Color(102, 0, 0));
        next2.setText("NEXT>>");
        next2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next2ActionPerformed(evt);
            }
        });
        jPanel1.add(next2, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 1062, 109, 33));

        prev2.setFont(new java.awt.Font("Nyala", 1, 14)); // NOI18N
        prev2.setForeground(new java.awt.Color(102, 0, 0));
        prev2.setText("<<PREVIOUS");
        prev2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prev2ActionPerformed(evt);
            }
        });
        jPanel1.add(prev2, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 1063, -1, 33));

        pan4.setBackground(new java.awt.Color(255, 255, 204));
        pan4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pan4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q4.setText("Q4");
        pan4.add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 12, -1, -1));

        area4.setEditable(false);
        area4.setColumns(20);
        area4.setFont(new java.awt.Font("Palatino Linotype", 0, 13)); // NOI18N
        area4.setLineWrap(true);
        area4.setRows(5);
        area4.setText("According to Merriam-Webster?s dictionary, administration is the management of affairs. System administration therefore, is the management of the affairs of a system and the system in this reference is the computer system. System administration is a subject matter that most authors has found writing books about superfluous");
        area4.setWrapStyleWord(true);
        jScrollPane4.setViewportView(area4);

        pan4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 12, 670, 74));

        radio13.setText("I have therefore decided to glean the few managerial skills I have learnt over the years into this small piece");
        pan4.add(radio13, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 93, -1, -1));

        radio14.setText("I have therefore decided to glean the few managerial skills I have learnt over the years into this small piece");
        pan4.add(radio14, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 116, -1, -1));

        radio15.setText("I have therefore decided to glean the few managerial skills I have learnt over the years into this small piece");
        pan4.add(radio15, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 139, -1, -1));

        radio16.setText("I have therefore decided to glean the few managerial skills I have learnt over the years into this small piece");
        pan4.add(radio16, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 162, -1, -1));

        jPanel1.add(pan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 657, 780, 190));

        pan3.setBackground(new java.awt.Color(255, 255, 204));
        pan3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pan3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q3.setText("Q3");
        pan3.add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 12, -1, -1));

        area3.setEditable(false);
        area3.setColumns(20);
        area3.setFont(new java.awt.Font("Palatino Linotype", 0, 13)); // NOI18N
        area3.setLineWrap(true);
        area3.setRows(5);
        area3.setText("According to Merriam-Webster?s dictionary, administration is the management of affairs. System administration therefore, is the management of the affairs of a  system and the system in this reference is the computer system. System administration is a subject matter that most authors has found writing books about superfluous");
        area3.setWrapStyleWord(true);
        jScrollPane3.setViewportView(area3);

        pan3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 12, 670, 74));

        radio9.setText("A compiler translates high level languages to machine language while translator is any software that translates to machine language");
        pan3.add(radio9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 93, -1, -1));

        radio10.setText("I have therefore decided to glean the few managerial skills I have learnt over the years into this small piece");
        pan3.add(radio10, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 116, -1, -1));

        radio11.setText("I have therefore decided to glean the few managerial skills I have learnt over the years into this small piece");
        pan3.add(radio11, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 139, -1, -1));

        radio12.setText("I have therefore decided to glean the few managerial skills I have learnt over the years into this small piece");
        pan3.add(radio12, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 162, -1, -1));

        jPanel1.add(pan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 457, 780, 190));

        pan2.setBackground(new java.awt.Color(255, 255, 204));
        pan2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pan2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q2.setText("Q2");
        pan2.add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 12, -1, -1));

        area2.setEditable(false);
        area2.setColumns(20);
        area2.setFont(new java.awt.Font("Palatino Linotype", 0, 13)); // NOI18N
        area2.setLineWrap(true);
        area2.setRows(5);
        area2.setText("According to Merriam-Webster?s dictionary, administration is the management of affairs. System administration therefore, is the management of the affairs of a system and the system in this reference is the computer system. System administration is a subject matter that most authors has found writing books about superfluous");
        area2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(area2);

        pan2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 12, 670, 74));

        radio5.setText("I have therefore decided to glean the few managerial skills I have learnt over the years into this small piece");
        pan2.add(radio5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 93, -1, -1));

        radio6.setText("I have therefore decided to glean the few managerial skills I have learnt over the years into this small piece");
        pan2.add(radio6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 116, -1, -1));

        radio7.setText("I have therefore decided to glean the few managerial skills I have learnt over the years into this small piece");
        pan2.add(radio7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 139, -1, -1));

        radio8.setText("I have therefore decided to glean the few managerial skills I have learnt over the years into this small piece");
        pan2.add(radio8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 162, -1, -1));

        jPanel1.add(pan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 257, 780, 190));

        usernameLab.setForeground(new java.awt.Color(102, 0, 0));
        jPanel1.add(usernameLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 210, 20));

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio1ActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        index = 0;
        next.setEnabled(true);
        next2.setEnabled(true);
        start.setEnabled(false);
        display(index);
        pan1.setVisible(true);
        pan2.setVisible(true);
        pan3.setVisible(true);
        pan4.setVisible(true);
        pan5.setVisible(true);
        if (type.equals("practice")) {
            startTimer(7);
        } else if (type.equals("exam")) {
            startTimer(25);
        }
//        MainPage.submit.setEnabled(true);
        pageOne = true;
//        MainPage.practice.setEnabled(false);
//        MainPage.takeTest.setEnabled(false);
    }//GEN-LAST:event_startActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        ArrayList<String>[] temp = new ArrayList[]{selectedOne, selectedTwo, selectedThree, selectedFour, selectedFive, selectedSix, selectedSeven, selectedEight, selectedNine, selectedTen};
        boolean[] t2 = new boolean[]{pageOne, pageTwo, pageThree, pageFour, pageFive, pageSix, pageSeven, pageEight, pageNine, pageTen};
        int max;
        if (type.equals("practice")) {
            max = 3;
        } else {
            max = 10;
        }
        if (index < max) {
            String s1, s2, s3, s4, s5;
            try {
                s1 = group1.getSelection().getActionCommand();
            } catch (Exception e) {
                s1 = "";
            }
            try {
                s2 = group2.getSelection().getActionCommand();
            } catch (Exception m) {
                s2 = "";
            }
            try {
                s3 = group3.getSelection().getActionCommand();
            } catch (Exception b) {
                s3 = "";
            }
            try {
                s4 = group4.getSelection().getActionCommand();
            } catch (Exception v) {
                s4 = "";
            }
            try {
                s5 = group5.getSelection().getActionCommand();
            } catch (Exception f) {
                s5 = "";
            }
            temp[index].add(0, s1);
            temp[index].add(1, s2);
            temp[index].add(2, s3);
            temp[index].add(3, s4);
            temp[index].add(4, s5);
        }
        index++;
        if (index < max) {
            display(index);
            if (index == 2 && type.equals("practice")) {
                next.setEnabled(false);
                next2.setEnabled(false);
                pageThree = true;
            }
            if (index == 9 && type.equals("exam")) {
                next.setEnabled(false);
                next2.setEnabled(false);
                pageTen = true;
            }
            if (index == 1) {
                pageTwo = true;
            }
            if (index == 3) {
                pageFour = true;
            }
            if (index == 4) {
                pageFive = true;
            }
            if (index == 5) {
                pageSix = true;
            }
            if (index == 6) {
                pageSeven = true;
            }
            if (index == 7) {
                pageEight = true;
            }
            if (index == 8) {
                pageNine = true;
            }
            if (t2[index] == false) {
                group1.clearSelection();
                group2.clearSelection();
                group3.clearSelection();
                group4.clearSelection();
                group5.clearSelection();
            } else {
                try {
                    String d = temp[index].get(3);
                    if (temp[index].get(0).equals("")) {
                        group1.clearSelection();
                    }
                    if (temp[index].get(1).equals("")) {
                        group2.clearSelection();
                    }
                    if (temp[index].get(2).equals("")) {
                        group3.clearSelection();
                    }
                    if (temp[index].get(3).equals("")) {
                        group4.clearSelection();
                    }
                    if (temp[index].get(4).equals("")) {
                        group5.clearSelection();
                    }
                } catch (Exception e) {
                    group1.clearSelection();
                    group2.clearSelection();
                    group3.clearSelection();
                    group4.clearSelection();
                    group5.clearSelection();
                }
            }
        }
        if (index > 0 && index < max) {
            try {
                for (int i = 0; i < 4; i++) {
                    if (rad[i].getText().equals(temp[index].get(0))) {
                        rad[i].setSelected(true);
                    }
                }
                for (int i = 4; i < 8; i++) {
                    if (rad[i].getText().equals(temp[index].get(1))) {
                        rad[i].setSelected(true);
                    }
                }
                for (int i = 8; i < 12; i++) {
                    if (rad[i].getText().equals(temp[index].get(2))) {
                        rad[i].setSelected(true);
                    }
                }
                for (int i = 12; i < 16; i++) {
                    if (rad[i].getText().equals(temp[index].get(3))) {
                        rad[i].setSelected(true);
                    }
                }
                for (int i = 16; i < 20; i++) {
                    if (rad[i].getText().equals(temp[index].get(4))) {
                        rad[i].setSelected(true);
                    }
                }
            } catch (Exception n) {
            }
        }
        prev.setEnabled(true);
        prev2.setEnabled(true);
    }//GEN-LAST:event_nextActionPerformed

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
        ArrayList<String>[] temp = new ArrayList[]{selectedOne, selectedTwo, selectedThree, selectedFour, selectedFive, selectedSix, selectedSeven, selectedEight, selectedNine, selectedTen};
        int max;
        if (type.equals("practice")) {
            max = 3;
        } else {
            max = 10;
        }
        if (index < max) {
            String s1, s2, s3, s4, s5;
            try {
                s1 = group1.getSelection().getActionCommand();
            } catch (Exception e) {
                s1 = "";
            }
            try {
                s2 = group2.getSelection().getActionCommand();
            } catch (Exception m) {
                s2 = "";
            }
            try {
                s3 = group3.getSelection().getActionCommand();
            } catch (Exception b) {
                s3 = "";
            }
            try {
                s4 = group4.getSelection().getActionCommand();
            } catch (Exception v) {
                s4 = "";
            }
            try {
                s5 = group5.getSelection().getActionCommand();
            } catch (Exception f) {
                s5 = "";
            }
            temp[index].add(0, s1);
            temp[index].add(1, s2);
            temp[index].add(2, s3);
            temp[index].add(3, s4);
            temp[index].add(4, s5);
        }
        index--;
        display(index);
        if (index >= 0) {
            for (int i = 0; i < 4; i++) {
                if (rad[i].getText().equals(temp[index].get(0))) {
                    rad[i].setSelected(true);
                }
            }
            for (int i = 4; i < 8; i++) {
                if (rad[i].getText().equals(temp[index].get(1))) {
                    rad[i].setSelected(true);
                }
            }
            for (int i = 8; i < 12; i++) {
                if (rad[i].getText().equals(temp[index].get(2))) {
                    rad[i].setSelected(true);
                }
            }
            for (int i = 12; i < 16; i++) {
                if (rad[i].getText().equals(temp[index].get(3))) {
                    rad[i].setSelected(true);
                }
            }
            for (int i = 16; i < 20; i++) {
                if (rad[i].getText().equals(temp[index].get(4))) {
                    rad[i].setSelected(true);
                }
            }
        }
        try {
            String d = temp[index].get(3);
            if (temp[index].get(0).equals("")) {
                group1.clearSelection();
            }
            if (temp[index].get(1).equals("")) {
                group2.clearSelection();
            }
            if (temp[index].get(2).equals("")) {
                group3.clearSelection();
            }
            if (temp[index].get(3).equals("")) {
                group4.clearSelection();
            }
            if (temp[index].get(4).equals("")) {
                group5.clearSelection();
            }
        } catch (Exception e) {
            group1.clearSelection();
            group2.clearSelection();
            group3.clearSelection();
            group4.clearSelection();
            group5.clearSelection();
        }
        if (index == 0) {
            prev.setEnabled(false);
            prev2.setEnabled(false);
        }
        next.setEnabled(true);
        next2.setEnabled(true);
    }//GEN-LAST:event_prevActionPerformed

    private void next2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next2ActionPerformed
        ArrayList<String>[] temp = new ArrayList[]{selectedOne, selectedTwo, selectedThree, selectedFour, selectedFive, selectedSix, selectedSeven, selectedEight, selectedNine, selectedTen};
        boolean[] t2 = new boolean[]{pageOne, pageTwo, pageThree, pageFour, pageFive, pageSix, pageSeven, pageEight, pageNine, pageTen};
        int max;
        if (type.equals("practice")) {
            max = 3;
        } else {
            max = 10;
        }
        if (index < max) {
            String s1, s2, s3, s4, s5;
            try {
                s1 = group1.getSelection().getActionCommand();
            } catch (Exception e) {
                s1 = "";
            }
            try {
                s2 = group2.getSelection().getActionCommand();
            } catch (Exception m) {
                s2 = "";
            }
            try {
                s3 = group3.getSelection().getActionCommand();
            } catch (Exception b) {
                s3 = "";
            }
            try {
                s4 = group4.getSelection().getActionCommand();
            } catch (Exception v) {
                s4 = "";
            }
            try {
                s5 = group5.getSelection().getActionCommand();
            } catch (Exception f) {
                s5 = "";
            }
            temp[index].add(0, s1);
            temp[index].add(1, s2);
            temp[index].add(2, s3);
            temp[index].add(3, s4);
            temp[index].add(4, s5);
        }
        index++;
        if (index < max) {
            display(index);
            if (index == 2 && type.equals("practice")) {
                next.setEnabled(false);
                next2.setEnabled(false);
                pageThree = true;
            }
            if (index == 9 && type.equals("exam")) {
                next.setEnabled(false);
                next2.setEnabled(false);
                pageTen = true;
            }
            if (index == 1) {
                pageTwo = true;
            }
            if (index == 3) {
                pageFour = true;
            }
            if (index == 4) {
                pageFive = true;
            }
            if (index == 5) {
                pageSix = true;
            }
            if (index == 6) {
                pageSeven = true;
            }
            if (index == 7) {
                pageEight = true;
            }
            if (index == 8) {
                pageNine = true;
            }
            if (t2[index] == false) {
                group1.clearSelection();
                group2.clearSelection();
                group3.clearSelection();
                group4.clearSelection();
                group5.clearSelection();
            } else {
                try {
                    String d = temp[index].get(3);
                    if (temp[index].get(0).equals("")) {
                        group1.clearSelection();
                    }
                    if (temp[index].get(1).equals("")) {
                        group2.clearSelection();
                    }
                    if (temp[index].get(2).equals("")) {
                        group3.clearSelection();
                    }
                    if (temp[index].get(3).equals("")) {
                        group4.clearSelection();
                    }
                    if (temp[index].get(4).equals("")) {
                        group5.clearSelection();
                    }
                } catch (Exception e) {
                    group1.clearSelection();
                    group2.clearSelection();
                    group3.clearSelection();
                    group4.clearSelection();
                    group5.clearSelection();
                }
            }
        }
        if (index > 0 && index < max) {
            try {
                for (int i = 0; i < 4; i++) {
                    if (rad[i].getText().equals(temp[index].get(0))) {
                        rad[i].setSelected(true);
                    }
                }
                for (int i = 4; i < 8; i++) {
                    if (rad[i].getText().equals(temp[index].get(1))) {
                        rad[i].setSelected(true);
                    }
                }
                for (int i = 8; i < 12; i++) {
                    if (rad[i].getText().equals(temp[index].get(2))) {
                        rad[i].setSelected(true);
                    }
                }
                for (int i = 12; i < 16; i++) {
                    if (rad[i].getText().equals(temp[index].get(3))) {
                        rad[i].setSelected(true);
                    }
                }
                for (int i = 16; i < 20; i++) {
                    if (rad[i].getText().equals(temp[index].get(4))) {
                        rad[i].setSelected(true);
                    }
                }
            } catch (Exception n) {
            }
        }
        prev.setEnabled(true);
        prev2.setEnabled(true);
//        MainPage.scroll.getViewport().setViewPosition(new Point(0, 0));
    }//GEN-LAST:event_next2ActionPerformed

    private void prev2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prev2ActionPerformed
        ArrayList<String>[] temp = new ArrayList[]{selectedOne, selectedTwo, selectedThree, selectedFour, selectedFive, selectedSix, selectedSeven, selectedEight, selectedNine, selectedTen};
        int max;
        if (type.equals("practice")) {
            max = 3;
        } else {
            max = 10;
        }
        if (index < max) {
            String s1, s2, s3, s4, s5;
            try {
                s1 = group1.getSelection().getActionCommand();
            } catch (Exception e) {
                s1 = "";
            }
            try {
                s2 = group2.getSelection().getActionCommand();
            } catch (Exception m) {
                s2 = "";
            }
            try {
                s3 = group3.getSelection().getActionCommand();
            } catch (Exception b) {
                s3 = "";
            }
            try {
                s4 = group4.getSelection().getActionCommand();
            } catch (Exception v) {
                s4 = "";
            }
            try {
                s5 = group5.getSelection().getActionCommand();
            } catch (Exception f) {
                s5 = "";
            }
            temp[index].add(0, s1);
            temp[index].add(1, s2);
            temp[index].add(2, s3);
            temp[index].add(3, s4);
            temp[index].add(4, s5);
        }
        index--;
        display(index);
        if (index >= 0) {
            for (int i = 0; i < 4; i++) {
                if (rad[i].getText().equals(temp[index].get(0))) {
                    rad[i].setSelected(true);
                }
            }
            for (int i = 4; i < 8; i++) {
                if (rad[i].getText().equals(temp[index].get(1))) {
                    rad[i].setSelected(true);
                }
            }
            for (int i = 8; i < 12; i++) {
                if (rad[i].getText().equals(temp[index].get(2))) {
                    rad[i].setSelected(true);
                }
            }
            for (int i = 12; i < 16; i++) {
                if (rad[i].getText().equals(temp[index].get(3))) {
                    rad[i].setSelected(true);
                }
            }
            for (int i = 16; i < 20; i++) {
                if (rad[i].getText().equals(temp[index].get(4))) {
                    rad[i].setSelected(true);
                }
            }
        }
        try {
            String d = temp[index].get(3);
            if (temp[index].get(0).equals("")) {
                group1.clearSelection();
            }
            if (temp[index].get(1).equals("")) {
                group2.clearSelection();
            }
            if (temp[index].get(2).equals("")) {
                group3.clearSelection();
            }
            if (temp[index].get(3).equals("")) {
                group4.clearSelection();
            }
            if (temp[index].get(4).equals("")) {
                group5.clearSelection();
            }
        } catch (Exception e) {
            group1.clearSelection();
            group2.clearSelection();
            group3.clearSelection();
            group4.clearSelection();
            group5.clearSelection();
        }
        if (index == 0) {
            prev.setEnabled(false);
            prev2.setEnabled(false);
        }
        next.setEnabled(true);
        next2.setEnabled(true);
//        MainPage.scroll.getViewport().setViewPosition(new Point(0, 0));
    }//GEN-LAST:event_prev2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area1;
    private javax.swing.JTextArea area2;
    private javax.swing.JTextArea area3;
    private javax.swing.JTextArea area4;
    private javax.swing.JTextArea area5;
    private static javax.swing.ButtonGroup group1;
    private static javax.swing.ButtonGroup group2;
    private static javax.swing.ButtonGroup group3;
    private static javax.swing.ButtonGroup group4;
    private static javax.swing.ButtonGroup group5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton next;
    private javax.swing.JButton next2;
    public javax.swing.JPanel pan1;
    public javax.swing.JPanel pan2;
    public javax.swing.JPanel pan3;
    public javax.swing.JPanel pan4;
    public javax.swing.JPanel pan5;
    private javax.swing.JButton prev;
    private javax.swing.JButton prev2;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio10;
    private javax.swing.JRadioButton radio11;
    private javax.swing.JRadioButton radio12;
    private javax.swing.JRadioButton radio13;
    private javax.swing.JRadioButton radio14;
    private javax.swing.JRadioButton radio15;
    private javax.swing.JRadioButton radio16;
    private javax.swing.JRadioButton radio17;
    private javax.swing.JRadioButton radio18;
    private javax.swing.JRadioButton radio19;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio20;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JRadioButton radio4;
    private javax.swing.JRadioButton radio5;
    private javax.swing.JRadioButton radio6;
    private javax.swing.JRadioButton radio7;
    private javax.swing.JRadioButton radio8;
    private javax.swing.JRadioButton radio9;
    private javax.swing.JButton start;
    public javax.swing.JLabel timeLab;
    private javax.swing.JLabel usernameLab;
    // End of variables declaration//GEN-END:variables

    public class Time implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            //txttime.setText(String.valueOf(Integer.parseInt(txttime.getText())-1));
            timeLab.setText(String.format("%02d:%02d:%02d", time.get(Calendar.HOUR), time.get(Calendar.MINUTE), time.get(Calendar.SECOND)));
//            MainPage.timeT.setText(String.format("%02d:%02d:%02d", time.get(Calendar.HOUR), time.get(Calendar.MINUTE), time.get(Calendar.SECOND)));
            if (time.get(Calendar.HOUR) == 0 && time.get(Calendar.MINUTE) == 0 && time.get(Calendar.SECOND) == 59) {
                timeLab.setForeground(Color.red);
//                MainPage.timeT.setForeground(Color.red);
            }

            if (time.get(Calendar.SECOND) == 0 & time.get(Calendar.MINUTE) != 0) {
                time.roll(Calendar.MINUTE, false);
                time.set(Calendar.SECOND, 59);
            } else if (time.get(Calendar.MINUTE) == 0 & time.get(Calendar.SECOND) == 0) {
                if (!flag) {
                    JOptionPane.showMessageDialog(null, "Time is up..........", "Time up", JOptionPane.INFORMATION_MESSAGE);
                }
                t.stop();
                int g;
                double score;
                if (type.equals("practice")) {
                    g = 15;
                    score = submitPractice();
                } else {
                    g = 50;
                    score = submitExam();
                }
                int perc = (int) ((score / g) * 100);
//                MainPage.viewResult(score, perc);
                Thread.currentThread().stop();  //stops the timer thread
            } else {
                time.roll(Calendar.SECOND, false);
            }
        }
    }
}
