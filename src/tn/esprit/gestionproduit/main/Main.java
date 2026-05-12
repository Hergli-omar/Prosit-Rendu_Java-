package tn.esprit.gestionproduit.main;

import tn.esprit.gestionproduit.entities.Product;
import tn.esprit.gestionproduit.services.ProductManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductManagement pm = new ProductManagement();

        // Test 1: Création de produits via Supplier
        Product p1 = pm.createProduct(() -> new Product(3, "PC Portable", 1500.0));
        Product p2 = pm.createProduct(() -> new Product(1, "Souris Sans Fil", 25.0));
        Product p3 = pm.createProduct(() -> new Product(2, "Clavier Mécanique", 85.0));

        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);

        // Test 2: Affichage classique avec Consumer
        System.out.println("--- Liste de tous les produits ---");
        pm.displayProducts(products, p -> System.out.println(p));

        // Test 3: Affichage filtré avec Predicate et Consumer
        System.out.println("\n--- Produits ayant un prix supérieur à 50 ---");
        pm.displayProductsByFilter(products, p -> p.getPrix() > 50, p -> System.out.println(p));

        // Test 4: Extraction des noms avec Function
        System.out.println("\n--- Noms des produits ---");
        String names = pm.returnProductsNames(products, p -> p.getNom());
        System.out.println("Résultat: " + names);

        // Test 5: Tri personnalisé avec Comparator
        System.out.println("\n--- Produits triés par ID ---");
        List<Product> sorted = pm.sortProductsById(products, (prod1, prod2) -> Integer.compare(prod1.getId(), prod2.getId()));
        pm.displayProducts(sorted, p -> System.out.println(p));

        // Test 6: Conversion en Stream
        System.out.println("\n--- Test conversion en Stream ---");
        long count = pm.convertToStream(products).count();
        System.out.println("Le stream contient " + count + " éléments.");
    }
}
