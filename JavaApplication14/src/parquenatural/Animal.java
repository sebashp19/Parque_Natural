/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parquenatural;

/**
 *
 * @author SIS
 */
public class Animal extends Especie{
        protected String alimento;
	protected int num;
	protected int pericelo;


	public void animal(){

	}

    public String getAlimento() {
        return alimento;
    }

    public int getPericelo() {
        return pericelo;
    }

    public int getNum() {
        return num;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setPericelo(int pericelo) {
        this.pericelo = pericelo;
    }
        
}
