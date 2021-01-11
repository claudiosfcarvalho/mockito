package com.claudiowork.mockito.junit.business;

import java.util.List;

import com.claudiowork.mockito.junit.business.exception.DifferentCurrenciesException;
import com.claudiowork.mockito.junit.model.Amount;
import com.claudiowork.mockito.junit.model.Product;

public interface ClientBO {

	Amount getClientProductsSum(List<Product> products)
			throws DifferentCurrenciesException;

}