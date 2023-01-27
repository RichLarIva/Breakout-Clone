package com.richard;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class Paddle extends Sprite
{
    private int dX;

    public Paddle()
    {
        initPaddle();
    }

    private void initPaddle()
    {
        loadImage();
        getImageDimensions();

        resetState();
    }

    private void loadImage()
    {
        var imageIcon = new ImageIcon("src/resources/paddle.png");
        image = imageIcon.getImage();
    }

    void move()
    {
        x += dX;
        if (x <= 0)
        {
            x = 0;
        }

        if (x >= Commons.WIDTH - imageWidth)
        {
            x = Commons.WIDTH - imageWidth;
        }
    }

    void keyPressed(KeyEvent keyEvent)
    {
        int key = keyEvent.getKeyCode();

        if (key == KeyEvent.VK_LEFT)
        {
            dX = -1;
        }
        if (key == KeyEvent.VK_RIGHT)
        {
            dX = 1;
        }
    }

    void keyReleased(KeyEvent keyEvent)
    {
        int key = keyEvent.getKeyCode();
        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)
        {
            dX = 0;
        }
    }

    private void resetState()
    {
        x = Commons.INIT_PADDLE_X;
        y = Commons.INIT_PADDLE_Y;
    }
}
