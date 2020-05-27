public class RegularNumbers {
    public static void main(String[] args) {
	try {
	    int n = Integer.parseInt(args[0]);
            long[] lista = new long[n + 1];
            lista[0] = 1;
            long pienin;
            int x2 = 0, x3 = 0, x5 = 0;
            for (int i = 1; i <= n; i++) {
                pienin = Math.min(Math.min(lista[x2] * 2, lista[x3] * 3), lista[x5] * 5);
                if (pienin == lista[x2] * 2) x2++;
                if (pienin == lista[x3] * 3) x3++;
                if (pienin == lista[x5] * 5) x5++;
                lista[i] = pienin;
	    }
	    System.out.println(lista[n - 1]);
        } catch (Exception e) {
	    System.out.println("Incorrect index. Check the arguments.");
	}
    }
}
