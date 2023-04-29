package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class GameInterface extends JFrame{

	//componentes da interface grafica
	private JButton botaoPedra;
	private JButton botaoPapel;
	private JButton botaoTesoura;
	private JLabel resultado;
	
	public GameInterface() {
		//configuracoes basicas da tela
        setTitle("Jokenpo");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
        setResizable(false);
		
        //torna a tela visivel
        setVisible(true);
        
        //cria os componentes
        botaoPedra = new JButton();
        botaoPapel = new JButton();
        botaoTesoura = new JButton();
        resultado = new JLabel();
        botaoPedra.setText("Pedra");
        botaoPapel.setText("Papel");
        botaoTesoura.setText("Tesoura");
        
        //label para exibir o resultado
        resultado = new JLabel("Escolha sua jogada");
        
        //Layout
		setLayout(null);
		
		//locais dos componentes
		botaoPedra.setBounds(50, 50, 100, 70);
		botaoPapel.setBounds(200, 50, 100, 70);
		botaoTesoura.setBounds(350, 50, 100, 70);
		resultado.setBounds(200, 70, 100, 70);
		//adiciona os componentes na tela
		add(botaoPedra);
		add(botaoPapel);
		add(botaoTesoura);
		add(resultado);
		
		
	}

}
