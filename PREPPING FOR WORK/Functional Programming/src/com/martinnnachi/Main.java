package com.martinnnachi;

public class Main {

    public static void main(String[] args) {
        final Boolean IS_DEVELOPMENT = false;
        DataLoader dataLoader = new DataLoader( IS_DEVELOPMENT );
        System.out.println(dataLoader.loadPerson.apply());
    }

    protected static class Person {
        public String name;
        public int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    protected static class DataLoader {
        public final NoArgFunction<Person> loadPerson;

        public DataLoader(Boolean isDevelopment) {
            this.loadPerson = isDevelopment ? this::loadPersonFake : this::loadPersonReal;
        }

        private Person loadPersonReal() {
            System.out.println( "Loading Person..." );
            return new Person( "Real Person", 50 );
        }

        private Person loadPersonFake() {
            System.out.println( "Returning fake person object..." );
            return new Person( "Fake Person", 100 );
        }
    }
}
