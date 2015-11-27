package etag;

import console.JPrompt;
import static etag.Controladora.SEL_TUDO;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.KeyStroke;

/**
 * Classe principal da ferramenta e-TAG para controle de eventos na janela.
 *
 * @author Professor Moises Henrique Ramos Pereira
 * @version 3.0
 */
public class Principal extends etag.Controladora {
    
    // <editor-fold defaultstate="collapsed" desc="Configuração das Teclas de Atalho">
    /**
     * Método que configura as ações a serem executadas pelas teclas de atalho
     * da ferramenta.
     * 
     */
    private void configurarTeclasAtalho() {
        //Ctrl + T (Selecionar todos os vértices e arestas)
        jPanelFundo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_MASK), SEL_TUDO);
        jPanelFundo.getActionMap().put(SEL_TUDO, new AcaoSelecionarTudo());
        
        //Ctrl + V (Adicionar vértice)
        jPanelFundo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK), ADD_VERTICE);
        jPanelFundo.getActionMap().put(ADD_VERTICE, new AcaoAddVertice());
        
        //Ctrl + A (Adicionar aresta)
        jPanelFundo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK), ADD_ARESTA);
        jPanelFundo.getActionMap().put(ADD_ARESTA, new AcaoAddAresta());
        
        //DELETE (Deletar os itens selecionados)
        jPanelFundo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke("DELETE"), DEL_ITEM);
        jPanelFundo.getActionMap().put(DEL_ITEM, new AcaoDeletarItem());
    }// </editor-fold>
    
    /**
     * Método construtor da tela principal da ferramenta e-TAG.
     * 
     */
    public Principal() {
        initComponents();
        configurarTeclasAtalho();
        
        this.jPanel1.add(this.grafoComponente, 0);
        this.setContentPane(this.jPanelFundo);
        this.jCheckBox2.setSelected(this.grafo.getDirecionado());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar2 = new javax.swing.JToolBar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelFundo = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        Ordem = new javax.swing.JMenuItem();
        Tamanho = new javax.swing.JMenuItem();
        CentralidadeProximidade = new javax.swing.JMenuItem();

        jToolBar2.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("e-TAG: Ensino de Teoria Aplicada em Grafos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(330, 530));

        jPanelFundo.setLayout(new java.awt.BorderLayout());

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButton3.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        jButton3.setText("Next");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        jButton4.setText("Adicionar Aresta");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jCheckBox2.setFocusable(false);
        jCheckBox2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jCheckBox2.setMargin(new java.awt.Insets(0, 30, 0, 0));
        jCheckBox2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });
        jToolBar1.add(jCheckBox2);

        jLabel5.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        jLabel5.setText("Grafo Direcionado?");
        jToolBar1.add(jLabel5);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFocusable(false);
        jRadioButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jRadioButton1.setMargin(new java.awt.Insets(0, 30, 0, 0));
        jRadioButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jRadioButton1);

        jLabel4.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        jLabel4.setText(" Adicionar Vértice? ");
        jToolBar1.add(jLabel4);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFocusable(false);
        jRadioButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jRadioButton2.setMargin(new java.awt.Insets(0, 30, 0, 0));
        jRadioButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jRadioButton2);

        jLabel6.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        jLabel6.setText("Remover Itens? ");
        jToolBar1.add(jLabel6);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setSelected(true);
        jRadioButton3.setFocusable(false);
        jRadioButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jRadioButton3.setMargin(new java.awt.Insets(0, 30, 0, 0));
        jRadioButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jRadioButton3);

        jLabel7.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        jLabel7.setText("Prosseguir Trabalhando!   ");
        jToolBar1.add(jLabel7);

        jPanelFundo.add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.BorderLayout());
        jTabbedPane1.addTab("Área de Visualização", jPanel1);

        jTextPane1.setEditable(false);
        jTextPane1.setText("Nesta aba estão descritas as principais funcionalidades do e-TAG:\n\n1) No menu \"Arquivo\", existem opções para criar um novo arquivo de grafo vazio, salvar o grafo atual em um arquivo de grafo (.grf), carregar um arquivo de grafo e importar arquivos CSV de relações de amizade do LinkedIn.\n\n2) No menu \"Algoritmos\" estão todos os algoritmos de grafos que devem ser implementados pelo usuário. As respectivas funções são abstratas e devem ser implementadas na classe usuária que estender JanelaETAG.java. Elas já estão configuradas com o evento de clique do mouse pela ferramenta.\n\n3) No menu \"Animações\", tem-se as mesmas considerações em 1, porém o código está implementado na classe usuária Principal.java para que os alunos possam estudar o código que permite animações.\n\n4) O menu \"Sobre\" apenas mostra algumas informações sobre a ferramenta e-TAG.\n\n5) Sobre os botões que se encontram logo abaixo da barra de menu: o botão \"Next\" serve para acompanhar passo-a-passo a animação gerada pelos algoritmos; e o botão \"Adionar Aresta\" permite adicionar uma nova aresta no grafo, bastando selecionar dois vértices do diagrama na Área de Visualização e clicar nesse botão.\n\n6) O campo checkbox \"Grafo Direcionado?\", quando marcado, informa que o grafo ali representado no diagrama é um dígrafo, ou seja, as arestas são setas orientadas. Caso contrário, informa que o grafo não é direcionado, cujas arestas não são setas.\n\n7) O campo radio \"Adicionar Vértice?\", quando marcado, permite adicionar vértices no grafo clicando com o mouse dentro da Área de Visualização.\n\n8) O campo radio \"Remover Itens?\", quando marcado, permite deletar vértices ou arestas clicando com o mouse sobre o item gráfico desejado.\n\n9) O campo radio \"Prosseguir Trabalhando!\", quando marcado, permite manipular os vértices e arestas do grafo com o mouse, sem criar novos vértices e sem remover itens com os cliques do mouse. Esses três campos radio são mutuamente exclusivos.\n\n10) A aba \"Área de Visualização\" permite ver e interagir com o diagrama do grafo corrente.\n\n11) TECLAS DE ATALHO:\n   • Ctrl + N = Cria um novo arquivo de grafo vazio;\n   • Ctrl + S = Salva o grafo atual em um arquivo de grafo;\n   • Ctrl + O = Carrega um grafo proveniente de um arquivo de grafo;\n   • Ctrl + T = Seleciona todos os itens da Área de Visualização;\n   • Ctrl + V = Adiciona um novo vértice na posição atual do cursor do mouse;\n   • Ctrl + A = Adiciona uma aresta caso um ou dois vértices estejam selecionados;\n   • DELETE  = Deleta os itens selecionados na Área de Visualização.");
        jTextPane1.setMaximumSize(new java.awt.Dimension(123, 240));
        jTextPane1.setPreferredSize(new java.awt.Dimension(350, 350));
        jScrollPane1.setViewportView(jTextPane1);

        jTabbedPane1.addTab("Manual de Uso", jScrollPane1);

        jPanelFundo.add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        jMenu4.setText("Arquivo");

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Novo Grafo...");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setText("Salvar Grafo");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setText("Carregar Grafo");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem14);

        jMenuItem15.setText("Importar CSV do LinkedIn");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);
        jMenu4.add(jSeparator1);

        jMenuItem13.setText("Sair");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        jMenuBar1.add(jMenu4);

        jMenu1.setText("Algoritmos");

        jMenuItem4.setText("AGM Prim");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem9.setText("AGM Kruskal");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem7.setText("Busca em Profundidade");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("Busca em Largura");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem10.setText("Algortimo de Dijkstra");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Animações");

        jMenuItem1.setText("Colore todos os vértices");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem16.setText("Colore todos os vértices (Timer)");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem16);

        jMenuItem5.setText("Colore todas as arestas");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem17.setText("Colore todas as arestas (Timer)");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem17);

        jMenuItem6.setText("Colore vértices e arestas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem18.setText("Colore vértices e arestas (Timer)");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem18);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sobre");

        jMenuItem2.setText("Professores");
        jMenuItem2.setToolTipText("Professores envolvidos no projeto do e-TAG");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("e-TAG");
        jMenuItem3.setToolTipText("Descreve os objetivos da ferramenta e-TAG");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Trabalho Prático III");

        Ordem.setText("Ordem");
        Ordem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdemActionPerformed(evt);
            }
        });
        jMenu5.add(Ordem);

        Tamanho.setText("Tamanho");
        Tamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TamanhoActionPerformed(evt);
            }
        });
        jMenu5.add(Tamanho);

        CentralidadeProximidade.setText("Centralidade de proximidade");
        CentralidadeProximidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CentralidadeProximidadeActionPerformed(evt);
            }
        });
        jMenu5.add(CentralidadeProximidade);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Área dos eventos (personalizados ou não) disparados pela ferramenta.
     * 
     */
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.exibeSobreProfessores();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.exibeSobreETag();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.processaFuncionalidadeNext();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.algoritmoAGMPrim();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.animacaoColorirVertices();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.animacaoColorirArestas();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        this.animacaoColorirVerticesArestas();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        this.alteraEstadoCheckBox();
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        this.algoritmoBuscaProfundidade();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        this.algoritmoBuscaLargura();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.adicionaAresta();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        this.algoritmoAGMKruskal();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        algoritmoDijkstra();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        this.novoGrafo();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        this.salvarGrafo(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        this.verificacaoFinalizacaoPrograma();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        this.carregarGrafo();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        this.importarCSV();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        int delay = JPrompt.readIntPane("Timer", "Informe um intervalo de coloração entre os vértices (em milissegundos)", "?");
        this.animacaoColorirVertices(delay);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        int delay = JPrompt.readIntPane("Timer", "Informe um intervalo de coloração entre os vértices (em milissegundos)", "?");
        this.animacaoColorirArestas(delay);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        int delay = JPrompt.readIntPane("Timer", "Informe um intervalo de coloração entre os vértices (em milissegundos)", "?");
        this.animacaoColorirVerticesArestas(delay);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void OrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdemActionPerformed
        
        GrafoController grafoController = new GrafoController(this.grafo);
        
        JPrompt.printPane("Quantidade de Vértices: " + grafoController.getOrdem());

    }//GEN-LAST:event_OrdemActionPerformed

    private void TamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TamanhoActionPerformed
        
        GrafoController grafoController = new GrafoController(this.grafo);
        
        JPrompt.printPane("Quantidade de Arestas: " + grafoController.getTamanho());
    }//GEN-LAST:event_TamanhoActionPerformed

    private void CentralidadeProximidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CentralidadeProximidadeActionPerformed
              
        GrafoController grafoController = new GrafoController(this.grafo);
        
        grafoController.RankearCP();
        
        String mensagem = grafoController.getTopNCP(3);
        
        JPrompt.printPane(mensagem);
                      
    }//GEN-LAST:event_CentralidadeProximidadeActionPerformed
    
    /**
     * Método principal para execução da janela gráfica da ferramenta.
     * 
     * @param args : argumentos em linha de comando.
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CentralidadeProximidade;
    private javax.swing.JMenuItem Ordem;
    private javax.swing.JMenuItem Tamanho;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables

    @Override
    protected JRadioButton getJRadioButton1() {
        return jRadioButton1;
    }
    
    @Override
    protected JRadioButton getJRadioButton2() {
        return jRadioButton2;
    }
    
    @Override
    protected JPanel getJPanelFundo() {
        return jPanelFundo;
    }
    
    @Override
    protected JTabbedPane getJTabbedPane1() {
        return jTabbedPane1;
    }
    
    @Override
    protected JCheckBox getJCheckBox2() {
        return jCheckBox2;
    }
    
    @Override
    public void algoritmoAGMPrim() {
        JPrompt.printPane("Algoritmo ainda não programado no e-TAG.");
        
    }

    @Override
    public void algoritmoAGMKruskal() {
        JPrompt.printPane("Algoritmo ainda não programado no e-TAG.");
    }

    @Override
    public void algoritmoBuscaProfundidade() {
        JPrompt.printPane("Algoritmo ainda não programado no e-TAG.");
    }

    @Override
    public void algoritmoBuscaLargura() {
        JPrompt.printPane("Algoritmo ainda não programado no e-TAG.");
    }

    @Override
    public void algoritmoDijkstra() {
        JPrompt.printPane("Algoritmo ainda não programado no e-TAG.");
    }

    /**
     * Prosseguir implementando os seus algoritmos aqui ou nos próprios eventos.
     * 
     */
    
    // Implementar aqui.
}
