//package com.example.patterns.behavioral.observer;
//
//// Базовый класс-издатель. Содержит код управления подписчиками
//// и их оповещения.
//class EventManager is
//        private field listeners: hash map of event types and listeners
//
//        method subscribe(eventType, listener) is
//        listeners.add(eventType, listener)
//
//        method unsubscribe(eventType, listener) is
//        listeners.remove(eventType, listener)
//
//        method notify(eventType, data) is
//        foreach (listener in listeners.of(eventType)) do
//        listener.update(data)
//
//// Конкретный класс-издатель, содержащий интересную для других
//// компонентов бизнес-логику. Мы могли бы сделать его прямым
//// потомком EventManager, но в реальной жизни это не всегда
//// возможно (например, если у класса уже есть родитель). Поэтому
//// здесь мы подключаем механизм подписки при помощи композиции.
//
