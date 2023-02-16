/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.gui;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import techquizapp.dao.PerformanceDAO;
import techquizapp.dao.QuestionDAO;
import techquizapp.pojo.Answer;
import techquizapp.pojo.AnswerStore;
import techquizapp.pojo.ExamPojo;
import techquizapp.pojo.Performance;
import techquizapp.pojo.QuestionStore;
import techquizapp.pojo.Questions;
import techquizapp.pojo.UserProfile;

public class TakeTestFrame extends javax.swing.JFrame { 
private ExamPojo exam;
    AnswerStore astore;
    private int pos=0;
    private int qno;
   QuestionStore qstore;
   String Option1,Option2,Option3,Option4;
   String Answer1,Answer2,Answer3,Answer4;
    
    public TakeTestFrame() {
        
        initComponents();
        setLocationRelativeTo(null);
        lblUserName.setText("Hello "+UserProfile.getUsername());
        astore = new AnswerStore();
        qstore=new QuestionStore();
        qno=1;
        lblQno.setText(lblQno.getText()+""+qno);
    }

    public TakeTestFrame(ExamPojo exam)
    { 
         
       this();
       
       this.exam = exam;
       lblTitle.setText("TAKE TEST " +exam.getLanguage().toUpperCase()+ " Paper");
        
        loadQuestions();
        showQuestion();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jrOption1 = new javax.swing.JRadioButton();
        jrOption2 = new javax.swing.JRadioButton();
        jrOption3 = new javax.swing.JRadioButton();
        jrOption4 = new javax.swing.JRadioButton();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnCancle = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        lblTitle = new javax.swing.JLabel();
        lblQno = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jrOption1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(jrOption1);
        jrOption1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrOption1.setForeground(new java.awt.Color(255, 255, 255));
        jrOption1.setText("jRadioButton1");

        jrOption2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(jrOption2);
        jrOption2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrOption2.setForeground(new java.awt.Color(255, 255, 255));
        jrOption2.setText("jRadioButton2");
        jrOption2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrOption2ActionPerformed(evt);
            }
        });

        jrOption3.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(jrOption3);
        jrOption3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrOption3.setForeground(new java.awt.Color(255, 255, 255));
        jrOption3.setText("jRadioButton3");

        jrOption4.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(jrOption4);
        jrOption4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrOption4.setForeground(new java.awt.Color(255, 255, 255));
        jrOption4.setText("jRadioButton4");

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnCancle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancle.setText("Cancle");

        btnDone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        txtQuestion.setBackground(new java.awt.Color(0, 0, 0));
        txtQuestion.setColumns(20);
        txtQuestion.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtQuestion.setForeground(new java.awt.Color(255, 255, 255));
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lblQno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQno.setForeground(new java.awt.Color(255, 255, 255));
        lblQno.setText("Question No:");

        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrOption1)
                            .addComponent(jrOption3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext)
                        .addGap(62, 62, 62)
                        .addComponent(btnPrevious)
                        .addGap(47, 47, 47)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrOption4)
                            .addComponent(jrOption2))
                        .addContainerGap(185, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDone)
                        .addGap(59, 59, 59))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrOption1)
                            .addComponent(jrOption2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrOption3)
                            .addComponent(jrOption4))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNext)
                            .addComponent(btnCancle)
                            .addComponent(btnDone)
                            .addComponent(btnPrevious)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrOption2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrOption2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrOption2ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        String chosenAnswer=getUserAnswer();
        System.out.println("Chosen: = " +chosenAnswer);
        if(chosenAnswer!=null){
        Questions question=qstore.getQuestionByQno(qno);
        String correctAnswer=question.getCorrectAnswer();
        Answer newanswer=new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
        Answer answer=astore.getAnswerByQno(qno);
            System.out.println(answer);
        if(answer==null)
            astore.addAnswer(newanswer);
        else{
            if(newanswer.getChosenAnswer().equals(answer.getChosenAnswer())==false)
            {
                int apos=astore.removeAnswer(answer);
                astore.setAnswerAt(apos, newanswer);
            }
        }
     }
        pos++;
        if(pos>=qstore.getCount())
        {
            pos=0;
        }
         qno++;         
        if(qno>qstore.getCount())
                qno=1;
        lblQno.setText("Question no:"+qno);
        showQuestion();
    
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null){
        Questions question=qstore.getQuestionByQno(qno);
        String correctAnswer=question.getCorrectAnswer();
        Answer newanswer=new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
        Answer answer=astore.getAnswerByQno(qno);
        if(answer==null)
            astore.addAnswer(newanswer);
        else{
            if(newanswer.getChosenAnswer().equals(answer.getChosenAnswer())==false){
                int apos=astore.removeAnswer(answer);
                astore.setAnswerAt(apos, newanswer);
            }
        }
     }
        pos--;
        if(pos<0)
        {
            pos=qstore.getCount()-1;
        }
      qno--;
        if(qno<=0)
        qno=qstore.getCount();
        lblQno.setText("Question no:"+qno);
        showQuestion();

    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed

        String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null){
        Questions question=qstore.getQuestionByQno(qno);
        String correctAnswer=question.getCorrectAnswer();
        Answer newanswer=new Answer(exam.getExamId(),exam.getLanguage(),qno,chosenAnswer,correctAnswer);
        Answer answer=astore.getAnswerByQno(qno);
        if(answer==null)
            astore.addAnswer(newanswer);
        else{
            if(newanswer.getChosenAnswer().equals(answer.getChosenAnswer())==false){
                int apos=astore.removeAnswer(answer);
                astore.setAnswerAt(apos, newanswer);
            }
        }
     }
        int right=0,wrong=0;
        for(Questions quest:qstore.getAllQuestions())
        {
            int qno=quest.getQno();
            Answer ans=astore.getAnswerByQno(qno);
            if(ans==null)
                continue;
            String attempedAns=ans.getChosenAnswer();
            String correctAns=ans.getCorrectAnswer();
            if(attempedAns.equals(correctAns))
                ++right;
            else
                ++wrong;
        }
        StringBuilder sb=new StringBuilder();
        sb.append("\nRight ans:"+right);
        sb.append("\nWrong ans:"+wrong);
        sb.append("\nUnattempted:"+(qstore.getCount()-(right+wrong)));
        JOptionPane.showMessageDialog(null,sb.toString(),"Result",JOptionPane.INFORMATION_MESSAGE);
        try
        {
            Performance perf=new Performance(exam.getExamId(),UserProfile.getUsername(),exam.getLanguage(),right,wrong,qstore.getCount()-(right+wrong),(double)right/qstore.getCount()*100);
            PerformanceDAO.addPerformance(perf);
            JOptionPane.showMessageDialog(null,"Result Saved!|nThank you for test","Done",JOptionPane.INFORMATION_MESSAGE);
            ChoosePaperFrame choosePaper=new ChoosePaperFrame();
            choosePaper.setVisible(true);
            this.dispose();
        }
        catch(SQLException ex)
        {
           JOptionPane.showMessageDialog(null,"TakeTest Error ","ERROR",JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
        }
    }//GEN-LAST:event_btnDoneActionPerformed

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
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeTestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrOption1;
    private javax.swing.JRadioButton jrOption2;
    private javax.swing.JRadioButton jrOption3;
    private javax.swing.JRadioButton jrOption4;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables

