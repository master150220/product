package product;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class FirstTest {
    @Test
    public void onePlusOne() {
        assertThat(1 + 1).isEqualTo(2);
    }
}
