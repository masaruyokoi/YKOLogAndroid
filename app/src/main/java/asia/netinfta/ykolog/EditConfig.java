package asia.netinfta.ykolog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

public class EditConfig extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_config);

        findViewById(R.id.button_save).setOnClickListener((v) -> {
            saveConfig();
            finish();
        });
        findViewById(R.id.button_cancel).setOnClickListener((v) -> {
            finish();
        });
        findViewById(R.id.buttonEditRigs).setOnClickListener((v) -> {
            // Do Config rig edit
        });

    }

    private void saveConfig() {


    }

}
