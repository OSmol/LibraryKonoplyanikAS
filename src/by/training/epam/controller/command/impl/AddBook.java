package by.training.epam.controller.command.impl;

import by.training.epam.controller.command.Command;
import by.training.epam.service.BookService;
import by.training.epam.service.exception.ServiceException;
import by.training.epam.service.impl.BookServiceImpl;

public class AddBook implements Command {

    private BookService bookService;

    public AddBook() throws ServiceException {
        bookService = BookServiceImpl.getInstance();
    }

    @Override
    public String execute(String request) throws ServiceException {
        return bookService.create(request);
    }

}
