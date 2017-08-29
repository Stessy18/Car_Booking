package licet.it.car_booking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by cisadmin on 8/9/2017.
 */

public class Verna extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verna);

        Button book = (Button) findViewById(R.id.button_book);


        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(Verna.this, "Your car has been booked!!! \n Thanks for Booking", Toast.LENGTH_LONG).show();


            }
        });


    }
}
