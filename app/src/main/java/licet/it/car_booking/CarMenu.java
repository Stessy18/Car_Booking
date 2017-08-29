package licet.it.car_booking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;



public class CarMenu extends AppCompatActivity {
    Button delhi; Button chennai; Button kolkata; Button mumbai;

    private FloatingActionMenu fam;
    private FloatingActionButton fab1;
    private FloatingActionButton fab2;
    private FloatingActionButton fab3;
    private FloatingActionButton fab4;
    private FloatingActionButton fab5;
    private FloatingActionButton fab6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        delhi = (Button) findViewById(R.id.button_del);
        delhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoIntent = new Intent(CarMenu.this, City.class);
                startActivity(gotoIntent);
            }
        });

        kolkata = (Button) findViewById(R.id.button_kol);
        kolkata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoIntent = new Intent(CarMenu.this, City.class);
                startActivity(gotoIntent);
            }
        });

        mumbai = (Button) findViewById(R.id.button_mum);
        mumbai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoIntent = new Intent(CarMenu.this, City.class);
                startActivity(gotoIntent);
            }
        });

        chennai = (Button) findViewById(R.id.button_che);
        chennai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoIntent = new Intent(CarMenu.this, City.class);
                startActivity(gotoIntent);
            }
        });

        fab1 = (FloatingActionButton) findViewById(R.id.indes1);
        fab2 = (FloatingActionButton) findViewById(R.id.index);
        fab3 = (FloatingActionButton) findViewById(R.id.indica);
        fab4 = (FloatingActionButton) findViewById(R.id.scorpio);
        fab5 = (FloatingActionButton) findViewById(R.id.duster);
        fab6 = (FloatingActionButton) findViewById(R.id.verna);
        fam = (FloatingActionMenu) findViewById(R.id.fab_menu);

        //handling menu status (open or close)
        fam.setOnMenuToggleListener(new FloatingActionMenu.OnMenuToggleListener() {
            @Override
            public void onMenuToggle(boolean opened) {
                if (opened) {
                    showToast("Menu is opened");
                } else {
                    showToast("Menu is closed");
                }
            }
        });

        //handling each floating action button clicked
        fab1.setOnClickListener(onButtonClick());
        fab2.setOnClickListener(onButtonClick());
        fab3.setOnClickListener(onButtonClick());
        fab4.setOnClickListener(onButtonClick());
        fab5.setOnClickListener(onButtonClick());
        fab6.setOnClickListener(onButtonClick());

        fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fam.isOpened()) {
                    fam.close(true);
                }
            }
        });
    }

    private View.OnClickListener onButtonClick() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view == fab1) {
                    Intent intent = new Intent(CarMenu.this, Scorpio.class);
                    startActivity(intent);

                } else if (view == fab2) {
                    Intent intent = new Intent(CarMenu.this, Indes1.class);
                    startActivity(intent);

                } else if (view == fab3) {
                    Intent intent = new Intent(CarMenu.this, Index.class);
                    startActivity(intent);

                } else if (view == fab4) {
                    Intent intent = new Intent(CarMenu.this, Duster.class);
                    startActivity(intent);

                } else if (view == fab5) {
                    Intent intent = new Intent(CarMenu.this, Verna.class);
                    startActivity(intent);

                } else if (view == fab6) {
                    Intent intent = new Intent(CarMenu.this, Indica.class);
                    startActivity(intent);

                }
                else  {
                    Intent intent = new Intent(getApplicationContext(), Indica.class);
                    startActivity(intent);

                }
                fam.close(true);
            }
        };
    }


    private void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();


    }


}

