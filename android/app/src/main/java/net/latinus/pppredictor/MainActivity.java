package net.latinus.pppredictor;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.Time;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button btnPredict;

    EditText txtPlate, txtTime;

    TextView btnDate;

    //Datepicker
    DatePickerDialog datePickerDialog;
    int year;
    int month;
    int dayOfMonth;
    Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPredict = (Button)findViewById(R.id.btnPredict);
        btnDate = (TextView) findViewById(R.id.btnDate);

        txtPlate= (EditText) findViewById(R.id.txtPlate);
        txtTime= (EditText) findViewById(R.id.txtTime);


        btnPredict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             Integer day=calendar.get(Calendar.DAY_OF_WEEK);
             Character lastChar=txtPlate.getText().toString().charAt(txtPlate.length()-1);
             Integer timePicked= (Integer.parseInt(String.valueOf(txtTime.getText().toString().charAt(0)))*1000)+(Integer.parseInt(String.valueOf(txtTime.getText().toString().charAt(1)))*100)+(Integer.parseInt(String.valueOf(txtTime.getText().toString().charAt(3)))*10)+(Integer.parseInt(String.valueOf(txtTime.getText().toString().charAt(4))));


                switch(day) {
                    case 1:
                        if(lastChar=='1' || lastChar=='2'){
                            if((timePicked<930 && timePicked>=700) || (timePicked<1930 && timePicked>=1600) )
                                Log.d("Answer","Car can't be on road!");
                            else
                                Log.d("Answer","Car can be on road!");
                        }
                        else
                            Log.d("Answer","Car can be on road!");
                        break;
                    case 2:
                        if(lastChar=='3' || lastChar=='4'){
                            if((timePicked<930 && timePicked>=700) || (timePicked<1930 && timePicked>=1600) )
                                Log.d("Answer","Car can't be on road!");
                            else
                                Log.d("Answer","Car can be on road!");
                        }
                        else
                            Log.d("Answer","Car can be on road!");
                        break;

                    case 3:
                        if(lastChar=='5' || lastChar=='6'){
                            if((timePicked<930 && timePicked>=700) || (timePicked<1930 && timePicked>=1600) )
                                Log.d("Answer","Car can't be on road!");
                            else
                                Log.d("Answer","Car can be on road!");
                        }
                        else
                            Log.d("Answer","Car can be on road!");
                        break;

                    case 4:
                        if(lastChar=='7' || lastChar=='8'){
                            if((timePicked<930 && timePicked>=700) || (timePicked<1930 && timePicked>=1600) )
                                Log.d("Answer","Car can't be on road!");
                            else
                                Log.d("Answer","Car can be on road!");
                        }
                        else
                            Log.d("Answer","Car can be on road!");
                        break;

                    case 5:
                        if(lastChar=='9' || lastChar=='0'){
                            if((timePicked<930 && timePicked>=700) || (timePicked<1930 && timePicked>=1600) )
                                Log.d("Answer","Car can't be on road!");
                            else
                                Log.d("Answer","Car can be on road!");
                        }
                        else
                            Log.d("Answer","Car can be on road!");
                        break;
           
                    default:
                        Log.d("Answer","Car can be on road!");
                }

            }
        });
    }

    public void showDatePickerDialog(View v) {



        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        datePickerDialog = new DatePickerDialog(MainActivity.this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        btnDate.setText(year + "/" + (month + 1) + "/" + day);
                    }
                }, year, month, dayOfMonth);

        datePickerDialog.show();
    }
}
