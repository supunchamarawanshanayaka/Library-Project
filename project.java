import java.util.Scanner;
public class project{

    static int bookcount=0;

    static String bookIds[];
    static String bookTitles[];
    static String bookAuthors[];
    static String bookGenres[];
    static String bookquantities[];

public static void main(String[] args){

login();   
}


public static void login(){
String name="admin";
String password="admin123";
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Username: ");
        String nameinput = input.nextLine();

    System.out.print("Enter Password: ");
        String passwordinput = input.nextLine();

        if(name.equals(nameinput) && password.equals(passwordinput)){
                clearConsole();
                homepage();
        }
        else{
            System.out.println("Invalid Credentials. Try again");
            login(); //self refential structure
        }
}


public static void homepage(){
    System.out.println("--- Library Management System ---");
    System.out.println("1. Manage Books ");
    System.out.println("2. Manage Members ");
    System.out.println("3. Issue Books ");
    System.out.println("4. Return Books ");
    System.out.println("5. View Reports ");
    System.out.println("6. Exit System ");


    Scanner input = new Scanner(System.in);
    System.out.print("Select an Option: ");
    int navigation = input.nextInt();

    if(navigation == 1){
        clearConsole();
        manageBooks();
    }
    else if(navigation == 2){
        manageMembers();

    }
    else if(navigation == 3){
        IssueBooks();
    }
    else if(navigation == 4){
        returnBooks();
    }
    else if(navigation == 5){
        viewReports();
    }
    else{
        exitSystem();
    }
    

}
public static void manageBooks(){
    System.out.println("--- Manage Books ---");
    System.out.println("1. Add Books ");
    System.out.println("2. Update Books ");
    System.out.println("3. Delete Books ");
    System.out.println("4. Search Books ");
    System.out.println("5. View Books ");
    System.out.println("6. Back ");

    Scanner input = new Scanner(System.in);
    System.out.print("Select an Option: ");
    String navigation = input.nextLine();
    

    if(navigation.equals("1")){
        clearConsole();
        addbook();
    }

    if(navigation.equals("1")){
        clearConsole();
        updatebook();
    }

    if(navigation.equals("5")){
        clearConsole();
        viewbook();
    }

    if(navigation.equals("6")){
        clearConsole();
        homepage();
    }


}
public static void addbook(){
        
    // String ans="Y";
     Scanner input = new Scanner(System.in);

    System.out.print("Enter Book ID :");
    String bookId = input.nextLine();

    System.out.print("Enter Book Title :");
    String bookTitle = input.nextLine();

    System.out.print("Enter Book Author :");
    String bookAuthor = input.nextLine();

    System.out.print("Enter Genre :");
    String bookGenre = input.nextLine();

    System.out.print("Enter Quantity :");
    String bookquantity = input.nextLine();



        if(bookcount>0){
            for(int i=0;i<bookIds.length;i++){

                    if(bookIds[i].equals(bookId)){
                        bookcount--;
                        System.out.println("warning!! already exists! Enter AnotherOne");
                        break;
                    }

            }

            String[] temp=new String[bookcount];
            for(int i=0;i<bookIds.length;i++){
                temp[i]=bookIds[i];
            }
                temp[bookcount-1]=bookId;
                bookIds=temp;


            
            String[] temp1=new String[bookcount];
            for(int i=0;i<bookTitles.length;i++){
                temp1[i]=bookTitles[i];
            }
                temp1[bookcount-1]=bookTitle;
                bookTitles=temp1;



            String[] temp2=new String[bookcount];
            for(int i=0;i<bookAuthors.length;i++){
                temp2[i]=bookAuthors[i];
            }
                temp2[bookcount-1]=bookAuthor;
                bookAuthors=temp2;



            String[] temp3=new String[bookcount];
            for(int i=0;i<bookGenres.length;i++){
                temp3[i]=bookGenres[i];
            }
                temp3[bookcount-1]=bookGenre;
                bookGenres=temp3;



            String[] temp4=new String[bookcount];
            for(int i=0;i<bookquantities.length;i++){
                temp4[i]=bookquantities[i];
            }
                temp4[bookcount-1]=bookquantity;
                bookquantities=temp4;

        }
        else{
            bookcount++;

            bookIds=new String[bookcount];
            bookIds[0]=bookId;

            bookTitles=new String[bookcount];
            bookTitles[0]=bookTitle;

            bookAuthors=new String[bookcount];
            bookAuthors[0]=bookAuthor;

            bookGenres=new String[bookcount];
            bookGenres[0]=bookGenre;

            bookquantities=new String[bookcount];
            bookquantities[0]=bookquantity;
        }
        
    
    System.out.println("Book added Successfully.");
    bookcount++;
    System.out.println();
    System.out.println();
    
    manageBooks();
    //System.out.print("Add More Books Y/N");
        
    //ans=input.nextLine();

        //   if(ans.equals("Y")){
        //         bookcount++;
        //         addbook();
        //     }

            //else if(ans.equals("N")){

                // System.out.println("...............id.................");
                // for(int i=0;i<bookIds.length;i++){
                //     System.out.print(bookIds[i]+" ");           
                // }
                // System.out.println();
                // System.out.println("...............Title.................");
                // for(int i=0;i<bookIds.length;i++){
                //     System.out.print(bookTitles[i]+" ");           
                // }
                // System.out.println();
                // System.out.println("...............Authors.................");
                // for(int i=0;i<bookIds.length;i++){
                //     System.out.print(bookAuthors[i]+" ");           
                // }
                // System.out.println();
                // System.out.println("...............Genres.................");
                // for(int i=0;i<bookIds.length;i++){
                //     System.out.print(bookGenres[i]+" ");           
                // }
                // System.out.println();
                // System.out.println("...............Quantity.................");
                // for(int i=0;i<bookIds.length;i++){
                //     System.out.print(bookquantities[i]+" ");           
                // }
            
            //}
    
    

}

public static void updatebook(){
    int index;
    Scanner input=new Scanner(System.in);

    System.out.print("Enter Book Id To Update: ");
    String bookid=input.nextLine();

    for(int i=0;i<bookIds.length;i++){

        if(bookid.equals(bookIds[i])){
            index=i;

        }   
    }
    System.out.println("Update Successfull.");
}

public static void viewbook(){

    System.out.println("...............id.................");
    for(int i=0;i<bookIds.length;i++){
        System.out.print(bookIds[i]+" ");           
    }
    System.out.println();
    System.out.println("...............Title.................");
    for(int i=0;i<bookIds.length;i++){
        System.out.print(bookTitles[i]+" ");           
    }
    System.out.println();
    System.out.println("...............Authors.................");
    for(int i=0;i<bookIds.length;i++){
        System.out.print(bookAuthors[i]+" ");           
    }
    System.out.println();
    System.out.println("...............Genres.................");
    for(int i=0;i<bookIds.length;i++){
        System.out.print(bookGenres[i]+" ");           
    }
    System.out.println();
    System.out.println("...............Quantity.................");
    for(int i=0;i<bookIds.length;i++){
        System.out.print(bookquantities[i]+" ");           
    }
}


public static void manageMembers(){
    
}
public static void IssueBooks(){
    
}
public static void returnBooks(){
    
}
public static void viewReports(){
    
}
public static void exitSystem(){
    
}



private final static void clearConsole() {
    final String os = System.getProperty("os.name");
    try {
    if (os.contains("Linux")) {
    System.out.print("\033\143");
    } else if (os.contains("Windows")) {
    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    System.out.print("\033[H\033[2J");
    System.out.flush();
    } catch (final Exception e) {
    // Handle the exception
    System.err.println(e.getMessage());
    }
    }





}