package com.example.patterns.factoryMethod;

public class HTMLButton implements Button{
    @Override
    public void render() {
        // Вернуть HTML-код кнопки.
    }

    @Override
    public void onClick() {
        // Навесить на кнопку обработчик события браузера.
    }
}
