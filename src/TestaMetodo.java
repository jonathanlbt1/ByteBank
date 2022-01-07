public class TestaMetodo {
    public static void main(String[] args){

        Conta contaDoJon = new Conta(45558, 2233);
        contaDoJon.getSaldo();
        contaDoJon.deposita(50);
        System.out.println(contaDoJon.getSaldo());

        boolean conseguiuRetirar = contaDoJon.saca(20);
        System.out.println("Conta do Jonathan R$" + contaDoJon.getSaldo());
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta(55258, 2354);
        contaDaMarcela.deposita(1000);
        System.out.println("Conta da Marcela R$" + contaDaMarcela.getSaldo());

        contaDaMarcela.transfere(200, contaDoJon);
        System.out.println("Conta do Jonathan R$" + contaDoJon.getSaldo());
        System.out.println("Conta da Marcela R$" + contaDaMarcela.getSaldo());



    }
}
