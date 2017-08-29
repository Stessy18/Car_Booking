package licet.it.car_booking;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class City extends AppCompatActivity {
    Button scorpio; Button indica; Button verna; Button scross,innova,duster;



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cities);

        scorpio = (Button) findViewById(R.id.button_scor);
        scorpio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoIntent = new Intent(City.this, Scorpio.class);
                startActivity(gotoIntent);
            }
        });

        indica = (Button) findViewById(R.id.button_in);
        indica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoIntent = new Intent(City.this, Indica.class);
                startActivity(gotoIntent);
            }
        });

        duster = (Button) findViewById(R.id.button_dus);
        duster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoIntent = new Intent(City.this, Duster.class);
                startActivity(gotoIntent);
            }
        });

        verna = (Button) findViewById(R.id.button_ver);
        verna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoIntent = new Intent(City.this, Verna.class);
                startActivity(gotoIntent);
            }
        });

        innova = (Button) findViewById(R.id.button_ind);
        innova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoIntent = new Intent(City.this, Index.class);
                startActivity(gotoIntent);
            }
        });

        scross = (Button) findViewById(R.id.button_indi);
        scross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoIntent = new Intent(City.this, Indes1.class);
                startActivity(gotoIntent);
            }
        });
    }
}
