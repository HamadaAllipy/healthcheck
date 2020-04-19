package pc.example.healthcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView ;
    ImageView imageView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.welcome_text_view);
        imageView = findViewById(R.id.heart_image_view);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim);
        textView.startAnimation(animation);
        imageView.startAnimation(animation);
        final Intent intent = new Intent(this,Main2Activity.class);
        Thread timer = new Thread(){
          public void run(){
              try {
                  sleep(5000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
              finally {
                  startActivity(intent);
                  finish();
              }
          }
        };
        timer.start();
    }
}
