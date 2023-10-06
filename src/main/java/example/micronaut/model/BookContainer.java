package example.micronaut.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.Objects;

/**
 * BookContainer
 */
@Serdeable
@JsonPropertyOrder({
    BookContainer.JSON_PROPERTY_BOOK
})
@Generated(value = "io.micronaut.openapi.generator.JavaMicronautServerCodegen")
@Introspected
public class BookContainer {

    public static final String JSON_PROPERTY_BOOK = "book";

    @NotNull
    @Pattern(regexp = "[a-zA-Z ]+")
    @Size(max = 10)
    @JsonProperty(JSON_PROPERTY_BOOK)
    private String book;

    public BookContainer(String book) {
        this.book = book;
    }

    /**
     * @return the book property value
     */
    public String getBook() {
        return book;
    }

    /**
     * Set the book property value
     */
    public void setBook(String book) {
        this.book = book;
    }

    /**
     * Set book in a chainable fashion.
     * @return The same instance of BookContainer for chaining.
     */
    public BookContainer book(String book) {
        this.book = book;
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
        BookContainer bookContainer = (BookContainer) o;
        return Objects.equals(this.book, bookContainer.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book);
    }

    @Override
    public String toString() {
        return "BookContainer("
            + "book: " + getBook()
            + ")";
    }

}