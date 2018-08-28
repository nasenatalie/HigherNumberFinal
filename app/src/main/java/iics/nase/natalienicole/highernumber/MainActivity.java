package iics.nase.natalienicole.highernumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button compare = (Button) findViewById(R.id.compare);
        compare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText first_number = (EditText) findViewById(R.id.first_number);
                EditText second_number = (EditText) findViewById(R.id.second_number);

                TextView result = (TextView) findViewById(R.id.result);

                int firstNum = Integer.parseInt(first_number.getText().toString());
                int secondNum = Integer.parseInt(second_number.getText().toString());

                if(firstNum > secondNum) {
                    result.setText("The higher number is: " + firstNum);
                }
                else {
                    result.setText("The higher number is: " + secondNum);
                }
            }
        });

    }
}
