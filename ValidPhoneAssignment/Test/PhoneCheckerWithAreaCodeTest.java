import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneCheckerWithAreaCodeTest {

    @DisplayName("PhoneLength = 10 or 12")
    @Test
    void CheckIfPhoneIs10or12CharLong() {
        String number = "";
        PhoneCheckerWithAreaCode pc = new PhoneCheckerWithAreaCode(number);
        boolean result = pc.checkValidNumber();
        boolean expected = false;
        assertEquals( expected, result);
    }

}