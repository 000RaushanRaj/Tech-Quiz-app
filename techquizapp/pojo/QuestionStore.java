/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.pojo;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class QuestionStore {

    @Override
    public String toString() {
        return "QuestionStore{" + "questionList=" + questionList + '}';
    }

   
    
    ArrayList<Questions>questionList;   

    public QuestionStore() {
        questionList =new ArrayList<>();
    }
    public void addQuestion(Questions q)
    {
       questionList.add(q);
    }
    public Questions getQuestion(int pos)
    {
       return questionList.get(pos);
    }
    public Questions getQuestionByQno(int qno)
    {
       for(Questions quest:questionList)
        {
            if(quest.getQno()==qno)
                return quest;
        }
        return null; 
    }
    public void removeQuestion(int pos)
    {
        questionList.remove(pos);
    }
    public void setQuestionAt(int pos, Questions q)
    {
        questionList.add(pos, q);
    }
    public ArrayList<Questions>getAllQuestions()
     {
         return questionList;    
     } 
    public int getCount()
    {
        return questionList.size();
    }
}
