package com.example.excercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnlogin;
    EditText edEmail, edPassword;
    String email, password;
    View tanya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin=findViewById(R.id.buttonlgn);
        edEmail=findViewById(R.id.Inpemail);
        edPassword=findViewById(R.id.InpPass);
        tanya = findViewById(R.id.tanya);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), DataKontak.class));
                email = edEmail.getText().toString();
                password = edPassword.getText().toString();

                if (email.equals("yasminaazzahra@gmail.com") && password.equals("20190140005")){
                    Toast y = Toast.makeText(getApplicationContext(),
                            "Berhasil, \n Email : "+email+"\nPassword : "+password, Toast.LENGTH_LONG);
                    y.show();

                    Bundle bun = new Bundle();
                    bun.putString("Par1", email.trim());
                    bun.putString("Par2", password.trim());

                    Intent intb = new Intent(MainActivity.this, DataKontak.class);
                    intb.putExtras(bun);
                    startActivity(new Intent(getApplicationContext(), DataKontak.class));
                }
                else if(!email.equals("yasminaazzahra@gmail.com") && password.equals("20190140005")){
                    Toast y = Toast.makeText(getApplicationContext(),
                            "Login Gagal, Email Salah", Toast.LENGTH_LONG);
                    y.show();
                }
                else if (email.equals("yasminaazzahra@gmail.com") && !password.equals("20190140005")){
                    Toast y = Toast.makeText(getApplicationContext(),
                            "Login Gagal, Password Salah", Toast.LENGTH_LONG);
                    y.show();
                }
                else{
                    Toast y = Toast.makeText(getApplicationContext(),
                            "Gagal, \n Email Salah dan Password Salah", Toast.LENGTH_LONG);
                    y.show();
                }
            }

            public boolean InputData()
            {
                String emailActive = "yasminaazzahra@gmail.com";
                String passActive = "20190140005";

                if (emailActive.equals(edEmail.getText().toString()) && passActive.equals(edPassword.getText().toString())){
                    return true;
                }
                return false;
            }
        });
        tanya.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), DataKontak.class));
            }
        });
    }
}