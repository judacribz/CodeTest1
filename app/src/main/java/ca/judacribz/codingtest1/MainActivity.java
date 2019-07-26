package ca.judacribz.codingtest1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToPalindromeActivity(View view) {
        startActivity(new Intent(this, PalindromeActivity.class));
    }

    public void goToMostFrequentOccurrActivity(View view) {
        startActivity(new Intent(this, MostFrequentOccurrActivity.class));
    }

    public void goToFizzBuzzActivity(View view) {
        startActivity(new Intent(this, FizzBuzzActivity.class));
    }

    public void goToArmstrongNumberActivity(View view) {
        startActivity(new Intent(this, ArmstrongNumberActivity.class));
    }
}
