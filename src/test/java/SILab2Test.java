import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SILab2Test {


    @Test
    void EveryStatement() {
        List<String> emptyList = new ArrayList<>();
        List<String> invalidList = Arrays.asList("0", "0", "0");

        List<String> correctList = Arrays.asList("0", "#", "0", "#", "0", "#", "0", "#", "#");
        List<String> correctResult = Arrays.asList("2", "#", "2", "#", "4", "#", "2", "#", "#");

        assertThrows(IllegalArgumentException.class, () -> SILab2.function(emptyList));
        assertThrows(IllegalArgumentException.class, () -> SILab2.function(invalidList));
        assertEquals(correctResult,SILab2.function(correctList));

    }

    @Test
    void EveryBranch(){
        //Некои од тест примерите се веќе тестирани во EveryStatement

        List<String> correctList = Arrays.asList("0", "#", "0", "#", "0", "0", "#", "0", "#", "#", "0", "#", "0", "0", "0", "0");
        List<String> correctResult = Arrays.asList("1", "#", "3", "#", "1", "3", "#", "3", "#", "#", "3", "#", "1", "1", "0", "1");

        assertEquals(correctResult,SILab2.function(correctList));

    }
}
