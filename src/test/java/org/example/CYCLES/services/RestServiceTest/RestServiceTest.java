package org.example.CYCLES.services.RestServiceTest;

import org.example.CYCLES.services.RestService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    public void testRestLimit(int income, int expenses, int threshold) {
        RestService service = new RestService();

        int rest = service.calculate(income, expenses, threshold);
        System.out.println("Месецев отдыха: " + rest);

    }
}
