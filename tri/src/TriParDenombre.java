public class TriParDenombre {
	
	private long countComp;
	private long countAdd;
	private int borneSup;



	public TriParDenombre(int borneSup) {
		countComp = 0;
		countAdd = 0;
		this.borneSup = borneSup;
	}



	private long getCountComp() {
		return countComp;
	}
	
	private long getCountAdd() {
		return countAdd;
	}
	

	
	public void triParDenombrement(Element[] tab) {
		int[] tabComptage = new int[borneSup+1];

		int x = 0, k = 0;
		
		Element[] tabSave = new Element[tab.length];
		for (Element t : tab) {
			tabSave[k] = new Element(t);
			k++;
		}
		
		for (int i = 0; i < borneSup; i++) {
			tabComptage[i] = 0;
		}

		for (Element element : tab) {
			tabComptage[element.getEntier()]++;
			countAdd++;
		}
		
		for (int i = 0; i < borneSup; i++) {
			k = 0;
			for (int j = 0; j < tabComptage[i]; j++) {
				while (k < tabSave.length && tabSave[k].getEntier() != i)
					k++;
				tab[x].setText(tabSave[k].getText());
				tab[x++].setEntier(i);
				k++;
				countAdd++;
			}
		}
	}

	public String toString() {
		return "\nCompteur d'affectation = " + this.getCountAdd() + "\nCompteur de Comparaison de cle = " + this.getCountComp();
	}
}
