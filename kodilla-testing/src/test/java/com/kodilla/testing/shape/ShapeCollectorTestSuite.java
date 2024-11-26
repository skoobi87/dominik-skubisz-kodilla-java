package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for managing shape list")
    class TestShapeList {

        @Test
        void testAddFigure() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(5.0);

            // When
            shapeCollector.addFigure(circle);

            // Then
            Assertions.assertTrue(shapeCollector.showFigures().contains("Circle"));
        }

        @Test
        void testRemoveFigure() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle(3.0, 4.0);
            shapeCollector.addFigure(triangle);

            // When
            shapeCollector.removeFigure(triangle);

            // Then
            Assertions.assertEquals("", shapeCollector.showFigures());
        }

        @Test
        void testGetFigure() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square(4.0);
            shapeCollector.addFigure(square);

            // When
            Shape retrievedShape = shapeCollector.getFigure(0);

            // Then
            Assertions.assertEquals(square, retrievedShape);
        }

        @Test
        void testGetFigureOutOfBounds() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();

            // When
            Shape retrievedShape = shapeCollector.getFigure(5);

            // Then
            Assertions.assertNull(retrievedShape, "Should return null for out-of-bounds index.");
        }
    }

    @Nested
    @DisplayName("Tests for displaying shapes")
    class TestShapeDisplay {

        @Test
        void testShowFiguresEmptyList() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();

            // When
            String result = shapeCollector.showFigures();

            // Then
            Assertions.assertEquals("", result, "Empty list should return an empty string.");
        }

        @Test
        void testShowFiguresNonEmptyList() {
            // Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(5.0);
            Shape square = new Square(4.0);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);

            // When
            String result = shapeCollector.showFigures();

            // Then
            Assertions.assertEquals("Circle, Square", result, "Should return names of added shapes.");
        }
    }
}
