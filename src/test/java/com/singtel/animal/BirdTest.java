package com.singtel.animal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class BirdTest {
    private PrintStream sysOut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static Bird bird = new Bird();

    @Before
    public void setUpStreams() {
        sysOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void revertStreams() {
        System.setOut(sysOut);
    }

    @Test
    public void walkTest(){
        bird.walk();
        assertThat(outContent.toString(), containsString("walking"));
    }

    @Test
    public void flyTest(){
        bird.fly();
        assertThat(outContent.toString(), containsString("flying"));
    }

    @Test
    public void singTest(){
        bird.sing();
        assertThat(outContent.toString(), containsString("singing"));
    }
}
