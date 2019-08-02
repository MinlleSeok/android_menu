package com.example.itwill.myapplication190802_03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout baseLayout;
    Button btn01;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        baseLayout = (LinearLayout) findViewById(R.id.baseLayout);
        btn01 = (Button) findViewById(R.id.btn01);
    }

    // onCreateOptionsMenu() 메서드 생성 -> 오버라이딩
    // 앱에 옵션메뉴를 추가
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
       //  MenuInflater mInflater = getMenuInflater();
       //  mInflater.inflate(R.menu.menu1,menu);

        // JAVA 코드를 사용하여 메뉴를 추가
        menu.add(0,1,0,"빨강");
        menu.add(0,2,0,"초록");
        menu.add(0,3,0,"파랑");

        SubMenu sMenu = menu.addSubMenu("버튼 변경");
        sMenu.add(0,4,0,"각도 45도 회전");
        sMenu.add(0,5,0,"크기 2배 확대");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case 1:
                baseLayout.setBackgroundColor(Color.CYAN);
                return true;
            case 2:
                baseLayout.setBackgroundColor(Color.MAGENTA);
                return true;
            case 3:
                baseLayout.setBackgroundColor(Color.LTGRAY);
                return true;

            case 4:
                btn01.setRotation(45);
                return true;
            case 5:
                btn01.setScaleX(2);
                return true;

            case R.id.item01:
                baseLayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.item02:
                baseLayout.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.item03:
                baseLayout.setBackgroundColor(Color.YELLOW);
                return true;
            case R.id.btnRotate:
                btn01.setRotation(45);
                return true;
            case R.id.subSize:
                btn01.setScaleX(2);
                return true;
        }

        return false;
    }
}
