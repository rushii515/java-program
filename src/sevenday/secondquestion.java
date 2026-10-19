package sevenday;

class OnlineLibrary{
    String[] books= new String[10];
    int count=0;

    void addBook(String book){
        if(count<books.length){
            books[count]=book;
            count++;
            System.out.println(books+" added successfully");
        } else {
            System.out.println("Library is full");
        }
    }

    void issuebook(String book){

        for (int i=0; i<count; i++){
            if(books[i] != null && books[i].equals(book)){
                books[i]=null;
                System.out.println(book +"issued successfully");
                return;
            }
        }

        System.out.println(" Book is not available");
    }

    void returnBook(String book){
        if(count < books.length){
            books[count]=book;
            count++;
            System.out.println(book + "returned successfully");
        }else {
            System.out.println("Library is full");
        }
    }

    void displayBooks(){
        System.out.println("Available books: ");

        for (int i=0; i<count; i++){
            if(books[i] !=null){
                System.out.println(books[i]);
            }
        }
    }
}

public class secondquestion {
    static void main(String[] args) {
        OnlineLibrary library= new OnlineLibrary();
        library.addBook("java");
        library.issuebook("python");
        library.returnBook("C++");
        library.displayBooks();

        library.issuebook("java");
        library.displayBooks();

        library.returnBook("java");
        library.displayBooks();

    }
}
