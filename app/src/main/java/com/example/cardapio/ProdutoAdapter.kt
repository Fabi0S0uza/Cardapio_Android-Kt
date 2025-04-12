package com.example.cardapio

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProdutoAdapter(private val produtoList: List<Produto>, private val context: Context) :
    RecyclerView.Adapter<ProdutoAdapter.ProdutoViewHolder>() {


    class ProdutoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textNome: TextView = itemView.findViewById(R.id.textName)
        val textPreco: TextView = itemView.findViewById(R.id.textPreco)
        val icon: ImageView = itemView.findViewById(R.id.viewProduto)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_produto, parent, false)
        return ProdutoViewHolder(view)
    }


    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        val produto = produtoList[position]

        holder.textNome.text = produto.nome
        holder.textPreco.text = "Preço: R$ ${produto.valor}"
        holder.icon.setImageResource(produto.image)


        holder.icon.setOnClickListener {

            val dialogView = LayoutInflater.from(context).inflate(R.layout.item_detalhar, null)
            val ingredientesString = produto.ingredientes.joinToString(", ")

            dialogView.findViewById<TextView>(R.id.plateName).text = produto.nome
            dialogView.findViewById<TextView>(R.id.plateDescription).text = produto.descricao
            dialogView.findViewById<TextView>(R.id.plateIngredients).text = produto.ingredientes.toString()

            dialogView.findViewById<TextView>(R.id.plateIngredients).text = ingredientesString
            val dialog = AlertDialog.Builder(context)
                .setView(dialogView)
                .setPositiveButton("Fechar", null)
                .create()

            dialog.show()
        }
    }


    override fun getItemCount(): Int = produtoList.size
}
