package com.example.jyace.mynotes.com.tops.notes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.jyace.mynotes.R;

/**
 * Created by Jyace on 2016/4/13.
 */
public class Login extends Activity {
private Button bt1,bt2;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login2);
        bt1=(Button)findViewById(R.id.button3);
        bt2=(Button)findViewById(R.id.button4);
        editText=(EditText)findViewById(R.id.editText2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password=editText.getText().toString();
                if(password.equals("不念过往，不畏将来")){
                    Intent intent=new Intent(Login.this,MainActivity.class);
                    startActivity(intent);
                    finish();


                }
                else {

                    Toast.makeText(Login.this,"密码错误请重新输入或选择退出",Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}
