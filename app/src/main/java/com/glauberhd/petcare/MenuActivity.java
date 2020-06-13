package com.glauberhd.petcare;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    private Button btnMedicamento;
    private Button btnRacao;
    private Button btnAcessorio;
    private Button btnCarrinho;
    private  Button btnRacaoCao;
    private Button btnRacaoGato;
    private Button btnRacaoPeixe;
    private Button btnRacaoPassaro;
    private TextView txtEviarRacaoCao;
    private TextView txtEviarRacaoGato;
    private TextView txtEnviarRacaoPeixe;
    private TextView txtEviarRacaoPassaro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        // Botao menus
        btnMedicamento = findViewById(R.id.btnIrParaTelaMedicamento01);
        btnRacao = findViewById(R.id.btnIrParaTelaRacao01);
        btnAcessorio = findViewById(R.id.btnIrParaTelaAcessorio02);
        btnCarrinho = findViewById(R.id.btnIrParaTelaCarrinho01);
        //botoes Adicionar Carrinho
        btnRacaoGato = findViewById(R.id.btnCarrinhoRacaoGato);
        btnRacaoPeixe = findViewById(R.id.btnCarrinhoRacaoPeixe);
        btnRacaoPassaro = findViewById(R.id.btnCarrinhoRacaoPassaro);
        //Envios de dados
        txtEviarRacaoCao =findViewById(R.id.txtEnviadoRacaoCao01);
        txtEviarRacaoGato =findViewById(R.id.txtEnviarRacaoGato);
        txtEnviarRacaoPeixe = findViewById(R.id.txtEnviadoRacaoPeixe);
        txtEviarRacaoPassaro = findViewById(R.id.txtEviarRacaoPassaro);


         // eventos de transição de tela
        btnMedicamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this,MedicamentoActivity.class));
            }
        });
        btnRacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this,MenuActivity.class));
            }
        });
        btnAcessorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this,AcessorioActivity.class));
            }
        });
        btnCarrinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this,CarrinhoActivity.class));

            }
        });

    }
    public void abrirDialogRacaoCachorro(View view){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        // configura titulo e mensagem
        dialog.setTitle("Ração Pedigree Vital Pro para Cães Adultos Sabor Carne e Vegetais");
        dialog.setMessage("Linha: Premium\n" +
                "Pet: Cachorros\n" +
                "Porte de Raça: Grande e Médio\n" +
                "Idade: Adulto\n" +
                "Sabor: Carne e Vegetais\n" +
                "Composição:\n" +
                "Farinha de Carne e Ossos, Farinha de Subprodutos de Frango, Milho Integral Moído*, Gordura de Frango, Farelo de Soja**, Glúten de Milho*, Cenoura, Espinafre," +
                " Metionina, Triptofano, Vitaminas (A, D3, E, B1, B2, B6, B12, Niacina, Ácido Pantotênico, Ácido Fólico, Biotina e Cloreto de Colina), Minerais (Cloreto de" +
                " Sódio - sal comum -, Óxido de Zinco, Cloreto de Potássio, Sulfato de Cobre, Sulfato de Ferro, Iodato de Cálcio e Selenito de Sódio)," +
                " Hidrolisado de Fígado de Ave e Suíno, Aluminosilicato, B.H.T. (Hidróxido de Tolueno Butilado) e Corantes (Natural Caramelo, " +
                "Artificial Azul Indigotina, Artificial Amarelo Tartrazina e Artificial Amarelo Crepúsculo). " +
                "Eventuais substitutivos: Sorgo Integral Moído, Quirera de Arroz, Cevada em Grão, Trigo Integral," +
                " Farelo de Milho*. *Espécies doadoras do gene: Agrobacterium tumefaciens, Bacillus thuringiensis, " +
                "Streptomyces viridochromogenes, Zea mays, Sphingobium herbicidorovans, Dicossoma sp., Diabrotica firgifera, Thermoccocales spp, Bacillus substilis. " +
                "**Espécies doadoras do gene: Agrobacterium tumefaciens, Bacillus thuringiensis, Streptomyces viridochromogenes, Arabidopsis thaliana, Delftia acidovorans," +
                " Pseudomonas fluorescens, Zea mays, Stenotrophomonas maltophilia, B.T. var Azawai e Kurstaqui, Agrobacterium sp." +


                "100.90  R$");

        //configurar cancelamento
        dialog.setCancelable(false);
        //icone
        dialog.setIcon(android.R.drawable.alert_dark_frame );
        // configura ação sim ou não
        dialog.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(MenuActivity.this,CarrinhoActivity.class);
                intent.putExtra("produto",txtEviarRacaoCao.getText().toString());
                Toast.makeText(getApplicationContext(),"Adicionado ao carrinho",Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });
        //ativar
        dialog.create();
        dialog.show();
    }
    public void abrirDialogueRacaoGato (View view){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        // configura titulo e mensagem
        dialog.setTitle("Ração Whiskas Carne para Gatos Adultos");
        dialog.setMessage("Linha: Premium\n" +
                "Pet: Gatos\n" +
                "Idade: Adulto\n" +
                "Sabor: Carne\n" +
                "Composição: Farinha de carne e ossos, farinha de subprodutos de frango, glúten de milho, quirera de arroz, milho integral moído, gordura de frango, " +
                "gordura bovina, farinha de trigo, taurina, metionina, palatabilizante, vitaminas ( A, B1, B2, B6, B12, D3, E, K3, ácido fólico, niacina, biotina, " +
                "cloreto de colina, ácido pantotênico), minerais (cloreto de sódio (sal comum), cloreto de potássio, óxido de zinco), antioxidante, corantes\n" +
                "Tipo: Rações secas\n" +
                "Apresentação: Embalagem de 500g, 1Kg, 3Kg, 10,1Kg\n" +
                "Níveis de Garantia:\n" +
                "Umidade (máx.) 120 g/kg (12%)\n" +
                "Proteína Bruta (mín.) 300 g/kg (30%)\n" +
                "Extrato Etéreo (mín.) 90 g/kg (9,0%)\n" +
                "Matéria Fibrosa (máx.) 40 g/kg (4,0%)\n" +
                "Matéria Mineral (máx.) 85 g/kg (8,5%)\n" +
                "Cálcio (mín.) 6.000 mg/kg (0,6 %)\n" +
                "Cálcio (máx.) 12 g/kg (1,2%)\n" +
                "Fósforo (mín.) 7.000 mg/kg (0,7 %)\n" +
                "Fósforo (máx.) 12 g/kg (1,2%)\n" +
                "Magnésio (máx.) 1.000 mg/kg (0,1%)\n" +
                "Sódio (mín.) 8.000 mg/kg\n" +
                "Potássio (mín.) 7.000 mg/kg\n" +
                "Zinco (mín.) 100 mg/kg\n" +
                "Ácido Linoleico (mín.) 18 g/kg\n" +
                "Vitamina E (mín.) 45 UI/kg\n" +
                "Taurina (mín.) 1.000 mg/kg\n" +
                "Metionina (mín.) 6.200 mg/kg");
        //configurar cancelamento
        dialog.setCancelable(false);
        //icone
        dialog.setIcon(android.R.drawable.alert_dark_frame );
        // configura ação sim ou não
        dialog.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent2 = new Intent(MenuActivity.this,CarrinhoActivity.class);
                intent2.putExtra("produto2",txtEviarRacaoGato.getText().toString());
                startActivity(intent2);
            }
        });
        //ativar
        dialog.create();
        dialog.show();
    }
    public void ativardailogueRacaoPeixe(View view){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        // configura titulo e mensagem
        dialog.setTitle("Ração para peixe  Alimento Alcon Basic");
        dialog.setMessage("Pet: Peixes\n" +
                "Composição: Farelo de soja, farinha de peixe, creme de milho, farinha de lula, adsorvente de micotoxinas, leveduras, óleo de soja refinado," +
                "espirulina desidratada, corantes naturais (cochonilha, urucum, cúrcuma) (1,54 %), proteína isolada de soja, premix vitamínico mineral (0,85 %)," +
                " óleo de peixe, fécula de mandioca, cloreto de sódio, beterraba desidratada, farinha de minhoca, premix mineral (0,1 %), aditivo prebiótico (0,09 %)," +
                " antioxidantes (Etoxiquin, Propilgalato, ácido cítrico, BHA, BHT), aditivo enzimático (0,05 %)");
        //configurar cancelamento
        dialog.setCancelable(false);
        //icone
        dialog.setIcon(android.R.drawable.alert_dark_frame );
        // configura ação sim ou não
        dialog.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent3 = new Intent(MenuActivity.this,CarrinhoActivity.class);
                intent3.putExtra("produto3",txtEnviarRacaoPeixe.getText().toString());
                startActivity(intent3);
            }
        });
        dialog.create();
        dialog.show();
    }
    public void ativarDailogueRacaoPassaro(View view){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Ração para peixe  Alimento Alcon Basic");
        dialog.setMessage("MATÉRIA PRIMA\n" +
                "Uma vasta quantidade de matérias-primas com rica composição em perfeito equilíbrio," +
                "QUALIDADE\n" +
                "A qualidade é o que mais importa. A integração de um sistema de qualidade moderno começa a partir da compra da matéria-prima até a entrega ao nosso cliente.\n" +
                "\n"
        );
        //configurar cancelamento
        dialog.setCancelable(false);
        //icone
        dialog.setIcon(android.R.drawable.alert_dark_frame );
        // configura ação sim ou não
        dialog.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent4 = new Intent(MenuActivity.this,CarrinhoActivity.class);
                intent4.putExtra("produto4",txtEviarRacaoPassaro.getText().toString());
                startActivity(intent4);
            }
        });
        dialog.create();
        dialog.show();

    }
}
