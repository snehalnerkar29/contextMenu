package svnadvanceproject.sol.svn.com.context_menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn =(Button) findViewById(R.id.btn);
        registerForContextMenu(btn);
    }
    void createMenu(Menu menu)
    {
        MenuItem mn1 = menu.add(0,0,0,"Browser");
        mn1.setAlphabeticShortcut('a');

        MenuItem mn2 = menu.add(1,1,1,"Calculator");
        mn2.setAlphabeticShortcut('i');

        MenuItem mn3 = menu.add(2,2,2,"Maps");
        mn1.setAlphabeticShortcut('m');
    }

    private boolean  MenuChoice(MenuItem menuItem)
    {
        switch (menuItem.getItemId())
        {
            case 0:
                Toast.makeText(this,"Browser Selected",Toast.LENGTH_SHORT).show();
                return true;
            case 1:
                Toast.makeText(this,"Calculator Selected",Toast.LENGTH_SHORT).show();
                return true;
            case 2:
                Toast.makeText(this,"Maps Selected",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        createMenu(menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
       // return super.onContextItemSelected(item);
        return MenuChoice(item);
    }
}


