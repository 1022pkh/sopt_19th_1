package com.semi.sopt_19th_1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        /**
         * Splash 이미지를 보여준 후 2초 후 자동적으로 메인페이지로 이동하게 해주는 부분입니다.
         *
         * Handler 란??
         * 다른 객체가 보낸 메시지 수신, 처리하는 객체
         * 서브 쓰레드가 보낸 메시지를 받아 UI를 변경
         * 메인 쓰레드에서만 UI를 변경할 수 있으므로!!
         */
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);

    }
}
