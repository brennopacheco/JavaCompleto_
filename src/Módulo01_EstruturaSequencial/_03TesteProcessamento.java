package Módulo01_EstruturaSequencial;

public class _03TesteProcessamento {
    public static void main(String[] args) {
        // Exemplo 1:

        int x, y;
        x = 5;
        y = 2 * x;

        System.out.println("Exemplo 1:");
        System.out.println(x);
        System.out.println(y);
        System.out.println("___________________");

        // Exemplo 2:


        int p;
        double q;
        p = 5;
        q = 2 * x;

        System.out.println("Exemplo 2:");
        System.out.println(p);
        System.out.println(q);
        System.out.println("___________________");

        // Exemplo 3:

        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2 * h;
        System.out.println("Exemplo 3:");
        System.out.println(area);
        System.out.println("___________________");

        // Exemplo 4:

        int l, m;
        double resultado;

        l = 5;
        m = 2;

        resultado = (double) l / m; // casting
        System.out.println("Exemplo 4:");
        System.out.println(resultado);
        System.out.println("___________________");

        // Exemplo 5:

        double s;
        int r;

        s = 5;
        r = (int) s;

        System.out.println("Exemplo 5:");
        System.out.println(r);
        System.out.println("___________________");
    }
}
