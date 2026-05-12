package tn.esprit.gestionproduit.services;

import tn.esprit.gestionproduit.entities.Product;
import tn.esprit.gestionproduit.interfaces.Management;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ProductManagement implements Management {

    @Override
    public void displayProducts(List<Product> products, Consumer<Product> con) {
        products.forEach(con);
    }

    @Override
    public void displayProductsByFilter(List<Product> products, Predicate<Product> pre, Consumer<Product> con) {
        for (Product p : products) {
            if (pre.test(p)) {
                con.accept(p);
            }
        }
    }

    @Override
    public String returnProductsNames(List<Product> products, Function<Product, String> fun) {
        StringBuilder names = new StringBuilder();
        for (int i = 0; i < products.size(); i++) {
            names.append(fun.apply(products.get(i)));
            if (i < products.size() - 1) {
                names.append(", ");
            }
        }
        return names.toString();
    }

    @Override
    public Product createProduct(Supplier<Product> sup) {
        return sup.get();
    }

    @Override
    public List<Product> sortProductsById(List<Product> products, Comparator<Product> com) {
        List<Product> sortedList = new ArrayList<>(products);
        sortedList.sort(com);
        return sortedList;
    }

    @Override
    public Stream<Product> convertToStream(List<Product> products) {
        return products.stream();
    }
}
