package licet.it.car_booking;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by cisadmin on 8/9/2017.
 */

public class Register extends AppCompatActivity {
    public static String strphone;
    DatabaseHelper myDb;
    EditText editName,editemail,editphone ;
    Button btnAddData;
    Button btnviewAll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        myDb = new DatabaseHelper(this);

        editName = (EditText)findViewById(R.id.et_name1);
        editemail = (EditText)findViewById(R.id.et_email);
        editphone = (EditText)findViewById(R.id.et_phno1);
        btnAddData = (Button)findViewById(R.id.button_register2);
        btnviewAll = (Button)findViewById(R.id.button_sd);
        strphone=editphone.getText().toString();
        AddData();
        viewAll();
    }

    public  void AddData() {
        btnAddData.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertData(editName.getText().toString(),
                                editemail.getText().toString(),
                                editphone.getText().toString() );
                        if(isInserted == true)
                            Toast.makeText(Register.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Register.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void viewAll() {
        btnviewAll.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res = myDb.getAllData();
                        if(res.getCount() == 0) {
                            // show message
                            showMessage("Error","Nothing found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext()) {
                            buffer.append("Id :"+ res.getString(0)+"\n");
                            buffer.append("Name :"+ res.getString(1)+"\n");
                            buffer.append("Email_Id :"+ res.getString(2)+"\n");
                            buffer.append("Phone_no :"+ res.getString(3)+"\n\n");
                        }

                        // Show all data
                        showMessage("Data",buffer.toString());
                    }


                }
        );
    }

    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
}
