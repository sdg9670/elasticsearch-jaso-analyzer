package org.elasticsearch.analysis;

import org.junit.Test;

import static org.junit.Assert.*;

public class JasoDecomposerTest {

    @Test
    public void runJasoDecompose() {
        TokenizerOptions options = TokenizerOptions.create("testJasoDecomposer");
        options.setMistype(true);
        options.setChosung(true);

        JasoDecomposer aa = new JasoDecomposer();
        String test = aa.runJasoDecompose("ㅆㄲ", options);
        assertEquals(test, "ㅅㅅㄱㄱ");
    }
}