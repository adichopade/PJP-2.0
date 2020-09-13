package com.example.demopractise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemopractiseApplicationTests {

	@Test
    public void testHomeController() {
		CalculatorController homeController = new CalculatorController();
        String result = homeController.home();
        assertEquals(result, "index.jsp");
    }

}
