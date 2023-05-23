import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


public class SILab2Test {


    private List<User> createList(User... allUsers){
        return new ArrayList<>(Arrays.asList(allUsers));
    }

    @Test
    void multipleConditionsTest(){
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class,()->SILab2.function(null,Collections.emptyList()));
        assertTrue(ex.getMessage().contains("Mandatory information missing"));

    }




}
