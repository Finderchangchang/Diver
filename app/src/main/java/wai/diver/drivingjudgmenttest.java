package wai.diver;

import java.io.Serializable;

/**
 * 判断题
 * Created by 酱面 on 2017/4/9.
 */
public class drivingjudgmenttest implements Serializable {

    private  Integer drivingNo2;
    private  String drivingproBlem2;
    private  String judgmentAnswer;
    private Integer testPicture2;

    public Integer getDrivingNo2() {
        return drivingNo2;
    }

    public void setDrivingNo2(Integer drivingNo2) {
        this.drivingNo2 = drivingNo2;
    }

    public String getDrivingproBlem2() {
        return drivingproBlem2;
    }

    public void setDrivingproBlem2(String drivingproBlem2) {
        this.drivingproBlem2 = drivingproBlem2;
    }

    public String getJudgmentAnswer() {
        return judgmentAnswer;
    }

    public void setJudgmentAnswer(String judgmentAnswer) {
        this.judgmentAnswer = judgmentAnswer;
    }

    public Integer getTestPicture2() {
        return testPicture2;
    }

    public void setTestPicture2(Integer testPicture2) {
        this.testPicture2 = testPicture2;
    }
}
