/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.pojo;

/**
 *
 * @author DELL
 */
public class ExamPojo {

    public ExamPojo(String ExamId, String Language, int TotalQuestions) {
        this.ExamId = ExamId;
        this.Language = Language;
        this.TotalQuestions = TotalQuestions;
    }
    private String ExamId;
    private String Language;
    private int TotalQuestions;

    public String getExamId() {
        return ExamId;
    }

    public void setExamId(String ExamId) {
        this.ExamId = ExamId;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public int getTotalQuestions() {
        return TotalQuestions;
    }

    public void setTotalQuestions(int TotalQuestions) {
        this.TotalQuestions = TotalQuestions;
    }
    
    
}
