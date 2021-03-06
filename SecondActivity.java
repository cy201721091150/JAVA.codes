package com.example.a24270.activitytest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class  SecondActivity extends BaseActivity {
    public static void actionStart(Context context, String data1, String data2){
        Intent intent=new Intent(context,SecondActivity.class);
        intent.putExtra("param1",data1);
        intent.putExtra("param1",data2);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("SecondActivity","Task id is "+getTaskId());
        setContentView(R.layout.activity_second);
        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);

            }
        });

        /*1.向屏幕输出字幕(toast)Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this, "该回去了", Toast.LENGTH_SHORT).show();
            }
        });
        2.接受FirstActivity-intent中的数据Intent intent=getIntent();
        String data=intent.getStringExtra("extra_data");
        Log.d("SecondActivity",data);*/
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("FirstActivity","onDestroy");
    }
}
