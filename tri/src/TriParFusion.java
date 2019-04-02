public class TriParFusion {
	private long countComp;
	private long countAdd;



	public TriParFusion(Element[] tab) {
		countComp = 0;
		countAdd = 0;
		int longueur = tab.length;
		if (longueur > 0) {
			triFusion(tab, 0, longueur-1);
		}
	}



	private long getCountComp() {
		return countComp;
	}
	
	private long getCountAdd() {
		return countAdd;
	}



	private void triFusion(Element[] tab, int deb, int fin) {
		if (deb != fin) {
			int milieu = (fin+deb)/2;
			triFusion(tab, deb, milieu);
			triFusion(tab, milieu+1, fin);
			fusion(tab, deb, milieu, fin);
		}
	}

	private void fusion(Element[] tab, int deb1 , int fin1 , int fin2){
		int deb2 = fin1+1;

		Element[] tab1 = new Element[fin1 - deb1 + 1];
		for(int i = deb1; i <= fin1; i++) {
			tab1[i-deb1] = tab[i];
			countAdd++;
		}

		int cpt1 = deb1;
		int cpt2 = deb2;

		for(int i = deb1; i <= fin2; i++) {
			if (cpt1 == deb2) {
				break;
		    }
		    else if (cpt2 == (fin2+1)) {
		    	tab[i] = tab1[cpt1-deb1];
		    	countAdd++;
		        cpt1++;
		    }
		    else if (tab1[cpt1-deb1].getEntier() < tab[cpt2].getEntier()) {
		    	countComp++;
		        tab[i] = tab1[cpt1-deb1];
		        countAdd++;
		        cpt1++;
		    }
		    else {
		    	countComp++;
		    	tab[i] = tab[cpt2];
		    	countAdd++;
		        cpt2++;
		    }
		}
	}

	public String toString() {
		return "\nCompteur d'affectation = " + this.getCountAdd() + "\nCompteur de Comparaison de cle = " + this.getCountComp();
	}
}
