public class Inventaire {
    public static long valeurAssuree(Object[] objets) {
        long somme = 0;
        if (objets == null) return somme;

        for (Object objet : objets) {
            if (objet instanceof ColisFragile) {
                ColisFragile fragile = (ColisFragile) objet;
                somme += fragile.getValeurDeclaree();
            }
        }
        return somme;
    }

    // Résultat : {standard, express, fragile, autres}
    public static int[] compterParType(Object[] objets) {
        int[] resultat = new int[4];
        if (objets == null) return resultat;

        for (Object objet : objets) {
            if (objet instanceof ColisFragile) {
                resultat[2]++;
            } else if (objet instanceof ColisExpress) {
                resultat[1]++;
            } else if (objet instanceof ColisStandard) {
                resultat[0]++;
            } else if (objet != null) {
                resultat[3]++;
            }
        }
        return resultat;
    }
}

