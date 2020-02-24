package com.example.patterns.behavioral.team;

import java.util.ArrayList;

public class Application {
    public String clipboard;
    public ArrayList<Editor> editors = new ArrayList<>();
    public Editor activeEditor;
    public CommandHistory history;

//    public void createUI()
//    {
//        field clipboard: string
//        field editors: array of Editors
//        field activeEditor: Editor
//        field history: CommandHistory
//
//        // Код, привязывающий команды к элементам интерфейса, может
//        // выглядеть примерно так.
//        method createUI() is
//            // ...
//            copy = function() {executeCommand(
//            new CopyCommand(this, activeEditor)) }
//        copyButton.setCommand(copy)
//        shortcuts.onKeyPress("Ctrl+C", copy)
//
//        cut = function() { executeCommand(
//            new CutCommand(this, activeEditor)) }
//        cutButton.setCommand(cut)
//        shortcuts.onKeyPress("Ctrl+X", cut)
//
//        paste = function() { executeCommand(
//            new PasteCommand(this, activeEditor)) }
//        pasteButton.setCommand(paste)
//        shortcuts.onKeyPress("Ctrl+V", paste)
//
//        undo = function() { executeCommand(
//            new UndoCommand(this, activeEditor)) }
//        undoButton.setCommand(undo)
//        shortcuts.onKeyPress("Ctrl+Z", undo)
//
//        // Запускаем команду и проверяем, надо ли добавить её в
//        // историю.
//        method executeCommand(command) is
//        if (command.execute())
//            history.push(command)
//
//        // Берём последнюю команду из истории и заставляем её все
//        // отменить. Мы не знаем конкретный тип команды, но это и не
//        // важно, так как каждая команда знает, как отменить своё
//        // действие.
//        method undo() is
//            command = history.pop()
//        if (command != null)
//            command.undo()
//    }
}
