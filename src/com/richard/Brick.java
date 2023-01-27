package com.richard;

import javax.swing.*;

public class Brick extends Sprite
{
    private boolean destroyed;

    public Brick(int x, int y)
    {
        initBrick(x, y);
    }

    private void initBrick(int x, int y)
    {
        this.x = x;
        this.y = y;
        destroyed = false;
        loadImage();
        getImageDimensions();
    }

    private void loadImage()
    {
        var imageIcon = new ImageIcon("src/resources/brick.png");
        image = imageIcon.getImage();
    }

    boolean isDestroyed()
    {
        return destroyed;
    }

    void setDestroyed(boolean value)
    {
        destroyed = value;
    }
}
