package com.example.leys.m1c20152016_planibu.menu_principal_choix;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.leys.m1c20152016_planibu.R;

import java.io.IOException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class SelectionContact extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    EditText msgTextField;
    EditText mailTextField;
    EditText objTextField;
    Button sendButton;
    Spinner subject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_contact);

        //make message text field object
        mailTextField = (EditText) findViewById(R.id.contact_email);
        objTextField = (EditText) findViewById(R.id.contact_obj);
        msgTextField = (EditText) findViewById(R.id.contact_msg);

        //make button object
        sendButton = (Button) findViewById(R.id.contact_send);
        sendButton.setOnClickListener(this);


    }

    public void onClick(View v)
    {
        if(mailTextField.getText().toString().length()==0)
        {
            mailTextField.setError( "Veuillez saisir votre email" );
        }
        else if(objTextField.getText().toString().length()==0)
        {
            objTextField.setError( "Veuillez saisir un objet" );
        }
        else if(msgTextField.getText().toString().length() == 0)
        {
            msgTextField.setError( "Veuillez saisir un message" );
        }
             else
        {

            Intent email = new Intent(Intent.ACTION_SEND);
            email.putExtra(Intent.EXTRA_EMAIL, new String[]{"leyla.elattar@gmail.com"});
            email.putExtra(Intent.EXTRA_SUBJECT, objTextField.toString());
            email.putExtra(Intent.EXTRA_TEXT, Html.fromHtml(String.valueOf(msgTextField)));
//            email.setType("message/rfc822");
            email.setType("plain/text");
            startActivityForResult(Intent.createChooser(email, "Contact BU Paris 10"),1);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {

        new AlertDialog.Builder(MijnEersteAppActivity.this)
                .setMessage("Your requested has been Accepted\nThank You")
                .setCancelable(false)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which)
                    {
                        dialog.cancel();
                    }
                })
                .show();
    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }
    */
}
