package example.micronaut;

import example.micronaut.model.BookContainer;
import example.micronaut.model.BooksContainer;
import io.micronaut.http.annotation.*;
import io.micronaut.validation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.List;

@Validated
@Controller
public class BookController {

    @Post("/add-book")
    @Produces({})
    @Consumes({"application/json"})
    public void addBook(
            @NotNull
            @Pattern(regexp = "[a-zA-Z ]+")
            @Size(max = 10)
            @Body
            String book
    ) {

    }

    @Post("/add-book-in-container")
    @Produces({})
    @Consumes({"application/json"})
    public void addBookInContainer(
            @NotNull
            @Valid
            @Body
            BookContainer bookContainer
    ) {

    }

    @Post("/add-books")
    @Produces({})
    @Consumes({"application/json"})
    public void addBooks(
            @NotNull
            @Valid
            @Body
            List<String> book
    ) {

    }

    @Post("/add-books-in-container")
    @Produces({})
    @Consumes({"application/json"})
    public void addBooksInContainer(
            @NotNull
            @Valid
            @Body
            BooksContainer booksContainer
    ) {

    }
}
