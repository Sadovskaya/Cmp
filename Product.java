/**
 * Product
 *
 * V.1
 *
 * Sadovskaya
 */
import java.util.Arrays;
import java.util.Comparator;
/**
 * Мой класс Product.
 * @version 1.0
 */
    class Product {
    /**
     * Имя.
     */
    private String name;
    /**
     * Количество.
     */
    private int count;

    /**
     * Это методы.
     * @param name string
     * @param count int
     */
    Product(final String name, final int count) {
        this.name = name;
        this.count = count;
        }
    /**
     * Это методы.
     * @return name string
     */
         String getName() {
            return name;
        }
    /**
     * Это методы.
     * @param name string
     */
        public void setName(final String name) {
            this.name = name;
        }
    /**
     * Это методы.
     * @return count int
     */
         int getCount() {
            return count;
        }
    /**
     * Это методы.
     * @param count int
     */
        public void setCount(final int count) {
            this.count = count;
        }

        @Override
        public String toString() {
            return name + " " + count;
        }
    }
/**
 * Сравнение.
 * @return возвращает
 */
    class SortedByName implements Comparator<Product> {
        /**
        * Сравнение.
        * @param prod1 string
        * @param prod2 string
        *  @return возвращает
        */
        public int compare(final Product prod1, final Product prod2) {
            String str1 = prod1.getName();
            String str2 = prod2.getName();

            return str1.compareTo(str2);
        }
    }
/**
 * Мой класс Product.
 * @version 1.0
 */

    class SortedByCount implements Comparator<Product> {
        /**
         * Сравнение.
         * @param prod1 string
         * @param prod2 string
         * @return возвращает
         */
        public int compare(final Product prod1, final Product prod2) {
            int count1 = prod1.getCount();
            int count2 = prod2.getCount();

            if (count1 > count2) {
                return 1;
            } else if (count1 < count2) {
                return -1;
            } else {
                return 0;
            }
        }
    }
/**
 * Мой класс Product.
 * @version 1.0
 */
    class Example {
        /**
         * Создание Map.
         * @param args string
         */
        public static void main(final String[] args) {
            Product[] productArr = new Product[4];

            productArr[0] = new Product("Product1", 3);
            productArr[1] = new Product("Product3", 50);
            productArr[2] = new Product("Product2", 24);
            productArr[3] = new Product("Product4", 8);

            Arrays.sort(productArr, new SortedByCount());
            System.out.println("Сортировка по кол-ву:");

           for (Product product : productArr) {
               System.out.println(product.toString());
           }

            Arrays.sort(productArr, new SortedByName());
            System.out.println("Сортировка по названию:");

           for (Product product : productArr) {
                System.out.println(product.toString());
            }
        }

    }
