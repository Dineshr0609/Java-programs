package WithOutMain;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CharacterCaseConverterTest {

    @Test
    public void testConvertCaseWithLowercaseInput() {
        String result = CharacterCaseConverter.convertCase("DINESH");
        assertEquals("dinesh", result);
    }

    @Test
    public void testConvertCaseWithUppercaseInput() {
        String result = CharacterCaseConverter.convertCase("ravipati");
        assertEquals("RAVIPATI", result);
    }

    @Test
    public void testConvertCaseWithMixedCaseInput() {
        String result = CharacterCaseConverter.convertCase("DiNeSh RaViPaTi");
        assertEquals("dInEsH rAvIpAtI", result);
    }

    @Test
    public void testConvertCaseWithEmptyString() {
        String result = CharacterCaseConverter.convertCase("");
        assertEquals("", result);
    }

}
