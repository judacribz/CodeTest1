package ca.judacribz.codingtest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import static ca.judacribz.codingtest1.Algorithms.mostOccurrences;

public class MostFrequentOccurrActivity extends AppCompatActivity {

    ArrayList numList;
    EditText etNumber;
    TextView tvMostFrequent;
    int[] nums;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_most_frequent_occurr);

        etNumber = findViewById(R.id.etNumber);
        tvMostFrequent = findViewById(R.id.tvMostFrequent);
        numList = new ArrayList<Integer>();
    }

    public void saveToList(View view) {
        if (!etNumber.getText().toString().isEmpty()) {
            nums = new int[numList.size() + 1];
            numList.add(Integer.valueOf(etNumber.getText().toString()));

            for (int i = 0; i < nums.length; i++) {
                nums[i] = (int)numList.get(i);
            }

            tvMostFrequent.setText(String.valueOf(mostOccurrences(nums)));

            etNumber.setText("");
        }
    }

    public void clearArray(View view) {
        numList = new ArrayList();
        etNumber.setText("");
    }
}
