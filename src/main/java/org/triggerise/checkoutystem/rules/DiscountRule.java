package org.triggerise.checkoutystem.rules;

import org.triggerise.checkoutystem.data.Product;

import java.math.BigDecimal;

public interface DiscountRule {

    BigDecimal apply(Product product, int quantity);
}
