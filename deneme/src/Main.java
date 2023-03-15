public class Main {
    public static void main(String[] args) {
        class QuickSortExample {

            public void main(String[] args) {
                int[] dizi = new int[1000];
                for (int i = 0; i < dizi.length; i++) {
                    dizi[i] = (int) (Math.random() * 1000);
                }

                System.out.println("Dizi (sıralanmamış):");
                for (int eleman : dizi) {
                    System.out.print(eleman + " ");
                }

                quickSort(dizi, 0, dizi.length - 1);

                System.out.println("\nDizi (sıralanmış):");
                for (int eleman : dizi) {
                    System.out.print(eleman + " ");
                }
            }

            public void quickSort(int[] dizi, int baslangic, int bitis) {
                if (baslangic < bitis) {
                    int pivotIndex = partition(dizi, baslangic, bitis);
                    quickSort(dizi, baslangic, pivotIndex - 1);
                    quickSort(dizi, pivotIndex + 1, bitis);
                }
            }

            public int partition(int[] dizi, int baslangic, int bitis) {
                int pivot = dizi[bitis];
                int i = baslangic - 1;
                for (int j = baslangic; j <= bitis - 1; j++) {
                    if (dizi[j] <= pivot) {
                        i++;
                        int temp = dizi[i];
                        dizi[i] = dizi[j];
                        dizi[j] = temp;
                    }
                }
                int temp = dizi[i + 1];
                dizi[i + 1] = dizi[bitis];
                dizi[bitis] = temp;
                return i + 1;
            }
        }

    }
}





