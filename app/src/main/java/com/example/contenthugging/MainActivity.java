package com.example.contenthugging;

import android.os.Bundle;
import android.widget.StackView;


import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    StackView stackView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stackView=findViewById(R.id.stack_view);
    }


    private List<String> numberWord()
    {
        List<String> word=new ArrayList<>();
        word.add("One");
        word.add("Two");
        word.add("Three");
        word.add("Four");
        word.add("Five");
        return word;
    }

    private List<Integer> numberImage()
    {
        List<Integer> image=new ArrayList<>();
        image.add(R.drawable.one);
        image.add(R.drawable.two);
        image.add(R.drawable.three);
        image.add(R.drawable.four);
        image.add(R.drawable.five);
        return image;
    }

}