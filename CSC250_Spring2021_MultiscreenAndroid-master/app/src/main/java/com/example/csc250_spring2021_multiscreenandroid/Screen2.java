package com.example.csc250_spring2021_multiscreenandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity
{
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        TextView nameTV = this.findViewById(R.id.nameTV);
        //Intent myIntent = this.getIntent();
        //this.name = myIntent.getStringExtra("name");
        //int counter = myIntent.getIntExtra("counter", -1);
        nameTV.setText(MySingleton.name + ": " + MySingleton.counter);
        public static long makeFact(int n){
        long result = 0;
        if(n == 1){
            result = 1;
        }else{
            result = n * makeFact(n-1);
        }
        return result;
    }
        public static void main(String[] args){
        long result = makeFact(5);
        System.out.println(result);
    }
    }
    }

    @Override
    protected void onPause()
    {
        super.onPause();

    }

    @Override
    protected void onStop() {
        super.onStop();
        TextView nameTV = this.findViewById(R.id.nameTV);
        nameTV.setText("WOOT");
    }

    public void onNextScreenButtonPressed(View v)
    {
        Intent i = new Intent(this, Screen3.class);
        //i.putExtra("name", this.name);
        this.startActivity(i);
    }
}