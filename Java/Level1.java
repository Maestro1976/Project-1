package com.company;

import java.util.*;
public class Level1
{
    public static int odometer(int [] oksana)
    {
        int    prevTime = 0;//время в пердыдущий раз
        int    distanceTotal = 0;//Общее расстояние
        int    distanceCurrent = 0;//Текущее расстояние
        int    timeCurrent;//Текущее время
        int    speedCurrent;//Текущяя скорость
        for (int i = 0; i < oksana.length / 2; i++)
        {
            speedCurrent    = oksana[i * 2];
            timeCurrent     = oksana[i * 2 + 1] - prevTime;

            distanceCurrent = timeCurrent * speedCurrent;

            distanceTotal  += distanceCurrent;
            prevTime       += timeCurrent;
        }
        return distanceTotal;
    }
}
