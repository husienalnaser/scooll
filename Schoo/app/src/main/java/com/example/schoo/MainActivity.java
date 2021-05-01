package com.example.schoo;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.schoolender.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String selectedcolor="blue";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button insert = findViewById(R.id.insert);



        RecyclerView rv = findViewById(R.id.rec);
        rv.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        final Adapter ad = new Adapter(this);
        rv.setAdapter(ad);

        insert.setOnClickListener(new View.OnClickListener() {
                @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                final EditText edittext = new EditText(MainActivity.this);

                alert.setMessage("what mission would like to add?");

                alert.setView(edittext);


                alert.setPositiveButton("Add", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, final int whichButton) {
                        //What ever you want to do with the value
                        // Editable YouEditTextValue = edittext.getText();
                        //OR

                        String activity = edittext.getText().toString();
                        arry.arrayl.add(activity);
                        ad.notifyDataSetChanged();
                        final AlertDialog.Builder alert2=new AlertDialog.Builder(MainActivity.this);
                        EditText editText4=new EditText(MainActivity.this);
                        alert2.setMessage("when will the mission end?");
                        String activity1 = editText4.getText().toString();
                        arry3.arrayl.add(activity1);
                        alert2.setView(editText4);
                        alert2.setPositiveButton("done", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        alert2.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        alert2.show();


                    }


                });
                    alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {
                            // what ever you want to do with No option.
                        }
                    });

                    alert.show();
                }

        });


    }
}