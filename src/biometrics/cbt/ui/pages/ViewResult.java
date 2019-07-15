package biometrics.cbt.ui.pages;

import java.util.ArrayList;

/**
 *
 * @author JBoss
 */
public class ViewResult extends javax.swing.JPanel {

    ArrayList<String> missedQuestion, missedAnswer, missedOption;
    int index = 0;

    public ViewResult() {
        initComponents();
        area.setVisible(false);
        answer.setVisible(false);
        prev.setVisible(false);
        next.setVisible(false);
        missedQuestion = new ArrayList<String>();
        missedAnswer = new ArrayList<String>();
        missedOption = new ArrayList<String>();
        for (String loop : QuestionBody.missedQuestion) {
            missedQuestion.add(loop);
        }
        for (String loop : QuestionBody.missedAnswer) {
            missedAnswer.add(loop);
        }
        for (String loop : QuestionBody.missedOption) {
            missedOption.add(loop);
        }
        prev.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fullName = new javax.swing.JLabel();
        matric = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        progress = new javax.swing.JProgressBar();
        missedLab = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        scrollPane = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        answer = new javax.swing.JLabel();
        prev = new javax.swing.JButton();
        next = new javax.swing.JButton();
        answerLab = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 0));
        jLabel1.setText("Please Find Your Result Below");

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Image3.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Nyala", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 0));
        jLabel3.setText("Full Name:");

        jLabel4.setFont(new java.awt.Font("Nyala", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 0));
        jLabel4.setText("Matric:");

        fullName.setFont(new java.awt.Font("Nyala", 1, 18)); // NOI18N
        fullName.setForeground(new java.awt.Color(102, 0, 0));
        fullName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullName.setText("Adekola Rasheedah Titilope");

        matric.setFont(new java.awt.Font("Nyala", 1, 18)); // NOI18N
        matric.setForeground(new java.awt.Color(102, 0, 0));
        matric.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        matric.setText("103569");

        jLabel7.setFont(new java.awt.Font("Nyala", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 0));
        jLabel7.setText("Score:");

        score.setFont(new java.awt.Font("Nyala", 1, 18)); // NOI18N
        score.setForeground(new java.awt.Color(102, 0, 0));
        score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        score.setText("05");

        jLabel9.setFont(new java.awt.Font("Nyala", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 0));
        jLabel9.setText("Percentage:");

        progress.setStringPainted(true);

        missedLab.setFont(new java.awt.Font("Nyala", 1, 20)); // NOI18N
        missedLab.setForeground(new java.awt.Color(0, 51, 51));
        missedLab.setText("Here are the questions you missed");

        area.setEditable(false);
        area.setColumns(20);
        area.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        area.setLineWrap(true);
        area.setRows(5);
        area.setWrapStyleWord(true);
        scrollPane.setViewportView(area);

        answer.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        answer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        answer.setText("A compiler translates high level languages to machine language while translator is any software that translates to machine language");

        prev.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        prev.setForeground(new java.awt.Color(0, 51, 51));
        prev.setText("<<PREVIOUS");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });

        next.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        next.setForeground(new java.awt.Color(0, 51, 51));
        next.setText("NEXT>>");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        answerLab.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        answerLab.setForeground(new java.awt.Color(0, 51, 51));
        answerLab.setText("Answer:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(298, 298, 298)
                                .addComponent(image))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(score)
                                            .addComponent(matric, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(fullName, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                            .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addComponent(missedLab)))
                        .addGap(0, 194, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(prev)
                        .addGap(18, 18, 18)
                        .addComponent(next))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(answerLab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(answer, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fullName, matric, score});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {next, prev});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fullName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(matric))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(score))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9))
                    .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(missedLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answer)
                    .addComponent(answerLab))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prev, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(next))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {next, prev});

    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        if (index < missedQuestion.size()) {
            index++;
            area.setText(missedQuestion.get(index) + "\nA: " + missedOption.get((index * 4)) + "\nB: " + missedOption.get(((index * 4) + 1)) + "\nC: " + missedOption.get(((index * 4) + 2)) + "\nD: " + missedOption.get(((index * 4) + 3)));
            answer.setText(missedAnswer.get(index));
            if (index == missedQuestion.size() - 1) {
                next.setEnabled(false);
            }
        }
        prev.setEnabled(true);
    }//GEN-LAST:event_nextActionPerformed

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
        if (index > 0) {
            index--;
            area.setText(missedQuestion.get(index) + "\nA: " + missedOption.get((index * 4)) + "\nB: " + missedOption.get(((index * 4) + 1)) + "\nC: " + missedOption.get(((index * 4) + 2)) + "\nD: " + missedOption.get(((index * 4) + 3)));
            answer.setText(missedAnswer.get(index));
            if (index == 0) {
                prev.setEnabled(false);
            }
        }
        next.setEnabled(true);
    }//GEN-LAST:event_prevActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel answer;
    public javax.swing.JLabel answerLab;
    public javax.swing.JTextArea area;
    public javax.swing.JLabel fullName;
    public static javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel matric;
    public javax.swing.JLabel missedLab;
    public javax.swing.JButton next;
    public javax.swing.JButton prev;
    public javax.swing.JProgressBar progress;
    public javax.swing.JLabel score;
    public javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
