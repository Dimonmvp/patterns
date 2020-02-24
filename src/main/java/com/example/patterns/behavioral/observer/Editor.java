//package com.example.patterns.behavioral.observer;
//
//public class Editor {
//    public field events: EventManager
//    private field file: File
//
//    constructor Editor() is
//    events = new EventManager()
//
//    // Методы бизнес-логики, которые оповещают подписчиков об
//    // изменениях.
//    method openFile(path) is
//        this.file = new File(path)
//        events.notify("open", file.name)
//
//    method saveFile() is
//        file.write()
//                events.notify("save", file.name)
//    // ...
//
//
//// Общий интерфейс подписчиков. Во многих языках, поддерживающих
//// функциональные типы, можно обойтись без этого интерфейса и
//// конкретных классов, заменив объекты подписчиков функциями.
//}
