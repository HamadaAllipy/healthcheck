package pc.example.healthcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.sql.Array;

public class Main2Activity extends AppCompatActivity {

    String[] question ;
    int countClick = 1 ;
    int health = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        Toolbar toolbar = findViewById()
        question = new String[10];
        question[0] = "هل تنام 8 ساعات يوميا ؟ ";
        question[1] = "هل تشرب 4 لترا من الماء ؟ ";
        question[2] = "هل تشرب الكحول او السجائر ؟ ";
        question[3] = "هل تمارس الرياضه يوميا ";
        question[4] = "هل تحبني ؟ ";
        question[5] = "انت متربط ؟ ";
        question[6] = "طب نتعرف ";
        question[7] = "اوعي تكون بتشرب سجاير وبتضحك عليا ";
        question[8] = "بجد  ";
        question[9] = "حبيبي تسلم ";

        display(question[0]);
        yes();
        somtimes();
        no();
    }
    public void display(String string){
        TextView textView = findViewById(R.id.question_text_view);
        textView.setText(string);
    }
    public void yes(){
        Button button = findViewById(R.id.yes);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Counter();
                health = health + 1 ;
            }
        });
    }
    public void somtimes(){
        Button button = findViewById(R.id.somtimes);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Counter();
                health = health + 0 ;
            }
        });
    }
    public void no(){
        Button button = findViewById(R.id.no);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Counter();
                health = health - 1 ;
            }
        });
    }
    public void Counter(){
        if (countClick == 1) {
            display(question[countClick]);
            countClick ++;
        }
        else if (countClick == 2) {
            display(question[countClick]);
            countClick ++;
        }
        else if (countClick == 3) {
            display(question[countClick]);
            countClick ++;
        }
        else if (countClick == 4) {
            display(question[countClick]);
            countClick ++;
        }
        else if (countClick == 5){
            display(question[countClick]);
            countClick ++;
        }
        else if (countClick == 6){
            display(question[countClick]);
            countClick ++;
        }
        else if (countClick == 7){
            display(question[countClick]);
            countClick ++;
        }
        else if (countClick == 8){
            display(question[countClick]);
            countClick ++;
        }
        else if (countClick == 9){
            display(question[countClick]);
            countClick ++;
        }
        else if (countClick == 10){
            health = health + 1 ;
            Toast toast = Toast.makeText(Main2Activity.this,"Health "+health, Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
