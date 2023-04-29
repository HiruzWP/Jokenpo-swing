package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Jogada;
import model.verificarJogadas;

@SuppressWarnings("serial")
public class GameInterface extends JFrame{

	//componentes da interface grafica
	private JButton botaoPedra;
	private JButton botaoPapel;
	private JButton botaoTesoura;
	private static JLabel resultado;
	private static JLabel jogadaOponente;
	
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
        botaoPedra.setText("Pedra");
        botaoPapel.setText("Papel");
        botaoTesoura.setText("Tesoura");
        
        //labels
        resultado = new JLabel("Escolha sua jogada");
        resultado.setFont(new Font("Arial", Font.PLAIN, 20));
        jogadaOponente = new JLabel();
        jogadaOponente.setFont(new Font("Arial", Font.PLAIN, 20));
        //Layout
		setLayout(null);
		
		//locais dos componentes
		botaoPedra.setBounds(50, 50, 100, 70);
		botaoPapel.setBounds(200, 50, 100, 70);
		botaoTesoura.setBounds(350, 50, 100, 70);
		resultado.setBounds(150, 190, 200, 50);
		jogadaOponente.setBounds(110, 140, 310, 50);
		//adiciona os componentes na tela
		add(botaoPedra);
		add(botaoPapel);
		add(botaoTesoura);
		add(resultado);
		add(jogadaOponente);
		
		botaoPedra.addActionListener(event -> {
			
			verificarJogadas.adicionarPlay(Jogada.PEDRA);
			
		});
		
		botaoPapel.addActionListener(event -> {
			
			verificarJogadas.adicionarPlay(Jogada.PAPEL);
			
		});
		
		botaoTesoura.addActionListener(event -> {
			
			verificarJogadas.adicionarPlay(Jogada.TESOURA);
			
		});
		
	}
	
	public static void setResultado(String result, String op, Jogada j) {
		
		resultado.setText(result);
		
		if(op == "emp") {
			jogadaOponente.setText("Jogada do oponente: " + j);
		}else {
			jogadaOponente.setText(op);
		}
		
		if(result.equals("Empate.")) {
			
			resultado.setBounds(210, 190, 200, 50);
			resultado.setForeground(new Color(250, 0 ,250));
			
		}else if(result.equals("Voce venceu!")) {
			
			resultado.setBounds(180, 190, 200, 50);
			resultado.setForeground(new Color(0, 250 ,0));
			
		}else if(result.equals("Oponente venceu!")){
			
			resultado.setBounds(160, 190, 200, 50);
			resultado.setForeground(new Color(250, 0 ,0));
		}
		
	}
	
	public static void main(String[] args) {
		
		new GameInterface();
	}

}
