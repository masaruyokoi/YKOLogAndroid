package asia.netinfta.ykolog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.buttonNewLog).
                setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClassName("asia.netinfra.ykolog", "asia.netinfra.ykolog.EditLog");
                startActivity(intent);
            }
        });
        findViewById(R.id.buttonConfig).
                setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.setClassName("asia.netinfra.ykolog",
                                "asia.netinfra.ykolog.EditConfig");
                        startActivity(intent);
                    }
                });
        /*
        findViewById(R.id.buttonSync).
                setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.setClassName("asia.netinfra.ykolog", "asia.netinfra.ykolog.DoSync");
                        startActivity(intent);
                    }
                });

        */

    }
}
