package www.gles.net.kitchen_companion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__screen);

    }
    public void buttonOnClick(View v) {
        Button Recipes_Button =(Button) v;
        ((Recipes_Button) v).setText("clicked");
    }
}
