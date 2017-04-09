package wai.diver;

import java.io.Serializable;

/**
 * Created by 酱面 on 2017/4/9.
 */
public class favoritetest implements Serializable {
    private  Integer drivingNo3;
    private  String  drivingPlem3;
    private  Integer testPicture3;

    public Integer getDrivingNo3() {
        return drivingNo3;
    }

    public void setDrivingNo3(Integer drivingNo3) {
        this.drivingNo3 = drivingNo3;
    }

    public String getDrivingPlem3() {
        return drivingPlem3;
    }

    public void setDrivingPlem3(String drivingPlem3) {
        this.drivingPlem3 = drivingPlem3;
    }

    public Integer getTestPicture3() {
        return testPicture3;
    }

    public void setTestPicture3(Integer testPicture3) {
        this.testPicture3 = testPicture3;
    }
}
