package com.richard;

import javax.swing.*;

public class Ball extends Sprite
{
    private int xDir;
    private int yDir;

    public Ball()
    {
        initBall();
    }

    private void initBall()
    {
        xDir = 1;
        yDir = -1;

        loadImage();
        getImageDimensions();
        resetState();
    }

    private void loadImage()
    {
        var imageIcon = new ImageIcon("src/resources/ball.png");
        image = imageIcon.getImage();
    }

    void move()
    {
        x += xDir;
        y += yDir;
        if (x == 0)
        {
            setXDir(1);
        }

        if (x == Commons.WIDTH - imageWidth)
        {
            setXDir(-1);
        }

        if (y == 0)
        {
            setYDir(1);
        }
    }

    private void resetState()
    {
        x = Commons.INIT_BALL_X;
        y = Commons.INIT_BALL_Y;
    }

    void setXDir(int x)
    {
        xDir = x;
    }

    void setYDir(int y)
    {
        yDir = y;
    }

    int getYDir()
    {
        return yDir;
    }
}
