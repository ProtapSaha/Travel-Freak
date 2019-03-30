package com.example.protap.travelfreak;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Signup extends AppCompatActivity implements View.OnClickListener {
    private Button btnregister;
    private EditText etemail;
    private EditText etpassword;

    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        firebaseAuth =FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser() != null){
            finish();
            startActivity(new Intent(getApplicationContext(),Travel_freak.class));
        }

        progressDialog= new ProgressDialog(this);

        btnregister=(Button) findViewById(R.id.btnregister);
        etemail=(EditText) findViewById(R.id.etemail);
        etpassword=(EditText)findViewById(R.id.etpassword);

        btnregister.setOnClickListener(this);
    }
    private void registeruser(){
        String email= etemail.getText().toString().trim();
        String password= etpassword.getText().toString().trim();

        if (TextUtils.isEmpty(email)){
            //email empty
            Toast.makeText(this,"Please enter Email", Toast.LENGTH_LONG).show();
            return;
        }
        if (TextUtils.isEmpty(password)){
            Toast.makeText(this,"Please enter Password", Toast.LENGTH_LONG).show();
            return;
        }
        progressDialog.setMessage("Registering user...");
        progressDialog.show();

        firebaseAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            finish();
                            Toast.makeText(Signup.this,"Registration success",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(),Travel_freak.class));
                        }
                        else{
                            //finish();
                            //startActivity(new Intent(getApplicationContext(),Travel_freak.class));
                            Toast.makeText(Signup.this,"Registration not successfull", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
    @Override
    public void onClick(View view) {
        if(view == btnregister)
        {
            registeruser();
        }
    }
}

