package licet.it.car_booking;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog;
import android.widget.Toast;


public class Scorpio extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scorpio);

        Button book = (Button) findViewById(R.id.button_book);


        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(Scorpio.this, "Your car has been booked!!! \n Thanks for Booking", Toast.LENGTH_LONG).show();
           /* try {
                SmsManager.getDefault().sendTextMessage(Register.strphone, null, "Hello SMS!", null, null);
            } catch (Exception e) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Scorpio.this);
                AlertDialog dialog = alertDialogBuilder.create();
                dialog.setMessage(e.getMessage());


                dialog.show();
            }*/
        }
            });



    }
}

