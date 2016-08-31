package com.semi.sopt_19th_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Page3 extends AppCompatActivity {

    private TextView inputName;
    private TextView inputPart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);


        /**
         * Intent를 통해서 전달되어온 데이터를 꺼내온다.
         */
        Intent intent = getIntent();
        String getName = intent.getExtras().getString("name");
        String getPart = intent.getExtras().getString("part");


        /**
         * 아래의 setText()는 2차 세미나부터 본격적으로 배울 것입니다
         * 지금은 이런 것이 있구나 하고 넘어가면 됩니다.
         */
        inputName = (TextView)findViewById(R.id.inputName);
        inputName.setText(getName);

        inputPart = (TextView)findViewById(R.id.inputpart);
        inputPart.setText(getPart);


    }
}
