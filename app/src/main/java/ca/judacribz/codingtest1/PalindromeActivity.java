package ca.judacribz.codingtest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PalindromeActivity extends AppCompatActivity {

    private static String IS_PALINDROME = "'%s' is %s a palindrome";
    private static String NOT = "not";

    EditText etPalindrome;
    TextView tvPalindromeOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        etPalindrome = findViewById(R.id.etPalindrome);
        tvPalindromeOut = findViewById(R.id.tvPalindromeOut);
    }

    public void checkPalindrome(View view) {
        tvPalindromeOut.setText(String.format(
                IS_PALINDROME,
                etPalindrome.getText().toString(),
                Algorithms.isPalindrome(etPalindrome.getText().toString().trim()) ?
                        "" :
                        NOT
        ));
    }
}
