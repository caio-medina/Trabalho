package a2017_1.pooa.iff.br.proprietario.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import a2017_1.pooa.iff.br.proprietario.R;
import a2017_1.pooa.iff.br.proprietario.model.Proprietario;

/**
 * Created by lglmo on 18/07/2017.
 */

public class ProprietarioAdapter  extends RecyclerView.Adapter {

    private List<Proprietario> proprietarios;
    private Context context;
    private static ClickRecyclerViewListener clickRecyclerViewListener;

    public ProprietarioAdapter(List<Proprietario> proprietarios, Context context,ClickRecyclerViewListener clickRecyclerViewListener) {

        this.proprietarios = proprietarios;
        this.context = context;
        this.clickRecyclerViewListener = clickRecyclerViewListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_proprietario, parent, false);
        ProprietarioViewHolder proprietarioViewHolder = new ProprietarioViewHolder(view);
        return proprietarioViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder,
                                 int position) {

        ProprietarioViewHolder holder = (ProprietarioViewHolder) viewHolder;

        Proprietario proprietario  = proprietarios.get(position) ;

        holder.nome.setText(proprietario.getNome());
        holder.endereco.setText(proprietario.getEndereco());
        holder.email.setText(proprietario.getEmail());

    }

    @Override
    public int getItemCount() {

        return proprietarios.size();
    }

    private void updateItem(int position) {

    }

    // Método responsável por remover um usuário da lista.
    private void removerItem(int position) {

    }

    public class ProprietarioViewHolder extends RecyclerView.ViewHolder {

        private final TextView nome;
        private final TextView endereco;
        private final TextView email;


        public ProprietarioViewHolder(View itemView) {
            super(itemView);
            nome = (TextView) itemView.findViewById(R.id.nome);
            endereco = (TextView) itemView.findViewById(R.id.endereco);
            email = (TextView) itemView.findViewById(R.id.email);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickRecyclerViewListener.onClick(proprietarios.get(getLayoutPosition()));

                }
            });


        }
    }
}
