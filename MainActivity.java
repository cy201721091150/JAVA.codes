package com.example.a24270.uidesign;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.button );
        editText=(EditText)findViewById(R.id.edit_text);
        imageView=(ImageView)findViewById(R.id.image_view);
        progressBar=(ProgressBar)findViewById(R.id.progress_bar);
        button.setOnClickListener(this);}
    @Override
            public void onClick(View v){
                switch (v.getId()){
                    case R.id.button:
                        ProgressDialog progressDialog=new ProgressDialog(MainActivity.this);
                        progressDialog.setTitle("This is ProgressDialog");
                        progressDialog.setMessage("等会嘛!!!!");
                        progressDialog.setCancelable(true);
                        progressDialog.show();
                                break;
                            default:
                                break;
                            /* 1.显示浮窗Toast.makeText(MainActivity.this,inputText,Toast.LENGTH_SHORT).show();
                                2.显示图片imageView.setImageResource(R.drawable.img_2);
                                3.进度条在可见和不可见之间循环
                                case R.id.button:
                                    if (progressBar.getVisibility()==View.GONE){
                                        progressBar.setVisibility(View.VISIBLE);}
                                    else{
                                        progressBar.setVisibility(View.GONE);
                                            }
                                 4.水平进度条
                                 int progress=progressBar.getProgress();
                                    progress=progress+10;
                                        progressBar.setProgress(progress);
                                  5.对话框
                                  AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
                        dialog.setTitle("This id Dialog");
                        dialog.setMessage("Something important");
                        dialog.setCancelable(true);//退出时能不能使用back键退出
                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {

                            }
                        });
                        dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {

                            }
                        });dialog.show();

                                 */


            }
    }
}
