package com.claudiowork.mockito.junit.model;

/**
 * Product Model API.
 */
public interface Product {

	long getId();

	String getName();

	ProductType getType();

	Amount getAmount();
}
