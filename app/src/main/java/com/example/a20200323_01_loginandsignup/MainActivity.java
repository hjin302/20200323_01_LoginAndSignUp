package com.example.a20200323_01_loginandsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.a20200323_01_loginandsignup.databinding.ActivityMainBinding;
import com.example.a20200323_01_loginandsignup.utils.ContextUtil;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {
//        로그인 버튼을 누르면 => 입력 되어있는 이메일 저장
        binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputEmail = binding.emailEdt.getText().toString();

                ContextUtil.setEmail(mContext, inputEmail);
            }
        });

    }

    @Override
    public void setValues() {
//      이 화면을 키면, 저장된 이메일 값을 emailEdt에 입력.
        binding.emailEdt.setText(ContextUtil.getEmail(mContext));
    }
}
