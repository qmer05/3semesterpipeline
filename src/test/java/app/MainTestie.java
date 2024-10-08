package app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTestie {

    Testie testie = new Testie();

    @Test
    void testAdd() {
        assert testie.add(1, 2) == 3;
    }

    @Test
    void testSubtract() {
        assert testie.subtract(1, 2) == 1;
    }

}