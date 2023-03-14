import java.security.PublicKey;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }
    public static void task1 (){
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763_789;
        System.out.println(paper);
    }
    public static void task2 (){
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3 (){
        var dog = 8.0;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4 (){
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 (){
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        System.out.println(boxerWeight1 + boxerWeight2 + " кг! " + " Общий вес двух бойцов ");
        System.out.println(boxerWeight2 - boxerWeight1 + " кг! " + " разница ");

    }
    public static void task7 () {
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        System.out.println(boxerWeight2 - boxerWeight1);
    }

    public static void task8 (){
    var workingHours = 640;
    var worker1 = 8;
    System.out.println("Всего работников в компании - "+ workingHours / worker1 + " человек " );
    var workerAll = 80;
    workerAll = workerAll + 94;
    System.out.println("Если в компании работает " + workerAll +  " Челоовека " + " то всего " + workingHours / workerAll + " часа работы может быть поделено между сотрудниками");









    }
}




