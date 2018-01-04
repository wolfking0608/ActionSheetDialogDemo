package com.wcyq.actionsheetdialogdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        textView = (TextView) findViewById(R.id.tv);
        textView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        new ActionSheetDialog(MainActivity.this).builder().setCancelable(true).setCanceledOnTouchOutside(true).addSheetItem("照相", ActionSheetDialog.SheetItemColor.Blue, new ActionSheetDialog.OnSheetItemClickListener() {
            @Override
            public void onClick(int which) {
                Toast.makeText(MainActivity.this, "照相", Toast.LENGTH_SHORT).show();
            }
        }).addSheetItem("去相册选择", ActionSheetDialog.SheetItemColor.Blue, new ActionSheetDialog.OnSheetItemClickListener() {
            @Override
            public void onClick(int which) {
                Toast.makeText(MainActivity.this, "去相册选择", Toast.LENGTH_SHORT).show();
            }
        }).show();

    }
}
