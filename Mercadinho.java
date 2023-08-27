package principal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Mercadinho {
	public static void main(String[] args) {
		

		JFrame frame = new JFrame("MERCADINHO");
		
		
		JPanel topPanel = new JPanel();
		JPanel checkPanel = new JPanel();
		JPanel valuesPanel = new JPanel();
		JPanel amountPanel = new JPanel();	
		JPanel bottomPanel = new JPanel();		
		
		JLabel toppingsLabel = new JLabel("Produtos");
		JLabel toppingsLabel2 = new JLabel("Valor");
		JLabel toppingsLabel3 = new JLabel("Quantidade em KG");
		JLabel resultLabel = new JLabel("Resultado: ");

		topPanel.setLayout(new GridLayout(1,0, 80, 70));

		
		topPanel.add(toppingsLabel);
		topPanel.add(toppingsLabel2);
		topPanel.add(toppingsLabel3);
	
		
		
		
		
		JLabel preco = new JLabel("R$ 1.50");
		preco.setHorizontalAlignment(JLabel.CENTER);
		JLabel preco2 = new JLabel("R$ 2.00");
		preco2.setHorizontalAlignment(JLabel.CENTER);
		JLabel preco3 = new JLabel("R$ 2.35");
		preco3.setHorizontalAlignment(JLabel.CENTER);
		JLabel preco4 = new JLabel("R$3.10");
		preco4.setHorizontalAlignment(JLabel.CENTER);
		JLabel preco5 = new JLabel("R$ 3.00");
		preco5.setHorizontalAlignment(JLabel.CENTER);
		JLabel preco6 = new JLabel("R$ 1.85");
		preco6.setHorizontalAlignment(JLabel.CENTER);
		JLabel preco7 = new JLabel("R$ 3.50");
		preco7.setHorizontalAlignment(JLabel.CENTER);
		

		checkPanel.setLayout(new GridLayout(0,1));
		
		checkPanel.add(preco);
		checkPanel.add(preco2);
		checkPanel.add(preco3);
		checkPanel.add(preco4);
		checkPanel.add(preco5);
		checkPanel.add(preco6);
		checkPanel.add(preco7);
		
		
		
		JCheckBox potatoCheckBox = new JCheckBox("Batata");
		JCheckBox carrotCheckBox = new JCheckBox("Cenoura");
		JCheckBox beetCheckBox = new JCheckBox("Betterraba");
		JCheckBox onionsCheckBox = new JCheckBox("Cebola");
		JCheckBox pepperCheckBox = new JCheckBox("Pimentão");
		JCheckBox cucumberCheckBox = new JCheckBox("Pepino");
		JCheckBox tomatoCheckBox = new JCheckBox("Tomate");
		
		
		valuesPanel.setLayout(new GridLayout(0,1));
		
		valuesPanel.add(potatoCheckBox);
		valuesPanel.add(carrotCheckBox);
		valuesPanel.add(beetCheckBox);
		valuesPanel.add(onionsCheckBox);
		valuesPanel.add(pepperCheckBox);
		valuesPanel.add(cucumberCheckBox);
		valuesPanel.add(tomatoCheckBox);
		
		JTextField textField = new JTextField(10);
		JTextField textField2 = new JTextField();
		JTextField textField3 = new JTextField();
		JTextField textField4 = new JTextField();
		JTextField textField5 = new JTextField();
		JTextField textField6 = new JTextField();
		JTextField textField7 = new JTextField();
		
		

		amountPanel.setLayout(new GridLayout(0,1));
		
		amountPanel.add(textField);
		amountPanel.add(textField2);
		amountPanel.add(textField3);
		amountPanel.add(textField4);
		amountPanel.add(textField5);
		amountPanel.add(textField6);
		amountPanel.add(textField7);
		
		
		bottomPanel.setLayout(new GridLayout(0,1));
		
		JButton submitButton = new JButton("Comprar");
		
		bottomPanel.add(submitButton);
		bottomPanel.add(resultLabel);
		
		


		
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Double> conta = new ArrayList();
				if(e.getSource()==submitButton) {
					if(potatoCheckBox.isSelected()) {
						String s = textField.getText();
						double n = Double.parseDouble(s);
						double result = n * 1.50;
						conta.add((double) result);
					}
				} if(carrotCheckBox.isSelected()) {
					String s = textField2.getText();
					double n = Double.parseDouble(s);
					double result = n * 2;
					conta.add((double) result);
				} if(beetCheckBox.isSelected()) {
					String s = textField3.getText();
					double n = Double.parseDouble(s);
					double result = n * 2.35;
					conta.add((double) result);	
				} if(onionsCheckBox.isSelected()) {
					String s = textField4.getText();
					double n = Double.parseDouble(s);
					double result = n * 3.10;
					conta.add((double) result); 
				} if(pepperCheckBox.isSelected()) {
					String s = textField5.getText();
					double n = Double.parseDouble(s);
					double result = n * 3;
					conta.add((double) result); 
				} if(cucumberCheckBox.isSelected()) {
					String s = textField6.getText();
					double n = Double.parseDouble(s);
					double result = n * 1.85;
					conta.add((double) result); 
				} if(tomatoCheckBox.isSelected()) {
					String s = textField7.getText();
					double n = Double.parseDouble(s);
					double result = n * 3.50;
					conta.add((double) result); 
					
				}

				
				Double sum = conta.stream().reduce((x, y) -> x + y).get();
				//System.out.printf("%.2f\n", sum);
			
			resultLabel.setText("Resultado: " + sum.toString());
				
			
			}
			});
		
		
		frame.setLayout(new BorderLayout());
				
	
		frame.add(topPanel, BorderLayout.NORTH);
		frame.add(checkPanel, BorderLayout.CENTER);
		frame.add(valuesPanel, BorderLayout.WEST);
		frame.add(amountPanel, BorderLayout.EAST);
		frame.add(bottomPanel, BorderLayout.PAGE_END);
		
		ImageIcon carrinho = new ImageIcon("carrinho.png");
		Image Image = carrinho.getImage();
		
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(Image);
		frame.setVisible(true);


		
	}

			
}

