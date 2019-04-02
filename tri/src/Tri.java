import java.util.*;

public class Tri {
	private static Scanner scan;
	private static int nb = 10;
	private static int borneMax = 500000000;
	private static int mode = 3;
	private static boolean affichage = false;
	private static boolean auto = true;
	private static boolean random = true;



	private static void creaTab(Element[] tab) {
		if (auto) {
			if (random) {
				for (int i = 0; i < tab.length ; i++) {
					tab[i] = new Element(((int) (Math.random() * borneMax)), ("#" + i));
					if (affichage) {
						System.out.println(tab[i].toString());
					}
				}
			} else {
				tab[0] = new Element(51, "#0");
				tab[1] = new Element(42, "#1");
				tab[2] = new Element(70, "#2");
				tab[3] = new Element(42, "#3");
				tab[4] = new Element(35, "#4");
				tab[5] = new Element(77, "#5");
				tab[6] = new Element(15, "#6");
				tab[7] = new Element(67, "#7");
				tab[8] = new Element(27, "#8");
				tab[9] = new Element(24, "#9");
				affichage = false;
			}
		} else {
			scan = new Scanner(System.in);
			for (int i = 0; i < tab.length; i++) {
				int cle = scan.nextInt();
				tab[i] = new Element(cle, ("#" + i));
			}
			for (Element element : tab) {
				System.out.println(element.toString());
			}
		}
	}

	public static Element[] copyTab(Element[] tab, Element[] tab2) {
		int i = 0;
		for (Element t : tab) {
			tab2[i] = t;
			i++;
		}
		return tab2;
	}

	public static void main(String[] args){
		Element[] tab = new Element[nb];

		creaTab(tab);

		switch (mode) {
			case 1: // Tri par insertion
				TriParInsert tri = new TriParInsert();
				System.out.println();
				tri.triParInsert(tab);
				for (int i = 0; i < tab.length && affichage; i++) {
					System.out.println(tab[i].toString());
				}
				System.out.println(tri);
				break;

			case 2: // Tri par Fusion
				System.out.println();
				TriParFusion tri1 = new TriParFusion(tab);
				for (int i = 0; i < tab.length && affichage; i++) {
					System.out.println(tab[i].toString());
				}
				System.out.println(tri1);
				break;

			default: // Tri par Denombrement
				TriParDenombre tri2 = new TriParDenombre(borneMax);
				System.out.println();
				tri2.triParDenombrement(tab);
				for (int i = 0; i < tab.length && affichage; i++) {
					System.out.println(tab[i].toString());
				}
				System.out.println(tri2);
		}
	}
}
