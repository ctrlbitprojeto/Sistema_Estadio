package telaSistema;

import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class telaInicial extends javax.swing.JFrame {

    //Todos os arrays---------------------------------------------------
    //Dia do 1° jogo
    int setorAmareloD1[][] = new int[26][201];
    int setorAzulD1[][] = new int[26][201];
    int setorBrancoD1[][] = new int[26][201];
    int setorVerdeD1[][] = new int[26][201];
    //Dia do 2° jogo
    int setorAmareloD2[][] = new int[26][201];
    int setorAzulD2[][] = new int[26][201];
    int setorBrancoD2[][] = new int[26][201];
    int setorVerdeD2[][] = new int[26][201];
    //--------------------------------------------------------------------

    //decimal format para o dinheiro--------------------------------------
    DecimalFormat df = new DecimalFormat("R$ #,##0.00");

    //vari�vel total arrecadado------------------------------------------
    double totalArrecadado = 0, totalArrecadado1dia = 0, totalArrecadado2dia = 0;

    //vari�vel total ingresos -------------------------------------------
    int tIngresos = 0, tIngressos1dia = 0, tIngressos2dia = 0;

    //CONTAR QUAL O SETOR MAIS LOTADO-------------------------------------
    //contador de setor dia 1
    int contSetorAmarelo1 = 0, contSetorAzul1 = 0, contSetorBranco1 = 0, contSetorVerde1 = 0;
    //contador de setor dia 2
    int contSetorAmarelo2 = 0, contSetorAzul2 = 0, contSetorBranco2 = 0, contSetorVerde2 = 0;

    //valor para o progressbar
    double porcentagemQueAdicionaProgres = 5;

    //PADR�O DO NETBEANS ------------------------------------------------------
    public telaInicial() {

        initComponents();
        setIcon();

    }
    //-------------------------------------------------------------------------

    //PADRA� DO NETBEANS ------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        painelPrincipal = new javax.swing.JPanel();
        painelCompra = new javax.swing.JPanel();
        layoutInutil = new javax.swing.JLabel();
        txtValorIngresso = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        painelLugar = new javax.swing.JPanel();
        layoutInutil2 = new javax.swing.JLabel();
        layoutInutil3 = new javax.swing.JLabel();
        caixaFileira = new javax.swing.JTextField();
        caixaCadeira = new javax.swing.JTextField();
        comboSetor = new javax.swing.JComboBox();
        btnConsultarDisponibilidade = new javax.swing.JButton();
        txtDisponibilidadeSN = new javax.swing.JLabel();
        painelDias = new javax.swing.JPanel();
        radioPrimeiroDia = new javax.swing.JRadioButton();
        radioSegundoDia = new javax.swing.JRadioButton();
        painelSugestao = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        caixaTxtProxima = new javax.swing.JTextArea();
        layoutInutil4 = new javax.swing.JLabel();
        btnBuscarMaisProximo = new javax.swing.JButton();
        painelLotacao = new javax.swing.JPanel();
        layoutInutil5 = new javax.swing.JLabel();
        layoutInutil6 = new javax.swing.JLabel();
        layoutInutil7 = new javax.swing.JLabel();
        layoutInutil8 = new javax.swing.JLabel();
        progresAmarelo = new javax.swing.JProgressBar();
        progresAzul = new javax.swing.JProgressBar();
        progresBranco = new javax.swing.JProgressBar();
        progresVerde = new javax.swing.JProgressBar();
        painelArrecadacaoDoisJogos = new javax.swing.JPanel();
        layoutInutil10 = new javax.swing.JLabel();
        layoutInutil12 = new javax.swing.JLabel();
        txtTotalArrecadado = new javax.swing.JLabel();
        txtIngressosVendidos = new javax.swing.JLabel();
        painelPrimeiroJogo = new javax.swing.JPanel();
        layoutInutil13 = new javax.swing.JLabel();
        layoutInutil14 = new javax.swing.JLabel();
        txtPrimeiroJogoArrecadado = new javax.swing.JLabel();
        txtIngressosVendidosPrimeiroJogo = new javax.swing.JLabel();
        painelSegundoJogo = new javax.swing.JPanel();
        layoutInutil15 = new javax.swing.JLabel();
        layoutInutil16 = new javax.swing.JLabel();
        txtSegundoJogoArrecadado = new javax.swing.JLabel();
        txtIngressosVendidosSegundoJogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estadio");
        setResizable(false);

        painelPrincipal.setOpaque(false);

        painelCompra.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Compra"));

        layoutInutil.setText("Valor do ingresso:");

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCompraLayout = new javax.swing.GroupLayout(painelCompra);
        painelCompra.setLayout(painelCompraLayout);
        painelCompraLayout.setHorizontalGroup(
            painelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelCompraLayout.createSequentialGroup()
                        .addComponent(layoutInutil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValorIngresso, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelCompraLayout.setVerticalGroup(
            painelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(layoutInutil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtValorIngresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnComprar)
                .addContainerGap())
        );

        painelLugar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Lugar"));

        layoutInutil2.setText("Cadeira");
        layoutInutil2.setOpaque(true);

        layoutInutil3.setText("Fileira");
        layoutInutil3.setOpaque(true);

        comboSetor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Setor", "Amarelo", "Azul", "Branco", "Verde" }));

        btnConsultarDisponibilidade.setText("Consultar Disponibilidade");
        btnConsultarDisponibilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarDisponibilidadeActionPerformed(evt);
            }
        });

        txtDisponibilidadeSN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout painelLugarLayout = new javax.swing.GroupLayout(painelLugar);
        painelLugar.setLayout(painelLugarLayout);
        painelLugarLayout.setHorizontalGroup(
            painelLugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLugarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLugarLayout.createSequentialGroup()
                        .addComponent(layoutInutil2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(caixaCadeira, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultarDisponibilidade)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelLugarLayout.createSequentialGroup()
                        .addGroup(painelLugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(comboSetor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelLugarLayout.createSequentialGroup()
                                .addComponent(layoutInutil3)
                                .addGap(18, 18, 18)
                                .addComponent(caixaFileira, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(txtDisponibilidadeSN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelLugarLayout.setVerticalGroup(
            painelLugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLugarLayout.createSequentialGroup()
                .addGroup(painelLugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLugarLayout.createSequentialGroup()
                        .addComponent(comboSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelLugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(layoutInutil3)
                            .addComponent(caixaFileira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelLugarLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txtDisponibilidadeSN, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(painelLugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaCadeira, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(layoutInutil2)
                    .addComponent(btnConsultarDisponibilidade))
                .addContainerGap())
        );

        painelDias.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Jogos"));

        buttonGroup1.add(radioPrimeiroDia);
        radioPrimeiroDia.setText("Primeiro jogo");
        radioPrimeiroDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                radioPrimeiroDiaMousePressed(evt);
            }
        });

        buttonGroup1.add(radioSegundoDia);
        radioSegundoDia.setText("Segundo jogo");
        radioSegundoDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSegundoDiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDiasLayout = new javax.swing.GroupLayout(painelDias);
        painelDias.setLayout(painelDiasLayout);
        painelDiasLayout.setHorizontalGroup(
            painelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDiasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioSegundoDia)
                    .addComponent(radioPrimeiroDia))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        painelDiasLayout.setVerticalGroup(
            painelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDiasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioPrimeiroDia)
                .addGap(18, 18, 18)
                .addComponent(radioSegundoDia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelSugestao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Sugestão"));

        caixaTxtProxima.setEditable(false);
        caixaTxtProxima.setColumns(20);
        caixaTxtProxima.setRows(5);
        jScrollPane1.setViewportView(caixaTxtProxima);

        layoutInutil4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        layoutInutil4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        layoutInutil4.setText("Cadeiras mais próximas do gramado :");

        btnBuscarMaisProximo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnBuscarMaisProximo.setText("Buscar");
        btnBuscarMaisProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMaisProximoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelSugestaoLayout = new javax.swing.GroupLayout(painelSugestao);
        painelSugestao.setLayout(painelSugestaoLayout);
        painelSugestaoLayout.setHorizontalGroup(
            painelSugestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSugestaoLayout.createSequentialGroup()
                .addGroup(painelSugestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSugestaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(layoutInutil4))
                    .addGroup(painelSugestaoLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnBuscarMaisProximo)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        painelSugestaoLayout.setVerticalGroup(
            painelSugestaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSugestaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(layoutInutil4)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarMaisProximo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painelSugestaoLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        painelLotacao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Lotação"));

        layoutInutil5.setText("Setor Amarelo");

        layoutInutil6.setText("Setor Azul");

        layoutInutil7.setText("Setor Branco");

        layoutInutil8.setText("Setor Verde");

        progresAmarelo.setForeground(new java.awt.Color(255, 204, 51));
        progresAmarelo.setStringPainted(true);

        progresAzul.setStringPainted(true);

        progresBranco.setForeground(new java.awt.Color(255, 255, 255));
        progresBranco.setStringPainted(true);

        progresVerde.setForeground(new java.awt.Color(0, 153, 0));
        progresVerde.setStringPainted(true);

        javax.swing.GroupLayout painelLotacaoLayout = new javax.swing.GroupLayout(painelLotacao);
        painelLotacao.setLayout(painelLotacaoLayout);
        painelLotacaoLayout.setHorizontalGroup(
            painelLotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLotacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLotacaoLayout.createSequentialGroup()
                        .addComponent(layoutInutil5)
                        .addGap(18, 18, 18)
                        .addComponent(progresAmarelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelLotacaoLayout.createSequentialGroup()
                        .addGroup(painelLotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(layoutInutil7)
                            .addComponent(layoutInutil8)
                            .addComponent(layoutInutil6))
                        .addGap(24, 24, 24)
                        .addGroup(painelLotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(progresAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(progresBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(progresVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        painelLotacaoLayout.setVerticalGroup(
            painelLotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLotacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(layoutInutil5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(progresAmarelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(painelLotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(progresAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(layoutInutil6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(painelLotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(progresBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(layoutInutil7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(painelLotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(layoutInutil8)
                    .addComponent(progresVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        painelArrecadacaoDoisJogos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Total de arrecadação dos dois jogos"));

        layoutInutil10.setText("Total arrecadado: ");

        layoutInutil12.setText("Ingressos vendidos: ");

        txtTotalArrecadado.setText("R$ 0,00");

        txtIngressosVendidos.setText("0");

        javax.swing.GroupLayout painelArrecadacaoDoisJogosLayout = new javax.swing.GroupLayout(painelArrecadacaoDoisJogos);
        painelArrecadacaoDoisJogos.setLayout(painelArrecadacaoDoisJogosLayout);
        painelArrecadacaoDoisJogosLayout.setHorizontalGroup(
            painelArrecadacaoDoisJogosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelArrecadacaoDoisJogosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelArrecadacaoDoisJogosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(layoutInutil12)
                    .addComponent(layoutInutil10))
                .addGap(18, 18, 18)
                .addGroup(painelArrecadacaoDoisJogosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTotalArrecadado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIngressosVendidos, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelArrecadacaoDoisJogosLayout.setVerticalGroup(
            painelArrecadacaoDoisJogosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelArrecadacaoDoisJogosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelArrecadacaoDoisJogosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(layoutInutil10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotalArrecadado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(painelArrecadacaoDoisJogosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(layoutInutil12)
                    .addComponent(txtIngressosVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        painelPrimeiroJogo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Primeiro jogo"));

        layoutInutil13.setText("Total arrecadado: ");

        layoutInutil14.setText("Ingressos vendidos: ");

        txtPrimeiroJogoArrecadado.setText("R$ 0,00");

        txtIngressosVendidosPrimeiroJogo.setText("0");

        javax.swing.GroupLayout painelPrimeiroJogoLayout = new javax.swing.GroupLayout(painelPrimeiroJogo);
        painelPrimeiroJogo.setLayout(painelPrimeiroJogoLayout);
        painelPrimeiroJogoLayout.setHorizontalGroup(
            painelPrimeiroJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrimeiroJogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrimeiroJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(layoutInutil14)
                    .addComponent(layoutInutil13))
                .addGap(18, 18, 18)
                .addGroup(painelPrimeiroJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIngressosVendidosPrimeiroJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrimeiroJogoArrecadado, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        painelPrimeiroJogoLayout.setVerticalGroup(
            painelPrimeiroJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrimeiroJogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrimeiroJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(layoutInutil13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrimeiroJogoArrecadado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(painelPrimeiroJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(layoutInutil14)
                    .addComponent(txtIngressosVendidosPrimeiroJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        painelSegundoJogo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Segundo jogo"));

        layoutInutil15.setText("Total arrecadado: ");

        layoutInutil16.setText("Ingressos vendidos: ");

        txtSegundoJogoArrecadado.setText("R$ 0,00");

        txtIngressosVendidosSegundoJogo.setText("0");

        javax.swing.GroupLayout painelSegundoJogoLayout = new javax.swing.GroupLayout(painelSegundoJogo);
        painelSegundoJogo.setLayout(painelSegundoJogoLayout);
        painelSegundoJogoLayout.setHorizontalGroup(
            painelSegundoJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSegundoJogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSegundoJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(layoutInutil16)
                    .addComponent(layoutInutil15))
                .addGap(18, 18, 18)
                .addGroup(painelSegundoJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIngressosVendidosSegundoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSegundoJogoArrecadado, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelSegundoJogoLayout.setVerticalGroup(
            painelSegundoJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSegundoJogoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(painelSegundoJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(layoutInutil15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSegundoJogoArrecadado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(painelSegundoJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(layoutInutil16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIngressosVendidosSegundoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(painelDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(painelSugestao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelLotacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelPrimeiroJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelArrecadacaoDoisJogos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelSegundoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(painelDias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelLugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(painelArrecadacaoDoisJogos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelPrimeiroJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelSugestao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelLotacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelSegundoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //-------------------------------------------------------------------------

    //BOT�O CONSULTAR DISPONIBILIDADE CLICADO----------------------------------------------
    private void btnConsultarDisponibilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarDisponibilidadeActionPerformed

        //limpa o jlabel valorIngresso e chama o m�todo consultandoDisponibilidade l� embaixo
        txtValorIngresso.setText("");
        consultandoDisponibilidade();

    }//GEN-LAST:event_btnConsultarDisponibilidadeActionPerformed

    //BOT�O COMPRAR INGRESSO --------------------------------------------------------------
    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed

        //se estiver escrito dispon�vel então soma mais um na vari�vel totalIngresos e 
        //chama o metodo la embaixo
        //aparece se a compra foi efetivada ou n�o
        if ("Disponível".equals(txtDisponibilidadeSN.getText())) {

            int resposta = JOptionPane.showConfirmDialog(this,("Ingresso\nCadeira: " + caixaCadeira.getText()
                    + "\nFileira: " + caixaFileira.getText() + "\nSetor: " + comboSetor.getSelectedItem() + "\nDeseja confirmar a compra?"));
            if (resposta == JOptionPane.YES_OPTION) {
                tIngresos += 1;
                comprandoIngressso();
            }
        } else {
            if (txtDisponibilidadeSN.getText() == "") {
                JOptionPane.showMessageDialog(null, "Você deve verificar a disponibilidade.");
            } else {
                JOptionPane.showMessageDialog(null, "O lugar tem que estar Disponível");
            }
            }
            if (radioPrimeiroDia.isSelected() == true) {
                radioSegundoDia.setEnabled(true);
                radioPrimeiroDia.setEnabled(true);
                comboSetor.setEnabled(true);
                caixaFileira.setEnabled(true);
                caixaCadeira.setEnabled(true);
                atualizarBarradeProgresso1Dia();
            } else {
                radioSegundoDia.setEnabled(true);
                radioPrimeiroDia.setEnabled(true);
                comboSetor.setEnabled(true);
                caixaFileira.setEnabled(true);
                caixaCadeira.setEnabled(true);
                atualizarBarradeProgresso2Dia();
            }

            //limpa os campos para o usu�rio e escreve o valor arrecadado e quantidade de ingressos em todos os jpanel's
            txtSegundoJogoArrecadado.setText(df.format(totalArrecadado2dia));
            txtPrimeiroJogoArrecadado.setText(df.format(totalArrecadado1dia));
            txtIngressosVendidosSegundoJogo.setText("" + tIngressos2dia);
            txtIngressosVendidosPrimeiroJogo.setText("" + tIngressos1dia);
            txtTotalArrecadado.setText(df.format(totalArrecadado));
            txtIngressosVendidos.setText("" + tIngresos);
            txtValorIngresso.setText("");
            txtDisponibilidadeSN.setText("");

    }//GEN-LAST:event_btnComprarActionPerformed

    private void radioPrimeiroDiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioPrimeiroDiaMousePressed
        atualizarBarradeProgresso1Dia();
    }//GEN-LAST:event_radioPrimeiroDiaMousePressed

    private void radioSegundoDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSegundoDiaActionPerformed
        atualizarBarradeProgresso2Dia();
    }//GEN-LAST:event_radioSegundoDiaActionPerformed

    private void btnBuscarMaisProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMaisProximoActionPerformed
        verificacaoCadeiraProximaGramado();
    }//GEN-LAST:event_btnBuscarMaisProximoActionPerformed

    public static void main(String args[]) {

        //PADRA� DO NETBEANS ------------------------------------------------------
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaInicial().setVisible(true);
            }
        });
        //-------------------------------------------------------------------------
    }

    //PADRA� DO NETBEANS ------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarMaisProximo;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnConsultarDisponibilidade;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField caixaCadeira;
    private javax.swing.JTextField caixaFileira;
    private javax.swing.JTextArea caixaTxtProxima;
    private javax.swing.JComboBox comboSetor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel layoutInutil;
    private javax.swing.JLabel layoutInutil10;
    private javax.swing.JLabel layoutInutil12;
    private javax.swing.JLabel layoutInutil13;
    private javax.swing.JLabel layoutInutil14;
    private javax.swing.JLabel layoutInutil15;
    private javax.swing.JLabel layoutInutil16;
    private javax.swing.JLabel layoutInutil2;
    private javax.swing.JLabel layoutInutil3;
    private javax.swing.JLabel layoutInutil4;
    private javax.swing.JLabel layoutInutil5;
    private javax.swing.JLabel layoutInutil6;
    private javax.swing.JLabel layoutInutil7;
    private javax.swing.JLabel layoutInutil8;
    private javax.swing.JPanel painelArrecadacaoDoisJogos;
    private javax.swing.JPanel painelCompra;
    private javax.swing.JPanel painelDias;
    private javax.swing.JPanel painelLotacao;
    private javax.swing.JPanel painelLugar;
    private javax.swing.JPanel painelPrimeiroJogo;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelSegundoJogo;
    private javax.swing.JPanel painelSugestao;
    private javax.swing.JProgressBar progresAmarelo;
    private javax.swing.JProgressBar progresAzul;
    private javax.swing.JProgressBar progresBranco;
    private javax.swing.JProgressBar progresVerde;
    private javax.swing.JRadioButton radioPrimeiroDia;
    private javax.swing.JRadioButton radioSegundoDia;
    private javax.swing.JLabel txtDisponibilidadeSN;
    private javax.swing.JLabel txtIngressosVendidos;
    private javax.swing.JLabel txtIngressosVendidosPrimeiroJogo;
    private javax.swing.JLabel txtIngressosVendidosSegundoJogo;
    private javax.swing.JLabel txtPrimeiroJogoArrecadado;
    private javax.swing.JLabel txtSegundoJogoArrecadado;
    private javax.swing.JLabel txtTotalArrecadado;
    private javax.swing.JLabel txtValorIngresso;
    // End of variables declaration//GEN-END:variables
    //----------------------------------------------------------------------------

    // M�todo verifica se todos os campos s�o v�lidos -----------
    public void consultandoDisponibilidade() {

        if (caixaCadeira.getText().isEmpty()) {
            txtDisponibilidadeSN.setText("Especifique a Cadeira");
        } else if (caixaFileira.getText().isEmpty()) {
            txtDisponibilidadeSN.setText("Especifique a Fileira");
        } else if (comboSetor.getSelectedItem() == "Setor") {
            txtDisponibilidadeSN.setText("Especifique o Setor");
        } else if (radioPrimeiroDia.isSelected() == false && radioSegundoDia.isSelected() == false) {
            txtDisponibilidadeSN.setText("Especifique o Dia");
        } else if (Integer.parseInt(caixaCadeira.getText()) >= 201 || Integer.parseInt(caixaCadeira.getText()) <= 0) {
            txtDisponibilidadeSN.setText("Cadeira não existe");
        } else if (Integer.parseInt(caixaFileira.getText()) >= 26 || Integer.parseInt(caixaFileira.getText()) <= 0) {
            txtDisponibilidadeSN.setText("Fileira não existe");
        } else //SE TODOS OS CAMPOS ESTIVEREM PREENCHIDOES O PROGRAMA CAI AQUI...
        //SE PRIMEIRO JOGO FOR SELECIONADO ENTÃO EXECUTA METODO 'verificarDisponibilidadeDia1' SE NÃO 'verificarDisponibilidadeDia2'
        {
            if (radioPrimeiroDia.isSelected() == true) {
                radioSegundoDia.setEnabled(false);
                radioPrimeiroDia.setEnabled(false);
                comboSetor.setEnabled(false);
                caixaFileira.setEnabled(false);
                caixaCadeira.setEnabled(false);
                verificarDisponibilidadeDia1();
            } else {
                radioSegundoDia.setEnabled(false);
                radioPrimeiroDia.setEnabled(false);
                comboSetor.setEnabled(false);
                caixaFileira.setEnabled(false);
                caixaCadeira.setEnabled(false);
                verificarDisponibilidadeDia2();
            }
        }

    }

    private void verificarDisponibilidadeDia1() {

        // SETOR AMARELO -----------------------------------------------------
        if (comboSetor.getSelectedItem() == "Amarelo") {

            if (setorAmareloD1[Integer.parseInt(caixaFileira.getText())][Integer.parseInt(caixaCadeira.getText())] != 1) {
                txtDisponibilidadeSN.setText("Disponível");
                txtValorIngresso.setText(df.format(25.00));
            } else {
                txtDisponibilidadeSN.setText("Ocupado");
            }

        } // SETOR AZUL ---------------------------------------
        else if (comboSetor.getSelectedItem() == "Azul") {

            if (setorAzulD1[Integer.parseInt(caixaFileira.getText())][Integer.parseInt(caixaCadeira.getText())] != 1) {
                txtDisponibilidadeSN.setText("Disponível");
                txtValorIngresso.setText(df.format(25.00));
            } else {
                txtDisponibilidadeSN.setText("Ocupado");
            }

        } // SETOR BRANCO ---------------------------------------
        else if (comboSetor.getSelectedItem() == "Branco") {

            if (setorBrancoD1[Integer.parseInt(caixaFileira.getText())][Integer.parseInt(caixaCadeira.getText())] != 1) {
                txtDisponibilidadeSN.setText("Disponível");
                txtValorIngresso.setText(df.format(45.00));
            } else {
                txtDisponibilidadeSN.setText("Ocupado");
            }

        } // SETOR VERDE ----------------------------------------
        else if (comboSetor.getSelectedItem() == "Verde") {

            if (setorVerdeD1[Integer.parseInt(caixaFileira.getText())][Integer.parseInt(caixaCadeira.getText())] != 1) {
                txtDisponibilidadeSN.setText("Disponível");
                txtValorIngresso.setText(df.format(45.00));
            } else {
                txtDisponibilidadeSN.setText("Ocupado");
            }

        }
        //-----------------------------------------------------------------------

    }

    private void verificarDisponibilidadeDia2() {

        // SETOR AMARELO -----------------------------------------------------
        if (comboSetor.getSelectedItem() == "Amarelo") {

            if (setorAmareloD2[Integer.parseInt(caixaFileira.getText())][Integer.parseInt(caixaCadeira.getText())] != 1) {
                txtDisponibilidadeSN.setText("Disponível");
                txtValorIngresso.setText(df.format(30.00));
            } else {
                txtDisponibilidadeSN.setText("Ocupado");
            }

        } // SETOR AZUL ---------------------------------------
        else if (comboSetor.getSelectedItem() == "Azul") {

            if (setorAzulD2[Integer.parseInt(caixaFileira.getText())][Integer.parseInt(caixaCadeira.getText())] != 1) {
                txtDisponibilidadeSN.setText("Disponível");
                txtValorIngresso.setText(df.format(30.00));
            } else {
                txtDisponibilidadeSN.setText("Ocupado");
            }

        } // SETOR BRANCO ---------------------------------------
        else if (comboSetor.getSelectedItem() == "Branco") {

            if (setorBrancoD2[Integer.parseInt(caixaFileira.getText())][Integer.parseInt(caixaCadeira.getText())] != 1) {
                txtDisponibilidadeSN.setText("Disponível");
                txtValorIngresso.setText(df.format(50.00));
            } else {
                txtDisponibilidadeSN.setText("Ocupado");
            }

        } // SETOR VERDE ----------------------------------------
        else if (comboSetor.getSelectedItem() == "Verde") {

            if (setorVerdeD2[Integer.parseInt(caixaFileira.getText())][Integer.parseInt(caixaCadeira.getText())] != 1) {
                txtDisponibilidadeSN.setText("Disponível");
                txtValorIngresso.setText(df.format(50.00));
            } else {
                txtDisponibilidadeSN.setText("Ocupado");
            }

        }
        //-----------------------------------------------------------------------

    }

    private void comprandoIngressso() {

        if (radioPrimeiroDia.isSelected() == true) {

            tIngressos1dia += 1;
            if (comboSetor.getSelectedItem() == "Amarelo") {
                setorAmareloD1[Integer.parseInt(caixaFileira.getText())][Integer.parseInt(caixaCadeira.getText())] = 1;
                totalArrecadado += 25.00;
                totalArrecadado1dia += 25.00;
                contSetorAmarelo1 += porcentagemQueAdicionaProgres;
            } else if (comboSetor.getSelectedItem() == "Azul") {
                setorAzulD1[Integer.parseInt(caixaFileira.getText())][Integer.parseInt(caixaCadeira.getText())] = 1;
                totalArrecadado += 25.00;
                totalArrecadado1dia += 25.00;
                contSetorAzul1 += porcentagemQueAdicionaProgres;
            } else if (comboSetor.getSelectedItem() == "Branco") {
                setorBrancoD1[Integer.parseInt(caixaFileira.getText())][Integer.parseInt(caixaCadeira.getText())] = 1;
                totalArrecadado += 45.00;
                totalArrecadado1dia += 45.00;
                contSetorBranco1 += porcentagemQueAdicionaProgres;
            } else if (comboSetor.getSelectedItem() == "Verde") {
                setorVerdeD1[Integer.parseInt(caixaFileira.getText())][Integer.parseInt(caixaCadeira.getText())] = 1;
                totalArrecadado += 45.00;
                totalArrecadado1dia += 45.00;
                contSetorVerde1 += porcentagemQueAdicionaProgres;
            }

        } else if (radioSegundoDia.isSelected() == true) {

            tIngressos2dia += 1;
            if (comboSetor.getSelectedItem() == "Amarelo") {
                setorAmareloD2[Integer.parseInt(caixaFileira.getText())][Integer.parseInt(caixaCadeira.getText())] = 1;
                totalArrecadado += 30.00;
                totalArrecadado2dia += 30.00;
                contSetorAmarelo2 += porcentagemQueAdicionaProgres;
            } else if (comboSetor.getSelectedItem() == "Azul") {
                setorAzulD2[Integer.parseInt(caixaFileira.getText())][Integer.parseInt(caixaCadeira.getText())] = 1;
                totalArrecadado += 30.00;
                totalArrecadado2dia += 30.00;
                contSetorAzul2 += porcentagemQueAdicionaProgres;
            } else if (comboSetor.getSelectedItem() == "Branco") {
                setorBrancoD2[Integer.parseInt(caixaFileira.getText())][Integer.parseInt(caixaCadeira.getText())] = 1;
                totalArrecadado += 50.00;
                totalArrecadado2dia += 50.00;
                contSetorBranco2 += porcentagemQueAdicionaProgres;
            } else if (comboSetor.getSelectedItem() == "Verde") {
                setorVerdeD2[Integer.parseInt(caixaFileira.getText())][Integer.parseInt(caixaCadeira.getText())] = 1;
                totalArrecadado += 50.00;
                totalArrecadado2dia += 50.00;
                contSetorVerde2 += porcentagemQueAdicionaProgres;
            }
        }

    }

    public void atualizarBarradeProgresso1Dia() {

        new Thread() {
            public void run() {
                try {
                    sleep(100);
                    progresAmarelo.setValue(contSetorAmarelo1);
                    progresAzul.setValue(contSetorAzul1);
                    progresBranco.setValue(contSetorBranco1);
                    progresVerde.setValue(contSetorVerde1);
                } catch (InterruptedException ex) {
                }
            }
        }.start();

    }

    public void atualizarBarradeProgresso2Dia() {

        new Thread() {
            public void run() {
                try {
                    sleep(100);
                    progresAmarelo.setValue(contSetorAmarelo2);
                    progresAzul.setValue(contSetorAzul2);
                    progresBranco.setValue(contSetorBranco2);
                    progresVerde.setValue(contSetorVerde2);
                } catch (InterruptedException ex) {
                }
            }
        }.start();

    }

    public void verificacaoCadeiraProximaGramado() {

        
        int sugest = 10; //Número de sugestoes
        caixaTxtProxima.setText("");//Limpar caixaTxtProxima
        if (radioPrimeiroDia.isSelected() == true) {//Seleciona botão de primeiro dia
            if (comboSetor.getSelectedItem() == "Amarelo") {//Seleciona setor amarelo
                int contfileira = 1, contcadeira = 1, contvezes = 0;//Variáveis cont
                while (contvezes < sugest) {//Estrutura de repetição para exibir 5 sugestões
                    if (setorAmareloD1[contfileira][contcadeira] == 0) {//Verifica se o lugar está vazio
                        caixaTxtProxima.setText(caixaTxtProxima.getText() + "Fileira "//Exibe a sugestão
                                + contfileira + " Cadeira " + contcadeira + "\n");
                        contcadeira++;//Pula cont para a próxima cadeira
                        contvezes++;//Adiciona 1 ao número de vezes que rodou o while
                    } else if (setorAmareloD1[contfileira][contcadeira] == 1) {//Caso o lugar esteja ocupado
                        contcadeira++;//Apenas adiciona 1 ao cont para pular para a próxima cadeira
                    }
                    if (contcadeira == 201) {//Verifica se acabaram as cadeiras da fileira
                        contcadeira = 1;//Volta o cont cadeira para 1
                        contfileira++;//Pula para a próxima fileira
                    }
                    if (contfileira == 26) {//Verifica se acabaram as fileiras do setor
                        caixaTxtProxima.setText(caixaTxtProxima.getText() + "Não há mais lugares disponíveis.");//Exibe mensagem que não há mais lugares nesse setor
                        contvezes = sugest;//Adiciona o numero de sugestões ao contvezes para parar o while
                    }
                }
            } else if (comboSetor.getSelectedItem() == "Azul") {
                int contfileira = 1, contcadeira = 1;
                int contvezes = 0;
                while (contvezes < sugest) {
                    if (setorAzulD1[contfileira][contcadeira] == 0) {
                        caixaTxtProxima.setText(caixaTxtProxima.getText() + "Fileira "
                                + contfileira + " Cadeira " + contcadeira + "\n");
                        contcadeira++;
                        contvezes++;
                    } else if (setorAzulD1[contfileira][contcadeira] == 1) {
                        contcadeira++;
                    }
                    if (contcadeira == 201) {
                        contcadeira = 1;
                        contfileira++;
                    }
                    if (contfileira == 26) {
                        caixaTxtProxima.setText(caixaTxtProxima.getText() + "Não há mais lugares disponíveis.");
                        contvezes = sugest;
                    }
                }
            } else if (comboSetor.getSelectedItem() == "Branco") {
                int contfileira = 1, contcadeira = 1;
                int contvezes = 0;
                while (contvezes < sugest) {
                    if (setorBrancoD1[contfileira][contcadeira] == 0) {
                        caixaTxtProxima.setText(caixaTxtProxima.getText() + "Fileira "
                                + contfileira + " Cadeira " + contcadeira + "\n");
                        contcadeira++;
                        contvezes++;
                    } else if (setorBrancoD1[contfileira][contcadeira] == 1) {
                        contcadeira++;
                    }
                    if (contcadeira == 201) {
                        contcadeira = 1;
                        contfileira++;
                    }
                    if (contfileira == 26) {
                        caixaTxtProxima.setText(caixaTxtProxima.getText() + "Não há mais lugares disponíveis.");
                        contvezes = sugest;
                    }
                }
            } else if (comboSetor.getSelectedItem() == "Verde") {
                int contfileira = 1, contcadeira = 1;
                int contvezes = 0;
                while (contvezes < sugest) {
                    if (setorVerdeD1[contfileira][contcadeira] == 0) {
                        caixaTxtProxima.setText(caixaTxtProxima.getText() + "Fileira "
                                + contfileira + " Cadeira " + contcadeira + "\n");
                        contcadeira++;
                        contvezes++;
                    } else if (setorVerdeD1[contfileira][contcadeira] == 1) {
                        contcadeira++;
                    }
                    if (contcadeira == 201) {
                        contcadeira = 1;
                        contfileira++;
                    }
                    if (contfileira == 26) {
                        caixaTxtProxima.setText(caixaTxtProxima.getText() + "Não há mais lugares disponíveis.");
                        contvezes = sugest;
                    }
                }
            }
        } else if (radioSegundoDia.isSelected() == true) {
            if (comboSetor.getSelectedItem() == "Amarelo") {
                int contfileira = 1, contcadeira = 1;
                int contvezes = 0;
                while (contvezes < sugest) {
                    if (setorAmareloD2[contfileira][contcadeira] == 0) {
                        caixaTxtProxima.setText(caixaTxtProxima.getText() + "Fileira "
                                + contfileira + " Cadeira " + contcadeira + "\n");
                        contcadeira++;
                        contvezes++;
                    } else if (setorAmareloD2[contfileira][contcadeira] == 1) {
                        contcadeira++;
                    }
                    if (contcadeira == 201) {
                        contcadeira = 1;
                        contfileira++;
                    }
                    if (contfileira == 26) {
                        caixaTxtProxima.setText(caixaTxtProxima.getText() + "Não há mais lugares disponíveis.");
                        contvezes = sugest;
                    }
                }
            } else if (comboSetor.getSelectedItem() == "Azul") {
                int contfileira = 1, contcadeira = 1;
                int contvezes = 0;
                while (contvezes < sugest) {
                    if (setorAzulD2[contfileira][contcadeira] == 0) {
                        caixaTxtProxima.setText(caixaTxtProxima.getText() + "Fileira "
                                + contfileira + " Cadeira " + contcadeira + "\n");
                        contcadeira++;
                        contvezes++;
                    } else if (setorAzulD2[contfileira][contcadeira] == 1) {
                        contcadeira++;
                    }
                    if (contcadeira == 201) {
                        contcadeira = 1;
                        contfileira++;
                    }
                    if (contfileira == 26) {
                        caixaTxtProxima.setText(caixaTxtProxima.getText() + "Não há mais lugares disponíveis.");
                        contvezes = sugest;
                    }
                }
            } else if (comboSetor.getSelectedItem() == "Branco") {
                int contfileira = 1, contcadeira = 1;
                int contvezes = 0;
                while (contvezes < sugest) {
                    if (setorBrancoD2[contfileira][contcadeira] == 0) {
                        caixaTxtProxima.setText(caixaTxtProxima.getText() + "Fileira "
                                + contfileira + " Cadeira " + contcadeira + "\n");
                        contcadeira++;
                        contvezes++;
                    } else if (setorBrancoD2[contfileira][contcadeira] == 1) {
                        contcadeira++;
                    }
                    if (contcadeira == 201) {
                        contcadeira = 1;
                        contfileira++;
                    }
                    if (contfileira == 26) {
                        caixaTxtProxima.setText(caixaTxtProxima.getText() + "Não há mais lugares disponíveis.");
                        contvezes = sugest;
                    }
                }
            } else if (comboSetor.getSelectedItem() == "Verde") {
                int contfileira = 1, contcadeira = 1;
                int contvezes = 0;
                while (contvezes < sugest) {
                    if (setorVerdeD2[contfileira][contcadeira] == 0) {
                        caixaTxtProxima.setText(caixaTxtProxima.getText() + "Fileira "
                                + contfileira + " Cadeira " + contcadeira + "\n");
                        contcadeira++;
                        contvezes++;
                    } else if (setorVerdeD2[contfileira][contcadeira] == 1) {
                        contcadeira++;
                    }
                    if (contcadeira == 201) {
                        contcadeira = 1;
                        contfileira++;
                    }
                    if (contfileira == 26) {
                        caixaTxtProxima.setText(caixaTxtProxima.getText() + "Não há mais lugares disponíveis.");
                        contvezes = sugest;
                    }
                }
            }
        }
    }

    private void setIcon() {

        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Iconep.png")));
    
    }
    
}
