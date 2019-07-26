package ca.judacribz.codingtest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static ca.judacribz.codingtest1.Algorithms.fizzBuzz;

public class FizzBuzzActivity extends AppCompatActivity {

    EditText etNumber;
    TextView tvFizzBuzz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fizz_buzz);

        etNumber = findViewById(R.id.etNumber);
        tvFizzBuzz = findViewById(R.id.tvFizzBuzz);
    }


    public void outFizzBuzz(View view) {
        tvFizzBuzz.setText(fizzBuzz(Integer.valueOf(etNumber.getText().toString())));
    }
}
