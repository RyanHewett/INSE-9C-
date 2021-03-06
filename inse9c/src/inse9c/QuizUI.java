package inse9c;

import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Brad King
 */
public class QuizUI extends javax.swing.JFrame {

    // 2 Dimensional array to store questions and possible answers. Array for correct answer.
    String[][] question1;
    String[] correctans;
    String quizTopic;
    int score;
    int count;
    int i;

    ButtonGroup bg = new ButtonGroup();
    // All Radio buttons grouped so 1 active at a time

    public QuizUI() {
        initComponents();
    }

    /**
     * Creates new form NewJFrame
     *
     * @param topic
     */
    public QuizUI(String topic) {
        initComponents();
        this.setLocationRelativeTo(null);
                
        quizTopic = topic;

        switch (quizTopic) {
            case "Alertness":
                headerLabel.setText("Topic A: " + quizTopic);
                break;
            case "Attitude":
                headerLabel.setText("Topic B: " + quizTopic);
                break;
            case "Safety and your vehicle":
                headerLabel.setText("Topic C: " + quizTopic);
                break;
            case "Hazard Awareness":
                headerLabel.setText("Topic D: " + quizTopic);
                break;
            case "Safety Margin":
                headerLabel.setText("Topic E: " + quizTopic);
                break;
            case "Motorway Rules":
                headerLabel.setText("Topic F: " + quizTopic);
                break;
            case "Vehicle Handling":
                headerLabel.setText("Topic G: " + quizTopic);
                break;
            default:
                System.out.println("error TOPICS SELECTION");
                break;
        }

        i = 0;
        score = 0;

        // Array of 3 questions (change 1st number to make bigger array)
        question1 = new String[3][5];

        question1[0][0] = "This is a question";
        question1[0][1] = "This is answer 1";
        question1[0][2] = "This is answer 2";
        question1[0][3] = "This is answer 3";
        question1[0][4] = "This is answer 4";

        correctans = new String[3];

        correctans[0] = "This is answer 4";
        correctans[1] = "This is 2 answer 3";
        correctans[2] = "This is 3 answer 1";

        question1[1][0] = "This is a second question";
        question1[1][1] = "This is 2 answer 1";
        question1[1][2] = "This is 2 answer 2";
        question1[1][3] = "This is 2 answer 3";
        question1[1][4] = "This is 2 answer 4";

        question1[2][0] = "This is a third question";
        question1[2][1] = "This is 3 answer 1";
        question1[2][2] = "This is 3 answer 2";
        question1[2][3] = "This is 3 answer 3";
        question1[2][4] = "This is 3 answer 4";

        TextfieldQuestion.setText(question1[0][0]);
        AnswerA.setText(question1[0][1]);
        AnswerA.setActionCommand(question1[0][1]);
        AnswerB.setText(question1[0][2]);
        AnswerB.setActionCommand(question1[0][2]);
        AnswerC.setText(question1[0][3]);
        AnswerC.setActionCommand(question1[0][3]);
        AnswerD.setText(question1[0][4]);
        AnswerD.setActionCommand(question1[0][4]);

        // Assigns textField and radioButton values for 1st question!
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerLabel = new javax.swing.JLabel();
        TextfieldQuestion = new javax.swing.JTextField();
        AnswerA = new javax.swing.JRadioButton();
        AnswerB = new javax.swing.JRadioButton();
        AnswerD = new javax.swing.JRadioButton();
        AnswerC = new javax.swing.JRadioButton();
        ButtonNext = new javax.swing.JButton();
        ButtonHint = new javax.swing.JButton();
        ButtonExit = new javax.swing.JButton();
        lbScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        headerLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        headerLabel.setText("Quiz Name");

        TextfieldQuestion.setEditable(false);
        TextfieldQuestion.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        TextfieldQuestion.setText("Oh Look, here's a famy looking area to store questions in");
        TextfieldQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextfieldQuestionActionPerformed(evt);
            }
        });

        bg.add(AnswerA);
        AnswerA.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        AnswerA.setText("A: This is answer A");
        AnswerA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerAActionPerformed(evt);
            }
        });

        bg.add(AnswerB);
        AnswerB.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        AnswerB.setText("B: Here's another answer");
        AnswerB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerBActionPerformed(evt);
            }
        });

        bg.add(AnswerD);
        AnswerD.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        AnswerD.setText("D: What about this one?");
        AnswerD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerDActionPerformed(evt);
            }
        });

        bg.add(AnswerC);
        AnswerC.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        AnswerC.setText("C: Is this the correct answer?");
        AnswerC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerCActionPerformed(evt);
            }
        });

        ButtonNext.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ButtonNext.setText("Next Question");
        ButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNextActionPerformed(evt);
            }
        });

        ButtonHint.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ButtonHint.setText("Hint");
        ButtonHint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHintActionPerformed(evt);
            }
        });

        ButtonExit.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ButtonExit.setText("Exit");
        ButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExitActionPerformed(evt);
            }
        });

        lbScore.setText("Score: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(TextfieldQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 112, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AnswerB)
                    .addComponent(AnswerA)
                    .addComponent(AnswerD)
                    .addComponent(AnswerC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(ButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212)
                .addComponent(headerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbScore)
                .addGap(88, 88, 88))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(ButtonHint, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(819, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbScore)
                        .addComponent(headerLabel)))
                .addGap(35, 35, 35)
                .addComponent(TextfieldQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(AnswerA)
                .addGap(18, 18, 18)
                .addComponent(AnswerB)
                .addGap(18, 18, 18)
                .addComponent(AnswerC)
                .addGap(18, 18, 18)
                .addComponent(AnswerD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(ButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(496, Short.MAX_VALUE)
                    .addComponent(ButtonHint, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextfieldQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextfieldQuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextfieldQuestionActionPerformed

    private void AnswerAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerAActionPerformed

    private void AnswerBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerBActionPerformed

    private void AnswerDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerDActionPerformed

    private void AnswerCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerCActionPerformed

    private void ButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNextActionPerformed
        // TODO add your handling code here:

        if (AnswerA.isSelected() == false && AnswerB.isSelected() == false && AnswerC.isSelected() == false && AnswerD.isSelected() == false) {

            JOptionPane.showMessageDialog(null, "Please select an answer before continuing.");
        } else {

            // Gets data from radio button. If same as answer, reward a point
            String submit = bg.getSelection().getActionCommand().toString();

            if (submit.equals(correctans[i])) {
                score = score + 1;
                lbScore.setText("Score: " + score);
            }

            

            if (i == 2) {
                End t = new End(score, correctans.length);
                t.setVisible(true);
                this.setVisible(false);
            }

            // Increment i by 1 
            i = i + 1;
            
            // Display next question
            TextfieldQuestion.setText(question1[i][0]);
            AnswerA.setText(question1[i][1]);
            AnswerA.setActionCommand(question1[i][1]);
            AnswerB.setText(question1[i][2]);
            AnswerB.setActionCommand(question1[i][2]);
            AnswerC.setText(question1[i][3]);
            AnswerC.setActionCommand(question1[i][3]);
            AnswerD.setText(question1[i][4]);
            AnswerD.setActionCommand(question1[i][4]);

        }

        if (i == 2) {
            ButtonNext.setText("Submit");
        }
        // WHAT NEEDS TO BE DONE!
        // End of quiz screen displayed
        // Hint (could be as simple as changing text color to red for 2 items)

    }//GEN-LAST:event_ButtonNextActionPerformed

    private void ButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExitActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Are you sure?", "alert", JOptionPane.OK_CANCEL_OPTION);
        if (result == 0) {
            Menu m = new Menu();
            m.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_ButtonExitActionPerformed

    private void ButtonHintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHintActionPerformed
        JOptionPane.showMessageDialog(null, "HINT PLACEHOLDER");
    }//GEN-LAST:event_ButtonHintActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuizUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AnswerA;
    private javax.swing.JRadioButton AnswerB;
    private javax.swing.JRadioButton AnswerC;
    private javax.swing.JRadioButton AnswerD;
    private javax.swing.JButton ButtonExit;
    private javax.swing.JButton ButtonHint;
    private javax.swing.JButton ButtonNext;
    private javax.swing.JTextField TextfieldQuestion;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel lbScore;
    // End of variables declaration//GEN-END:variables
}
