package com.semi.sopt_19th_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Page2 extends AppCompatActivity {

    private EditText name;
    private EditText part;
    private Button sendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        Log.i("myTag", "Page2 onCreate가 실행됨");

        name = (EditText)findViewById(R.id.userName);
        part = (EditText)findViewById(R.id.userPart);
        sendBtn = (Button)findViewById(R.id.sendBtn);
        /**
         * 클릭이벤트를 주는 부분입니다
         * 1차세미나때에는 이런 것이 있구나 하고 넘어가면 됩니다.
         */
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * intent를 통해 전달할 값을 넣어준다
                 */
                Intent intent = new Intent(getApplicationContext(),Page3.class);
                intent.putExtra("name",name.getText().toString());
                intent.putExtra("part",part.getText().toString());

                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("myTag", "Page2 onResume가 실행됨");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("myTag", "Page2 onPause가 실행됨");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("myTag", "Page2 onDestroy가 실행됨");
    }
}
