package com.example.a24270.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("FirstActivity","Task id is "+getTaskId());
        setContentView(R.layout.frist_layout);
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondActivity.actionStart(FirstActivity.this,"data1","data2");
                /*1.显式intentIntent intent=new Intent("FirstActivity(上下文).this,SecondActivity(目标活动)");
                隐式Intent intent=new Intent("com.example.a24270.activitytest.ACTION_START");
                intent.addCategory("com.example.a24270.activitytest.MY_CATEGORY");
                2.打开系统应用百度Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                3.打开系统应用拨号Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:18827420363"));
                4.向下一个活动传递数据String data="Hello SecondActivity";
                Intent intent=new Intent(FirstActivity.this,SecondActivity.class );
                intent.putExtra("extra_data",data);
                启动startActivityForResult(intent,1);
                */
            }
        });

    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("FirstActivity","onRestart");
    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        switch (requestCode){
            case 1:
                if (requestCode==RESULT_OK){
                    String returnedData=data.getStringExtra("data_return");
                    Log.d("FirstActivity",returnedData);
                }
                break;
            default:
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "you clisted Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.memore_item:
                Toast.makeText(this, "you clisted Remove", Toast.LENGTH_SHORT).show();
                break;
                default:
                }
                return true;
        }
}

