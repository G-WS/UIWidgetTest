package com.example.uiwidgettest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Button button = (Button) findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //在此处添加逻辑
//            }
//        });
//    }
//}
//如果不喜欢匿名注册监听器，也可以使用实现接口的方法来进行注册
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.edit_Text);
        imageView = (ImageView) findViewById(R.id.image_View);
        progressBar = (ProgressBar) findViewById(R.id.progress_Bar);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                //此处添加逻辑
                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("this is progressDialog");
                progressDialog.setMessage("loading...");
                progressDialog.setCancelable(true);
                progressDialog.show();

//                //alterDialog
//                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
//                dialog.setTitle("this is dialog");
//                dialog.setMessage("something important");
//                dialog.setCancelable(false);
//                dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int which) {
//
//                    }
//                });
//                dialog.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int which) {
//
//                    }
//                });
//                dialog.show();

//                int progress = progressBar.getProgress();
//                progress = progress+10;
//                progressBar.setProgress(progress);


//                if (progressBar.getVisibility() == View.GONE) {
//                    progressBar.setVisibility(View.VISIBLE);
//                }else {
//                    progressBar.setVisibility(View.GONE);
//                }


//                imageView.setImageResource(R.drawable.img_2);


//                String inputText = editText.getText().toString();
//                Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT)
//                        .show();
                break;
            default:
                break;
        }
    }
}