package com.company.Composite;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductGroup extends ProductComponent{
    private String description;
    private ArrayList<ProductComponent> productComponents;

    public ProductGroup(String description) {
        productComponents = new ArrayList<>();
        this.description = description;
    }

    @Override
    public float getPrice() {
        float total = 0;
        for(ProductComponent productComponent: productComponents) {
            total += productComponent.getPrice();
        }
        return total;
    }

    @Override
    public String getDescription() {
        String fullDescription = description + "\n";
        Iterator<ProductComponent> iterator = productComponents.iterator();
        while (iterator.hasNext()) {
            ProductComponent productComponent = iterator.next();
            fullDescription += productComponent.getDescription();
            if(iterator.hasNext() && productComponent.getClass().getSimpleName().equals("Product")) fullDescription += ", ";
        }
        fullDescription += "\n";
        return fullDescription;
    }

    public void addProductComponent(ProductComponent productComponent) {
        this.productComponents.add(productComponent);
    }
    public void removeProductComponent(int productIndex) {
        this.productComponents.remove(productIndex);
    }
    public ProductComponent getProductComponent(int productIndex) {
        return this.productComponents.get(productIndex);
    }
}
