package array;

// printing alternate sequence
public class AlternateNumber {
    public static void main(String[] args) {
        int[] a = {-2, -41, -7, -4, 6, 9};
        a = new AlternateNumber().alternate(a);
        for (int n : a) {
            System.out.println(n);
        }
    }

    int[] alternate(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                if (arr[i] > 0) { //+ve index
                    continue;
                } else {
                    int k = i + 1;
                    while (k < arr.length) {
                        if (arr[k] < 0) {
                            k++;
                        } else {
                            break;
                        }
                    }
                    if (k >= arr.length) {
                        break;
                    }
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }

            if (i % 2 == 1) {
                if (arr[i] < 0) { //-ve index
                    continue;
                } else {
                    int k = i + 1;
                    while (k < arr.length) {
                        if (arr[k] > 0) {
                            k++;
                        } else {
                            break;
                        }
                    }
                    if (k >= arr.length) {
                        break;
                    }
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }

            }
        }
        return arr;
    }
}