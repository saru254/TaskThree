 /*
     * possible way of implementing polymorphism with method overloading
     * a java program for method overloading by using different numbers of arguments
     */
    class MethodOverloading {
        private static void display( int a ){
            System.out.println("arguments:" + a);
        }
        private static void display(int a, int b){
            System.out.println("arguments:" + a + "and" + b);
        }
        public static void main(String args[]){
            display(1);
            display(1,4);
        }
    }

