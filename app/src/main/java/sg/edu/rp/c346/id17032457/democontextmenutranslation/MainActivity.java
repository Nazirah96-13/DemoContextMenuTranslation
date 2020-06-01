package sg.edu.rp.c346.id17032457.democontextmenutranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvTranslatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Binding
        tvTranslatedText = findViewById(R.id.textViewTranslatedText);


        // to register the textview to which the context menu should be associated by
        // Calling registerForContextMenu() and pass in the TextView variable.
        registerForContextMenu(tvTranslatedText);


    }
    //Source code 2
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0,0,0,"English");
        menu.add(0,1,1,"Italian");
    }
    //Source code 3a -The code will check the context item selected.
    // If the item ID is 0, it will create a Toast message and display it.
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getItemId()==0) { //check whether the selected menu item ID is 0
            //code for action
            Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();

            return true; //menu item successfully handled
        }
            //Source Code 3b - 2nd option Italian
            else if(item.getItemId()==1) { //check if the selected menu item ID is 1
                //code for action
                Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();

                return true;  //menu item successfully handled
            }


        return super.onContextItemSelected(item); //pass menu item to the superclass implementation
    }

}
