package com.example.autocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> arrayAdapter;
    String[] items = {"What is your name", "how old are you"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView = findViewById(R.id.autoComplete);

        arrayAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_activated_1,items);
        autoCompleteTextView.setAdapter(arrayAdapter);




    }
}
