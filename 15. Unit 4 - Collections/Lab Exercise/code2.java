//For code with header and footer, just write the below code as answer
class Sortbyroll implements Comparator<Student> {

     public int compare(Student a, Student b) {
          return a.rollno - b.rollno;
     }
}

class Sortbyname implements Comparator<Student> {

     public int compare(Student a, Student b) {
          return a.name.compareTo(b.name);
     }
}

class SortbyRank implements Comparator<Student> {

     private boolean ascending;

     public SortbyRank(boolean ascending) {
          this.ascending = ascending;
     }

     public int compare(Student a, Student b) {
          return ascending ? a.rank - (b.rank) : b.rank - (a.rank);
     }
}