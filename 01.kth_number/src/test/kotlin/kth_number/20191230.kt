package kth_number

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class `20191230` {

    @Test
    fun `get kth number`() {
        assertThat(getKthNumber(
                intArrayOf(1, 5, 2, 6, 3, 7, 4),
                arrayOf(
                        intArrayOf(2, 5, 3),
                        intArrayOf(4, 4, 1),
                        intArrayOf(1, 7, 3)
                )
        )).isEqualTo(intArrayOf(5, 6, 3))
    }
}