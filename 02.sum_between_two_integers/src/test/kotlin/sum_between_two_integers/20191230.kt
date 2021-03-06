package sum_between_two_integers

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test
import kotlin.test.assertNotNull

class `20191230` {

    @Test
    fun `sum between_two_integers`(){
        assertThat(sumBetweenTwoInteger(3,5)).isEqualTo(12)
        assertThat(sumBetweenTwoInteger(3,3)).isEqualTo(3)
        assertThat(sumBetweenTwoInteger(5,3)).isEqualTo(12)
    }
}
