import javax.swing.JOptionPane;

public class Resultadoaluno {

	public static void main(String[] args) {
	
		double media = Double.parseDouble(JOptionPane
		 .showInputDialog(null, "media"));
				
		if(media >=6.0) {
			JOptionPane.showMessageDialog(null,
					"Aprovado!");
	
		
		} else {
			JOptionPane.showMessageDialog(null, 
		       "Reprovado");
		  
				
		}
	}
}