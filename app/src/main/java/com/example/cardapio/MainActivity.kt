package com.example.cardapio

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var produtoAdapter: ProdutoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val produtoList = listOf(
            Produto("Baião de Dois", 25.00, listOf("Calabresa", "Feijão","Arroz","Cebola","Sal"),"O baião de dois é um prato típico do Nordeste brasileiro, especialmente do Ceará, que combina arroz e feijão verde (ou feijão macassa) cozidos juntos.", R.drawable.baiaodedois ) ,
                    Produto("Arroz feijao", 25.00, listOf("ArroZ", "Feijão", "Sal", "Cebola"),"O arroz e feijão é uma combinação clássica da culinária brasileira, sendo uma das refeições mais consumidas no país. " , R.drawable.arrozfeijao),
        Produto("Macarrão", 25.00, listOf("Macarrão", "Molho", "Carne Moida"),"Macarrão com carne moída é uma refeição simples, prática e deliciosa, muito popular no Brasil. " , R.drawable.macarrao),
        Produto("Feijoada", 25.00, listOf("Feijão", "Carnes de Porco", "Cebola", "Sal"),"A feijoada é um dos pratos mais tradicionais e emblemáticos da culinária brasileira." , R.drawable.feijoada)
        )

        recyclerView = findViewById(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        produtoAdapter = ProdutoAdapter(produtoList, this)
        recyclerView.adapter = produtoAdapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


}