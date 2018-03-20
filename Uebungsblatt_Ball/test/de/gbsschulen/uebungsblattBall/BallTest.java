package de.gbsschulen.uebungsblattBall;

import org.junit.Test;

import static org.junit.Assert.*;

public class BallTest {


    @Test
    public void test() {
        Ball ball = new Ball(500.0);
        assertNotNull(ball);
        assertEquals(500.0, ball.fullemenge, 0.001);
    }

    public static void main(String[] args) {

    }
}