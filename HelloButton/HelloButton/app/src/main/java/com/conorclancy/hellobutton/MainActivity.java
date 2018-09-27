package com.conorclancy.hellobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private TextView mMessageTextView;
    private int mCounter = 0;
   
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // This method is called when the app launches
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  Code you add goes after the setContentView call

        mMessageTextView = findViewById(R.id.message_textview);

        final Button resetButton=findViewById(R.id.reset_button);

        //Buttonisalocalvariable

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter = 0;
                updateView();
            }
        });
        //mMessageTextView.setText("Conoriscool!");
        //Log.d("HB","Thisisalogcatlog.Logsareimportant");
        //tag-makesiteasiertofinditinthelogs


    }
              // For OnClick
        public void handleDecrement(View view)
        {
            mCounter = mCounter -1;
            //mCounter--;
            updateView();
        }

        public void handleIncrement(View view){
            mCounter +=1;
            updateView();
        }

       
       private void updateView()
       {
        mMessageTextView.setText(getString(R.string.message_format, mCounter));
       }
}
