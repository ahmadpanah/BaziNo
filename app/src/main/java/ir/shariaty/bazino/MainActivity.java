package ir.shariaty.bazino;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

import ir.shariaty.bazino.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        ArrayList<CategoryModel> categories = new ArrayList<>();
        categories.add(new CategoryModel("","Sport","https://cdn0.iconfinder.com/data/icons/stroke-ball-icons-2/633/02_Soccer-512.png"));
        categories.add(new CategoryModel("","History","https://cdn0.iconfinder.com/data/icons/stroke-ball-icons-2/633/02_Soccer-512.png"));
        categories.add(new CategoryModel("","Science","https://cdn0.iconfinder.com/data/icons/stroke-ball-icons-2/633/02_Soccer-512.png"));
        categories.add(new CategoryModel("","Computer","https://cdn0.iconfinder.com/data/icons/stroke-ball-icons-2/633/02_Soccer-512.png"));
        categories.add(new CategoryModel("","Cinema","https://cdn0.iconfinder.com/data/icons/stroke-ball-icons-2/633/02_Soccer-512.png"));
        categories.add(new CategoryModel("","Puzzle","https://cdn0.iconfinder.com/data/icons/stroke-ball-icons-2/633/02_Soccer-512.png"));

        CategoryAdapter adapter = new CategoryAdapter(this,categories);
        binding.categoryList.setLayoutManager(new GridLayoutManager(this,2));
        binding.categoryList.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.wallet) {
            Toast.makeText(this,"Wallet is Clicked!", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}