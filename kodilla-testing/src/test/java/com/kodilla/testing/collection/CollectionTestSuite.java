package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.*;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Rozpoczęcie testu");
    }

    @AfterEach
    public void after() {
        System.out.println("Zakończenie testu\n");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("\nRozpoczęcie testowania\n");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test zakończony");
    }

    @DisplayName("Kiedy lista jest pusta, zwraca pustą listę"
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {

        // Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();

        // When
        List<Integer> result = exterminator.exterminate(emptyList);

        // Then
        Assertions.assertEquals(emptyList, result);
        System.out.println("Test pustej listy = " + result);
    }

    @DisplayName("Kiedy lista zawiera liczby, zwraca tylko liczby parzyste"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
        // Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> normalList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expectedList = Arrays.asList(2, 4, 6, 8, 10);

        // When
        List<Integer> result = exterminator.exterminate(normalList);

        // Then
        Assertions.assertEquals(expectedList, result);
        System.out.println("Test pełnej listy = " + result);
    }
}
