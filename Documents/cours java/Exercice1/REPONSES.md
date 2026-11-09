# Exercice 1 — Lire, prédire et transtyper

## A. Prédiction de l'affichage

```text
A vehicule
F null 0
E moto 137
Moto2
vehicule
moto
C3
C2
D-vehicule
A vehicule
F null 0
E moto 137
true false
true
A vehicule
B vehicule
3
```

### Justifications

- **F null 0 :** la méthode `demarrer()` de `Moto` est appelée avant l'initialisation de ses attributs.
- **C3 :** la méthode `comparer(Vehicule)` est redéfinie dans `Moto`.
- **C2 :** la méthode `comparer(Moto)` est héritée de `Vehicule`.
- **D-vehicule :** la méthode statique `categorie()` est appelée selon le type déclaré `Vehicule`.
- **true false :** `equals()` compare l'objet à lui-même, puis `==` compare deux objets différents.
## B. Transtypage

1. `Vehicule x1 = c;`
   - Compile : Oui
   - Exécution : OK
   - Explication : Une Moto peut être référencée par une variable Vehicule.

2. `Moto x2 = a;`
   - Compile : Non
   - Exécution : Erreur de compilation
   - Explication : Il faut un cast explicite.

3. `Moto x3 = (Moto) a;`
   - Compile : Oui
   - Exécution : OK
   - Explication : L'objet référencé par a est réellement une Moto.

4. `Moto x4 = (Moto) b;`
   - Compile : Oui
   - Exécution : ClassCastException
   - Explication : b référence un Camion, pas une Moto.

5. `Camion x5 = (Camion) c;`
   - Compile : Oui
   - Exécution : ClassCastException
   - Explication : c référence une Moto, pas un Camion.

6. `String x6 = (String) b;`
   - Compile : Oui
   - Exécution : ClassCastException
   - Explication : b référence un Camion, pas une String.

7. `String x7 = b.type();`
   - Compile : Non
   - Exécution : Erreur de compilation
   - Explication : Object ne possède pas de méthode type().

8. `String x8 = ((Vehicule) b).type();`
   - Compile : Oui
   - Exécution : OK
   - Explication : b référence un Camion, qui hérite de Vehicule.
