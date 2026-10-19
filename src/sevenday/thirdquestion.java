package sevenday;

class Library{
    String bookName;
    boolean isIssued=false;

    Library(String bookName){
        this.bookName=bookName;
    }

    void issueBook(){
        if( isIssued==false){
            isIssued=true;
            System.out.println(bookName+ " book issued successfully");
        }else{
            System.out.println(bookName+"book is already issued.");
        }
    }
}
public class thirdquestion {
    static void main(String[] args) {
        Library l= new Library("java");
      l.issueBook();
      l.issueBook();
    }
}
