package br.com.beans;
import javax.ejb.Stateless;

@Stateless
public class MeuPrimeiroBean implements MeuPrimeiroBeanLocal {


    public MeuPrimeiroBean() {
    }	
    
	@Override
	public void helloWorld() {
		System.out.println("&quot;Hello World&quot;");
		
	}
}