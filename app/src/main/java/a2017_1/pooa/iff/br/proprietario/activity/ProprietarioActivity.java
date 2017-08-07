package a2017_1.pooa.iff.br.proprietario.activity;

/**
 * Created by user on 07/08/17.
 */

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import a2017_1.pooa.iff.br.proprietario.R;
import a2017_1.pooa.iff.br.proprietario.adapter.ClickRecyclerViewListener;
import a2017_1.pooa.iff.br.proprietario.adapter.ProprietarioAdapter;
import a2017_1.pooa.iff.br.proprietario.model.Proprietario;
public class ProprietarioActivity extends AppCompatActivity implements ClickRecyclerViewListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proprietario);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_Proprietario);

        recyclerView.setAdapter(new ProprietarioAdapter(getProprietarios(),this,this));
        RecyclerView.LayoutManager layout = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layout);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private List<Proprietario> getLivros(){
        List<Proprietario> proprietarios = new ArrayList<Proprietario>();
        int i =0;
        for(i=0;i<=20;i++){
            String iv = String.valueOf(i);
            Proprietario proprietario = new Proprietario(i,"Nome".concat(iv),"Endereço".concat(iv),"Email".concat(iv));
            proprietario.add(proprietario);
        }
        return proprietarios;

    }

    @Override
    public void onClick(Object object) {
        Proprietario proprietario = (Proprietario) object;
        //Intent intent = new Intent(this, ProprietarioDestaque.class);
        //intent.putExtra("proprietario", proprietario);
        //startActivity(intent);

    }
}
