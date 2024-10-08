package app;

import org.junit.jupiter.api.Test;

class TestieTest {

    Testie testie = new Testie();

    @Test
    void testAdd() {
        assert testie.add(1, 2) == 3;
    }

    @Test
    void testSubtract() {
        assert testie.subtract(1, 2) == -3;
    }

}