private void loadQuestions()
   {
       try
       {
       ArrayList<Questions>questionsList=QuestionDAO.getQuestionsByExamId(exam.getExamId());
       
       for(Questions q:questionsList)
       {
         qstore.addQuestion(q);
       }
       
      }
       catch(SQLException ex)
        {
           JOptionPane.showMessageDialog(null," Edit Question Error! ","ERROR",JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
        }
   }
private void showQuestion()
    {
        buttonGroup2.clearSelection();
        Questions q=qstore.getQuestion(pos);
        System.out.println(q);
        txtQuestion.setText(q.getQuestion());
        jrOption1.setText(q.getAnswer1());
        jrOption2.setText(q.getAnswer2());
        jrOption3.setText(q.getAnswer3());
        jrOption4.setText(q.getAnswer4());
        Answer ans=astore.getAnswerByQno(qno);
        if(ans==null)
        {
            return;
        }
        String str=ans.getChosenAnswer();
        switch(str)
        {
            case"Option1":
                jrOption1.setSelected(true);
                break;
            case"Option2":
                jrOption2.setSelected(true);
                break;
            case"Option3":
                jrOption3.setSelected(true);
                break;    
            case"Option4":
                jrOption4.setSelected(true);
                break;    
        }
    }
    private String getUserAnswer()
    {
       if(jrOption1.isSelected())
           return Option1;
       else if(jrOption2.isSelected())
           return Option2;
       else if(jrOption3.isSelected())
           return Option3;
       else if(jrOption4.isSelected())
           return Option4;
       else
           return null;
    }
}