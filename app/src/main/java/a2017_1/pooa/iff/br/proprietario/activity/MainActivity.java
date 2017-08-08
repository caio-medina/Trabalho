package a2017_1.pooa.iff.br.proprietario.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import a2017_1.pooa.iff.br.proprietario.model.Proprietario;
import a2017_1.pooa.iff.br.proprietario.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button livroBT = (Button) findViewById(R.id.bt_proprietario);

        livroBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ProprietarioActivity.class);
                startActivity(intent);

            }
        });

    }

    private Context getContext(){
        return this;
    }

}
