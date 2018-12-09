package id.anhs.examplemenujava.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import id.anhs.examplemenujava.R;

public class StaticMenuActivity extends AppCompatActivity {

    private LinearLayout menu_1, menu_2, menu_3, menu_4, menu_5, menu_6, menu_7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_menu);

        initViews();
        addMenuListener();
    }

    private void initViews() {
        menu_1 = findViewById(R.id.linear_menu_book_1);
        menu_2 = findViewById(R.id.linear_menu_book_2);
        menu_3 = findViewById(R.id.linear_menu_book_3);
        menu_4 = findViewById(R.id.linear_menu_book_4);
        menu_5 = findViewById(R.id.linear_menu_book_5);
        menu_6 = findViewById(R.id.linear_menu_book_6);
        menu_7 = findViewById(R.id.linear_menu_book_7);
    }

    private void addMenuListener() {
        menu_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StaticMenuActivity.this, "Buku 1", Toast.LENGTH_SHORT).show();
            }
        });

        menu_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StaticMenuActivity.this, "Buku 2", Toast.LENGTH_SHORT).show();
            }
        });

        menu_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StaticMenuActivity.this, "Buku 3", Toast.LENGTH_SHORT).show();
            }
        });

        menu_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StaticMenuActivity.this, "Buku 4", Toast.LENGTH_SHORT).show();
            }
        });

        menu_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StaticMenuActivity.this, "Buku 5", Toast.LENGTH_SHORT).show();
            }
        });

        menu_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StaticMenuActivity.this, "Buku 6", Toast.LENGTH_SHORT).show();
            }
        });

        menu_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StaticMenuActivity.this, "Buku 7", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
