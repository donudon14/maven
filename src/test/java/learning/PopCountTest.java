package com.github.donudon14.maven;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static com.github.donudon14.maven.PopCount.popCount;

public final class PopCountTest {
    @Test
    public final void testPopCount() {
        assertEquals(0,  popCount(0));
        assertEquals(1,  popCount(1));
        assertEquals(1,  popCount(2));
        assertEquals(2,  popCount(3));
        assertEquals(1,  popCount(4));
        assertEquals(2,  popCount(5));
        assertEquals(2,  popCount(6));
        assertEquals(3,  popCount(7));
        assertEquals(1,  popCount(1073741824));
        assertEquals(2,  popCount(1073741825));
        assertEquals(31, popCount(2147483647));
        assertEquals(32, popCount(-1));
        assertEquals(31, popCount(-2));
        assertEquals(31, popCount(-3));
        assertEquals(30, popCount(-4));
        assertEquals(2,  popCount(-2147483647));
        assertEquals(1,  popCount(-2147483648));
    }
}
