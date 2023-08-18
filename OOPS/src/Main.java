// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Book b=new Book();
       Libraryitem l=new Libraryitem();
       b.setAuthor("kambar");
       DVD d=new DVD();
       d.setDuration(22.9f);
       b.displayInfo();
       d.displayInfo();
       LibraryMember Student=new StudentMember(1);
       Student.borrowItem(l);
       LibraryMember f=new FacultyMember(8);
       f.borrowItem(l);

       }
    }
