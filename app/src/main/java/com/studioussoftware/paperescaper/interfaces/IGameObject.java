package com.studioussoftware.paperescaper.interfaces;

/**
 * Created by Robbie Wolfe on 8/9/2016.
 */
public interface IGameObject {
    void initGL();  // To be called on the openGL thread
    void draw(float[] perspectiveMatrix, float[] viewMatrix);
}
