class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        // write your code here
        int tempAge;
        String tempName;
        tempAge = p1.age;
        tempName = p1.name;
        p1.age = p2.age;
        p1.name = p2.name;
        p2.age = tempAge;
        p2.name = tempName;
    }
}