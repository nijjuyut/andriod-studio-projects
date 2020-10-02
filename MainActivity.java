package hardik.iisc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//Declaring option menu here
ImageView hardik;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case Menu.FIRST:
                hardik.setImageResource(R.drawable.a);
                Toast.makeText(this, "I like pizza", Toast.LENGTH_SHORT).show();
                break;

            case Menu.FIRST+1:
                hardik.setImageResource(R.drawable.b);
                Toast.makeText(this, "I like burger", Toast.LENGTH_SHORT).show();
                break;

            case Menu.FIRST+2:
                hardik.setImageResource(R.drawable.c);
                Toast.makeText(this, "I like Frankie", Toast.LENGTH_SHORT).show();
                break;

            case Menu.FIRST+3:
                hardik.setImageResource(R.drawable.d);
                Toast.makeText(this, "I like french fries", Toast.LENGTH_SHORT).show();
                break;

            case Menu.FIRST+4:
                hardik.setImageResource(R.drawable.e);
                Toast.makeText(this, "I like pasta", Toast.LENGTH_SHORT).show();
                break;

            default:
                Toast.makeText(this, "Namma metro", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(1,Menu.FIRST,Menu.NONE,"Pizza");
        menu.add(1,Menu.FIRST+1,Menu.NONE,"Burger");
        menu.add(1,Menu.FIRST+2,Menu.NONE,"Frankie");
        menu.add(1,Menu.FIRST+3,Menu.NONE,"French Fries");
        menu.add(1,Menu.FIRST+4,Menu.NONE,"Pasta");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hardik = findViewById(R.id.bakery);
    }
}
