package example.micronaut.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.Objects;

/**
 * BooksContainer
 */
@Serdeable
@JsonPropertyOrder({
    BooksContainer.JSON_PROPERTY_BOOKS
})
@Generated(value = "io.micronaut.openapi.generator.JavaMicronautServerCodegen")
@Introspected
public class BooksContainer {

    public static final String JSON_PROPERTY_BOOKS = "books";

    @NotNull
    @Valid
    @JsonProperty(JSON_PROPERTY_BOOKS)
    private List<String> books;

    public BooksContainer(List<String> books) {
        this.books = books;
    }

    /**
     * @return the books property value
     */
    public List<String> getBooks() {
        return books;
    }

    /**
     * Set the books property value
     */
    public void setBooks(List<String> books) {
        this.books = books;
    }

    /**
     * Set books in a chainable fashion.
     * @return The same instance of BooksContainer for chaining.
     */
    public BooksContainer books(List<String> books) {
        this.books = books;
        return this;
    }

    /**
     * Add an item to the books property in a chainable fashion.
     * @return The same instance of BooksContainer for chaining.
     */
    public BooksContainer addBooksItem(String booksItem) {
        this.books.add(booksItem);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BooksContainer booksContainer = (BooksContainer) o;
        return Objects.equals(this.books, booksContainer.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books);
    }

    @Override
    public String toString() {
        return "BooksContainer("
            + "books: " + getBooks()
            + ")";
    }

}