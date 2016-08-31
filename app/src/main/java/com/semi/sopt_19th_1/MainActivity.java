package com.semi.sopt_19th_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button toastMsg;
    private Button nextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /**
         * onCreate()는 Activity가 생성될 때 호출됩니다
         * 주로 사용자 인터페이스 초기화에 사용됩니다.
         */

        /**
         * 기기의 재현스탭을 확인하기위해 남기는 일종의 발자국 같은 기능입니다
         */
        Log.i("myTag", "MainPage onCreate가 실행됨");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         * toastMsg 버튼에 대한 초기화 및 클릭이벤트 부여
         */
        toastMsg = (Button)findViewById(R.id.toastMsg);
        toastMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Toash 메시지입니다.",Toast.LENGTH_SHORT).show();
            }
        });

        nextPage = (Button)findViewById(R.id.nextPage);
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Page2.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("myTag", "MainPage onResume가 실행됨");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("myTag", "MainPage onPause가 실행됨");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("myTag", "MainPage onDestroy가 실행됨");
    }
}
