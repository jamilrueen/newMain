package com.collection.class25;

interface First {
    void talk();

    public class Inter implements First {
        public static void main(String[] args) {
            First first = new First() {
                @Override
                public void talk() {
                    System.out.println("This is it.");
                }
            };
        }

        @Override
        public void talk() {
            System.out.println("Is this it?");
        }
    }
}
