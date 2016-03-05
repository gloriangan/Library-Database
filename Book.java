import java.io.*;

/* Author: Gloria Ngan and Crystal Lee
 * 
 * This is a class for book objects, which have unique
 * attributes like titles, authors, physical states,
 * and availibility.
 */

public class Book{
  private String title, author, status, ISBN, genre;     //For title, author, and the physical condition of the book.
  private double borrowDate;                             //Double for the date the book was checked out.
  private boolean isAvailable = true;                    //Boolean for whether the book is borrowed or not.
  
  //Constructor. Params for ISBN, title, author, genre, status.
  public Book(String i, String t, String a, String g, String s){
    ISBN = i;
    title = t;
    author = a;
    genre = g;
    status = s;
  }
  
  //Modifier method to mark book as unavailible.
  public void makeBorrowed(){
    isAvailable = false;
  }
  
  //Modifier method to mark a book as availible.
  public void makeReturned(){
    isAvailable = true;
  }
  
  //Accessor for genre.
  public String getGenre(){
    return genre;
  }
  
  //Accessor for title.
  public String getTitle(){
    return title;
  }
  
  //Accessor for ISBN.
  public String getISBN(){
    return ISBN;
  }

  //Accessor for title.
  public boolean getAvailability(){
    return isAvailable;
  }
  
  //Converts object to String.
  public String toString(){
    return title + " by: " + author + "; " + ", genre: " + genre + ", ISBN: " + ISBN + ", status: " + status;
  }
}
