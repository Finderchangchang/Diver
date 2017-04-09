package wai.diver;

import java.io.Serializable;

/**
 * 单选题
 * Created by 酱面 on 2017/4/9.
 */
public class drivingchoicetest implements Serializable {
    private Integer drivingNo1;
    private String drivingProblem1;
    private String aChoice;
    private String bChoice;
    private String cChoice;
    private String dChoice;
    private String choiveAnswer;//正确答案
    private Integer testPicture1;


    public Integer getDrivingNo1() {
        return drivingNo1;
    }

    public void setDrivingNo1(Integer drivingNo1) {
        this.drivingNo1 = drivingNo1;
    }

    public String getDrivingProblem1() {
        return drivingProblem1;
    }

    public void setDrivingProblem1(String drivingProblem1) {
        this.drivingProblem1 = drivingProblem1;
    }

    public String getaChoice() {
        return aChoice;
    }

    public void setaChoice(String aChoice) {
        this.aChoice = aChoice;
    }

    public String getbChoice() {
        return bChoice;
    }

    public void setbChoice(String bChoice) {
        this.bChoice = bChoice;
    }

    public String getcChoice() {
        return cChoice;
    }

    public void setcChoice(String cChoice) {
        this.cChoice = cChoice;
    }

    public String getdChoice() {
        return dChoice;
    }

    public void setdChoice(String dChoice) {
        this.dChoice = dChoice;
    }

    public String getChoiveAnswer() {
        return choiveAnswer;
    }

    public void setChoiveAnswer(String choiveAnswer) {
        this.choiveAnswer = choiveAnswer;
    }

    public Integer getTestPicture1() {
        return testPicture1;
    }

    public void setTestPicture1(Integer testPicture1) {
        this.testPicture1 = testPicture1;
    }
}
