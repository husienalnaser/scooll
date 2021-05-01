package com.example.schoo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.schoolender.R;

public class subject extends AppCompatActivity {
    String selectedcolors="Blue";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);
        RecyclerView rv = findViewById(R.id.rec);
        rv.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        Button insert1 = findViewById(R.id.insert1);
        final SubAdapter ad = new SubAdapter(this);
        rv.setAdapter(ad);

        insert1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final AlertDialog.Builder alert = new AlertDialog.Builder(subject.this);
                final EditText edittext = new EditText(subject.this);
                final EditText edittext2 = new EditText(subject.this);
                final EditText edittext3 = new EditText(subject.this);

                alert.setMessage("what mission would you like to add?");

                alert.setView(edittext);


                alert.setPositiveButton("Add", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //What ever you want to do with the value
                        // Editable YouEditTextValue = edittext.getText();
                        //OR

                        String activity = edittext.getText().toString();

                        arry2.arrayl.add(activity);
                        ad.notifyDataSetChanged();
                        final AlertDialog.Builder alert2=new AlertDialog.Builder(subject.this);
                        EditText editText4=new EditText(subject.this);
                        alert2.setMessage("when will the mission end?");
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