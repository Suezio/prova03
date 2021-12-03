package questao03;

public class Pagamento {
    private double resultado;
    public double efetuarpagamento(){
        if(isEmAberto()){
            resultado = pagamentoEmAberto();
        }else {
            if(isAtrasado()){
                resultado = pagamentoAtrasado();
            }
        }
        return resultado;
    }
}
