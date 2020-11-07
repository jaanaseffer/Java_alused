public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);
        Box box2 = new Box(6);
        Box box3 = new Box(8);

        box.add( new Book1("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box.add( new Book1("Robert Martin", "Clean Code", 1) );

        box2.add( new Book1("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box2.add( new Book1("Robert Martin", "Clean Code", 1) );
        box2.add( new Book1("Kent Beck", "Test Driven Development", 0.7) );

        box3.add( new Book1("Robert Martin", "Clean Code", 1) );
        box3.add( new Book1("Kent Beck", "Test Driven Development", 0.7) );

        box.add(box2);
        box3.add(box2);
        box2.add(box);
        box2.add(box3);

        System.out.println( box );
        System.out.println( box2 );
        System.out.println( box3 );
    }

}