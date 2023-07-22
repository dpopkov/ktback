package io.dpopkov.ktbackdev.m1l1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FirstTest {
    @Test
    fun first() {
        val actual = Greeting()
        assertEquals("Hello World!", actual.message)
    }
}
