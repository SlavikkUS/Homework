/*
 *
 *
 * author Usenkov Slava;
 */
package Task11;

import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        numbers(6, 8, 1);
    }

    private static void numbers(int width, int length, int radius) {
        if (radius >= (int) Math.sqrt(length * length + width * width) / 2)
            System.out.println("Картонка с радиусом " + radius + " закрывает полностью отвертие размера " + width + " * " + length);
        else
            System.out.println("Картонка с радиусом " + radius + " не закрывает полностью отвертие размера " + width + " * " + length);
    }

}
