package com.example.patterns.behavioral.visitor;

public class XMLExportVisitor implements Visitor{


    @Override
    public void visitDot(Dot dot) {
        // Экспорт id и координат центра точки.
    }

    @Override
    public void visitCircle(Circle circle) {
        // Экспорт id, кординат центра и радиуса окружности.
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        // Экспорт id, кординат левого-верхнего угла, ширины и
        // высоты прямоугольника.
    }

    @Override
    public void visitCompoundShape(CompoundShape cs) {
        // Экспорт id составной фигуры, а также списка id
        // подфигур, из которых она состоит.
    }
}
