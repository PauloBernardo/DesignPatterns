package com.company.Composite;

public abstract class ProductComponent {
    public abstract float getPrice();
    public abstract String getDescription();
    public void addProductComponent(ProductComponent productComponent) {
        throw new UnsupportedOperationException();
    }
    public void removeProductComponent(int productIndex) {
        throw new UnsupportedOperationException();
    }
    public ProductComponent getProductComponent(int productIndex) {
        throw new UnsupportedOperationException();
    }
}
