package com.javalesson.graphic.layout;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        new GridLayoutTest();
    }
}

class GridLayoutTest extends JFrame {
    public GridLayoutTest() {
        super("GridLayoutTest");
        setSize(320, 320);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Вспомогательная панель
        JPanel grid = new JPanel();
        /*
         * Первые два параметра конструктора GridLayout определяют количество
         * строк и столбцов в таблице. Вторые 2 параметра - расстояние между
         * ячейками по горизонтали и вертикали
         */
        GridLayout layout = new GridLayout(2, 0, 5, 12);
        grid.setLayout(layout);
        grid.setBorder(BorderFactory.createEmptyBorder(6,8,6,8));
        // Создаем 8 кнопок
        for (int i = 1; i < 9; i++) {
            grid.add(new JLabel("Надпись " + i));
        }
        // Размещаем нашу панель в панели содержимого
        getContentPane().add(grid);
        // Устанавливаем оптимальный размер окна
        pack();
        // Открываем окно
        setVisible(true);
    }
}