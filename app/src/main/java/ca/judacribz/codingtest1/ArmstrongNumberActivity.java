package ca.judacribz.codingtest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static ca.judacribz.codingtest1.Algorithms.isArmstrongNumber;

public class ArmstrongNumberActivity extends AppCompatActivity {

    private static String IS_ARMSTRONG = "%d is %s an armstrong number";
    private static String NOT = "not";

    EditText etArmstrong;
    TextView tvArmstrongOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armstrong_number);
        etArmstrong = findViewById(R.id.etArmstrong);
        tvArmstrongOut = findViewById(R.id.tvArmstrongOut);

    }

    public void checkArmstrong(View view) {
        tvArmstrongOut.setText(String.format(
                IS_ARMSTRONG,
                Integer.valueOf(etArmstrong.getText().toString()),
                isArmstrongNumber(Integer.valueOf(etArmstrong.getText().toString())) ?
                        "" :
                        NOT
        ));
    }

}
