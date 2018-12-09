package id.anhs.examplemenujava.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import id.anhs.examplemenujava.R;
import id.anhs.examplemenujava.model.Menu;
import id.anhs.examplemenujava.views.adapter.MenuAdapter;

public class DynamicMenuActivity extends AppCompatActivity {

    private List<Menu> menuList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_menu);

        RecyclerView rvMenu = findViewById(R.id.dynamic_rv_menu);

        Menu menu1 = new Menu(R.drawable.book, "Book 1");
        Menu menu2 = new Menu(R.drawable.book, "Book 2");
        Menu menu3 = new Menu(R.drawable.book, "Book 3");
        Menu menu4 = new Menu(R.drawable.book, "Book 4");
        Menu menu5 = new Menu(R.drawable.book, "Book 5");
        Menu menu6 = new Menu(R.drawable.book, "Book 6");
        Menu menu7 = new Menu(R.drawable.book, "Book 7");

        menuList.add(menu1);
        menuList.add(menu2);
        menuList.add(menu3);
        menuList.add(menu4);
        menuList.add(menu5);
        menuList.add(menu6);
        menuList.add(menu7);

        RecyclerView.Adapter adapterRvMenu = new MenuAdapter(menuList, new MenuAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Menu menu) {
                String title = menu.getTitle();
                Toast.makeText(DynamicMenuActivity.this, title, Toast.LENGTH_SHORT).show();
            }
        });
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(DynamicMenuActivity.this, 4);
        rvMenu.setAdapter(adapterRvMenu);
        rvMenu.setLayoutManager(layoutManager);
    }
}
