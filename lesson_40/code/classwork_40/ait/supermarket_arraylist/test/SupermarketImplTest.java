package classwork_40.ait.supermarket_arraylist.test;

import classwork_40.ait.supermarket_arraylist.dao.Supermarket;
import classwork_40.ait.supermarket_arraylist.dao.SupermarketImpl;
import classwork_40.ait.supermarket_arraylist.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketImplTest {

    Supermarket supermarket;
    Product[] products;
    LocalDate now = LocalDate.now();

    @BeforeEach
    void setUp() {

        supermarket = new SupermarketImpl();
        products = new Product[5];

        products[0] = new Product(111111, "White Bread", "Bread", "Kolosok", 6.5, now.plusDays(5));
        products[1] = new Product(222222, "ChocoMilk", "Dairy", "MilkLand", 13, now.minusDays(3));
        products[2] = new Product(333333, "Cheese Gouda", "Dairy", "Farmer", 22.5, now.plusDays(50));
        products[3] = new Product(444444, "Cheese Cheddar", "Dairy", "MilkLand", 30, now.plusDays(85));
        products[4] = new Product(555555, "Sweet Beans", "Bread", "Kolosok", 18.3, now.minusDays(25));

        for (Product p : products) {
            supermarket.addProduct(p);
        }

    }

    @Test
    void addProduct() {
        assertFalse(supermarket.addProduct(null));
        assertFalse(supermarket.addProduct(products[3]));
        Product product1 = new Product(666666, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25));
        assertTrue(supermarket.addProduct(product1));
        assertEquals(6, supermarket.skuQuantity());
        Product product2 = new Product(666666, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25));
        assertFalse(supermarket.addProduct(product2)); // с одинаковым баркодом
        Product product3 = new Product(777777, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25));
        assertTrue(supermarket.addProduct(product3));

    }

    @Test
    void removeProduct() {
        assertEquals(products[1], supermarket.removeProduct(222222));
        assertEquals(4, supermarket.skuQuantity());
        assertNull(supermarket.removeProduct(222222)); // дважды не можем удалить
    }

    @Test
    void findByBarCode() {
        assertEquals(products[1], supermarket.findByBarCode(222222));
        assertNull(supermarket.findByBarCode(888888));
    }

    @Test
    void findByCategory() {
        ArrayList<Product> actual = (ArrayList<Product>) supermarket.findByCategory("Bread"); // безопасный кастинг
        int l = actual.size();
        Product[] productsActual = new Product[l];
        // перекладываем из List в массив
        int i = 0;
        for (Product p : actual) {
            productsActual[i] = p;
            i++;
        }

        Product[] expected = {products[0], products[4]};
        assertArrayEquals(expected, productsActual);
    }

    @Test
    void findByBrand() {
        Iterable<Product> actual = supermarket.findByBrand("Kolosok");
        Iterable<Product> expected = Arrays.asList(products[0], products[4]);
        assertIterableEquals(actual, expected);
    }

    @Test
    void findProductsWithExpiredDate() {
        Iterable<Product> actual = supermarket.findProductsWithExpiredDate();
        Iterable<Product> expected = Arrays.asList(products[1], products[4]);
        assertIterableEquals(actual, expected);
    }

    @Test
    void skuQuantity() {
        assertEquals(5, supermarket.skuQuantity());
    }
}
