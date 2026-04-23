//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

//    int i = 0;
//    int j = 0;
//
//    // i = 0
//    // j = 0
//
//    System.out.println("1. => " + i);
//
//    // 1 + (value i) -> i
//    i = i + 1;
//
//    System.out.println("2. => " + i);
//
//    // 1 + (value i) -> i
//    i = i + 1;
//
//    System.out.println("3. => " + i);


    int i = 1;
    int a = i++; // Java READS value of `a` FIRST and THEN increments: a = 1 (before increment) and THEN increments a (a = 2)

    System.out.println("-----------");
    System.out.println(i); // i = 2 (java assigns value to a BEFORE increment and THEN increments (+1))
    System.out.println(a); // a = 1 (value of `i` BEFORE increment)

    int j = 1;
    int b = ++j; // Java INCREMENTS value of `j` FIRST (+1) and THEN assigns to variable `b`

    System.out.println("-----------");
    System.out.println(j); // j = 2
    System.out.println(b); // b = 2 (value of `j` AFTER increment)

    int x = 1;
    int y = (x++) + (++x); // (read) 1 -> (x = x + 1 = 2) -> (x = x + 1 = 3) -> + 3

    System.out.println("-----------");
    System.out.println(y); // y = 4
    System.out.println(x); // x = 3


}

