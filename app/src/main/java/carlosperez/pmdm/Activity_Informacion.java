package carlosperez.pmdm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



/**
 * Created by CaRLoS on 21/11/2016.
 */

public class Activity_Informacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_info);

        Button miBotonVolver = findViewById(R.id.boton_InfoVolver);

        miBotonVolver.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                onBackPressed();
            }

        });
    }



}
