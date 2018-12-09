package id.anhs.examplemenujava.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import id.anhs.examplemenujava.R;

public class MainActivity extends AppCompatActivity {

    private Button btnMenuStatic, btnMenuDynamic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        addButtonListener();
    }

    private void initView() {
        btnMenuStatic = findViewById(R.id.main_btn_menu_static);
        btnMenuDynamic = findViewById(R.id.main_btn_menu_dynamic);

    }

    private void addButtonListener() {
        btnMenuStatic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StaticMenuActivity.class);
                startActivity(intent);
            }
        });

        btnMenuDynamic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DynamicMenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
