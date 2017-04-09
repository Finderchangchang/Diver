package wai.diver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<drivingjudgmenttest> panduan = new ArrayList<>();//判断题
    List<drivingchoicetest> xuanze = new ArrayList<>();//选择题
    int position = 0;
    TextView title_tv;
    TextView content_tv;
    RadioGroup choice_rg;
    RadioButton a_rb;
    RadioButton b_rb;
    RadioButton c_rb;
    RadioButton d_rb;

    /**
     * 先判断题再选择题
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        content_tv = (TextView) findViewById(R.id.content_tv);
        title_tv = (TextView) findViewById(R.id.title_tv);
        choice_rg = (RadioGroup) findViewById(R.id.choice_rg);
        a_rb = (RadioButton) findViewById(R.id.a_rb);
        b_rb = (RadioButton) findViewById(R.id.b_rb);
        c_rb = (RadioButton) findViewById(R.id.c_rb);
        d_rb = (RadioButton) findViewById(R.id.d_rb);

        for (int i = 0; i < panduan.size() + xuanze.size(); i++) {
            if (position > panduan.size()) {
                //选择题

            } else {//判断题
                content_tv.setText(panduan.get(i).getDrivingproBlem2());
                switch (choice_rg.getCheckedRadioButtonId()) {
                    case R.id.a_rb:
                        if (("对").equals(panduan.get(i).getJudgmentAnswer())) {
                            Toast.makeText(this, "回答正确", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(this, "回答错误", Toast.LENGTH_SHORT).show();
                        }
                        break;
                    case R.id.b_rb:
                        if (("错").equals(panduan.get(i).getJudgmentAnswer())) {
                            Toast.makeText(this, "回答正确", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(this, "回答错误", Toast.LENGTH_SHORT).show();
                        }
                        break;
                }
            }
        }
    }
}
