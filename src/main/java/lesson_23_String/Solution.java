package lesson_23_String;

public class Solution {

    public static boolean isPalindrome(int x) {

        String originalString = String.valueOf(x);

        StringBuilder sb = new StringBuilder(originalString);

        String reverseString = sb.reverse().toString();

        if (originalString.equals(reverseString)) {
            return true;
        } else {
            return false;
        }
    }

    public static int majorityElement(int[] nums) {

        // Нам потрібен масив
        // Взяти перший елемент з масиву
        // Пройтись по масиву
        // Рахуємо скільки разів ми зустріли цей елемент
        // Якщо більше ніж n/2 разів, то ми повертаємо його
        // Якщо не відповідаємо умові, то ми беремо наступний елемент з масиву.


        for (int i = 0; i < nums.length; i++) {
            int majorityElement = nums[i];
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == majorityElement) {
                    count++;
                }
            }
            if (count > nums.length / 2) {
                return majorityElement;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static int removeElement(int[] arr, int val) {

        // Створимо змінну k і вона буде показувати на яке місце треба поставити наступний елемент
        // Пройдемось по масиву
        // Перевіримо, що наше k не дорівнює val і перезаписати її в новий масив
        // збільшуємо нашу змінну k
        // повертаємо наш результат який ми записали в k

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
}
