package com.bluelinelabs.logansquare.processor;

import org.junit.Test;
import static org.junit.Assert.*;

public class TextUtilsTest {
    @Test
    public void toLowerCaseFirstChar_PascalCase() {
        String result = TextUtils.toLowerCaseFirstChar("Text");
        assertEquals("text", result);
    }

    @Test
    public void toLowerCaseFirstChar_UpperCase() {
        String result = TextUtils.toLowerCaseFirstChar("TEXT");
        assertEquals("tEXT", result);
    }
}
