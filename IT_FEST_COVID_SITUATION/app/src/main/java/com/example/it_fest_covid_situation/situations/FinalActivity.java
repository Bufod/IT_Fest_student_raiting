package com.example.it_fest_covid_situation.situations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.it_fest_covid_situation.R;
import com.example.it_fest_covid_situation.RegisterActivity;
import com.example.it_fest_covid_situation.model.Player;

public class FinalActivity extends AppCompatActivity {

    private TextView tv_text;
    private Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        player = (Player) (getIntent().getSerializableExtra(RegisterActivity.MSG_NAME));

        tv_text = findViewById(R.id.tv_story);

        switch (player.getPoint()){
            case 0:
                String str = String.format(getString(R.string.final0), player.getName());
                tv_text.setText( str );
                break;
            case 25:
                str = String.format(getString(R.string.final25), player.getName());
                tv_text.setText( str );
                break;
            case 50:
                str = String.format(getString(R.string.final50), player.getName());
                tv_text.setText( str );
                break;
            case 75:
                str = String.format(getString(R.string.final75), player.getName());
                tv_text.setText( str );
                break;
            default:
                str = String.format(getString(R.string.final75), player.getName());
                tv_text.setText( str );
                break;
        }

        findViewById(R.id.btn_img_src).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.freepik.com/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                finish();
            }
        });
    }
}