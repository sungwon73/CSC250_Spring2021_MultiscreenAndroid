package com.example.csc250_spring2021_multiscreenandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Screen3 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        TextView nameTV = this.findViewById(R.id.nameTV);
        //Intent myIntent = this.getIntent();
        //String name = myIntent.getStringExtra("name");
        public class Sqrt {
            public static void main(String[] args)  {
                double result = Math.sqrt(this);
                System.out.println(result);
            }
        }
        nameTV.setText(MySingleton.name + ": " + MySingleton.counter);
    }
}