/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parserexpression;

/**
 *
 * @author josue.inaldo.alcantara
 */
public class Token {
    public final int token;
    public final String sequence;

    public Token(int token, String sequence)
    {
      super();
      this.token = token;
      this.sequence = sequence;
    }
}